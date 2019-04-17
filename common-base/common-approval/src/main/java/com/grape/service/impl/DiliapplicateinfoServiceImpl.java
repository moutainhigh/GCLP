package com.grape.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.DiliapplicateRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Deliapplicateinfo;
import com.grape.model.db.DeliapplicateinfoExample;
import com.grape.model.mapper.base.DeliapplicateinfoMapper;
import com.grape.service.DiliapplicateinfoService;
import com.grape.util.Util;
@Service
public class DiliapplicateinfoServiceImpl implements DiliapplicateinfoService{
	private static final Logger log = LoggerFactory.getLogger(DebtinfoServiceImpl.class);
	@Autowired
	private DeliapplicateinfoMapper deliapplicateinfoMapper;
	@Override
	public Deliapplicateinfo queryApplyByWorkid(WorkidAndCerdidRequest req) {
		Deliapplicateinfo deli =  deliapplicateinfoMapper.selectByPrimaryKey(req.getCerdid(), req.getWorkid());
		return deli;
	}
	@Override
	public void insertApplicateinfo(DiliapplicateRequest req) {
		Deliapplicateinfo deli = new Deliapplicateinfo();
		try {
			Util.transferFields(req, deli);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		deliapplicateinfoMapper.insertSelective(deli);
		
	}
	
	@Override
	public void updateApplicateinfo(DiliapplicateRequest req) {
		Deliapplicateinfo deli = new Deliapplicateinfo();
		try {
			Util.transferFields(req, deli);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		deliapplicateinfoMapper.updateByPrimaryKeySelective(deli);
		
	}
	@Override
	public void deleteApplicateinfo(String workid,String cerdid) {
		deliapplicateinfoMapper.deleteByPrimaryKey(cerdid, workid);
	}
	@Override
	public List<Deliapplicateinfo> queryByworkid(String workid) {
		DeliapplicateinfoExample example = new DeliapplicateinfoExample() ;
		example.createCriteria().andWorkidEqualTo(workid) ;
		return deliapplicateinfoMapper.selectByExample(example);
	}
	@Override
	public void insertApp(Deliapplicateinfo req) {
		
		deliapplicateinfoMapper.insertSelective(req) ;
		
	}

}
