package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.DoctaskDao;
import com.grape.repository.entity.Doctask;
import com.grape.service.DoctaskService;

@Service
public class DoctaskServiceImpl implements DoctaskService {

	@Autowired
	private DoctaskDao doctaskDao;	
	
	@Override
	public List<Doctask> findBycondition(Date startDate,Date endDate,String channo,String departmentno,String areaid,String userid,String productno,int pagenum,int pagesize) {
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Doctask doctask = new Doctask();
		doctask.setChanno(channo);
		doctask.setDepartmentno(departmentno);
		doctask.setAreaid(areaid);
		doctask.setUserid(userid);
		doctask.setApplydate(endDate);
		Example<Doctask> example = Example.of(doctask);
		Page<Doctask> page = doctaskDao.findAll(example, pageable);
		return page.getContent();
	}
	
	@Override
	public Doctask findByworkid(String workid) {
		return doctaskDao.findByworkid(workid);
	}
}
