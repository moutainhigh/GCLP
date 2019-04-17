package com.grape.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grape.repository.entity.Repayplan;
	
public interface RepayplanDao extends JpaRepository<Repayplan, String>  {

}
