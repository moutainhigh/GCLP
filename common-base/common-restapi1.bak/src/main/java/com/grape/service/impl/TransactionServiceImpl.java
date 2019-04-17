package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.TransactionDao;
import com.grape.repository.entity.Transaction;
import com.grape.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionDao transactionDao;

	@Override
	public List<Transaction> findByaccountno(String accountno,int pagenum, int pagesize) {
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Transaction transaction = new Transaction();
		transaction.setAccountno(accountno);
		Example<Transaction> example = Example.of(transaction);
		Page<Transaction> page = transactionDao.findAll(example, pageable);
		return page.getContent();
	}

	@Override
	public void saveTransaction(Transaction transaction) {
		transactionDao.save(transaction);
	}	
}
