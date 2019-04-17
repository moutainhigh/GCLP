package com.grape.service;

import java.util.List;

import com.grape.repository.entity.Consult;

public interface ConsultService {

	List<Consult> findByworkid(String workid,int pagenum, int pagesize);
	
}
