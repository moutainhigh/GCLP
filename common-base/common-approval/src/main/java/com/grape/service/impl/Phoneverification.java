package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Riskinfo;
import com.grape.model.db.RiskinfoExample;
import com.grape.model.mapper.base.PhoneverificationMapper;
import com.grape.model.mapper.base.RiskinfoMapper;
import com.grape.service.PhoneverificationService;
@Service
public class Phoneverification implements PhoneverificationService {

	@Autowired
	PhoneverificationMapper phoneverificationMapper;
	
	@Autowired
	RiskinfoMapper riskinfoMapper;
	@Override
	public com.grape.model.db.Phoneverification findPhoneverificationByWorkid(String workid) {
		
		return phoneverificationMapper.selectByPrimaryKey(workid);
	}
	@Override
	public void insert(com.grape.model.db.Phoneverification phoneverification) {
		phoneverificationMapper.insert(phoneverification);
		
	}
	@Override
	public void update(com.grape.model.db.Phoneverification phoneverification) {
		phoneverificationMapper.updateByPrimaryKey(phoneverification);
		
	}
	@Override
	public void insertRiskinfo(Riskinfo riskinfo) {
		riskinfoMapper.insert(riskinfo);
		
	}
	@Override
	public List<Riskinfo> findRiskinfoByWorkid(String workid) {
		RiskinfoExample example=new RiskinfoExample();
		example.createCriteria().andWorkidEqualTo(workid);
		
		return riskinfoMapper.selectByExample(example);
	}
	@Override
	public void deleteRiskinfo(String workid) {
		RiskinfoExample example = new RiskinfoExample();
		example.createCriteria().andWorkidEqualTo(workid);
		riskinfoMapper.deleteByExample(example);	
	}

}
