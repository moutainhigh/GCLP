package com.grape.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.VisaRequest;
import com.grape.model.db.Visa;
import com.grape.model.db.VisaExample;
import com.grape.model.mapper.base.VisaMapper;
import com.grape.service.VisaService;
import com.grape.util.Util;

@Service
public class VisaServiceImpl implements VisaService{
	private static final Logger log = LoggerFactory.getLogger(DebtinfoServiceImpl.class);
	
	@Autowired
	private VisaMapper visaMapper ;
	
	@Override
	public Visa queryByWorkid(String workid) {
		VisaExample example = new VisaExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Visa> visa = visaMapper.selectByExample(example);
		if(visa!=null && !visa.isEmpty()){
			return visa.get(0);
		}
		return null;
	}

	@Override
	public void insertVisa(VisaRequest req, FlowHandleResponse res) {
		Visa visa = new Visa() ;
		try {
			Util.transferFields(req, visa);
		} catch(Exception e) {
			log.info("实体类转换出错" , e);
		}
		visa.setId(res.getLogid());
		visa.setWorkid(req.getWorkid());
		visaMapper.insertSelective(visa) ;
	}

	@Override
	public Visa queryId(String id) {
		VisaExample example = new VisaExample();
		example.createCriteria().andIdEqualTo(id);
		List<Visa> visa = visaMapper.selectByExample(example);
		if(visa!=null && !visa.isEmpty()){
			return visa.get(0);
		}
		return null;
	}

}
