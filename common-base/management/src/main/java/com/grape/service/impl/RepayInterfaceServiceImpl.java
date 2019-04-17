package com.grape.service.impl;

import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;
import com.grape.model.db.Account;
import com.grape.model.db.Accountquota;
import com.grape.model.db.Overdue;
import com.grape.model.db.OverdueExample;
import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayinfo;
import com.grape.model.db.RepayinfoExample;
import com.grape.model.db.Repayplan;
import com.grape.model.db.RepayplanExample;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.base.AccountMapper;
import com.grape.model.mapper.base.AccountquotaMapper;
import com.grape.model.mapper.base.OverdueMapper;
import com.grape.model.mapper.base.PostloaninfoMapper;
import com.grape.model.mapper.base.RepayinfoMapper;
import com.grape.model.mapper.base.RepayplanMapper;
import com.grape.model.mapper.external.RepayInterfaceExMapper;
import com.grape.service.RepayInterfaceService;
import com.grape.util.LogUtil;
import com.grape.util.Util;

@Service
public class RepayInterfaceServiceImpl extends BaseMapper implements RepayInterfaceService {

    @Autowired
    private RepayInterfaceExMapper repayInterfaceExMapper;

    @Autowired
    private RepayinfoMapper repayinfoMapper;

    @Autowired
    private OverdueMapper overdueMapper;

    @Autowired
    private PostloaninfoMapper postloaninfoMapper;

    @Autowired
    private AccountquotaMapper accountquotaMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private RepayplanMapper repayplanMapper;


    @Transactional
    @Override
    public String repayInterfaceReponse(String workid, Integer refundissue, String repaytype,
                                        Date realityrefunddate, BigDecimal refundmoney, BigDecimal refundinterest,
                                        BigDecimal breachofcontract, BigDecimal interestmoney, BigDecimal delayingpayment) throws UnknownHostException {

        String time = Util.valueOfTime(new Date());
        //获取统一还款时间
        realityrefunddate = Util.parseDate(Util.valueOfDate(realityrefunddate) + time);

        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        //流水id
        paramMap.put("workid", workid);
        //期数
        paramMap.put("refundissue", refundissue);
        //还款表
        Repayinfo repayinfo = new Repayinfo();
        repayinfo.setId(Util.getID());
        repayinfo.setWorkid(workid);
        repayinfo.setRefundissue(refundissue);
        //统一还款时间
        repayinfo.setUnifiedtime(realityrefunddate);

        //还本金额或还本利息不为空
        if (refundmoney != null || refundinterest != null) {
            if (refundmoney == null) {
                refundmoney = new BigDecimal(0);
            }
            if (refundinterest == null) {
                refundinterest = new BigDecimal(0);
            }
            repayinfo.setRepayamount(refundmoney.add(refundinterest));
            repayinfo.setRefundmoney(refundmoney);
            repayinfo.setRefundinterest(refundinterest);
            repayinfo.setRealityrefunddate(realityrefunddate);
        }
        if (interestmoney != null) {
            repayinfo.setInterestmoney(interestmoney);
            repayinfo.setInterestmoneydate(realityrefunddate);
        }
        if (delayingpayment != null) {
            repayinfo.setDelayingpayment(delayingpayment);
            repayinfo.setDelayingpaymentdate(realityrefunddate);
        }
        repayinfo.setRepaymethod(repaytype);
        //根据还款方式
        if ("1".equals(repaytype) || "2".equals(repaytype) || "4".equals(repaytype)) {
            //查询逾期本金、逾期利息、罚息、滞纳金
            Map<String, Object> map = repayInterfaceExMapper.getoverduemoney(paramMap);
            if (map != null) {
                Double overduecorpusSum = 0.0;
                Double overdueaccrualSum = 0.0;
                Double defaultinterestSum = 0.0;
                Double delayingpaymentSum = 0.0;

                if (map.get("overduecorpusSum") != null) {
                    overduecorpusSum = ((BigDecimal) map.get("overduecorpusSum")).doubleValue();
                }
                if (map.get("defaultinterestSum") != null) {
                    overdueaccrualSum = ((BigDecimal) map.get("overdueaccrualSum")).doubleValue();
                }
                if (map.get("defaultinterestSum") != null) {
                    defaultinterestSum = ((BigDecimal) map.get("defaultinterestSum")).doubleValue();
                }
                if (map.get("delayingpaymentSum") != null) {
                    delayingpaymentSum = ((BigDecimal) map.get("delayingpaymentSum")).doubleValue();
                }

                if (overduecorpusSum == 0 && overdueaccrualSum == 0 && defaultinterestSum == 0 && delayingpaymentSum == 0) {
                    if ("1".equals(repaytype)) {
                        repayinfo.setBreachofcontract(breachofcontract);
                        //repayInterfaceExMapper.deleteRepayplan(paramMap);
                        repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
                        Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workid);
                        postloaninfo.setSettledate(realityrefunddate);
                        postloaninfoMapper.updateByPrimaryKey(postloaninfo);
                    }
                } else {
                    return "20002";
                }
            } else {
                if ("1".equals(repaytype)) {
                    repayinfo.setBreachofcontract(breachofcontract);
                    //repayInterfaceExMapper.deleteRepayplan(paramMap);
                    repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
                    Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workid);
                    postloaninfo.setSettledate(realityrefunddate);
                    postloaninfoMapper.updateByPrimaryKey(postloaninfo);
                }
            }
        }
        if ("3".equals(repaytype)) {
            Overdue overdueinfo = repayInterfaceExMapper.getoverdueinfo(paramMap);
            if (overdueinfo != null) {
                if (refundmoney != null) {
                    overdueinfo.setOverduecorpus(overdueinfo.getOverduecorpus().subtract(refundmoney));
                }
                if (refundinterest != null) {
                    overdueinfo.setOverdueaccrual(overdueinfo.getOverdueaccrual().subtract(refundinterest));
                }
                if (interestmoney != null) {
                    overdueinfo.setDefaultinterest(overdueinfo.getDefaultinterest().subtract(interestmoney));
                }
                if (delayingpayment != null) {
                    overdueinfo.setDelayingpayment(overdueinfo.getDelayingpayment().subtract(delayingpayment));
                }
                overdueMapper.updateByPrimaryKey(overdueinfo);
            }
            Map<String, Object> map2 = repayInterfaceExMapper.getoverduemoney(paramMap);
            Double overduecorpusS = ((BigDecimal) map2.get("overduecorpusSum")).doubleValue();
            Double overdueaccrualS = ((BigDecimal) map2.get("overdueaccrualSum")).doubleValue();
            Double defaultinterestS = ((BigDecimal) map2.get("defaultinterestSum")).doubleValue();
            Double delayingpaymentS = ((BigDecimal) map2.get("delayingpaymentSum")).doubleValue();

            if (overduecorpusS == 0 && overdueaccrualS == 0 && defaultinterestS == 0 && delayingpaymentS == 0) {
                Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workid);
                postloaninfo.setOverdueflg("N");
                postloaninfo.setOverdueterm(null);
                postloaninfo.setOverduecorpus(null);
                postloaninfo.setOverdueaccrual(null);
                postloaninfo.setDefaultinterest(null);
                postloaninfo.setOverduenum(null);
                postloaninfoMapper.updateByPrimaryKey(postloaninfo);
            }
        }
        if ("2".equals(repaytype)) {
            //查询正常还款的本金和利息是否大于,如果输入的本金和利息大于查询的本金和利息
            Map<String, Object> resultMap = repayInterfaceExMapper.selectByWorkIdAndRepayterm(paramMap);
            //在还款计划中查出该期的还款记录,求还款的本金和、利息的和
            Map<String, Object> repayinfoMap = repayInterfaceExMapper.selectSumByWorkIdAndRepayterm(paramMap);
            if ((refundmoney.add((BigDecimal) repayinfoMap.get("refundmoney"))).compareTo((BigDecimal) resultMap.get("repaycapital")) == 1) {
                //返回错误消息
                return "30027";
            }
            if ((refundinterest.add((BigDecimal) repayinfoMap.get("refundinterest"))).compareTo((BigDecimal) resultMap.get("repayaccrual")) == 1) {
                //返回错误消息
                return "30027";
            }
            if ((refundmoney.add((BigDecimal) repayinfoMap.get("refundmoney"))).compareTo((BigDecimal) resultMap.get("repaycapital")) == 0
                    && (refundinterest.add((BigDecimal) repayinfoMap.get("refundinterest"))).compareTo((BigDecimal) resultMap.get("repayaccrual")) == 0) {
                repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
            }
        }
        repayinfo.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        repayinfo.setChgdt(new Date());
        repayinfoMapper.insert(repayinfo);

        //设置结算日期(流水id,还款时间)
        this.setSettledate(workid, realityrefunddate);
        //修改额度
        this.updateAccountQuota(workid, refundmoney);

        String descriptions = Util.valueOfDate(realityrefunddate, "yyyy-MM-dd HH:mm:ss") + " " + workid + "号流水的第" + refundissue + "期进行还款";
        String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        LogUtil.saveLog("5", descriptions, workerid);
        return "20000";
    }

    @Override
    public void setSettledate(String workId, Date realityRefundDate) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(1);
        paramMap.put("workid", workId);
        Map<String, Object> overdueInfo = repayInterfaceExMapper.getOverdue(paramMap);
        Map<String, Object> repayinfoInfo = repayInterfaceExMapper.getRepayinfo(paramMap);
        Map<String, Object> repayplanInfo = repayInterfaceExMapper.getRepayplan(paramMap);
        if (overdueInfo != null && repayinfoInfo != null && repayplanInfo != null) {
            //(逾期本金为空 或 逾期本金等于0) 和 (逾期利息为空或等于0) 和 罚息金额 和 滞纳金
            if (((overdueInfo.get("overduecorpus") == null) || ((BigDecimal) overdueInfo.get("overduecorpus")).doubleValue() == 0)
                    && ((overdueInfo.get("overdueaccrual") == null) || ((BigDecimal) overdueInfo.get("overdueaccrual")).doubleValue() == 0)
                    && ((overdueInfo.get("defaultinterest") == null) || ((BigDecimal) overdueInfo.get("defaultinterest")).doubleValue() == 0
                    && ((overdueInfo.get("delayingpayment") == null) || ((BigDecimal) overdueInfo.get("delayingpayment")).doubleValue() == 0))) {

                //还款表的应还款金额 >= 还款计划表的应还款金额
                if (((BigDecimal) repayinfoInfo.get("repayamount")).doubleValue() >= ((BigDecimal) repayplanInfo.get("repayamount")).doubleValue()) {
                    Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workId);
                    //结清日期
                    postloaninfo.setSettledate(realityRefundDate);
                    postloaninfoMapper.updateByPrimaryKey(postloaninfo);
                }
            }
        }
    }

    @Override
    public void updateAccountQuota(String workId, BigDecimal refundMoney) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(1);
        paramMap.put("workid", workId);
        Map<String, Object> map = repayInterfaceExMapper.getDoctaskInfo(paramMap);

        if (map != null) {
            //产品类型 和 额度编号
            if (map.get("producttype") != null && map.get("linenumber") != null) {
                //还款本金
                BigDecimal sumofamount = refundMoney;
                String producttype = map.get("producttype").toString();
                String linenumber = map.get("linenumber").toString();
                //根据额度编号查询账号信息
                List<Account> accountlist = repayInterfaceExMapper.getAccountInfo(linenumber);

                if ("1".equals(producttype)) {
                    if (accountlist.size() > 1) {

                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(linenumber);
                        for (Account account : accountlist) {
                            BigDecimal mortgageratio = sumofamount.multiply(accountquota.getMortgageratio());
                            account.setFreezeamount(account.getFreezeamount().subtract(mortgageratio));
                            account.setMarginbalance(account.getMarginbalance().add(mortgageratio));
                            accountMapper.updateByPrimaryKey(account);
                        }
                        accountquota.setMortgageamount(accountquota.getMortgageamount().subtract(sumofamount));
                        accountquota.setRemainingamount(accountquota.getRemainingamount().add(sumofamount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);
                    } else {
                        Account account = accountlist.get(0);
                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(linenumber);
                        List<Accountquota> accountquotalist = repayInterfaceExMapper.getAccountquotaInfo(linenumber);
                        BigDecimal mortgageratio = sumofamount.multiply(accountquota.getMortgageratio());
                        account.setFreezeamount(account.getFreezeamount().subtract(mortgageratio));
                        account.setMarginbalance(account.getMarginbalance().add(mortgageratio));
                        accountMapper.updateByPrimaryKey(account);
                        accountquota.setMortgageamount(accountquota.getMortgageamount().subtract(sumofamount));
                        accountquota.setRemainingamount(accountquota.getRemainingamount().add(sumofamount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);
                        //子公司
                        if (accountquota.getLinenumbersenior() != null && accountquotalist.size() == 0) {
                            String linenumbersenior = accountquota.getLinenumbersenior();
                            while (linenumbersenior != null && !("".equals(linenumbersenior))) {
                                Accountquota accountquotainfo = accountquotaMapper.selectByPrimaryKey(linenumbersenior);
                                List<Account> accountlistinfo = repayInterfaceExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                if (accountlistinfo.size() > 0) {
                                    Account accountinfo = accountlistinfo.get(0);
                                    BigDecimal mortgage = sumofamount.multiply(accountquotainfo.getMortgageratio());
                                    accountinfo.setMarginbalance(accountinfo.getMarginbalance().add(mortgage));
                                    accountMapper.updateByPrimaryKey(accountinfo);
                                }
                                linenumbersenior = accountquotainfo.getLinenumbersenior();
                            }

                        }
                        //父公司
                        if (accountquota.getLinenumbersenior() == null && accountquotalist.size() > 0) {
                            for (Accountquota accountquotainfo : accountquotalist) {
                                List<Account> accountlistinfo = repayInterfaceExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                if (accountlistinfo.size() > 0) {
                                    Account accountinfo = accountlistinfo.get(0);
                                    BigDecimal mortgage = sumofamount.multiply(accountquotainfo.getMortgageratio());
                                    accountinfo.setMarginbalance(accountinfo.getMarginbalance().add(mortgage));
                                    accountMapper.updateByPrimaryKey(accountinfo);
                                }
                            }

                        }
                    }
                }
                if ("2".equals(producttype)) {
                    if (accountlist.size() > 1) {
                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(linenumber);
                        for (Account account : accountlist) {
                            BigDecimal foreclosurefloorratio = sumofamount.multiply(accountquota.getForeclosurefloorratio());
                            account.setFreezeamount(account.getFreezeamount().subtract(foreclosurefloorratio));
                            account.setMarginbalance(account.getMarginbalance().add(foreclosurefloorratio));
                            accountMapper.updateByPrimaryKey(account);
                        }
                        accountquota.setForeclosurefloorlines(accountquota.getForeclosurefloorlines().subtract(sumofamount));
                        accountquota.setRemainingamount(accountquota.getRemainingamount().add(sumofamount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);
                    } else {
                        Account account = accountlist.get(0);
                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(linenumber);
                        List<Accountquota> accountquotalist = repayInterfaceExMapper.getAccountquotaInfo(linenumber);
                        BigDecimal foreclosurefloorratio = sumofamount.multiply(accountquota.getForeclosurefloorratio());
                        account.setFreezeamount(account.getFreezeamount().subtract(foreclosurefloorratio));
                        account.setMarginbalance(account.getMarginbalance().add(foreclosurefloorratio));
                        accountMapper.updateByPrimaryKey(account);
                        accountquota.setForeclosurefloorlines(accountquota.getForeclosurefloorlines().subtract(sumofamount));
                        accountquota.setRemainingamount(accountquota.getRemainingamount().add(sumofamount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);
                        //子公司
                        if (accountquota.getLinenumbersenior() != null && accountquotalist.size() == 0) {
                            String linenumbersenior = accountquota.getLinenumbersenior();
                            while (linenumbersenior != null && !(linenumbersenior.equals(""))) {
                                Accountquota accountquotainfo = accountquotaMapper.selectByPrimaryKey(linenumbersenior);
                                List<Account> accountlistinfo = repayInterfaceExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                if (accountlistinfo.size() > 0) {
                                    Account accountinfo = accountlistinfo.get(0);
                                    BigDecimal foreclosurefloor = sumofamount.multiply(accountquotainfo.getForeclosurefloorratio());
                                    accountinfo.setMarginbalance(accountinfo.getMarginbalance().add(foreclosurefloor));
                                    accountMapper.updateByPrimaryKey(accountinfo);
                                }
                                linenumbersenior = accountquotainfo.getLinenumbersenior();
                            }
                        }
                        //父公司
                        if (accountquota.getLinenumbersenior() == null && accountquotalist.size() > 0) {
                            for (Accountquota accountquotainfo : accountquotalist) {
                                List<Account> accountlistinfo = repayInterfaceExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                if (accountlistinfo.size() > 0) {
                                    Account accountinfo = accountlistinfo.get(0);
                                    BigDecimal foreclosurefloor = sumofamount.multiply(accountquotainfo.getForeclosurefloorratio());
                                    accountinfo.setMarginbalance(accountinfo.getMarginbalance().add(foreclosurefloor));
                                    accountMapper.updateByPrimaryKey(accountinfo);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Transactional
    @Override
    public String normalRepayment(String workId, Integer refundIssue, Date realityRefundDate, BigDecimal refundMoney, BigDecimal refundInterest) throws UnknownHostException {
           /* 1.获取当前时间
            2.查询该期是否有逾期,有则返回错误消息
            3.查询该期的还款记录(有可能出现多次还款仍未还清),求出 还款记录本金和 和 还款记录利息和
            4.计算当次还款是否还清所有的余额，大于所需的金额则不允许还款,返回错误消息
            5.新增还款记录,恢复额度(额度可能存在两层关系)
            6.记录还款日志*/
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        //流水id
        paramMap.put("workid", workId);
        //期数
        paramMap.put("refundissue", refundIssue);
        //还款表
        Repayinfo repayinfo = new Repayinfo();
        repayinfo.setId(Util.getID());
        repayinfo.setWorkid(workId);
        repayinfo.setRefundissue(refundIssue);
        //统一还款时间
        repayinfo.setUnifiedtime(realityRefundDate);
        repayinfo.setRepayamount(refundMoney.add(refundInterest));
        repayinfo.setRefundmoney(refundMoney);
        repayinfo.setRefundinterest(refundInterest);
        repayinfo.setRealityrefunddate(realityRefundDate);
        repayinfo.setRepaymethod("2");

        //查询逾期本金、逾期利息、罚息、滞纳金
        Map<String, Object> map = repayInterfaceExMapper.getoverduemoney(paramMap);
        if (map != null) {
            //不为空则有逾期金额没有还款,应返回错误的逾期状态码
            return "20002";
        }
        //查询该期的还款记录(有可能出现多次还款仍未还清),求出 还款记录本金和 和 还款记录利息和
        Map<String, Object> repayinfoMap = repayInterfaceExMapper.selectSumByWorkIdAndRepayterm(paramMap);

        BigDecimal refundmoney = (BigDecimal) repayinfoMap.get("refundmoney");
        BigDecimal refundinterest = (BigDecimal) repayinfoMap.get("refundinterest");

        //查询正常还款的本金和利息是否大于,如果输入的本金和利息大于查询的本金和利息
        Map<String, Object> resultMap = repayInterfaceExMapper.selectByWorkIdAndRepayterm(paramMap);

        BigDecimal repaycapital = (BigDecimal) resultMap.get("repaycapital");
        BigDecimal repayaccrual = (BigDecimal) resultMap.get("repayaccrual");

        if ((refundMoney.add(refundmoney)).compareTo(repaycapital) == 1 ||
                (refundInterest.add(refundinterest)).compareTo(repayaccrual) == 1) {
            //本次还款的本金超过了所需的本金金额,或者本次还款的利息超过了所需的利息，返回错误消息
            return "30027";
        }

        if ((refundMoney.add(refundmoney)).compareTo(repaycapital) == 0
                && (refundInterest.add(refundinterest)).compareTo(repayaccrual) == 0) {
            //本次还款的本金和金额刚好等于所需的本金和利息,则表示该次还款已经完成,修改还款状态
            repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
        }

        repayinfo.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        repayinfo.setChgdt(new Date());
        repayinfoMapper.insert(repayinfo);

        //设置结算日期(流水id,还款时间)
        this.setSettledate(workId, realityRefundDate);
        //修改额度
        this.updateAccountQuota(workId, refundMoney);

        String descriptions = workId + "号流水的第" + refundIssue + "期进行正常还款";
        String workerId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        LogUtil.saveLog("5", descriptions, workerId);
        return "20000";
    }

    @Transactional
    @Override
    public String overdueRepayment(String workId, Integer refundIssue, Date realityRefundDate, BigDecimal refundMoney, BigDecimal refundInterest, BigDecimal interestMoney, BigDecimal delayingPayment) throws UnknownHostException {
           /* 1.获取当前时间
            3.查询该期的还款记录(有可能出现多次还款仍未还清),求出 还款记录本金和 和 还款记录利息和
            4.计算当次还款是否还清所有的余额，大于所需的金额则不允许还款,返回错误消息
            5.新增还款记录,恢复额度(额度可能存在两层关系)
            6.记录还款日志*/
        //获取统一还款时间

        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        //流水id
        paramMap.put("workid", workId);
        //期数
        paramMap.put("refundissue", refundIssue);
        //还款表
        Repayinfo repayinfo = new Repayinfo();
        repayinfo.setId(Util.getID());
        repayinfo.setWorkid(workId);
        repayinfo.setRefundissue(refundIssue);
        //统一还款时间
        repayinfo.setUnifiedtime(realityRefundDate);
        repayinfo.setRepayamount(refundMoney.add(refundInterest));
        repayinfo.setRefundmoney(refundMoney);
        repayinfo.setRefundinterest(refundInterest);
        repayinfo.setRealityrefunddate(realityRefundDate);
        repayinfo.setInterestmoney(interestMoney);
        repayinfo.setInterestmoneydate(realityRefundDate);
        repayinfo.setDelayingpayment(delayingPayment);
        repayinfo.setDelayingpaymentdate(realityRefundDate);
        repayinfo.setRepaymethod("3");

        /*//查询该期的还款记录(有可能出现多次还款仍未还清),求出 还款记录本金和 和 还款记录利息和
        Map<String, Object> repayinfoMap = repayInterfaceExMapper.selectSumByWorkIdAndRepayterm(paramMap);
        //查询正常还款的本金和利息是否大于,如果输入的本金和利息大于查询的本金和利息
        Map<String, Object> resultMap = repayInterfaceExMapper.selectByWorkIdAndRepayterm(paramMap);

        if ((refundMoney.add((BigDecimal) repayinfoMap.get("refundmoney"))).compareTo((BigDecimal) resultMap.get("repaycapital")) == 1 ||
                (refundInterest.add((BigDecimal) repayinfoMap.get("refundinterest"))).compareTo((BigDecimal) resultMap.get("repayaccrual")) == 1) {
            //本次还款的本金超过了所需的本金金额,或者本次还款的利息超过了所需的利息，返回错误消息
            return "30027";
        }*/

        //查看逾期本金、逾期利息、罚息、滞纳金，判断还款是否正确
        Map<String, Object> map = repayInterfaceExMapper.selectOverdueByWorkIdAndOverdueterm(paramMap);
        if (map == null) {
            //查询不到逾期记录,证明用户存在不正确的还款方式
            return "30028";
        }
        //逾期本金
        BigDecimal overduecorpus = (BigDecimal) map.get("overduecorpus");
        //逾期利息
        BigDecimal overdueaccrual = (BigDecimal) map.get("overdueaccrual");
        //罚息
        BigDecimal defaultinterest = (BigDecimal) map.get("defaultinterest");
        //滞纳金
        BigDecimal delayingpayment = (BigDecimal) map.get("delayingpayment");

        if (refundMoney.compareTo(overduecorpus) == 1 || refundInterest.compareTo(overdueaccrual) == 1 ||
                interestMoney.compareTo(defaultinterest) == 1 || delayingPayment.compareTo(delayingpayment) == 1) {
            //逾期还款某个值出现多还现象
            return "30029";
        }
      /*   else if (refundMoney.compareTo(overduecorpus) == 0 && refundInterest.compareTo(overdueaccrual) == 0 &&
                interestMoney.compareTo(defaultinterest) == 0 && delayingPayment.compareTo(delayingpayment) == 0) {
            //逾期金额全部对应得上
              postloaninfo.setOverdueflg("N");
              postloaninfo.setOverdueterm(null);
              postloaninfo.setOverduecorpus(null);
              postloaninfo.setOverdueaccrual(null);
              postloaninfo.setDefaultinterest(null);
              postloaninfo.setOverduenum(null);
              postloaninfoMapper.updateByPrimaryKey(postloaninfo);
              //本次还款刚好等于所需,则表示该次还款已经完成,修改还款状态
              repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
        }
        Integer compareToOverduecorpus = refundMoney.compareTo((BigDecimal) map.get("overduecorpus"));
        Integer compareToOverdueaccrual = refundMoney.compareTo((BigDecimal) map.get("overdueaccrual"));
        Integer compareToDefaultinterest = refundMoney.compareTo((BigDecimal) map.get("defaultinterest"));
        Integer compareToDelayingpayment = refundMoney.compareTo((BigDecimal) map.get("delayingpayment"));*/


        //根据还款方式
        Overdue overdueInfo = repayInterfaceExMapper.getoverdueinfo(paramMap);
        overdueInfo.setOverduecorpus(overdueInfo.getOverduecorpus().subtract(refundMoney));
        overdueInfo.setOverdueaccrual(overdueInfo.getOverdueaccrual().subtract(refundInterest));
        overdueInfo.setDefaultinterest(overdueInfo.getDefaultinterest().subtract(interestMoney));
        overdueInfo.setDelayingpayment(overdueInfo.getDelayingpayment().subtract(delayingPayment));
        overdueMapper.updateByPrimaryKey(overdueInfo);

        Map<String, Object> resultMap = repayInterfaceExMapper.getoverduemoney(paramMap);
        Double overdueCorpus = ((BigDecimal) resultMap.get("overduecorpusSum")).doubleValue();
        Double overdueAccruals = ((BigDecimal) resultMap.get("overdueaccrualSum")).doubleValue();
        Double defaultInterests = ((BigDecimal) resultMap.get("defaultinterestSum")).doubleValue();
        Double delayingPayments = ((BigDecimal) resultMap.get("delayingpaymentSum")).doubleValue();

        if (overdueCorpus == 0 && overdueAccruals == 0 && defaultInterests == 0 && delayingPayments == 0) {
            Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workId);
            postloaninfo.setOverdueflg("N");
            postloaninfo.setOverdueterm(null);
            postloaninfo.setOverduecorpus(null);
            postloaninfo.setOverdueaccrual(null);
            postloaninfo.setDefaultinterest(null);
            postloaninfo.setOverduenum(null);
            postloaninfoMapper.updateByPrimaryKey(postloaninfo);
            //本次还款刚好等于所需,则表示该次还款已经完成,修改还款状态
            repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
        }
        repayinfo.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        repayinfo.setChgdt(new Date());
        repayinfoMapper.insert(repayinfo);

        //设置结算日期(流水id,还款时间)
        this.setSettledate(workId, realityRefundDate);
        //修改额度
        this.updateAccountQuota(workId, refundMoney);
        String descriptions = workId + "号流水的第" + refundIssue + "期进行逾期还款";
        String workerId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        LogUtil.saveLog("5", descriptions, workerId);
        return "20000";
    }

    /**
     * 查询还款计划的接口
     */
    @Override
    public List<Repayplan> selectPrePayResponse(String workid, String repaytype) {
        if (repaytype.equals("1")) {
            RepayplanExample example = new RepayplanExample();
            example.createCriteria().andWorkidEqualTo(workid);
            List<Repayplan> repayPlans = repayplanMapper.selectByExample(example);
            return repayPlans;
        } else {
            return null;
        }
    }

    @Override
    public List<Repayinfo> selectRrpayInfoResponse(String workid) {
        RepayinfoExample example = new RepayinfoExample();
        example.createCriteria().andWorkidEqualTo(workid);
        List<Repayinfo> repayinfos = repayinfoMapper.selectByExample(example);
        return repayinfos;
    }

    @Transactional
    @Override
    public String advanceRepayment(String workId, BigDecimal refundMoney, BigDecimal refundInterest, BigDecimal breachOfContract, Date realityRefundDate) throws UnknownHostException {

        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(1);
        //流水id
        paramMap.put("workid", workId);
        //还款表
        Repayinfo repayinfo = new Repayinfo();
        repayinfo.setWorkid(workId);
        //统一还款时间
        repayinfo.setUnifiedtime(realityRefundDate);

        //还本金额或还本利息不为空
        repayinfo.setRepayamount(refundMoney.add(refundInterest));
        repayinfo.setRefundmoney(refundMoney);
        repayinfo.setRefundinterest(refundInterest);
        repayinfo.setRealityrefunddate(realityRefundDate);

        repayinfo.setRepaymethod("1");
        //根据还款方式
        //查询逾期本金、逾期利息、罚息、滞纳金
        Map<String, Object> map = repayInterfaceExMapper.getoverduemoney(paramMap);

        if (map != null) {
            //有逾期没还
            return "20002";
        }
        //查询需还款最前的还款期数和最后的还款期数
        Map<String, Object> repaytermMap = repayInterfaceExMapper.selectMinAndMaxByWorkId(paramMap);
        Integer minRepayterm = (Integer) repaytermMap.get("minRepayterm");
        Integer maxRepayterm = (Integer) repaytermMap.get("maxRepayterm");

        //新增每一期的还款记录
        for (int i = 0; i <= (maxRepayterm - minRepayterm); i++) {
            RepayplanExample repayplanExample = new RepayplanExample();
            repayplanExample.createCriteria().andWorkidEqualTo(workId).andRepaytermEqualTo(minRepayterm);
            //修改每期的还款本金和利息
            List<Repayplan> repayplanList = repayplanMapper.selectByExample(repayplanExample);
            if (repayplanList.size() == 0) {
                break;
            }
            Repayplan repayplan = repayplanList.get(0);
            Repayinfo repayInfo = new Repayinfo();
            if (i == 0 && breachOfContract != null) {
                repayinfo.setBreachofcontract(breachOfContract);
            }
            BeanUtils.copyProperties(repayinfo, repayInfo);
            repayInfo.setRefundissue(minRepayterm + i);
            repayInfo.setRefundmoney(repayplan.getRepaycapital());
            repayInfo.setRefundinterest(repayplan.getRepayaccrual());
            repayInfo.setRepayamount(repayplan.getRepaycapital().add(repayplan.getRepayaccrual()));
            repayInfo.setId(Util.getID());
            repayinfoMapper.insert(repayInfo);
        }

        repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
        Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workId);
        postloaninfo.setSettledate(realityRefundDate);
        postloaninfoMapper.updateByPrimaryKey(postloaninfo);
        repayinfo.setBreachofcontract(breachOfContract);
        repayinfo.setId(Util.getID());
        repayinfo.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        repayinfo.setChgdt(new Date());
        repayinfoMapper.insert(repayinfo);

        //设置结算日期(流水id,还款时间)
        this.setSettledate(workId, realityRefundDate);
        //修改额度
        this.updateAccountQuota(workId, refundMoney);

        String descriptions = workId + "号流水提前还款成功";
        String workerId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        LogUtil.saveLog("5", descriptions, workerId);
        return "20000";

      /*  if (map == null) {
            Double overduecorpusSum = 0.0;
            Double overdueaccrualSum = 0.0;
            Double defaultinterestSum = 0.0;
            Double delayingpaymentSum = 0.0;

            if (map.get("overduecorpusSum") != null) {
                overduecorpusSum = ((BigDecimal) map.get("overduecorpusSum")).doubleValue();
            }
            if (map.get("defaultinterestSum") != null) {
                overdueaccrualSum = ((BigDecimal) map.get("overdueaccrualSum")).doubleValue();
            }
            if (map.get("defaultinterestSum") != null) {
                defaultinterestSum = ((BigDecimal) map.get("defaultinterestSum")).doubleValue();
            }
            if (map.get("delayingpaymentSum") != null) {
                delayingpaymentSum = ((BigDecimal) map.get("delayingpaymentSum")).doubleValue();
            }

            if (overduecorpusSum == 0 && overdueaccrualSum == 0 && defaultinterestSum == 0 && delayingpaymentSum == 0) {
                repayinfo.setBreachofcontract(breachOfContract);
                //查询需还款最前的还款期数和最后的还款期数
                Map<String, Object> repaytermMap = repayInterfaceExMapper.selectMinAndMaxByWorkId(paramMap);
                Integer minRepayterm = (Integer) repaytermMap.get("minRepayterm");
                Integer maxRepayterm = (Integer) repaytermMap.get("maxRepayterm");

                //新增每一期的还款记录
                for (int i = 0; i < (maxRepayterm - minRepayterm); i++) {
                    RepayplanExample repayplanExample = new RepayplanExample();
                    repayplanExample.createCriteria().andWorkidEqualTo(workId).andRepaytermEqualTo(minRepayterm);
                    //修改每期的还款本金和利息
                    List<Repayplan> repayplanList = repayplanMapper.selectByExample(repayplanExample);
                    if (repayplanList.size() == 0) {
                        break;
                    }
                    Repayplan repayplan = repayplanList.get(0);
                    Repayinfo repayInfo = new Repayinfo();
                    BeanUtils.copyProperties(repayinfo, repayInfo);
                    repayInfo.setRefundissue(minRepayterm + i);
                    repayInfo.setRefundmoney(repayplan.getRepaycapital());
                    repayInfo.setRefundinterest(repayplan.getRepayaccrual());
                    repayInfo.setRepayamount(repayplan.getRepaycapital().add(repayplan.getRepayaccrual()));
                    repayinfoMapper.insert(repayInfo);
                }

                repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
                Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workId);
                postloaninfo.setSettledate(realityRefundDate);
                postloaninfoMapper.updateByPrimaryKey(postloaninfo);
            } else {
                return "20002";
            }
        } else {
            repayinfo.setBreachofcontract(breachOfContract);
            repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
            Postloaninfo postloaninfo = postloaninfoMapper.selectByPrimaryKey(workId);
            postloaninfo.setSettledate(realityRefundDate);
            postloaninfoMapper.updateByPrimaryKey(postloaninfo);
        }

        repayinfo.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        repayinfo.setChgdt(new Date());
        repayinfoMapper.insert(repayinfo);

        //设置结算日期(流水id,还款时间)
        this.setSettledate(workId, realityRefundDate);
        //修改额度
        this.updateAccountQuota(workId, refundMoney);

        String descriptions = workId + "号流水提前还款成功";
        String workerId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        LogUtil.saveLog("5", descriptions, workerId);
        return "20000";*/
    }

    @Override
    public List<Overdue> selectOverdueResponse(String workid) {
        OverdueExample example = new OverdueExample();
        example.createCriteria().andWorkidEqualTo(workid);
        List<Overdue> overdues = overdueMapper.selectByExample(example);
        return overdues;
    }

    @Override
    public String extendedRepayment(String workId, Integer refundIssue, Date realityRefundDate, BigDecimal refundMoney, BigDecimal refundInterest) throws UnknownHostException {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        //流水id
        paramMap.put("workid", workId);
        //期数
        paramMap.put("refundissue", refundIssue);
        //还款表
        Repayinfo repayinfo = new Repayinfo();
        repayinfo.setId(Util.getID());
        repayinfo.setWorkid(workId);
        repayinfo.setRefundissue(refundIssue);
        //统一还款时间
        repayinfo.setUnifiedtime(realityRefundDate);
        repayinfo.setRepayamount(refundMoney.add(refundInterest));
        repayinfo.setRefundmoney(refundMoney);
        repayinfo.setRefundinterest(refundInterest);
        repayinfo.setRealityrefunddate(realityRefundDate);
        repayinfo.setRepaymethod("4");

        //查询逾期本金、逾期利息、罚息、滞纳金
        Map<String, Object> map = repayInterfaceExMapper.getoverduemoney(paramMap);
        if (map != null) {
            //不为空则有逾期金额没有还款,应返回错误的逾期状态码
            return "20002";
        }
        //查询该期的还款记录(有可能出现多次还款仍未还清),求出 还款记录本金和 和 还款记录利息和
        Map<String, Object> repayinfoMap = repayInterfaceExMapper.selectSumByWorkIdAndRepayterm(paramMap);

        BigDecimal refundmoney = (BigDecimal) repayinfoMap.get("refundmoney");
        BigDecimal refundinterest = (BigDecimal) repayinfoMap.get("refundinterest");

        //查询正常还款的本金和利息是否大于,如果输入的本金和利息大于查询的本金和利息
        Map<String, Object> resultMap = repayInterfaceExMapper.selectByWorkIdAndRepayterm(paramMap);

        BigDecimal repaycapital = (BigDecimal) resultMap.get("repaycapital");
        BigDecimal repayaccrual = (BigDecimal) resultMap.get("repayaccrual");

        if ((refundMoney.add(refundmoney)).compareTo(repaycapital) == 1 ||
                (refundInterest.add(refundinterest)).compareTo(repayaccrual) == 1) {
            //本次还款的本金超过了所需的本金金额,或者本次还款的利息超过了所需的利息，返回错误消息
            return "30027";
        }

        if ((refundMoney.add(refundmoney)).compareTo(repaycapital) == 0
                && (refundInterest.add(refundinterest)).compareTo(repayaccrual) == 0) {
            //本次还款的本金和金额刚好等于所需的本金和利息,则表示该次还款已经完成,修改还款状态
            repayInterfaceExMapper.updateStatusByWorkIdAndRepayterm(paramMap);
        }

        repayinfo.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        repayinfo.setChgdt(new Date());
        repayinfoMapper.insert(repayinfo);

        //设置结算日期(流水id,还款时间)
        this.setSettledate(workId, realityRefundDate);
        //修改额度
        this.updateAccountQuota(workId, refundMoney);

        String descriptions = workId + "号流水的第" + refundIssue + "期进行展期还款";
        String workerId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        LogUtil.saveLog("5", descriptions, workerId);
        return "20000";
    }
}
