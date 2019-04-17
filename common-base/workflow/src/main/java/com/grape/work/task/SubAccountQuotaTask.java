package com.grape.work.task;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Account;
import com.grape.model.db.Accountquota;
import com.grape.model.mapper.base.AccountMapper;
import com.grape.model.mapper.base.AccountquotaMapper;
import com.grape.model.mapper.external.QuotaExMapper;
import com.grape.workflow.Execution;

@Log4j
@Component
@Scope("prototype")
public class SubAccountQuotaTask implements WorkTask {

    //private static final Logger log = org.slf4j.LoggerFactory.getLogger(SubAccountQuotaTask.class);
    @Autowired
    private QuotaExMapper quotaExMapper;
    @Autowired
    private AccountquotaMapper accountquotaMapper;
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public TaskResult handle(Execution execution) {
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("workid", execution.getWorkId());
        Map<String, Object> map = quotaExMapper.getDoctaskInfo(paramMap);

        if (map != null) {
            if (map.get("sumofamount") != null && map.get("producttype") != null && map.get("linenumber") != null) {

                BigDecimal sumofamount = (BigDecimal) map.get("sumofamount");
                String producttype = map.get("producttype").toString();
                String linenumber = map.get("linenumber").toString();
                List<Account> accountlist = quotaExMapper.getAccountInfo(linenumber);

                if ("1".equals(producttype)) {
                    //多个公司共用同个额度
                    if (accountlist.size() > 1) {

                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(linenumber);
                        for (Account account : accountlist) {
                            //冻结金额 = 批复金额 * 抵押比例
                            BigDecimal mortgageratio = sumofamount.multiply(accountquota.getMortgageratio());
                            //冻结保证金总金额
                            account.setFreezeamount(account.getFreezeamount().add(mortgageratio));
                            //保证金余额
                            if ((account.getMarginbalance().subtract(mortgageratio)).doubleValue() < 0) {
                                log.error("同级公司" + account.getAccountno() + "账户保证金" + account.getMarginbalance() + "不足于" + mortgageratio);
                                return new TaskResult(false, "账户保证金余额不足");
                            }
                            account.setMarginbalance(account.getMarginbalance().subtract(mortgageratio));
                            accountMapper.updateByPrimaryKey(account);
                        }
                        accountquota.setMortgageamount(accountquota.getMortgageamount().add(sumofamount));
                        //剩余授信额度
                        if ((accountquota.getRemainingamount().subtract(sumofamount)).doubleValue() < 0) {
                            log.error(accountquota.getLinenumber() + "号可用额度" + accountquota.getRemainingamount() + "不足于" + sumofamount);
                            return new TaskResult(false, "账户额度不足");
                        }
                        accountquota.setRemainingamount(accountquota.getRemainingamount().subtract(sumofamount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);

                    } else {

                        Account account = accountlist.get(0);
                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(linenumber);
                        List<Accountquota> accountquotalist = quotaExMapper.getAccountquotaInfo(linenumber);

                        BigDecimal mortgageratio = sumofamount.multiply(accountquota.getMortgageratio());
                        if ((account.getMarginbalance().subtract(mortgageratio)).doubleValue() < 0) {
                            log.error("独立公司" + account.getAccountno() + "账户保证金" + account.getMarginbalance() + "不足于" + mortgageratio);
                            return new TaskResult(false, "账户保证金余额或账户额度不足");
                        }
                        if ((accountquota.getRemainingamount().subtract(sumofamount)).doubleValue() < 0) {
                            log.error(accountquota.getLinenumber() + "号可用额度" + accountquota.getRemainingamount() + "不足于" + sumofamount);
                            return new TaskResult(false, "账户保证金余额或账户额度不足");
                        }
                        account.setFreezeamount(account.getFreezeamount().add(mortgageratio));
                        account.setMarginbalance(account.getMarginbalance().subtract(mortgageratio));
                        accountMapper.updateByPrimaryKey(account);
                        accountquota.setMortgageamount(accountquota.getMortgageamount().add(sumofamount));
                        accountquota.setRemainingamount(accountquota.getRemainingamount().subtract(sumofamount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);

                        //子公司
                        if (accountquota.getLinenumbersenior() != null && accountquotalist.size() == 0) {
                            //上级额度编号
                            String linenumbersenior = accountquota.getLinenumbersenior();
                            while (linenumbersenior != null && !"".equals(linenumbersenior)) {
                                Accountquota accountquotainfo = accountquotaMapper.selectByPrimaryKey(linenumbersenior);
                                List<Account> accountlistinfo = quotaExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                if (accountlistinfo.size() > 0) {
                                    Account accountinfo = accountlistinfo.get(0);
                                    BigDecimal mortgage = sumofamount.multiply(accountquotainfo.getMortgageratio());
                                    if ((accountinfo.getMarginbalance().subtract(mortgage)).doubleValue() < 0) {
                                        log.error("父级公司" + accountinfo.getAccountno() + "账户保证金" + accountinfo.getMarginbalance() + "不足于" + mortgage);
                                        return new TaskResult(false, "账户保证金余额或账户额度不足");
                                    }
                                    accountinfo.setMarginbalance(accountinfo.getMarginbalance().subtract(mortgage));
                                    accountMapper.updateByPrimaryKey(accountinfo);
                                }
                                linenumbersenior = accountquotainfo.getLinenumbersenior();
                            }

                        }
                        //父公司
                        if (accountquota.getLinenumbersenior() == null && accountquotalist.size() > 0) {
                            for (Accountquota accountquotainfo : accountquotalist) {
                                List<Account> accountlistinfo = quotaExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                if (accountlistinfo.size() > 0) {
                                    Account accountinfo = accountlistinfo.get(0);
                                    BigDecimal mortgage = sumofamount.multiply(accountquotainfo.getMortgageratio());
                                    if ((accountinfo.getMarginbalance().subtract(mortgage)).doubleValue() < 0) {
                                        log.error("子公司" + accountinfo.getAccountno() + "账户保证金" + accountinfo.getMarginbalance() + "不足于" + mortgage);
                                        return new TaskResult(false, "账户保证金余额或账户额度不足");
                                    }
                                    accountinfo.setMarginbalance(accountinfo.getMarginbalance().subtract(mortgage));
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
                            account.setFreezeamount(account.getFreezeamount().add(foreclosurefloorratio));
                            if ((account.getMarginbalance().subtract(foreclosurefloorratio)).doubleValue() < 0) {
                                log.info("同级公司" + account.getAccountno() + "账户保证金" + account.getMarginbalance() + "不足于" + foreclosurefloorratio);
                                return new TaskResult(false, "账户保证金余额或账户额度不足");
                            }
                            account.setMarginbalance(account.getMarginbalance().subtract(foreclosurefloorratio));
                            accountMapper.updateByPrimaryKey(account);
                        }
                        accountquota.setForeclosurefloorlines(accountquota.getForeclosurefloorlines().add(sumofamount));
                        if ((accountquota.getRemainingamount().subtract(sumofamount)).doubleValue() < 0) {
                            log.info(accountquota.getLinenumber() + "号可用额度" + accountquota.getRemainingamount() + "不足于" + sumofamount);
                            return new TaskResult(false, "账户保证金余额或账户额度不足");
                        }
                        accountquota.setRemainingamount(accountquota.getRemainingamount().subtract(sumofamount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);

                    } else {

                        Account account = accountlist.get(0);
                        Accountquota accountquota = accountquotaMapper.selectByPrimaryKey(linenumber);
                        List<Accountquota> accountquotalist = quotaExMapper.getAccountquotaInfo(linenumber);

                        BigDecimal foreclosurefloorratio = sumofamount.multiply(accountquota.getForeclosurefloorratio());
                        if ((account.getMarginbalance().subtract(foreclosurefloorratio)).doubleValue() < 0) {
                            log.error("独立公司" + account.getAccountno() + "账户保证金" + account.getMarginbalance() + "不足于" + foreclosurefloorratio);
                            return new TaskResult(false, "账户保证金余额或账户额度不足");
                        }
                        if ((accountquota.getRemainingamount().subtract(sumofamount)).doubleValue() < 0) {
                            log.error(accountquota.getLinenumber() + "号可用额度" + accountquota.getRemainingamount() + "不足于" + sumofamount);
                            return new TaskResult(false, "账户保证金余额或账户额度不足");
                        }
                        account.setFreezeamount(account.getFreezeamount().add(foreclosurefloorratio));
                        account.setMarginbalance(account.getMarginbalance().subtract(foreclosurefloorratio));
                        accountMapper.updateByPrimaryKey(account);
                        accountquota.setForeclosurefloorlines(accountquota.getForeclosurefloorlines().add(sumofamount));
                        accountquota.setRemainingamount(accountquota.getRemainingamount().subtract(sumofamount));
                        accountquotaMapper.updateByPrimaryKey(accountquota);
                        //子公司
                        if (accountquota.getLinenumbersenior() != null && accountquotalist.size() == 0) {

                            String linenumbersenior = accountquota.getLinenumbersenior();
                            while (linenumbersenior != null && !("".equals(linenumbersenior))) {
                                Accountquota accountquotainfo = accountquotaMapper.selectByPrimaryKey(linenumbersenior);
                                List<Account> accountlistinfo = quotaExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                if (accountlistinfo.size() > 0) {
                                    Account accountinfo = accountlistinfo.get(0);
                                    BigDecimal foreclosurefloor = sumofamount.multiply(accountquotainfo.getForeclosurefloorratio());
                                    if ((accountinfo.getMarginbalance().subtract(foreclosurefloor)).doubleValue() < 0) {
                                        log.error("父级公司" + accountinfo.getAccountno() + "账户保证金" + accountinfo.getMarginbalance() + "不足于" + foreclosurefloor);
                                        return new TaskResult(false, "账户保证金余额或账户额度不足");
                                    }
                                    accountinfo.setMarginbalance(accountinfo.getMarginbalance().subtract(foreclosurefloor));
                                    accountMapper.updateByPrimaryKey(accountinfo);
                                }
                                linenumbersenior = accountquotainfo.getLinenumbersenior();
                            }

                        }
                        //父公司
                        if (accountquota.getLinenumbersenior() == null && accountquotalist.size() > 0) {

                            for (Accountquota accountquotainfo : accountquotalist) {
                                List<Account> accountlistinfo = quotaExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                if (accountlistinfo.size() > 0) {
                                    Account accountinfo = accountlistinfo.get(0);
                                    BigDecimal foreclosurefloor = sumofamount.multiply(accountquotainfo.getForeclosurefloorratio());
                                    if ((accountinfo.getMarginbalance().subtract(foreclosurefloor)).doubleValue() < 0) {
                                        log.error("子公司" + accountinfo.getAccountno() + "账户保证金" + accountinfo.getMarginbalance() + "不足于" + foreclosurefloor);
                                        return new TaskResult(false, "账户保证金余额或账户额度不足");
                                    }
                                    accountinfo.setMarginbalance(accountinfo.getMarginbalance().subtract(foreclosurefloor));
                                    accountMapper.updateByPrimaryKey(accountinfo);
                                }
                            }
                        }
                    }
                }
                log.info("账户保证金额度变更成功");
                return new TaskResult(true, "流水变更额度成功");
            } else {
                log.error("未找到账户信息");
                return new TaskResult(false, "未找到账户信息");
            }
        } else {
            log.error("未找到账户信息");
            return new TaskResult(false, "未找到账户信息");
        }
    }
}
