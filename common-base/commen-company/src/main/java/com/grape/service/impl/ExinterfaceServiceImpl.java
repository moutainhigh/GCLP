package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Exinterface;
import com.grape.model.mapper.base.ExinterfaceMapper;
import com.grape.service.ExinterfaceService;
@Service
public class ExinterfaceServiceImpl implements ExinterfaceService {

	@Autowired
	ExinterfaceMapper exinterfaceMapper;
	@Override
	public Exinterface findExinterface1(String channelno) {
		
		return exinterfaceMapper.selectByPrimaryKey(channelno, "1");
	}

	@Override
	public Exinterface findExinterface2(String channelno) {
		
		return exinterfaceMapper.selectByPrimaryKey(channelno, "2");
	}

	@Override
	public Exinterface findExinterface3(String channelno) {
		
		return exinterfaceMapper.selectByPrimaryKey(channelno, "3");
	}

	@Override
	public Exinterface findExinterface4(String channelno) {
		
		return exinterfaceMapper.selectByPrimaryKey(channelno, "4");
	}

}
