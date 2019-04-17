package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Exchannel;
import com.grape.model.db.ExchannelExample;
import com.grape.model.mapper.base.ExchannelMapper;
import com.grape.service.ExchannelService;
@Service
public class ExchannelServiceImpl implements ExchannelService {

	@Autowired
	ExchannelMapper exchannelMapper;
	@Override
	public Exchannel findExchannelByChannelno(String channelno) {
		
		return exchannelMapper.selectByPrimaryKey(channelno);
	}
	@Override
	public List<Exchannel> findExchannelList() {
		ExchannelExample example = new ExchannelExample();
		example.createCriteria().andAssessmentflagEqualTo("Y").andOpenflgEqualTo("Y");
		
		return exchannelMapper.selectByExample(example);
	}

}
