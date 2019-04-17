package com.grape.service;

import java.util.Date;
import java.util.List;

import com.grape.repository.entity.Doctask;

public interface DoctaskService {

	List<Doctask> findBycondition(Date startDate,Date endDate,String channo,String departmentno,String areaid,String userid,String productno,int pagenum, int pagesize);
	
	Doctask findByworkid(String workid);
}
