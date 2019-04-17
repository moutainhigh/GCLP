package com.grape.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.IncomeofcomRequest;
import com.grape.model.db.Incomeofcom;
import com.grape.model.mapper.base.IncomeofcomMapper;
import com.grape.service.IncomeofcomService;
import com.grape.util.Util;

@Service
public class IncomeinfoofcomServiceImpl implements IncomeofcomService{
	private final static Logger log = LoggerFactory.getLogger(IncomeinfoofcomServiceImpl.class);
	@Autowired
	private IncomeofcomMapper incomeofcomMapper;
	
	@Override
	public Incomeofcom queryByWorkidAndComno(String workid,String comno) {
		Incomeofcom income = incomeofcomMapper.selectByPrimaryKey(workid, comno);
		return income;
	}

	@Override
	public void saveIncomeofcom(IncomeofcomRequest req) {
		Incomeofcom income = new Incomeofcom();
		try {
			Util.transferFields(req, income);
		} catch (Exception e) {
			log.info("实体类转换出错"+e);
		}
		incomeofcomMapper.updateByPrimaryKeySelective(income);
		
	}

	@Override
	public void deleteIncomeofcom(String workid,String comno) {
		incomeofcomMapper.deleteByPrimaryKey(workid, comno);
		
	}

	@Override
	public void insertIncomeofcom(IncomeofcomRequest req) {
		Incomeofcom income = new Incomeofcom();
		try {
			Util.transferFields(req, income);
		} catch (Exception e) {
			log.info("实体类转换出错"+e);
		}
		incomeofcomMapper.insertSelective(income);
		
	}

}
