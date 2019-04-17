package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Doctask;
import com.grape.model.mapper.base.DoctaskMapper;
import com.grape.service.DoctaskService;

@Service
public class DoctaskServiceImpl implements DoctaskService{
	
	@Autowired
	private DoctaskMapper doctaskMapper;

	@Override
	public Doctask getDocktaskById(String workid) {
		return doctaskMapper.selectByPrimaryKey(workid);
	}

	@Override
	public void saveDoctask(Doctask doctask) {
		doctaskMapper.insert(doctask);
	}

	@Override
	public void updateDoctask(Doctask doctask) {
		doctaskMapper.updateByPrimaryKey(doctask);
	}

}
