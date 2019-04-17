package com.grape.service;

import java.util.List;

import com.grape.repository.entity.Repayinfo;

public interface RepayinfoService {

	List<Repayinfo> findByworkid(String workid,int pagenum, int pagesize);
	
}
