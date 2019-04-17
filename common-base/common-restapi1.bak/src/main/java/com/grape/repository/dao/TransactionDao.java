package com.grape.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grape.repository.entity.Transaction;
	
public interface TransactionDao extends JpaRepository<Transaction, String>  {

}
