package com.grape.work.task;

import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayplan;
import com.grape.model.db.RepayplanExample;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.mapper.base.PostloaninfoMapper;
import com.grape.model.mapper.base.RepayplanMapper;
import com.grape.model.mapper.external.RecordsAndPlansExMapper;
import com.grape.workflow.Execution;
import com.grape.workflow.util.AverageCapitalPlusInterest;
import com.grape.workflow.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

@Component
@Scope("prototype")
public class SaveRepaymentplanTask implements WorkTask {
    private final static Logger log = LoggerFactory.getLogger(SaveRepaymentplanTask.class);

    @Autowired
    private RecordsAndPlansExMapper recordsAndPlansExMapper;
    @Autowired
    private RepayplanMapper repayplanMapper;
    @Autowired
    private PostloaninfoMapper postloaninfoMapper;

    @Override
    public TaskResult handle(Execution execution) {

        HashMap<String, Object> ParamMap = new HashMap<String, Object>();
        ParamMap.put("workid", execution.getWorkId());

        Postloaninfo posloan = recordsAndPlansExMapper.getPostloaninfo(ParamMap);

        RepayplanExample repayplanExample = new RepayplanExample();
        repayplanExample.createCriteria().andWorkidEqualTo(execution.getWorkId());
        List<Repayplan> repayplanList = repayplanMapper.selectByExample(repayplanExample);
        if (repayplanList != null && repayplanList.size() != 0 ){
            repayplanMapper.deleteByExample(repayplanExample);
        }

        //假如此流水是展期，清除原流水下次还款日
        if (posloan != null) {
            posloan.setNextrepaydate(null);
            postloaninfoMapper.updateByPrimaryKey(posloan);
        }

        List<Repaytoinfo> list = recordsAndPlansExMapper.getrepaytoinfo(ParamMap);
        log.info("******************************************************************************************list输出");
        if (list.size() > 0) {
            Repaytoinfo repaytoinfo = list.get(0);
            String repaymethod = repaytoinfo.getRepaymethod();

            repaytoinfo.setInterestrate(repaytoinfo.getInterestrate().divide(new BigDecimal(100)));

            if (repaymethod.equals("1")) {
                String interestratetype = repaytoinfo.getInterestratetype();
                BigDecimal interestrate = null;
                Map<String, Object> map = recordsAndPlansExMapper.getProduct(ParamMap);
                String productno = map.get("productno").toString();
                String producttype = map.get("producttype").toString();

                //赎楼贷求日利率
                if (productno.equals("ZQ001") || producttype.equals("2")) {

                    if (interestratetype.equals("1")) {
                        interestrate = repaytoinfo.getInterestrate();
                    }
                    if (interestratetype.equals("2")) {
                        interestrate = repaytoinfo.getInterestrate().divide(new BigDecimal(30), 9, BigDecimal.ROUND_HALF_UP);
                    }
                    if (interestratetype.equals("3")) {
                        interestrate = repaytoinfo.getInterestrate().divide(new BigDecimal(365), 9, BigDecimal.ROUND_HALF_UP);
                    }

                    BigDecimal sumofamount = (BigDecimal) repaytoinfo.getSumofamount();
                    Integer loanlimittime = Integer.parseInt(repaytoinfo.getLoanlimittime());
                    BigDecimal repayaccrual = sumofamount.multiply(interestrate);

                    for (int i = 1; i <= loanlimittime; i++) {

                        Repayplan repayplan = new Repayplan();
                        repayplan.setId(Util.getID());
                        repayplan.setWorkid(execution.getWorkId());

                        LocalDate nextDate = LocalDate.now().minusDays(-1+i);
                        Date date = Date.from(nextDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                        repayplan.setRepaydate(date);

                        if (i != loanlimittime) {
                            repayplan.setLoanbalance(sumofamount);
                            repayplan.setRepayamount(new BigDecimal(0).add(repayaccrual));
                            repayplan.setRepaycapital(new BigDecimal(0));
                        } else {
                            repayplan.setLoanbalance(new BigDecimal(0));
                            repayplan.setRepayamount(sumofamount.add(repayaccrual));
                            repayplan.setRepaycapital(sumofamount);
                        }
                        repayplan.setRepayaccrual(repayaccrual);
                        repayplan.setRepayterm(i);
                        repayplan.setRepaymethod(repaymethod);
                        repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                        repayplan.setChgdt(new Date());
                        repayplan.setStatus(0);
                        repayplanMapper.insert(repayplan);
                    }
                }
                //房抵贷求月利率
                if (productno.equals("ZQ002") || producttype.equals("1")) {

                    if (interestratetype.equals("1")) {
                        interestrate = repaytoinfo.getInterestrate().multiply(new BigDecimal(30));
                    }
                    if (interestratetype.equals("2")) {
                        interestrate = repaytoinfo.getInterestrate();
                    }
                    if (interestratetype.equals("3")) {
                        interestrate = repaytoinfo.getInterestrate().divide(new BigDecimal(12), 9, BigDecimal.ROUND_HALF_UP);
                    }

                    BigDecimal sumofamount = (BigDecimal) repaytoinfo.getSumofamount();
                    Integer loanlimittime = Integer.parseInt(repaytoinfo.getLoanlimittime());
                    BigDecimal repayaccrual = sumofamount.multiply(interestrate);

                    for (int i = 1; i <= loanlimittime; i++) {

                        Repayplan repayplan = new Repayplan();
                        repayplan.setId(Util.getID());
                        repayplan.setWorkid(execution.getWorkId());
                        Calendar cal = Calendar.getInstance();
                        cal.add(Calendar.MONTH, i);
                        cal.add(Calendar.DAY_OF_MONTH, -1);
                        repayplan.setRepaydate(cal.getTime());

                        if (i != loanlimittime) {
                            repayplan.setLoanbalance(sumofamount);
                            repayplan.setRepayamount(new BigDecimal(0).add(repayaccrual));
                            repayplan.setRepaycapital(new BigDecimal(0));
                        } else {
                            repayplan.setLoanbalance(new BigDecimal(0));
                            repayplan.setRepayamount(sumofamount.add(repayaccrual));
                            repayplan.setRepaycapital(sumofamount);
                        }
                        repayplan.setRepayaccrual(repayaccrual);
                        repayplan.setRepayterm(i);
                        repayplan.setRepaymethod(repaymethod);
                        repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                        repayplan.setChgdt(new Date());
                        repayplan.setStatus(0);
                        repayplanMapper.insert(repayplan);
                    }
                }
            }
            if (repaymethod.equals("2")) {
                String interestratetype = repaytoinfo.getInterestratetype();
                Double interestrate = null;
                if (interestratetype.equals("1")) {
                    interestrate = repaytoinfo.getInterestrate().multiply(new BigDecimal(30)).doubleValue();
                }
                if (interestratetype.equals("2")) {
                    interestrate = repaytoinfo.getInterestrate().doubleValue();
                }
                if (interestratetype.equals("3")) {
                    interestrate = repaytoinfo.getInterestrate().divide(new BigDecimal(12), 9, BigDecimal.ROUND_HALF_UP).doubleValue();
                }
                Double sumofamount = repaytoinfo.getSumofamount().doubleValue();
                Integer loanlimittime = Integer.parseInt(repaytoinfo.getLoanlimittime().toString());
                BigDecimal repaycapital = (BigDecimal) repaytoinfo.getSumofamount();

                double perMonthPrincipalInterest = AverageCapitalPlusInterest.getPerMonthPrincipalInterest(sumofamount, interestrate, loanlimittime);
                Map<Integer, BigDecimal> mapPrincipal = AverageCapitalPlusInterest.getPerMonthPrincipal(sumofamount, interestrate, loanlimittime);
                Map<Integer, BigDecimal> mapInterest = AverageCapitalPlusInterest.getPerMonthInterest(sumofamount, interestrate, loanlimittime);

                for (int i = 1; i <= loanlimittime; i++) {
                    Repayplan repayplan = new Repayplan();
                    repayplan.setId(Util.getID());
                    repayplan.setWorkid(execution.getWorkId());
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.MONTH, i);
                    cal.add(Calendar.DAY_OF_MONTH, -1);
                    repayplan.setRepaydate(cal.getTime());

                    if (i != loanlimittime) {
                        repayplan.setRepayamount(new BigDecimal(perMonthPrincipalInterest));
                        repayplan.setRepaycapital(mapPrincipal.get(i));
                        repayplan.setRepayaccrual(mapInterest.get(i));
                        repaycapital = repaycapital.subtract(mapPrincipal.get(i));
                        repayplan.setLoanbalance(repaycapital);
                    } else {
                        repayplan.setRepayamount(repaycapital.add(mapInterest.get(i)));
                        repayplan.setRepaycapital(repaycapital);
                        repayplan.setRepayaccrual(mapInterest.get(i));
                        repayplan.setLoanbalance(new BigDecimal(0));
                    }
                    repayplan.setRepayterm(i);
                    repayplan.setRepaymethod(repaymethod);
                    repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                    repayplan.setChgdt(new Date());
                    repayplan.setStatus(0);
                    repayplanMapper.insert(repayplan);
                }
            }
            if (repaymethod.equals("3")) {
                log.info("进入还款方式为等额本息");
                String interestratetype = repaytoinfo.getInterestratetype();
                BigDecimal interestrate = null;
                if (interestratetype.equals("1")) {
                    interestrate = repaytoinfo.getInterestrate().multiply(new BigDecimal(30));
                }
                if (interestratetype.equals("2")) {
                    interestrate = repaytoinfo.getInterestrate();
                }
                if (interestratetype.equals("3")) {
                    interestrate = repaytoinfo.getInterestrate().divide(new BigDecimal(12), 9, BigDecimal.ROUND_HALF_UP);
                }
                BigDecimal sumofamount = repaytoinfo.getSumofamount();
                Integer loanlimittime = Integer.parseInt(repaytoinfo.getLoanlimittime());
                BigDecimal repayaccrual = sumofamount.multiply(interestrate);
                log.info("开始循环");
                for (int i = 1; i <= loanlimittime; i++) {

                    Repayplan repayplan = new Repayplan();
                    repayplan.setId(Util.getID());
                    repayplan.setWorkid(execution.getWorkId());
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.MONTH, i);
                    cal.add(Calendar.DAY_OF_MONTH, -1);
                    repayplan.setRepaydate(cal.getTime());

                    if (i != loanlimittime) {
                        repayplan.setLoanbalance(sumofamount);
                        repayplan.setRepayamount(new BigDecimal(0).add(repayaccrual));
                        repayplan.setRepaycapital(new BigDecimal(0));
                    } else {
                        repayplan.setLoanbalance(new BigDecimal(0));
                        repayplan.setRepayamount(sumofamount.add(repayaccrual));
                        repayplan.setRepaycapital(sumofamount);
                    }
                    repayplan.setRepayaccrual(repayaccrual);
                    repayplan.setRepayterm(i);
                    repayplan.setRepaymethod(repaymethod);
                    repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                    repayplan.setChgdt(new Date());
                    repayplan.setStatus(0);
                    repayplanMapper.insert(repayplan);
                    log.info("循环结束", i);
                }

            }
            if (repaymethod.equals("4")) {
                log.info("进入还款方式为自主月供");
                String interestratetype = repaytoinfo.getInterestratetype();
                //批复利率
                Double interestrate = null;
                if (interestratetype.equals("1")) {
                    //日利率
                    interestrate = repaytoinfo.getInterestrate().multiply(new BigDecimal(30)).doubleValue();
                }
                if (interestratetype.equals("2")) {
                    //月利率
                    interestrate = repaytoinfo.getInterestrate().doubleValue() * 12;
                }
                if (interestratetype.equals("3")) {
                    //年利率
                    interestrate = repaytoinfo.getInterestrate().doubleValue();
                }
                //批复金额
                Double sumofamount = repaytoinfo.getSumofamount().doubleValue();
                //批复贷款期限
                Integer loanlimittime = Integer.parseInt(repaytoinfo.getLoanlimittime());
                //实际贷款期限
                //TODO 模板中的实际期望总显 RATE(120,-21760,1200000,0,0)中的第一个值
                Integer actualtimelimit = 120;
                BigDecimal repaycapital = repaytoinfo.getSumofamount();
                //每月还款本息
                double perMonthPrincipalInterest = AverageCapitalPlusInterest.getPerMonthPrincipalInterest(sumofamount, interestrate, actualtimelimit);
                //每月还款本金
                Map<Integer, BigDecimal> mapPrincipal = AverageCapitalPlusInterest.getPerMonthPrincipal(sumofamount, interestrate, actualtimelimit);
                //每月还款利息
                Map<Integer, BigDecimal> mapInterest = AverageCapitalPlusInterest.getPerMonthInterest(sumofamount, interestrate, actualtimelimit);

                for (int i = 1; i <= loanlimittime; i++) {
                    Repayplan repayplan = new Repayplan();
                    repayplan.setId(Util.getID());
                    repayplan.setWorkid(execution.getWorkId());
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.MONTH, i);
                    cal.add(Calendar.DAY_OF_MONTH, -1);
                    repayplan.setRepaydate(cal.getTime());

                    if (i != loanlimittime) {
                        //应还款金额
                        repayplan.setRepayamount(new BigDecimal(perMonthPrincipalInterest));
                        //应还款本金
                        repayplan.setRepaycapital(mapPrincipal.get(i));
                        //应还款利息
                        repayplan.setRepayaccrual(mapInterest.get(i));
                        repaycapital = repaycapital.subtract(mapPrincipal.get(i));
                        //贷款余额
                        repayplan.setLoanbalance(repaycapital);
                    } else {
                        repayplan.setRepayamount(repaycapital.add(mapInterest.get(i)));
                        repayplan.setRepaycapital(repaycapital);
                        repayplan.setRepayaccrual(mapInterest.get(i));
                        repayplan.setLoanbalance(new BigDecimal(0));
                    }
                    repayplan.setRepayterm(i);
                    repayplan.setRepaymethod(repaymethod);
                    repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                    repayplan.setChgdt(new Date());
                    repayplan.setStatus(0);
                    repayplanMapper.insert(repayplan);
                }
                double realInterestRate = (perMonthPrincipalInterest - sumofamount / actualtimelimit) / sumofamount;
                BigDecimal bd = BigDecimal.valueOf(realInterestRate);
                double dou = bd.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
                Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(execution.getWorkId());
                if (postloaninfo != null) {
                    postloaninfo.setRealinterestrate(BigDecimal.valueOf(dou));
                    postloaninfo.setRealinterestratetype("2");
                    postloaninfoMapper.updateByPrimaryKey(postloaninfo);
                }
            }
        }
        return new TaskResult(true, "还款计划成功生成");
    }
}

