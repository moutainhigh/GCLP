package com.grape.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Msgmaininfo;
import com.grape.model.mapper.base.MsgmaininfoMapper;
import com.grape.service.MsgmaininfoService;
import com.grape.util.Util;

@Service
public class MsgmaininfoServiceImpl implements MsgmaininfoService{

	private static final Logger log = LoggerFactory.getLogger(CustinfoServiceImpl.class);
	
	@Autowired
	private MsgmaininfoMapper msgmaininfoMapper ;
	
	@Override
	public void insertMsgmaininfo() {
		Msgmaininfo msg = new Msgmaininfo() ;
		msg.setId(Util.getID());
		msg.setContent("您有一个审批已超时，请尽快处理。");
		msg.setMsgtype("05");
		msgmaininfoMapper.insert(msg) ;
	}

}
