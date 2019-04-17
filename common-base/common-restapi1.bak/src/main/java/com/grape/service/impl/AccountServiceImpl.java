package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.AccountDao;
import com.grape.repository.entity.Account;
import com.grape.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;	
	
	@Override
	public List<Account> findBycondition(String accountname,String accountorg,String accountno,int pagenum, int pagesize) {
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Account account = new Account();
		account.setAccountname(accountname);
		account.setAccountorg(accountorg);
		account.setAccountno(accountno);
		Example<Account> example = Example.of(account);
		Page<Account> page = accountDao.findAll(example, pageable);
		return page.getContent();
	}
	
	@Override
	public void saveAccount(Account account) {
		accountDao.save(account);
	}
	
	@Override
	public Account findByaccountno(String accountno) {
		return accountDao.findByaccountno(accountno);
	}
	
	@Override
	public void updateAccount(Account account) {
		accountDao.save(account);
	}
}
