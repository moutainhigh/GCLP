package com.grape.service;

import java.util.List;

import com.grape.repository.entity.Account;

public interface AccountService {

	List<Account> findBycondition(String accountname,String accountorg,String accountno,int pagenum, int pagesize);
	
	void saveAccount(Account account);
	
	Account findByaccountno(String accountno);
	
	void updateAccount(Account account);
}
