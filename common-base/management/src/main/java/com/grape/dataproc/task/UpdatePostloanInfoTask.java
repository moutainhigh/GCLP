package com.grape.dataproc.task;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.grape.model.db.Overdue;
import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayplan;
import com.grape.service.RepayManagementService;
import com.grape.util.Util;
import org.springframework.transaction.annotation.Transactional;

/**
 * @描述 计算逾期的罚息和滞纳金定时器
 * @创建人 zyh
 * @创建时间 2018/11/13 11:34
 */
@Log4j
@Component
public class UpdatePostloanInfoTask {

    @Autowired
    private RepayManagementService repayManagementService;

    /**
     * @描述 修改贷款用户信息
     * @参数 []
     * @返回值 void
     * @创建人 zyh
     * @创建时间 2018/11/13 11:33
     */
    @Scheduled(cron = "0 0 0 * * ? ")
    @Transactional
    //@Scheduled(fixedDelay=100000)
    public void updatePostloanInfo() {
        try {
            //获取当前时间
            Calendar c = Calendar.getInstance();
            //结束时间为当前时间
            Date endDate = c.getTime();
            c.add(Calendar.DAY_OF_MONTH, -1);
            //开始时间为上个月时间
            Date startDate = c.getTime();
            log.info("贷后扫描定时器开始运行,开始时间为:" + Util.getDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒"));
            //查询需要还款的贷后信息
            List<Postloaninfo> postloaninfolist = repayManagementService.getPostloaninfolist(startDate, endDate);

            for (Postloaninfo postloaninfo : postloaninfolist) {
                //根据申请编号和还款期号查询还款信息
                List<Map<String, Object>> repaypment = repayManagementService.getRepaymentInfo(postloaninfo.getWorkid(), postloaninfo.getNextrefundissue());
                //应还款本金
                BigDecimal repaycapital = (BigDecimal) repaypment.get(0).get("repaycapital");
                //贷款余额 = 原贷款余额-还款本金
                postloaninfo.setLoanbalance(postloaninfo.getLoanbalance().subtract(repaycapital));

                BigDecimal refundmoneySum = new BigDecimal(0);
                BigDecimal refundinterestSum = new BigDecimal(0);

                for (Map<String, Object> map : repaypment) {
                    //还款本金
                    BigDecimal refundmoney = new BigDecimal(0);
                    //还款表的还款本金不为空
                    if (map.get("refundmoney") != null) {
                        refundmoney = (BigDecimal) map.get("refundmoney");
                    }
                    BigDecimal refundinterest = new BigDecimal(0);
                    //还款表的还款利息不能为空
                    if (map.get("refundinterest") != null) {
                        //还款利息
                        refundinterest = (BigDecimal) map.get("refundinterest");
                    }
                    //还款本金合计
                    refundmoneySum = refundmoneySum.add(refundmoney);
                    //还款利息合计
                    refundinterestSum = refundinterestSum.add(refundinterest);
                }
                //剩余还款本金 = 还款本金合计-应还款本金
                Double res1 = refundmoneySum.subtract((BigDecimal) repaypment.get(0).get("repaycapital")).doubleValue();
                //剩余还款利息 = 还款利息合计-应还款利息
                Double res2 = refundinterestSum.subtract((BigDecimal) repaypment.get(0).get("repayaccrual")).doubleValue();

                if (res1 < 0 || res2 < 0) {
                    //逾期标示
                    postloaninfo.setOverdueflg("Y");
                    //将下期划款期号设置为逾期期数
                    postloaninfo.setOverdueterm(postloaninfo.getNextrefundissue().toString());
                    if (res1 < 0) {
                        //逾期本金
                        postloaninfo.setOverduecorpus(new BigDecimal(-res1));
                    }
                    if (res2 < 0) {
                        //逾期利息
                        postloaninfo.setOverdueaccrual(new BigDecimal(-res2));
                    }
                    //上次逾期日设置为此时应还款日期
                    postloaninfo.setOverduedate((Date) repaypment.get(0).get("repaydate"));
                    //累计逾期次数+1
                    postloaninfo.setAddoverduetimenum(postloaninfo.getAddoverduetimenum() + 1);

                    Overdue overdue = new Overdue();
                    overdue.setId(Util.getID());
                    overdue.setWorkid(postloaninfo.getWorkid());
                    overdue.setOverdueterm(postloaninfo.getNextrefundissue().toString());
                    overdue.setOverduecorpus(new BigDecimal(-res1));
                    overdue.setOverdueaccrual(new BigDecimal(-res2));
                    overdue.setLatetime(new Date());
                    //添加到逾期表
                    repayManagementService.saveOverdue(overdue);

                }
                //根据申请编号和下次还款期号+1去查询还款计划
                Repayplan repayplan = repayManagementService.getRepayplan(postloaninfo.getWorkid(), postloaninfo.getNextrefundissue() + 1);
                if (repayplan != null) {
                    //下次还款日设置为还款计划的应还款日期
                    postloaninfo.setNextrepaydate(repayplan.getRepaydate());
                    //下次还款期号设置为还款计划的还款期数
                    postloaninfo.setNextrefundissue(repayplan.getRepayterm());
                    //下次还款金额设置为还款计划的还款金额
                    postloaninfo.setNextrefundmoney(repayplan.getRepayamount());
                }

                repayManagementService.updatepostloaninfo(postloaninfo);
            }

            List<Postloaninfo> postloaninfos = repayManagementService.getPostloaninfolist(null, null);
            for (Postloaninfo postloaninfo : postloaninfos) {
                //TODO
                //逾期标示为Y
                if ("Y".equals(postloaninfo.getOverdueflg())) {
                    //当前逾期天数
                    postloaninfo.setOverduenum(postloaninfo.getOverduenum() + 1);
                    //累计逾期天数
                    postloaninfo.setAddoverduedaynum(postloaninfo.getAddoverduedaynum() + 1);
                    repayManagementService.updatepostloaninfo(postloaninfo);
                }
            }

            List<Overdue> overdueList = repayManagementService.getoverduelist();
            for (Overdue overdue : overdueList) {
                Postloaninfo postloaninfo = repayManagementService.getpostloaninfo(overdue.getWorkid());

                //逾期本金大于0 逾期利息大于0 罚息金额大于0 滞纳金大于0
                if (overdue.getOverduecorpus().doubleValue() > 0 || overdue.getOverdueaccrual().doubleValue() > 0
                        || overdue.getDefaultinterest().doubleValue() > 0 || overdue.getDelayingpayment().doubleValue() > 0) {
                    //TODO
                    if ("1".equals(postloaninfo.getRepaymethod()) || "3".equals(postloaninfo.getRepaymethod())) {
                        //贷后余额
                        Double loanBalance = postloaninfo.getLoanbalance().doubleValue();

                        if (loanBalance > 0) {
                            int day = (int) ((
                                    System.currentTimeMillis() - overdue.getLatetime().getTime()) / (1000 * 3600 * 24));
                            overdue.setOverduedays(day);
                            Double penaltyinterest = loanBalance * 0.1 / 100 * day;
                            //罚息金额
                            overdue.setDefaultinterest(BigDecimal.valueOf(penaltyinterest));
                            if (day > 0) {
                                //滞纳金
                                overdue.setDelayingpayment(BigDecimal.valueOf(penaltyinterest * 0.05 / 100 * (day - 1)));
                            }
                        }
                    }
                    //TODO
                    if ("2".equals(postloaninfo.getRepaymethod()) || "4".equals(postloaninfo.getRepaymethod())) {
                        //逾期本金
                        Double overduecorpus = overdue.getOverduecorpus().doubleValue();
                        if (overduecorpus > 0) {
                            int day = (int) ((System.currentTimeMillis() - overdue.getLatetime().getTime()) / (1000 * 3600 * 24));
                            overdue.setOverduedays(day);
                            Double penaltyinterest = overduecorpus * 0.1 / 100 * day;
                            //罚息
                            overdue.setDefaultinterest(BigDecimal.valueOf(penaltyinterest));
                            if (day > 0) {
                                overdue.setDelayingpayment(BigDecimal.valueOf(penaltyinterest * 0.05 / 100 * (day - 1)));
                            }
                        }
                    }
                }
                repayManagementService.updateOverdue(overdue);
            }
            log.info("贷后扫描定时器开始结束,结束时间为:" + Util.getDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒"));
        } catch (Exception e) {
            log.error("贷后定时器扫描出错,出错时间为:" + Util.getDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒"), e);
        }
    }
}
