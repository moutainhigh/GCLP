package com.grape.service.impl;

import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.grape.util.DecimalFormatTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.SeeAccountResponse;
import com.grape.controller.reponse.SeeTradingResponse;
import com.grape.controller.reponse.StatisticalAccountResponse;
import com.grape.controller.reponse.bean.SeeAccountListBean;
import com.grape.controller.reponse.bean.SeeTradingBean;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.model.db.Account;
import com.grape.model.db.Organization;
import com.grape.model.db.Transaction;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.base.AccountMapper;
import com.grape.model.mapper.base.OrganizationMapper;
import com.grape.model.mapper.base.TransactionMapper;
import com.grape.model.mapper.external.AccountExMapper;
import com.grape.service.AccountService;
import com.grape.util.LogUtil;
import com.grape.util.PageBean;
import com.grape.util.Util;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl extends BaseMapper implements AccountService {

    @Autowired
    private AccountExMapper accountExMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private TransactionMapper transactionMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public StatisticalAccountResponse statisticalAccountResponse(String checkType, UserOfOrgBean userOfOrgBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(4);
        //企业类型
        paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        //企业编号
        paramMap.put("organizationno", userOfOrgBean.getOrganizationno());
        //查看类型
        paramMap.put("checktype", checkType);
        return accountExMapper.statisticalAccount(paramMap);
    }

    @Override
    public SeeAccountResponse seeAccountResponse(String checkType, PageBean pageBean, UserOfOrgBean userOfOrgBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(5);
        //企业类型
        paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        //企业编号
        paramMap.put("organizationno", userOfOrgBean.getOrganizationno());
        //查看类型
        paramMap.put("checktype", checkType);
        //当前页
        paramMap.put("pagenum", pageBean.getCurrentPage());
        //页数大小
        paramMap.put("pagesize", pageBean.getPageSize());
        List<SeeAccountListBean> seeAccountList = accountExMapper.seeAccountList(paramMap);
        Integer countInfo = accountExMapper.seeAccountCount(paramMap);
        return new SeeAccountResponse(seeAccountList, countInfo);
    }


    @Transactional
    @Override
    public String saveTradingResponse(String organizationNo, String topupOrDeduction, String balanceType, BigDecimal transAmount, String tradingNote, UserOfOrgBean userOfOrgBean) throws UnknownHostException {
        //BigDecimal money = new BigDecimal(0);
        BigDecimal money;
        String logTransactionType;
        if ("1".equals(topupOrDeduction)) {
            money = transAmount;
            logTransactionType = "充值 ";
        } else {
            money = transAmount.multiply(new BigDecimal("-1"));
            logTransactionType = "扣费 ";
        }
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(3);
        Organization organization = organizationMapper.selectByPrimaryKey(organizationNo);
        if ("04".equals(userOfOrgBean.getOrgbelongsto()) && "02".equals(organization.getOrgbelongsto())) {
            paramMap.put("accountbakno", userOfOrgBean.getOrganizationno());
            paramMap.put("accountorg", organizationNo);
            paramMap.put("accounttype", balanceType);
        } else {
            paramMap.put("accountbakno", organizationNo);
            paramMap.put("accountorg", userOfOrgBean.getOrganizationno());
            paramMap.put("accounttype", balanceType);
        }
        Account account = accountExMapper.getAccount(paramMap);

        if (account != null && (account.getAccountremian().add(money)).doubleValue() > 0) {
            account.setAccountremian(account.getAccountremian().add(money));
            if ("01".equals(account.getAccounttype()) && (account.getMarginbalance().add(money)).doubleValue() > 0) {
                account.setMarginbalance(account.getMarginbalance().add(money));
            }
            accountMapper.updateByPrimaryKey(account);
            Transaction transaction = new Transaction();
            transaction.setId(Util.getID());
            transaction.setAccountno(account.getAccountno());
            transaction.setBalancetype(account.getAccounttype());
            transaction.setTransamount(money);
            transaction.setTranstime(new Date());
            transaction.setTradingnote(tradingNote);
            transaction.setDealman(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
            transactionMapper.insert(transaction);
            String descriptions = account.getAccountname() + "账户" + logTransactionType + DecimalFormatTool.formatBigDecimal(transAmount) + "元";
            String workerId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
            LogUtil.saveLog("4", descriptions, workerId);
            return "20000";
        } else {
            return "20003";
        }
    }

    @Override
    public SeeTradingResponse seeTradingResponse(String organizationNo, String accountType, PageBean pageBean, UserOfOrgBean userOfOrgBean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(7);
        paramMap.put("accountorg", userOfOrgBean.getOrganizationno());
        paramMap.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        Organization organization = organizationMapper.selectByPrimaryKey(organizationNo);
        if (organizationNo != null) {
            paramMap.put("accountbakno", organizationNo);
        }
        if (organization != null) {
            paramMap.put("orgtype", organization.getOrgbelongsto());
        }
        paramMap.put("accounttype", accountType);
        paramMap.put("pagenum", pageBean.getCurrentPage());
        paramMap.put("pagesize", pageBean.getPageSize());

        List<SeeTradingBean> seeTradingBean;
        Integer count;
        if (accountType != null && !("".equals(accountType))) {
            seeTradingBean = accountExMapper.seeTradingList(paramMap);
            count = accountExMapper.seeTradingCount(paramMap);
        } else {
            seeTradingBean = accountExMapper.seeSingleList(paramMap);
            count = accountExMapper.seeSingleCount(paramMap);
        }
        return new SeeTradingResponse(seeTradingBean, count);
    }
}
