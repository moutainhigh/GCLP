package com.grape.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Verifyopinion;

import com.grape.model.mapper.base.VerifyopinionMapper;
import com.grape.service.VerifyopinionService;
@Service
public class VerifyopinionServiceImpl implements VerifyopinionService {

	@Autowired
	VerifyopinionMapper verifyopinionMapper;
	@Override
	public void insert(Verifyopinion verifyopinion) {
		verifyopinionMapper.insert(verifyopinion);
	}
	@Override
	public Verifyopinion findVerifyopinionById(String workid) throws Exception{
		
		return verifyopinionMapper.selectByPrimaryKey(workid);
		
	}
	@Override
	public void update(Verifyopinion verifyopinion) {
		verifyopinionMapper.updateByPrimaryKey(verifyopinion);
		
	}

}
