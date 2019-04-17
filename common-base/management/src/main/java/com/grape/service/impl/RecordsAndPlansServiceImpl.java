package com.grape.service.impl;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.RecordsAndPlansResponse;
import com.grape.controller.reponse.bean.RepaymentplanBean;
import com.grape.controller.reponse.bean.RepayplanmainBean;
import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayplan;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.base.PostloaninfoMapper;
import com.grape.model.mapper.base.RepayplanMapper;
import com.grape.model.mapper.external.RecordsAndPlansExMapper;
import com.grape.service.RecordsAndPlansService;
import com.grape.util.AverageCapitalPlusInterest;
import com.grape.util.PageBean;
import com.grape.util.Util;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecordsAndPlansServiceImpl extends BaseMapper implements RecordsAndPlansService {

    @Autowired
    private RecordsAndPlansExMapper recordsAndPlansExMapper;

    @Autowired
    private RepayplanMapper repayplanMapper;

    @Autowired
    private PostloaninfoMapper postloaninfoMapper;


    @Override
    public RecordsAndPlansResponse recordsAndPlansResponse(String workId, PageBean pageBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(3);
        paramMap.put("workid", workId);
        paramMap.put("pagenum", pageBean.getCurrentPage());
        paramMap.put("pagesize", pageBean.getPageSize());
        RepayplanmainBean repayPlanMainBean = recordsAndPlansExMapper.repayplanmainBean(paramMap);
        if (repayPlanMainBean != null && repayPlanMainBean.getCvs() != null) {
            double cvs = repayPlanMainBean.getCvs().setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            if (cvs > 0.7) {
                repayPlanMainBean.setStrcvs(cvs + ">0.7");
            }
            if (cvs < 0.7) {
                repayPlanMainBean.setStrcvs(cvs + "<0.7");
            }
            if (cvs == 0.7) {
                repayPlanMainBean.setStrcvs(cvs + "=0.7");
            }
        }
        List<RepaymentplanBean> repaymentPlanBeanList = recordsAndPlansExMapper.repaymentplanBeanlist(paramMap);
        Integer countInfo = recordsAndPlansExMapper.repaymentplanBeanCount(paramMap);
        return new RecordsAndPlansResponse(repayPlanMainBean, repaymentPlanBeanList, countInfo);
    }


    @Override
    public void saveRepaymentplan(String workId) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(1);
        paramMap.put("workid", workId);

        Postloaninfo postLoan = recordsAndPlansExMapper.getPostloaninfo(paramMap);
        if (postLoan != null) {
            postLoan.setNextrepaydate(null);
            postloaninfoMapper.updateByPrimaryKey(postLoan);
        }
        //假如此流水是展期，清除原流水下次还款日
        List<Repaytoinfo> list = recordsAndPlansExMapper.getrepaytoinfo(paramMap);
        if (list.size() > 0) {
            Repaytoinfo repaytoInfo = list.get(0);
            //查询还款方式
            String repayMethod = repaytoInfo.getRepaymethod();

            repaytoInfo.setInterestrate(repaytoInfo.getInterestrate().divide(new BigDecimal(100)));
            //还款方式为按息日期
            if ("1".equals(repayMethod)) {
                String interestRateType = repaytoInfo.getInterestratetype();
                BigDecimal interestRate = null;

                Map<String, Object> map = recordsAndPlansExMapper.getProduct(paramMap);
                String productNo = map.get("productno").toString();
                String productType = map.get("producttype").toString();

                //赎楼贷求日利率
                if ("ZQ001".equals(productNo) || "2".equals(productType)) {

                    if ("1".equals(interestRateType)) {
                        interestRate = repaytoInfo.getInterestrate();
                    }
                    if ("2".equals(interestRateType)) {
                        interestRate = repaytoInfo.getInterestrate().divide(new BigDecimal(30), 9, BigDecimal.ROUND_HALF_UP);
                    }
                    if ("3".equals(interestRateType)) {
                        interestRate = repaytoInfo.getInterestrate().divide(new BigDecimal(365), 9, BigDecimal.ROUND_HALF_UP);
                    }

                    BigDecimal sumofAmount = repaytoInfo.getSumofamount();
                    Integer loanLimitTime = Integer.parseInt(repaytoInfo.getLoanlimittime());
                    BigDecimal repayAccrual = sumofAmount.multiply(interestRate);

                    for (int i = 1; i <= loanLimitTime; i++) {

                        Repayplan repayplan = new Repayplan();
                        repayplan.setId(Util.getID());
                        repayplan.setWorkid(workId);
                        Calendar cal = Calendar.getInstance();
                        cal.add(Calendar.DAY_OF_MONTH, i);
                        repayplan.setRepaydate(cal.getTime());

                        if (i != loanLimitTime) {
                            repayplan.setLoanbalance(sumofAmount);
                            repayplan.setRepayamount(new BigDecimal(0).add(repayAccrual));
                            repayplan.setRepaycapital(new BigDecimal(0));
                        } else {
                            repayplan.setLoanbalance(new BigDecimal(0));
                            repayplan.setRepayamount(sumofAmount.add(repayAccrual));
                            repayplan.setRepaycapital(sumofAmount);
                        }
                        repayplan.setRepayaccrual(repayAccrual);
                        repayplan.setRepayterm(i);
                        repayplan.setRepaymethod(repayMethod);
                        repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                        repayplan.setChgdt(new Date());
                        repayplanMapper.insert(repayplan);
                    }
                }
                //房抵贷求月利率
                if ("ZQ002".equals(productNo) || "1".equals(productType)) {

                    if ("1".equals(interestRateType)) {
                        interestRate = repaytoInfo.getInterestrate().multiply(new BigDecimal(30));
                    }
                    if ("2".equals(interestRateType)) {
                        interestRate = repaytoInfo.getInterestrate();
                    }
                    if ("3".equals(interestRateType)) {
                        interestRate = repaytoInfo.getInterestrate().divide(new BigDecimal(12), 9, BigDecimal.ROUND_HALF_UP);
                    }

                    BigDecimal sumofAmount = repaytoInfo.getSumofamount();
                    Integer loanLimiTtime = Integer.parseInt(repaytoInfo.getLoanlimittime());
                    BigDecimal repayAccrual = sumofAmount.multiply(interestRate);

                    for (int i = 1; i <= loanLimiTtime; i++) {

                        Repayplan repayplan = new Repayplan();
                        repayplan.setId(Util.getID());
                        repayplan.setWorkid(workId);
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(Calendar.MONTH, i);
                        calendar.add(Calendar.DAY_OF_MONTH, -1);
                        repayplan.setRepaydate(calendar.getTime());

                        if (i != loanLimiTtime) {
                            repayplan.setLoanbalance(sumofAmount);
                            repayplan.setRepayamount(new BigDecimal(0).add(repayAccrual));
                            repayplan.setRepaycapital(new BigDecimal(0));
                        } else {
                            repayplan.setLoanbalance(new BigDecimal(0));
                            repayplan.setRepayamount(sumofAmount.add(repayAccrual));
                            repayplan.setRepaycapital(sumofAmount);
                        }
                        repayplan.setRepayaccrual(repayAccrual);
                        repayplan.setRepayterm(i);
                        repayplan.setRepaymethod(repayMethod);
                        repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                        repayplan.setChgdt(new Date());
                        repayplanMapper.insert(repayplan);
                    }
                }
            }
            if ("2".equals(repayMethod)) {
                String interestRateType = repaytoInfo.getInterestratetype();
                Double interestRate = null;
                if ("1".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate().multiply(new BigDecimal(30)).doubleValue();
                }
                if ("2".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate().doubleValue();
                }
                if ("3".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate().divide(new BigDecimal(12), 9, BigDecimal.ROUND_HALF_UP).doubleValue();
                }
                Double sumofAmount = repaytoInfo.getSumofamount().doubleValue();
                Integer loanLimitTime = Integer.parseInt(repaytoInfo.getLoanlimittime().toString());
                BigDecimal repayCapital = repaytoInfo.getSumofamount();

                double perMonthPrincipalInterest = AverageCapitalPlusInterest.getPerMonthPrincipalInterest(sumofAmount, interestRate, loanLimitTime);
                Map<Integer, BigDecimal> mapPrincipal = AverageCapitalPlusInterest.getPerMonthPrincipal(sumofAmount, interestRate, loanLimitTime);
                Map<Integer, BigDecimal> mapInterest = AverageCapitalPlusInterest.getPerMonthInterest(sumofAmount, interestRate, loanLimitTime);

                for (int i = 1; i <= loanLimitTime; i++) {
                    Repayplan repayplan = new Repayplan();
                    repayplan.setId(Util.getID());
                    repayplan.setWorkid(workId);
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.MONTH, i);
                    cal.add(Calendar.DAY_OF_MONTH, -1);
                    repayplan.setRepaydate(cal.getTime());

                    if (i != loanLimitTime) {
                        repayplan.setRepayamount(new BigDecimal(perMonthPrincipalInterest));
                        repayplan.setRepaycapital(mapPrincipal.get(i));
                        repayplan.setRepayaccrual(mapInterest.get(i));
                        repayCapital = repayCapital.subtract(mapPrincipal.get(i));
                        repayplan.setLoanbalance(repayCapital);
                    } else {
                        repayplan.setRepayamount(repayCapital.add(mapInterest.get(i)));
                        repayplan.setRepaycapital(repayCapital);
                        repayplan.setRepayaccrual(mapInterest.get(i));
                        repayplan.setLoanbalance(new BigDecimal(0));
                    }
                    repayplan.setRepayterm(i);
                    repayplan.setRepaymethod(repayMethod);
                    repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                    repayplan.setChgdt(new Date());
                    repayplanMapper.insert(repayplan);
                }
            }
            if ("3".equals(repayMethod)) {
                String interestRateType = repaytoInfo.getInterestratetype();
                BigDecimal interestRate = null;
                if ("1".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate().multiply(new BigDecimal(30));
                }
                if ("2".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate();
                }
                if ("3".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate().divide(new BigDecimal(12), 9, BigDecimal.ROUND_HALF_UP);
                }
                BigDecimal sumofAmount = repaytoInfo.getSumofamount();
                Integer loanLimitTime = Integer.parseInt(repaytoInfo.getLoanlimittime());
                BigDecimal repayAccrual = sumofAmount.multiply(interestRate);

                for (int i = 1; i <= loanLimitTime; i++) {

                    Repayplan repayplan = new Repayplan();
                    repayplan.setId(Util.getID());
                    repayplan.setWorkid(workId);
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.MONTH, i);
                    cal.add(Calendar.DAY_OF_MONTH, -1);
                    repayplan.setRepaydate(cal.getTime());

                    if (i != loanLimitTime) {
                        repayplan.setLoanbalance(sumofAmount);
                        repayplan.setRepayamount(new BigDecimal(0).add(repayAccrual));
                        repayplan.setRepaycapital(new BigDecimal(0));
                    } else {
                        repayplan.setLoanbalance(new BigDecimal(0));
                        repayplan.setRepayamount(sumofAmount.add(repayAccrual));
                        repayplan.setRepaycapital(sumofAmount);
                    }
                    repayplan.setRepayaccrual(repayAccrual);
                    repayplan.setRepayterm(i);
                    repayplan.setRepaymethod(repayMethod);
                    repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                    repayplan.setChgdt(new Date());
                    repayplanMapper.insert(repayplan);
                }
            }
            if ("4".equals(repayMethod)) {
                String interestRateType = repaytoInfo.getInterestratetype();
                //批复利率
                Double interestRate = null;
                if ("1".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate().multiply(new BigDecimal(30)).doubleValue();
                }
                if ("2".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate().doubleValue();
                }
                if ("3".equals(interestRateType)) {
                    interestRate = repaytoInfo.getInterestrate().divide(new BigDecimal(12), 9, BigDecimal.ROUND_HALF_UP).doubleValue();
                }
                //批复金额
                Double sumofAmount = repaytoInfo.getSumofamount().doubleValue();
                //批复贷款期限
                Integer loanLimitTime = Integer.parseInt(repaytoInfo.getLoanlimittime());
                //实际贷款期限
                Integer actualTimeLimit = 120;
                BigDecimal repayCapital = repaytoInfo.getSumofamount();
                //每月还款本息
                double perMonthPrincipalInterest = AverageCapitalPlusInterest.getPerMonthPrincipalInterest(sumofAmount, interestRate, actualTimeLimit);
                //每月还款本金
                Map<Integer, BigDecimal> mapPrincipal = AverageCapitalPlusInterest.getPerMonthPrincipal(sumofAmount, interestRate, actualTimeLimit);
                //每月还款利息
                Map<Integer, BigDecimal> mapInterest = AverageCapitalPlusInterest.getPerMonthInterest(sumofAmount, interestRate, actualTimeLimit);

                for (int i = 1; i <= loanLimitTime; i++) {
                    Repayplan repayplan = new Repayplan();
                    repayplan.setId(Util.getID());
                    repayplan.setWorkid(workId);
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.MONTH, i);
                    cal.add(Calendar.DAY_OF_MONTH, -1);
                    repayplan.setRepaydate(cal.getTime());

                    if (i != loanLimitTime) {
                        //应还款金额
                        repayplan.setRepayamount(new BigDecimal(perMonthPrincipalInterest));
                        //应还款本金
                        repayplan.setRepaycapital(mapPrincipal.get(i));
                        //应还款利息
                        repayplan.setRepayaccrual(mapInterest.get(i));
                        repayCapital = repayCapital.subtract(mapPrincipal.get(i));
                        //贷款余额
                        repayplan.setLoanbalance(repayCapital);
                    } else {
                        repayplan.setRepayamount(repayCapital.add(mapInterest.get(i)));
                        repayplan.setRepaycapital(repayCapital);
                        repayplan.setRepayaccrual(mapInterest.get(i));
                        repayplan.setLoanbalance(new BigDecimal(0));
                    }
                    repayplan.setRepayterm(i);
                    repayplan.setRepaymethod(repayMethod);
                    repayplan.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                    repayplan.setChgdt(new Date());
                    repayplanMapper.insert(repayplan);
                }
                double realInterestRate = (perMonthPrincipalInterest - sumofAmount / actualTimeLimit) / sumofAmount;
                BigDecimal bd = BigDecimal.valueOf(realInterestRate);
                double dou = bd.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
                Postloaninfo postloanInfo = postloaninfoMapper.selectByPrimaryKey(workId);
                if (postloanInfo != null) {
                    postloanInfo.setRealinterestrate(BigDecimal.valueOf(dou));
                    postloanInfo.setRealinterestratetype("2");
                    postloaninfoMapper.updateByPrimaryKey(postloanInfo);
                }
            }
        }
    }
    /*public static Double rate(Double Principal,Double MonthlyPayments,int Period,int Iterations,int Digit){
        double rate = 1,x,jd = 0.1,side = 0.1,i = 1;
		do{
			x = Principal/MonthlyPayments - (Math.pow(1+rate, Period)-1)/(Math.pow(rate+1, Period)*rate);
			if(x*side>0){
				side = -side;
				jd *=10;
			}
			rate += side/jd;
		}while(i++<Iterations&&Math.abs(x)>=1/Math.pow(10, Digit));
		if(i>Iterations)return Double.NaN;
		return rate;
	}*/
}
