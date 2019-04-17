package com.grape.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.CreditrecodeRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Creditrecode;
import com.grape.model.db.CreditrecodeExample;
import com.grape.model.mapper.base.CreditrecodeMapper;
import com.grape.service.CreditrecordService;
import com.grape.util.Util;
@Service
public class CreditrecordServiceImpl implements CreditrecordService{
	private static final Logger log = LoggerFactory.getLogger(CreditrecordServiceImpl.class);
	@Autowired
	private CreditrecodeMapper creditrecodeMapper;
	
	@Override
	public Creditrecode queryCreditByWorkid(WorkidAndCerdidRequest req) {
		Creditrecode credit = creditrecodeMapper.selectByPrimaryKey(req.getWorkid(),req.getCerdid());
		return credit;
	}
	@Override
	public void insertCreditInfo(CreditrecodeRequest req) {
		Creditrecode cred = new Creditrecode();
		try {
			Util.transferFields(req, cred);
		} catch (Exception e) {
			log.info("实体类转换出错"+e);
		}
		Creditrecode credit=creditrecodeMapper.selectByPrimaryKey(req.getWorkid(), req.getCerdid());
		if(credit!=null){
			creditrecodeMapper.updateByPrimaryKeySelective(cred);
		}else{
			creditrecodeMapper.insertSelective(cred);
		}
	}
	@Override
	public void updateCreditrecord(CreditrecodeRequest req) {
		Creditrecode cred = new Creditrecode();
		try {
			Util.transferFields(req, cred);
		} catch (Exception e) {
			log.info("实体类转换出错"+e);
		}
		creditrecodeMapper.updateByPrimaryKeySelective(cred);
		
	}
	@Override
	public void deleteCreditrecord(WorkidAndCerdidRequest req) {
		creditrecodeMapper.deleteByPrimaryKey(req.getWorkid(),req.getCerdid());
		
	}
	@Override
	public List<Creditrecode> queryByWorkid(String workid) {
		CreditrecodeExample example = new CreditrecodeExample() ;
		example.createCriteria().andWorkidEqualTo(workid) ;
		return creditrecodeMapper.selectByExample(example);
	}
	
	
}
