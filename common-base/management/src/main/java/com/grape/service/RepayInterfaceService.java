package com.grape.service;

import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

import com.grape.model.db.Overdue;
import com.grape.model.db.Repayinfo;
import com.grape.model.db.Repayplan;

/**
 * @描述 还款模块Service层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/15 14:14
 */
public interface RepayInterfaceService {
    /**
     * @描述 还款
     * @参数 [workid, refundissue, repaytype, realityrefunddate, refundmoney, refundinterest, breachofcontract, interestmoney, delayingpayment]
     * @返回值 java.lang.String
     * @创建人 zyh
     * @创建时间 2018/11/15 14:15
     */
    String repayInterfaceReponse(String workid, Integer refundissue, String repaytype,
                                 Date realityrefunddate, BigDecimal refundmoney, BigDecimal refundinterest,
                                 BigDecimal breachofcontract, BigDecimal interestmoney, BigDecimal delayingpayment) throws UnknownHostException;

    /**
     * @描述
     * @参数 [workid, realityrefunddate]
     * @返回值 void
     * @创建人 zyh
     * @创建时间 2018/11/15 14:15
     */
    void setSettledate(String workid, Date realityrefunddate);

    /**
     * @描述
     * @参数 [workid, refundmoney]
     * @返回值 void
     * @创建人 zyh
     * @创建时间 2018/11/15 14:15
     */
    void updateAccountQuota(String workid, BigDecimal refundmoney);

    /**
     * TODO  正常还款业务层接口
     *
     * @param workId            流水编号
     * @param refundissue       还款期数
     * @param realityRefundDate 还款时间
     * @param refundMoney       还款本金
     * @param refundInterest    还款利息
     * @return java.lang.String
     * @author zyh
     * @date 21:05 2018/12/29
     **/
    String normalRepayment(String workId, Integer refundissue, Date realityRefundDate, BigDecimal refundMoney, BigDecimal refundInterest) throws UnknownHostException;

    /**
     * TODO  逾期还款业务层接口
     *
     * @param workId            流水编号
     * @param refundissue       还款期数
     * @param realityRefundDate 还款时间
     * @param refundMoney       还款本金
     * @param refundInterest    还款利息
     * @param interestMoney     罚息金额
     * @param delayingPayment   滞纳金
     * @return java.lang.String
     * @author zyh
     * @date 21:16 2018/12/29
     **/
    String overdueRepayment(String workId, Integer refundissue, Date realityRefundDate, BigDecimal refundMoney, BigDecimal refundInterest,
                            BigDecimal interestMoney, BigDecimal delayingPayment) throws UnknownHostException;

    /**
     * @param workid
     * @param repaytype
     * @return
     * @创建人 cwc
     * @创建时间 2019/1/2 10:10
     */
    List<Repayplan> selectPrePayResponse(String workid, String repaytype);

    /**
     * @param workid
     * @return
     * @创建人 cwc
     * @创建时间 2019/1/2 10:15
     */
    List<Repayinfo> selectRrpayInfoResponse(String workid);

    /**
     * TODO     提前还款
     *
     * @param workId
     * @param refundMoney
     * @param refundInterest
     * @param breachOfContract
     * @param realityRefundDate
     * @return java.lang.String
     * @author zyh
     * @date 16:00 2019/1/2
     **/
    String advanceRepayment(String workId, BigDecimal refundMoney, BigDecimal refundInterest, BigDecimal breachOfContract, Date realityRefundDate) throws UnknownHostException;

    /**
     * @param workid
     * @return
     * @创建人 cwc
     * @创建时间 2019/1/2 13:45
     */
    List<Overdue> selectOverdueResponse(String workid);

    /**
     * TODO     展期还款
     *
     * @param workId
     * @param refundissue
     * @param realityRefundDate
     * @param refundMoney
     * @param refundInterest
     * @return java.lang.String
     * @author zyh
     * @date 11:32 2019/1/4
     **/
    String extendedRepayment(String workId, Integer refundissue, Date realityRefundDate, BigDecimal refundMoney, BigDecimal refundInterest) throws UnknownHostException;
}	
