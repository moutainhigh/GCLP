package com.grape.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.ReponseBean;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.repository.entity.Account;
import com.grape.repository.entity.Limittable;
import com.grape.repository.entity.Transaction;
import com.grape.security.Util;
import com.grape.service.AccountService;
import com.grape.service.LimittableService;
import com.grape.service.TransactionService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/account")
@Validated
public class AccountController {

	@Autowired
	private AccountService accountService;
	@Autowired
	private TransactionService transactionService;
	@Autowired
	private LimittableService limittableService;

	@ApiOperation(value = "查询账户",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/1findBycondition")
	public ReponseBean findBycondition(String accountname,String accountorg,String accountno) {
		return new ReponseBean(accountService.findBycondition(accountname,accountorg,accountno,0,10));
	}



	@ApiOperation(value = "新增账户",httpMethod="POST",notes="测试用接口",response=RestfulResponse.class)
	@RequestMapping("/2saveAccount")
	public RestfulResponse saveAccount(@Validated @RequestBody Account account) {
		accountService.saveAccount(account);
		return new RestfulResponse();
	}



	@ApiOperation(value = "主键查询获取账户信息",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/3accountfindByaccountno")
	public ReponseBean accountfindByaccountno(@Validated @RequestParam("accountno") String accountno) {
		return new ReponseBean(accountService.findByaccountno(accountno));
	}
	@ApiOperation(value = "主键查询获取额度信息",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/4limitfindByaccountno")
	public ReponseBean limitfindByaccountno(@Validated @RequestParam("accountno") String accountno) {
		return new ReponseBean(limittableService.findByaccountno(accountno, 0, 3));
	}
	@ApiOperation(value = "主键查询获取交易记录",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/5transactionfindByaccountno")
	public ReponseBean transactionfindByaccountno(@Validated @RequestParam("accountno") String accountno) {
		return new ReponseBean(transactionService.findByaccountno(accountno, 0, 3));
	}



	@ApiOperation(value = "新增额度",httpMethod="POST",notes="测试用接口",response=RestfulResponse.class)
	@RequestMapping("/6saveLimittable")
	public RestfulResponse saveLimittable(@Validated @RequestBody Limittable limittable) {
		limittableService.saveLimittable(limittable);
		return new RestfulResponse();
	}



	@ApiOperation(value = "修改账户",httpMethod="POST",notes="测试用接口",response=RestfulResponse.class)
	@RequestMapping("/7updateAccount")
	public RestfulResponse updateAccount(@Validated @RequestBody Account account) {
		Account Account=accountService.findByaccountno(account.getAccountno());
		Double money=account.getBailamount()-Account.getBailamount();
		if(money!=0){
			Transaction transaction=new Transaction();
			transaction.setId(Util.getID());
			transaction.setAccountno(account.getAccountno());
			transaction.setBalancetype(account.getAccounttype());
			transaction.setTransaccount(account.getAccountname());
			transaction.setTransaccount(account.getAccountno());
			transaction.setTransway("1");
			transaction.setTransamount(money);
			transaction.setTranstime(new Date());
			transaction.setAccountamount(account.getBailamount());
			transaction.setDealman("当前登录人员");
			transactionService.saveTransaction(transaction);
			accountService.updateAccount(account);
		}else{
			accountService.updateAccount(account);
		}
		return new RestfulResponse();
	}
}
