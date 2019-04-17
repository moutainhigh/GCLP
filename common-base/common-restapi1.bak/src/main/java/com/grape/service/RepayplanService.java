package com.grape.service;

import java.util.List;

import com.grape.repository.entity.Repayplan;

public interface RepayplanService {

	List<Repayplan> findByworkid(String workid,int pagenum, int pagesize);
	
}
