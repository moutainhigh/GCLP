package com.grape.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.DoctaskRequest;
import com.grape.model.db.Doctask;
import com.grape.model.db.Product;
import com.grape.model.mapper.base.DoctaskMapper;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.service.DoctaskService;
import com.grape.util.Util;

@Service
public class DoctaskServiceImpl implements DoctaskService{
	private static final Logger log = LoggerFactory.getLogger(DebtinfoServiceImpl.class);
	
	@Autowired
	private DoctaskMapper doctaskMapper ;
	
	@Autowired
	ProductMapper productMapper;

	@Override
	public Doctask queryByWorkid(DoctaskRequest req) {		
		return doctaskMapper.selectByPrimaryKey(req.getWorkid());
	}

	@Override
	public Doctask queryByWorkid(String workid) {
		return doctaskMapper.selectByPrimaryKey(workid);
	}

	@Override
	public void updateDoctask(DoctaskRequest req) {
		Doctask doctask = new Doctask() ;
		try{
			Util.transferFields(req, doctask);
		}catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		doctask.setWorkid(req.getWorkid());
		doctask.setDeviceid(req.getDeviceid());
		doctaskMapper.updateByPrimaryKeySelective(doctask) ;
	}

	@Override
	public void updateDoctaskByWorkid(Doctask doc) {
		doctaskMapper.updateByPrimaryKey(doc);
		
	}

	@Override
	public Product findProductByNo(String productNo) {
		
		return productMapper.selectByPrimaryKey(productNo);
	}

}
