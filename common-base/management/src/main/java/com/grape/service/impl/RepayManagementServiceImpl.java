package com.grape.service.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.grape.controller.reponse.BasicInformationResponse;
import com.grape.controller.reponse.ManagementlistResponse;
import com.grape.controller.reponse.OverduelistResponse;
import com.grape.controller.reponse.PromptpaymentsResponse;
import com.grape.controller.reponse.RepayManagementResponse;
import com.grape.controller.reponse.RepaymenthistoryResponse;
import com.grape.controller.reponse.bean.BasicInformationBean;
import com.grape.controller.reponse.bean.ManagementlistBean;
import com.grape.controller.reponse.bean.OverdueStatBean;
import com.grape.controller.reponse.bean.OverduelistBean;
import com.grape.controller.reponse.bean.PromptpaymentBean;
import com.grape.controller.reponse.bean.RepayManagementBean;
import com.grape.controller.reponse.bean.RepaymenthistoryBean;
import com.grape.controller.reponse.bean.StatisticalRepay;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.model.db.Overdue;
import com.grape.model.db.OverdueExample;
import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayplan;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.base.OverdueMapper;
import com.grape.model.mapper.base.PostloaninfoMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.model.mapper.external.RepayManagementExMapper;
import com.grape.service.RepayManagementService;
import com.grape.util.PageBean;

@Service
public class RepayManagementServiceImpl extends BaseMapper implements RepayManagementService {

    @Autowired
    private RepayManagementExMapper repayManagementExMapper;

    @Autowired
    private PostloaninfoMapper postloaninfoMapper;

    @Autowired
    private OverdueMapper overdueMapper;

    @Autowired
    private DoctaskExMapper doctaskExMapper;

    public OverdueStatBean getOverdueStatBean(String binding, UserOfOrgBean userOfOrgBean, BigDecimal num) {
        //笔数
        BigDecimal count = new BigDecimal(0);
        //逾期金额
        BigDecimal sum = new BigDecimal(0);
        //上期笔数
        BigDecimal lastCount = new BigDecimal(0);
        //当前月数逾期率
        BigDecimal overdueProb = new BigDecimal(0);
        //上月逾期率
        BigDecimal lastOverdueProb = new BigDecimal(0);
        //标题
        String title;

        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        paramMap.put("organizationno", userOfOrgBean.getOrganizationno());
        paramMap.put("binding", binding);

        LocalDate endDate = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()).minusDays(1);

        //查询当前月的逾期信息
        Map<String, Object> overdueInfoMap = repayManagementExMapper.getOverdueInfo(paramMap);
        if (null != overdueInfoMap) {
            count = BigDecimal.valueOf((long) overdueInfoMap.get("count"));
            sum = (BigDecimal) overdueInfoMap.get("sum");
            overdueProb = count.divide(num, 4, BigDecimal.ROUND_HALF_UP);
            paramMap.put("endDate", endDate);
        }

        //查询上个月的逾期笔数
        Map<String, Object> lastMap = repayManagementExMapper.getOverdueInfo(paramMap);
        if (null != lastMap && null != lastMap.get("count")) {
            lastCount = BigDecimal.valueOf((long) lastMap.get("count"));
            lastOverdueProb = lastCount.divide(num, 4, BigDecimal.ROUND_HALF_UP);
        }

        if (("0".equals(binding))) {
            title = "全部";
        } else if (("120".equals(binding))) {
            title = "超过90天";
        } else {
            title = binding + "天以内";
        }
        return new OverdueStatBean(title, count, sum, overdueProb, lastOverdueProb);
    }

    @Override
    public List<OverdueStatBean> overdueStatReponse(UserOfOrgBean userOfOrgBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        //企业类型
        paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        //企业编号
        paramMap.put("organizationno", userOfOrgBean.getOrganizationno());
        //根据资金方查询贷后信息
        BigDecimal num = BigDecimal.valueOf(repayManagementExMapper.getnum(paramMap));
        if (null != num) {
            //分别查询逾期全部、逾期30天内、逾期60天内、逾期90天、超过90天的逾期笔数等相关信息
            OverdueStatBean allDaysOverdueStatBean = this.getOverdueStatBean("0", userOfOrgBean, num);
            OverdueStatBean less30DaysOverdueStatBean = this.getOverdueStatBean("30", userOfOrgBean, num);
            OverdueStatBean less60DaysOverdueStatBean = this.getOverdueStatBean("60", userOfOrgBean, num);
            OverdueStatBean less90DaysOverdueStatBean = this.getOverdueStatBean("90", userOfOrgBean, num);
            OverdueStatBean more90DaysOverdueStatBean = this.getOverdueStatBean("120", userOfOrgBean, num);
            return Lists.newArrayList(allDaysOverdueStatBean, less30DaysOverdueStatBean, less60DaysOverdueStatBean,
                    less90DaysOverdueStatBean, more90DaysOverdueStatBean);
        }
        return null;
    }


    @Override
    public ManagementlistResponse managementlistResponse(Date startDate, Date endDate,
                                                         String productNo, String workId, String custName, String cerdId, String houseNo,
                                                         PageBean pageBean, UserOfOrgBean userOfOrgBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(15);
        paramMap.put("startDate", startDate);
        paramMap.put("endDate", endDate);
        paramMap.put("productno", productNo);
        paramMap.put("workid", workId);
        paramMap.put("custname", custName);
        paramMap.put("cerdid", cerdId);
        paramMap.put("houseno", houseNo);
        paramMap.put("pagenum", pageBean.getCurrentPage());
        paramMap.put("pagesize", pageBean.getPageSize());
        paramMap.put("plevel", userOfOrgBean.getPlevel());
        paramMap.put("workerid", userOfOrgBean.getWorkerid());
        paramMap.put("dlevel", userOfOrgBean.getDlevel());
        paramMap.put("departmentno", userOfOrgBean.getDepartmentno());
        paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        paramMap.put("organizationno", userOfOrgBean.getOrganizationno());
        List<ManagementlistBean> managementListBean = repayManagementExMapper.managementlistBean(paramMap);
        for (ManagementlistBean management : managementListBean) {
            Map<String, Object> managementMap = Maps.newHashMapWithExpectedSize(1);
            managementMap.put("workid", management.getWorkid());
            management.setCoborrower(doctaskExMapper.getcoborrower(managementMap));
            management.setGuarantor(doctaskExMapper.getguarantor(managementMap));
            management.setMortgagor(doctaskExMapper.getmortgagor(managementMap));
            management.setHouseid(doctaskExMapper.gethouseid(managementMap));
        }
        Integer countInfo = repayManagementExMapper.managementCount(paramMap);
        return new ManagementlistResponse(managementListBean, countInfo);
    }

    @Override
    public RepayManagementResponse repayManagementResponse(String workId, String checkType, PageBean pageBean) {
        //根据workid查询贷后信息
        Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workId);
        //设置为已读
        postloaninfo.setIshaveread("Y");
        postloaninfoMapper.updateByPrimaryKey(postloaninfo);

        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(5);
        paramMap.put("workid", workId);
        paramMap.put("checktype", checkType);
        paramMap.put("pagenum", pageBean.getCurrentPage());
        paramMap.put("pagesize", pageBean.getPageSize());

        //根据请求参数查询
        StatisticalRepay statisticalRepay = repayManagementExMapper.statisticalRepay(paramMap);
        Map<String, Object> repayManagementMap = repayManagementExMapper.getPostloaninfo(paramMap);

        if (repayManagementMap != null && repayManagementMap.get("repaymethod") != null && repayManagementMap.get("loanbalance") != null) {
            //还款方式为3
            if ("3".equals(repayManagementMap.get("repaymethod").toString())) {
                //违约金
                statisticalRepay.setBreachOfContract(BigDecimal.valueOf((Double.parseDouble(repayManagementMap.get("loanbalance").toString())) * 1 / 100));
            }
            //还款方式为4或还款方式为2
            if ("4".equals(repayManagementMap.get("repaymethod").toString()) || "2".equals(repayManagementMap.get("repaymethod").toString())) {
                statisticalRepay.setBreachOfContract(BigDecimal.valueOf((Double.parseDouble(repayManagementMap.get("loanbalance").toString())) * 2 / 100));
            }

        }
        //查询还款信息
        List<RepayManagementBean> repayManagementBeanlist = repayManagementExMapper.repayManagementBeanlist(paramMap);
        //查询还款信息数
        Integer countInfo = repayManagementExMapper.repayManagementBeanCount(paramMap);

        for (RepayManagementBean repayManagementBean : repayManagementBeanlist) {

            paramMap.put("refundissue", repayManagementBean.getRepayterm());
            Map<String, Object> repayMap = repayManagementExMapper.getDatetime(paramMap);

            if (repayMap != null) {
                if (repayMap.get("realityrefunddate") != null) {
                    if (repayManagementBean.getRepaycapital().doubleValue() <= repayManagementBean.getRefundmoneySum().doubleValue()
                            && repayManagementBean.getRepayaccrual().doubleValue() <= repayManagementBean.getRefundinterestSum().doubleValue()) {
                        repayManagementBean.setRealityrefunddate((Timestamp) repayMap.get("realityrefunddate"));
                    }
                }
                if (repayMap.get("interestmoneydate") != null && repayManagementBean.getDefaultinterest() != null) {
                    if (repayManagementBean.getDefaultinterest().doubleValue() == 0) {
                        repayManagementBean.setInterestmoneydate((Timestamp) repayMap.get("interestmoneydate"));
                    }
                }
                if (repayMap.get("delayingpaymentdate") != null && repayManagementBean.getDelayingpayment() != null) {
                    if (repayManagementBean.getDelayingpayment().doubleValue() == 0) {
                        repayManagementBean.setDelayingpaymentdate((Timestamp) repayMap.get("delayingpaymentdate"));
                    }
                }
                if (repayManagementBean.getRepaycapital().doubleValue() >= repayManagementBean.getRefundmoneySum().doubleValue()) {
                    if (repayManagementBean.getRepaycapital().doubleValue() == repayManagementBean.getRefundmoneySum().doubleValue()
                            && repayManagementBean.getRepayaccrual().doubleValue() == repayManagementBean.getRefundinterestSum().doubleValue()
                            && (repayManagementBean.getDefaultinterest() == null || repayManagementBean.getDefaultinterest().doubleValue() == 0)
                            && (repayManagementBean.getDelayingpayment() == null || repayManagementBean.getDelayingpayment().doubleValue() == 0)) {
                            repayManagementBean.setRepaymethod(repayManagementExMapper.getmethod(paramMap).get("coddes").toString());
                    }
                } else {
                    repayManagementBean.setRepaymethod("提前还款");
                }
            }
        }
        if (statisticalRepay.getReminddays() == 0) {
            statisticalRepay.setReminddays(null);
        }
        return new RepayManagementResponse(statisticalRepay, repayManagementBeanlist, countInfo);
    }

    @Override
    public RepayManagementResponse repayRollOverResponse(String workId, String checkType, PageBean pageBean) {
        String newWorkId = repayManagementExMapper.getnewWorkid(workId);
        if (newWorkId != null && !("".equals(newWorkId))) {
            Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(5);
            paramMap.put("workid", newWorkId);
            paramMap.put("checktype", checkType);
            paramMap.put("pagenum", pageBean.getCurrentPage());
            paramMap.put("pagesize", pageBean.getPageSize());

            //查询累计的还款信息
            StatisticalRepay statisticalRepay = repayManagementExMapper.statisticalRepay(paramMap);

            //查询贷后信息的贷款余额和还款方式
            Map<String, Object> repayManagementMap = repayManagementExMapper.getPostloaninfo(paramMap);

            if (repayManagementMap != null && repayManagementMap.get("repaymethod") != null && repayManagementMap.get("loanbalance") != null) {

                //还款方式为3,当前提前还款违约金设置为贷款余额百分之一
                if ("3".equals(repayManagementMap.get("repaymethod").toString())) {
                    statisticalRepay.setBreachOfContract(BigDecimal.valueOf((Double.parseDouble(repayManagementMap.get("loanbalance").toString())) * 1 / 100));
                }

                //还款方式为4,和2,当前提前还款违约金设置为贷款余额的百分之二
                if ("4".equals(repayManagementMap.get("repaymethod").toString()) || "2".equals(repayManagementMap.get("repaymethod").toString())) {
                    statisticalRepay.setBreachOfContract(BigDecimal.valueOf((Double.parseDouble(repayManagementMap.get("loanbalance").toString())) * 2 / 100));
                }
            }

            //查询还款计划的应还款本金和批复信息的批复金额,不为空则执行下列代码
            if (repayManagementExMapper.getrepaycapital(workId) != null && repayManagementExMapper.getsumofamount(newWorkId) != null) {
                //还款本金
                BigDecimal repayCapital = (BigDecimal) repayManagementExMapper.getrepaycapital(workId).get("repaycapital");
                //批复金额
                BigDecimal sumofAmount = (BigDecimal) repayManagementExMapper.getsumofamount(newWorkId).get("sumofamount");
                //设置展期差额(还款本金 - 批复金额)
                statisticalRepay.setDifference(repayCapital.subtract(sumofAmount));
            }

            //分页查询还款计划信息
            List<RepayManagementBean> repayManagementBeanList = repayManagementExMapper.repayManagementBeanlist(paramMap);

            //查询还款计划信息数量
            Integer countInfo = repayManagementExMapper.repayManagementBeanCount(paramMap);

            for (RepayManagementBean repayManagementBean : repayManagementBeanList) {
                //还款期数
                paramMap.put("refundissue", repayManagementBean.getRepayterm());
                //查询实际划款日期、罚息缴纳日期、滞纳金缴纳日期
                Map<String, Object> repayMap = repayManagementExMapper.getDatetime(paramMap);

                if (repayMap != null) {
                    if (repayMap.get("realityrefunddate") != null) {
                        //应还本金 <= 实还本金 和 应还利息 <= 实还利息
                        if (repayManagementBean.getRepaycapital().doubleValue() <= repayManagementBean.getRefundmoneySum().doubleValue()
                                && repayManagementBean.getRepayaccrual().doubleValue() <= repayManagementBean.getRefundinterestSum().doubleValue()) {
                            //实际还款日期
                            repayManagementBean.setRealityrefunddate((Timestamp) repayMap.get("realityrefunddate"));
                        }
                    }
                    //罚息缴纳日期不为空 和 应罚利息不为空
                    if (repayMap.get("interestmoneydate") != null && repayManagementBean.getDefaultinterest() != null) {
                        //应缴罚息等于0,设置罚息缴纳日期
                        if (repayManagementBean.getDefaultinterest().doubleValue() == 0) {
                            repayManagementBean.setInterestmoneydate((Timestamp) repayMap.get("interestmoneydate"));
                        }
                    }
                    //滞纳金缴纳日期不为空 和 应缴滞纳金不为空
                    if (repayMap.get("delayingpaymentdate") != null && repayManagementBean.getDelayingpayment() != null) {
                        //应缴滞纳金等于0,设置滞纳金缴纳日期
                        if (repayManagementBean.getDelayingpayment().doubleValue() == 0) {
                            repayManagementBean.setDelayingpaymentdate((Timestamp) repayMap.get("delayingpaymentdate"));
                        }
                    }
                    //应还本金 >= 实还本金
                    if (repayManagementBean.getRepaycapital().doubleValue() >= repayManagementBean.getRefundmoneySum().doubleValue()) {
                        //应还本金 == 实还本金 和 应还利息==实还利息 和 (应缴罚息不为0或等于0) 和 (应缴滞纳金为空或等于0),,
                        if (repayManagementBean.getRepaycapital().doubleValue() == repayManagementBean.getRefundmoneySum().doubleValue()
                                && repayManagementBean.getRepayaccrual().doubleValue() == repayManagementBean.getRefundinterestSum().doubleValue()
                                && (repayManagementBean.getDefaultinterest() == null || repayManagementBean.getDefaultinterest().doubleValue() == 0)
                                && (repayManagementBean.getDelayingpayment() == null || repayManagementBean.getDelayingpayment().doubleValue() == 0)) {
                            //设置还款类型
                            repayManagementBean.setRepaymethod(repayManagementExMapper.getmethod(paramMap).get("coddes").toString());
                        }
                    } else {
                        repayManagementBean.setRepaymethod("提前还款");
                    }
                }
            }
            return new RepayManagementResponse(statisticalRepay, repayManagementBeanList, countInfo);
        } else {
            return null;
        }
    }

    @Override
    public BasicInformationResponse basicInformationResponse(String workId) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(1);
        paramMap.put("workid", workId);
        BasicInformationBean basicInformationBean = repayManagementExMapper.getBasicInformationBean(paramMap);
        basicInformationBean.setMortgagor(doctaskExMapper.getmortgagor(paramMap));
        return new BasicInformationResponse(basicInformationBean);
    }

    @Override
    public BasicInformationResponse basicInfoRollOverResponse(String workId) {
        String newWorkId = repayManagementExMapper.getnewWorkid(workId);
        if (newWorkId != null && !("".equals(newWorkId))) {
            Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(1);
            paramMap.put("workid", newWorkId);
            BasicInformationBean basicInformationBean = repayManagementExMapper.getBasicInformationBean(paramMap);
            return new BasicInformationResponse(basicInformationBean);
        }
        return null;
    }

    @Override
    public RepaymenthistoryResponse repaymenthistoryResponse(String workId, Integer refundIssue) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        paramMap.put("workid", workId);
        paramMap.put("refundissue", refundIssue);
        List<RepaymenthistoryBean> repaymentHistoryBeanList = repayManagementExMapper.repaymenthistoryBeanlist(paramMap);
        return new RepaymenthistoryResponse(repaymentHistoryBeanList);
    }

    @Override
    public OverduelistResponse overduelistResponse(UserOfOrgBean userOfOrgBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(6);
        paramMap.put("plevel", userOfOrgBean.getPlevel());
        paramMap.put("workerid", userOfOrgBean.getWorkerid());
        paramMap.put("dlevel", userOfOrgBean.getDlevel());
        paramMap.put("departmentno", userOfOrgBean.getDepartmentno());
        paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        paramMap.put("organizationno", userOfOrgBean.getOrganizationno());
        List<OverduelistBean> overdueListBean = repayManagementExMapper.overduelistBean(paramMap);
        for (OverduelistBean overdueList : overdueListBean) {
            Map<String, Object> overdueListMap = Maps.newHashMapWithExpectedSize(1);
            overdueListMap.put("workid", overdueList.getWorkid());
            overdueList.setCoborrower(doctaskExMapper.getcoborrower(overdueListMap));
            overdueList.setMortgagor(doctaskExMapper.getmortgagor(overdueListMap));
        }
        return new OverduelistResponse(overdueListBean);
    }

    @Override
    public PromptpaymentsResponse promptpaymentsResponse(UserOfOrgBean userOfOrgBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(6);
        paramMap.put("plevel", userOfOrgBean.getPlevel());
        paramMap.put("workerid", userOfOrgBean.getWorkerid());
        paramMap.put("dlevel", userOfOrgBean.getDlevel());
        paramMap.put("departmentno", userOfOrgBean.getDepartmentno());
        paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        paramMap.put("organizationno", userOfOrgBean.getOrganizationno());
        List<PromptpaymentBean> promptPaymentBean = repayManagementExMapper.promptpaymentBean(paramMap);
        for (PromptpaymentBean promptPayment : promptPaymentBean) {
            Map<String, Object> promptPaymentMap = Maps.newHashMapWithExpectedSize(1);
            promptPaymentMap.put("workid", promptPayment.getWorkid());
            promptPayment.setCoborrower(doctaskExMapper.getcoborrower(promptPaymentMap));
            promptPayment.setMortgagor(doctaskExMapper.getmortgagor(promptPaymentMap));
        }
        return new PromptpaymentsResponse(promptPaymentBean);
    }


    @Override
    public List<Postloaninfo> getPostloaninfolist(Date startDate, Date endDate) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        paramMap.put("startDate", startDate);
        paramMap.put("endDate", endDate);
        return repayManagementExMapper.getPostloaninfolist(paramMap);
    }

    @Override
    public List<Map<String, Object>> getRepaymentInfo(String workid, int refundissue) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        paramMap.put("workid", workid);
        paramMap.put("refundissue", refundissue);
        return repayManagementExMapper.getRepaymentInfo(paramMap);
    }

    @Override
    public void saveOverdue(Overdue overdue) {
        overdueMapper.insert(overdue);
    }

    @Override
    public Repayplan getRepayplan(String workid, Integer nextrefundissue) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        paramMap.put("workid", workid);
        paramMap.put("nextrefundissue", nextrefundissue);
        return repayManagementExMapper.getRepayplan(paramMap);
    }

    @Override
    public void updatepostloaninfo(Postloaninfo postloaninfo) {
        postloaninfoMapper.updateByPrimaryKey(postloaninfo);
    }

    @Override
    public List<Overdue> getoverduelist() {
        return overdueMapper.selectByExample(new OverdueExample());
    }

    @Override
    public Postloaninfo getpostloaninfo(String workid) {
        return postloaninfoMapper.selectByPrimaryKey(workid);
    }

    @Override
    public void updateOverdue(Overdue overdue) {
        overdueMapper.updateByPrimaryKey(overdue);
    }

}
