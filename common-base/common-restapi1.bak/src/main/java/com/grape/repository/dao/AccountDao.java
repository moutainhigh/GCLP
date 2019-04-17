package com.grape.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grape.repository.entity.Account;
	
public interface AccountDao extends JpaRepository<Account, String>  {

    Account findByaccountno(String accountno);
    
}
