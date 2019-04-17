package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Liveinfo;
import com.grape.model.db.LiveinfoExample;
import com.grape.model.mapper.base.LiveinfoMapper;
import com.grape.service.LiveinfoService;
@Service
public class LiveinfoServiceImpl implements LiveinfoService{

	@Autowired
	private LiveinfoMapper liveinfoMapper ;
	
	@Override
	public void insertLiveinfo(Liveinfo liveinfo) {
		// TODO Auto-generated method stub
		liveinfoMapper.insertSelective(liveinfo) ;
	}

	@Override
	public List<Liveinfo> selectByWorkid(String workid) {
		LiveinfoExample example = new LiveinfoExample() ; 
		example.createCriteria().andWorkidEqualTo(workid) ;
		return liveinfoMapper.selectByExample(example) ;
	}

}
