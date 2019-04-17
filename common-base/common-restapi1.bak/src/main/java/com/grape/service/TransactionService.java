package com.grape.service;

import java.util.List;

import com.grape.repository.entity.Transaction;

public interface TransactionService {

	List<Transaction> findByaccountno(String accountno,int pagenum, int pagesize);
	
	void saveTransaction(Transaction transaction);
	
}
