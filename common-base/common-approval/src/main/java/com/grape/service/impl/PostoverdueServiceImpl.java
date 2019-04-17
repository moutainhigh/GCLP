package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Postloaninfo;
import com.grape.model.mapper.base.PostloaninfoMapper;
import com.grape.service.PostoverdueService;

@Service
public class PostoverdueServiceImpl implements PostoverdueService{
	@Autowired
	private PostloaninfoMapper postloaninfoMapper;
	@Override
	public Postloaninfo selectByWorkid(String workid) {
		
		return postloaninfoMapper.selectByPrimaryKey(workid);
	}
	
}
