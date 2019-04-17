package com.grape.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.CreditinfoofcomRequest;
import com.grape.model.db.Creditinfoofcom;
import com.grape.model.mapper.base.CreditinfoofcomMapper;
import com.grape.service.CreditinfoofcomService;
import com.grape.util.Util;
@Service
public class CreditinfoofcomServiceImpl implements CreditinfoofcomService{
	private static final Logger log = LoggerFactory.getLogger(CreditinfoofcomServiceImpl.class);
	@Autowired
	private CreditinfoofcomMapper creditinfoofcomMapper;
	@Override
	public Creditinfoofcom queryByWorkid(String workid) {
		Creditinfoofcom  credit= creditinfoofcomMapper.selectByPrimaryKey(workid);
		return credit;
	}

	@Override
	public void saveCreditinfoofcom(CreditinfoofcomRequest req) {
		Creditinfoofcom credit = new Creditinfoofcom();
		try {
			Util.transferFields(req, credit);
		} catch (Exception e) {
			log.info("实体转换失败"+e);
		}
		creditinfoofcomMapper.updateByPrimaryKeySelective(credit);
		
	}

	@Override
	public void deleteCreditinfoofcom(String workid) {
		try {
			creditinfoofcomMapper.deleteByPrimaryKey(workid);
		} catch (Exception e) {
			log.info("删除公司信用记录失败"+e);
		}
		
	}

	@Override
	public void insertCreditinfoofcom(CreditinfoofcomRequest req) {
		Creditinfoofcom credit = new Creditinfoofcom();
		try {
			Util.transferFields(req, credit);
		} catch (Exception e) {
			log.info("实体转换失败"+e);
		}
		creditinfoofcomMapper.insertSelective(credit);
		
	}

}
