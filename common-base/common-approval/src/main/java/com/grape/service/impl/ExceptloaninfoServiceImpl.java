package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.mapper.base.ExceptloaninfoMapper;
import com.grape.service.ExceptloaninfoService;
@Service
public class ExceptloaninfoServiceImpl implements ExceptloaninfoService{

	@Autowired
	ExceptloaninfoMapper exceptloaninfoMapper ;
	
	@Override
	public Exceptloaninfo querybyWorkid(String workid) {
		
		return exceptloaninfoMapper.selectByPrimaryKey(workid) ;
	}

}
