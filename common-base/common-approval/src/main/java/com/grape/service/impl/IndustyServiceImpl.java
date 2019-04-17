package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Industry;
import com.grape.model.mapper.base.IndustryMapper;
import com.grape.service.IndustyService;

@Service
public class IndustyServiceImpl implements IndustyService{
	@Autowired
	private IndustryMapper industryMapper;
	@Override
	public Industry selectNameById(String industryfirst) {
		return industryMapper.selectByPrimaryKey(industryfirst);
	}

}
