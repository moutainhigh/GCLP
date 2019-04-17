package com.grape.work.task;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Account;
import com.grape.model.db.Accountquota;
import com.grape.model.mapper.base.AccountMapper;
import com.grape.model.mapper.base.AccountquotaMapper;
import com.grape.model.mapper.external.QuotaExMapper;
import com.grape.workflow.Execution;
import com.grape.workflow.util.Util;

@Log4j
@Component
@Scope("prototype")
public class AddAccountQuotaTask implements WorkTask {

    @Autowired
    private QuotaExMapper quotaExMapper;
    @Autowired
    private AccountquotaMapper accountquotaMapper;
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public TaskResult handle(Execution execution) {
        if (Util.outObj(execution.getOperation()).contains("拒绝") || Util.outObj(execution.getOperation()).contains("取消") || Util.outObj(execution.getOperation()).contains("退回")) {
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
                            List<Accountquota> accountquotalist = quotaExMapper.getAccountquotaInfo(linenumber);

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
                                while (linenumbersenior != null && !(linenumbersenior.equals(""))) {
                                    Accountquota accountquotainfo = accountquotaMapper.selectByPrimaryKey(linenumbersenior);
                                    List<Account> accountlistinfo = quotaExMapper.getAccountInfo(accountquotainfo.getLinenumber());
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
                                    List<Account> accountlistinfo = quotaExMapper.getAccountInfo(accountquotainfo.getLinenumber());
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
                            List<Accountquota> accountquotalist = quotaExMapper.getAccountquotaInfo(linenumber);

                            BigDecimal foreclosurefloorratio = sumofamount.multiply(accountquota.getForeclosurefloorratio());
                            account.setFreezeamount(account.getFreezeamount().subtract(foreclosurefloorratio));
                            account.setMarginbalance(account.getMarginbalance().add(foreclosurefloorratio));
                            accountMapper.updateByPrimaryKey(account);
                            accountquota.setForeclosurefloorlines(accountquota.getForeclosurefloorlines().subtract(sumofamount));
                            accountquota.setRemainingamount(accountquota.getRemainingamount().add(sumofamount));
                            accountquotaMapper.updateByPrimaryKey(accountquota);

                            if (accountquota.getLinenumbersenior() != null && accountquotalist.size() == 0) {//子公司

                                String linenumbersenior = accountquota.getLinenumbersenior();
                                while (linenumbersenior != null && !(linenumbersenior.equals(""))) {
                                    Accountquota accountquotainfo = accountquotaMapper.selectByPrimaryKey(linenumbersenior);
                                    List<Account> accountlistinfo = quotaExMapper.getAccountInfo(accountquotainfo.getLinenumber());
                                    if (accountlistinfo.size() > 0) {
                                        Account accountinfo = accountlistinfo.get(0);
                                        BigDecimal foreclosurefloor = sumofamount.multiply(accountquotainfo.getForeclosurefloorratio());
                                        accountinfo.setMarginbalance(accountinfo.getMarginbalance().add(foreclosurefloor));
                                        accountMapper.updateByPrimaryKey(accountinfo);
                                    }
                                    linenumbersenior = accountquotainfo.getLinenumbersenior();
                                }

                            }
                            if (accountquota.getLinenumbersenior() == null && accountquotalist.size() > 0) {//父公司

                                for (Accountquota accountquotainfo : accountquotalist) {
                                    List<Account> accountlistinfo = quotaExMapper.getAccountInfo(accountquotainfo.getLinenumber());
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
                    log.info("操作：" + Util.outObj(execution.getOperation()) + "  退还额度成功");
                }
            }
            return new TaskResult(true, "退还额度成功");
        } else {
            return new TaskResult(true, "");
        }


    }
}