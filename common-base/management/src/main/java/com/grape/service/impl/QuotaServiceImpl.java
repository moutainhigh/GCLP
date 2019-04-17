package com.grape.service.impl;

import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.grape.util.DecimalFormatTool;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.SeeAreaQuotaResponse;
import com.grape.controller.reponse.SeeChangeRecordResponse;
import com.grape.controller.reponse.SeeQuotaResponse;
import com.grape.controller.reponse.bean.ChangeRecordListBean;
import com.grape.controller.reponse.bean.SeeAreaQuotaListBean;
import com.grape.controller.reponse.bean.SeeQuotaListBean;
import com.grape.controller.reponse.bean.StatisticalAreaQuota;
import com.grape.controller.reponse.bean.StatisticalQuota;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.model.db.Account;
import com.grape.model.db.Accountquota;
import com.grape.model.db.Transaction;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.base.AccountMapper;
import com.grape.model.mapper.base.AccountquotaMapper;
import com.grape.model.mapper.base.TransactionMapper;
import com.grape.model.mapper.external.QuotaExMapper;
import com.grape.service.QuotaService;
import com.grape.util.LogUtil;
import com.grape.util.PageBean;
import com.grape.util.Util;
import org.springframework.transaction.annotation.Transactional;

@Log4j
@Service
public class QuotaServiceImpl extends BaseMapper implements QuotaService {

    //private static final Logger log = org.slf4j.LoggerFactory.getLogger(QuotaServiceImpl.class);
    @Autowired
    private QuotaExMapper quotaExMapper;

    @Autowired
    private TransactionMapper transactionMapper;

    @Autowired
    private AccountquotaMapper accountquotaMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public SeeQuotaResponse seeQuotaResponse(String checkType, String fundNo, PageBean pageBean, UserOfOrgBean userOfOrgBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(7);
        //判断资金方是否为空值
        if (fundNo == null || "".equals(fundNo)) {
            paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
            paramMap.put("organizationno", userOfOrgBean.getOrganizationno());
        } else {
            paramMap.put("orgbelongsto", "02");
            paramMap.put("organizationno", fundNo);
        }

        LocalDate firstDay = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());

        paramMap.put("firstday", firstDay);
        paramMap.put("lastday", lastDay);
        paramMap.put("checktype", checkType);
        paramMap.put("pagenum", pageBean.getCurrentPage());
        paramMap.put("pagesize", pageBean.getPageSize());

        StatisticalQuota statisticalQuota = quotaExMapper.getstatisticalQuota(paramMap);
        List<SeeQuotaListBean> seeQuotaListBean = quotaExMapper.seeQuotaListBean(paramMap);
        Integer countInfo = quotaExMapper.seeQuotaCount(paramMap);

        Date chgdt = Util.parseDate("2018-01-01");
        for (SeeQuotaListBean seeChannelQuota : seeQuotaListBean) {
            if (seeChannelQuota.getChgdt().getTime() > chgdt.getTime()) {
                chgdt = seeChannelQuota.getChgdt();
            }
        }
        return new SeeQuotaResponse(statisticalQuota, seeQuotaListBean, countInfo, chgdt);
    }

    @Override
    public SeeAreaQuotaResponse seeAreaQuotaResponse(String accountNo, PageBean pageBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(5);

        LocalDate firstDay = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());

        paramMap.put("accountno", accountNo);
        paramMap.put("firstday", firstDay);
        paramMap.put("lastday", lastDay);
        paramMap.put("pagenum", pageBean.getCurrentPage());
        paramMap.put("pagesize", pageBean.getPageSize());

        StatisticalAreaQuota statisticalAreaQuota = quotaExMapper.getStatisticalAreaQuota(paramMap);
        List<SeeAreaQuotaListBean> seeAreaQuotaList = quotaExMapper.getseeAreaQuotalist(paramMap);
        Integer countInfo = quotaExMapper.getseeAreaQuotaCount(paramMap);
        return new SeeAreaQuotaResponse(statisticalAreaQuota, seeAreaQuotaList, countInfo);
    }

    @Override
    public SeeChangeRecordResponse seeChangeRecordResponse(String accountNo, PageBean pageBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(3);
        paramMap.put("accountno", accountNo);
        paramMap.put("pagenum", pageBean.getCurrentPage());
        paramMap.put("pagesize", pageBean.getPageSize());
        List<ChangeRecordListBean> changeRecordList = quotaExMapper.getChangeRecordList(paramMap);
        Integer countInfo = quotaExMapper.getChangeRecordCount(paramMap);
        return new SeeChangeRecordResponse(changeRecordList, countInfo);
    }

    @Transactional
    @Override
    public String saveChangeRecordResponse(String accountNo, BigDecimal transAmount, String tradingNote) throws UnknownHostException {
        //查询账号
        Account account = accountMapper.selectByPrimaryKey(accountNo);
        //查询下级的账户额度
        List<Accountquota> accountQuotaList = quotaExMapper.getAccountquotaInfo(account.getLinenumber());
        BigDecimal totalCreditLineSum = new BigDecimal(0);
        if (accountQuotaList.size() > 0) {
            for (Accountquota accountQuota : accountQuotaList) {
                //子额度总和
                totalCreditLineSum = totalCreditLineSum.add(accountQuota.getTotalcreditline());
            }
        }
        if (totalCreditLineSum.doubleValue() > transAmount.doubleValue()) {
            //父级额度不能低于子额度总和
            return "20005";
        } else {
            Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(1);
            paramMap.put("accountno", accountNo);

            Accountquota accountQuota = quotaExMapper.getAccountquota(paramMap);
            if ((accountQuota.getMortgageamount()).add(accountQuota.getForeclosurefloorlines()).doubleValue() > transAmount.doubleValue()) {
                //修改额度不能低于已用额度
                return "20006";
            } else {
                BigDecimal totalCreditLine = accountQuota.getTotalcreditline();

                accountQuota.setTotalcreditline(transAmount);
                BigDecimal remainingAmount = transAmount.subtract(accountQuota.getMortgageamount().add(accountQuota.getForeclosurefloorlines()));
                accountQuota.setRemainingamount(remainingAmount);
                accountQuota.setChgdt(new Date());
                accountquotaMapper.updateByPrimaryKey(accountQuota);

                Transaction transaction = new Transaction();
                transaction.setId(Util.getID());
                transaction.setAccountno(accountNo);
                transaction.setBalancetype("3");
                transaction.setTransamount(transAmount);
                transaction.setTranstime(new Date());
                transaction.setTradingnote(tradingNote);
                transaction.setDealman(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
                transactionMapper.insert(transaction);

                String descriptions = account.getAccountname() + "账户额度从" + DecimalFormatTool.formatBigDecimal(totalCreditLine) +
                        "元修改为" + DecimalFormatTool.formatBigDecimal(transAmount) + "元";
                String workerId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
                LogUtil.saveLog("3", descriptions, workerId);
                return "20000";
            }
        }
    }

    @Transactional
    @Override
    public String updateAccountQuota(String workId) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(1);
        paramMap.put("workid", workId);
        Map<String, Object> map = quotaExMapper.getDoctaskInfo(paramMap);

        if (map != null) {
            if (map.get("sumofamount") != null && map.get("producttype") != null && map.get("linenumber") != null) {

                BigDecimal sumofAmount = (BigDecimal) map.get("sumofamount");
                String productType = map.get("producttype").toString();
                String lineNumber = map.get("linenumber").toString();
                List<Account> accountList = quotaExMapper.getAccountInfo(lineNumber);

                if ("1".equals(productType)) {
                    if (accountList.size() > 1) {

                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(lineNumber);
                        for (Account account : accountList) {
                            BigDecimal mortgageRatio = sumofAmount.multiply(accountquota.getMortgageratio());
                            account.setFreezeamount(account.getFreezeamount().add(mortgageRatio));
                            if ((account.getMarginbalance().subtract(mortgageRatio)).doubleValue() < 0) {
                                log.info("同级公司" + account.getAccountname() + "账户保证金" + DecimalFormatTool.formatBigDecimal(account.getMarginbalance()) +
                                        "不足于" + DecimalFormatTool.formatBigDecimal(mortgageRatio));
                                return "20005";
                            }
                            account.setMarginbalance(account.getMarginbalance().subtract(mortgageRatio));
                            accountMapper.updateByPrimaryKey(account);
                        }
                        accountquota.setMortgageamount(accountquota.getMortgageamount().add(sumofAmount));
                        if ((accountquota.getRemainingamount().subtract(sumofAmount)).doubleValue() < 0) {
                            log.info(accountquota.getLinenumber() + "号可用额度" + DecimalFormatTool.formatBigDecimal(accountquota.getRemainingamount()) +
                                    "不足于" + DecimalFormatTool.formatBigDecimal(sumofAmount));
                            return "20005";
                        }
                        accountquota.setRemainingamount(accountquota.getRemainingamount().subtract(sumofAmount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);

                    } else {

                        Account account = accountList.get(0);
                        Accountquota accountQuota = accountquotaMapper.selectByPrimaryKey(lineNumber);
                        List<Accountquota> accountQuotaList = quotaExMapper.getAccountquotaInfo(lineNumber);

                        BigDecimal mortgageRatio = sumofAmount.multiply(accountQuota.getMortgageratio());
                        if ((account.getMarginbalance().subtract(mortgageRatio)).doubleValue() < 0) {
                            log.info("独立公司" + account.getAccountname() + "账户保证金" + DecimalFormatTool.formatBigDecimal(account.getMarginbalance()) +
                                    "不足于" + DecimalFormatTool.formatBigDecimal(mortgageRatio));
                            return "20005";
                        }
                        if ((accountQuota.getRemainingamount().subtract(sumofAmount)).doubleValue() < 0) {
                            log.info(accountQuota.getLinenumber() + "号可用额度" + DecimalFormatTool.formatBigDecimal(accountQuota.getRemainingamount()) +
                                    "不足于" + DecimalFormatTool.formatBigDecimal(sumofAmount));
                            return "20005";
                        }
                        account.setFreezeamount(account.getFreezeamount().add(mortgageRatio));
                        account.setMarginbalance(account.getMarginbalance().subtract(mortgageRatio));
                        accountMapper.updateByPrimaryKey(account);
                        accountQuota.setMortgageamount(accountQuota.getMortgageamount().add(sumofAmount));
                        accountQuota.setRemainingamount(accountQuota.getRemainingamount().subtract(sumofAmount));
                        accountquotaMapper.updateByPrimaryKey(accountQuota);

                        //子公司
                        if (accountQuota.getLinenumbersenior() != null && accountQuotaList.size() == 0) {

                            String lineNumberSenior = accountQuota.getLinenumbersenior();
                            while (lineNumberSenior != null && !("".equals(lineNumberSenior))) {
                                Accountquota accountuotaInfo = accountquotaMapper.selectByPrimaryKey(lineNumberSenior);
                                List<Account> accountListInfo = quotaExMapper.getAccountInfo(accountuotaInfo.getLinenumber());
                                if (accountListInfo.size() > 0) {
                                    Account accountInfo = accountListInfo.get(0);
                                    BigDecimal mortgage = sumofAmount.multiply(accountuotaInfo.getMortgageratio());
                                    if ((accountInfo.getMarginbalance().subtract(mortgage)).doubleValue() < 0) {
                                        log.info("父级公司" + accountInfo.getAccountname() + "账户保证金" + DecimalFormatTool.formatBigDecimal(accountInfo.getMarginbalance()) +
                                                "不足于" + DecimalFormatTool.formatBigDecimal(mortgage));
                                        return "20005";
                                    }
                                    accountInfo.setMarginbalance(accountInfo.getMarginbalance().subtract(mortgage));
                                    accountMapper.updateByPrimaryKey(accountInfo);
                                }
                                lineNumberSenior = accountuotaInfo.getLinenumbersenior();
                            }

                        }
                        //父公司
                        if (accountQuota.getLinenumbersenior() == null && accountQuotaList.size() > 0) {

                            for (Accountquota accountquotaInfo : accountQuotaList) {
                                List<Account> accountListInfo = quotaExMapper.getAccountInfo(accountquotaInfo.getLinenumber());
                                if (accountListInfo.size() > 0) {
                                    Account accountInfo = accountListInfo.get(0);
                                    BigDecimal mortgage = sumofAmount.multiply(accountquotaInfo.getMortgageratio());
                                    if ((accountInfo.getMarginbalance().subtract(mortgage)).doubleValue() < 0) {
                                        log.info("子公司" + accountInfo.getAccountname() + "账户保证金" + DecimalFormatTool.formatBigDecimal(accountInfo.getMarginbalance()) + "不足于" + DecimalFormatTool.formatBigDecimal(mortgage));
                                        return "20005";
                                    }
                                    accountInfo.setMarginbalance(accountInfo.getMarginbalance().subtract(mortgage));
                                    accountMapper.updateByPrimaryKey(accountInfo);
                                }
                            }

                        }
                    }
                }
                if ("2".equals(productType)) {
                    if (accountList.size() > 1) {

                        Accountquota accountQuota = accountquotaMapper.selectByPrimaryKey(lineNumber);
                        for (Account account : accountList) {
                            BigDecimal foreclosureFloorRatio = sumofAmount.multiply(accountQuota.getForeclosurefloorratio());
                            account.setFreezeamount(account.getFreezeamount().add(foreclosureFloorRatio));
                            if ((account.getMarginbalance().subtract(foreclosureFloorRatio)).doubleValue() < 0) {
                                log.info("同级公司" + account.getAccountname() + "账户保证金" + DecimalFormatTool.formatBigDecimal(account.getMarginbalance()) +
                                        "不足于" + DecimalFormatTool.formatBigDecimal(foreclosureFloorRatio));
                                return "20005";
                            }
                            account.setMarginbalance(account.getMarginbalance().subtract(foreclosureFloorRatio));
                            accountMapper.updateByPrimaryKey(account);
                        }
                        accountQuota.setForeclosurefloorlines(accountQuota.getForeclosurefloorlines().add(sumofAmount));
                        if ((accountQuota.getRemainingamount().subtract(sumofAmount)).doubleValue() < 0) {
                            log.info(accountQuota.getLinenumber() + "号可用额度" + DecimalFormatTool.formatBigDecimal(accountQuota.getRemainingamount()) +
                                    "不足于" + DecimalFormatTool.formatBigDecimal(sumofAmount));
                            return "20005";
                        }
                        accountQuota.setRemainingamount(accountQuota.getRemainingamount().subtract(sumofAmount));
                        accountquotaMapper.updateByPrimaryKey(accountQuota);

                    } else {

                        Account account = accountList.get(0);
                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(lineNumber);
                        List<Accountquota> accountQuotaList = quotaExMapper.getAccountquotaInfo(lineNumber);

                        BigDecimal foreclosureFloorRatio = sumofAmount.multiply(accountquota.getForeclosurefloorratio());
                        if ((account.getMarginbalance().subtract(foreclosureFloorRatio)).doubleValue() < 0) {
                            log.info("独立公司" + account.getAccountname() + "账户保证金" + DecimalFormatTool.formatBigDecimal(account.getMarginbalance()) +
                                    "不足于" + DecimalFormatTool.formatBigDecimal(foreclosureFloorRatio));
                            return "20005";
                        }
                        if ((accountquota.getRemainingamount().subtract(sumofAmount)).doubleValue() < 0) {
                            log.info(accountquota.getLinenumber() + "号可用额度" + DecimalFormatTool.formatBigDecimal(accountquota.getRemainingamount()) +
                                    "不足于" + DecimalFormatTool.formatBigDecimal(sumofAmount));
                            return "20005";
                        }
                        account.setFreezeamount(account.getFreezeamount().add(foreclosureFloorRatio));
                        account.setMarginbalance(account.getMarginbalance().subtract(foreclosureFloorRatio));
                        accountMapper.updateByPrimaryKey(account);
                        accountquota.setForeclosurefloorlines(accountquota.getForeclosurefloorlines().add(sumofAmount));
                        accountquota.setRemainingamount(accountquota.getRemainingamount().subtract(sumofAmount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);

                        //子公司
                        if (accountquota.getLinenumbersenior() != null && accountQuotaList.size() == 0) {

                            String linenumberSenior = accountquota.getLinenumbersenior();
                            while (linenumberSenior != null && !("".equals(linenumberSenior))) {
                                Accountquota accountQuotaInfo = accountquotaMapper.selectByPrimaryKey(linenumberSenior);
                                List<Account> accountListInfo = quotaExMapper.getAccountInfo(accountQuotaInfo.getLinenumber());
                                if (accountListInfo.size() > 0) {
                                    Account accountInfo = accountListInfo.get(0);
                                    BigDecimal foreclosureFloor = sumofAmount.multiply(accountQuotaInfo.getForeclosurefloorratio());
                                    if ((accountInfo.getMarginbalance().subtract(foreclosureFloor)).doubleValue() < 0) {
                                        log.info("父级公司" + accountInfo.getAccountname() + "账户保证金" + DecimalFormatTool.formatBigDecimal(accountInfo.getMarginbalance()) +
                                                "不足于" + DecimalFormatTool.formatBigDecimal(foreclosureFloor));
                                        return "20005";
                                    }
                                    accountInfo.setMarginbalance(accountInfo.getMarginbalance().subtract(foreclosureFloor));
                                    accountMapper.updateByPrimaryKey(accountInfo);
                                }
                                linenumberSenior = accountQuotaInfo.getLinenumbersenior();
                            }

                        }
                        //父公司
                        if (accountquota.getLinenumbersenior() == null && accountQuotaList.size() > 0) {

                            for (Accountquota accountQuotaInfo : accountQuotaList) {
                                List<Account> accountListInfo = quotaExMapper.getAccountInfo(accountQuotaInfo.getLinenumber());
                                if (accountListInfo.size() > 0) {
                                    Account accountInfo = accountListInfo.get(0);
                                    BigDecimal foreclosureFloor = sumofAmount.multiply(accountQuotaInfo.getForeclosurefloorratio());
                                    if ((accountInfo.getMarginbalance().subtract(foreclosureFloor)).doubleValue() < 0) {
                                        log.info("子公司" + accountInfo.getAccountname() + "账户保证金" + DecimalFormatTool.formatBigDecimal(accountInfo.getMarginbalance()) +
                                                "不足于" + DecimalFormatTool.formatBigDecimal(foreclosureFloor));
                                        return "20005";
                                    }
                                    accountInfo.setMarginbalance(accountInfo.getMarginbalance().subtract(foreclosureFloor));
                                    accountMapper.updateByPrimaryKey(accountInfo);
                                }
                            }
                        }
                    }
                }
                return "20000";
            } else {
                return "20004";
            }
        } else {
            return "20004";
        }
    }
}
