package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.WorkidAndComnoRequest;
import com.grape.model.db.Shareman;
import com.grape.model.db.SharemanExample;
import com.grape.model.mapper.base.SharemanMapper;
import com.grape.service.SharemanService;
@Service
public class SharemanServiceImpl implements SharemanService{
	@Autowired
	private SharemanMapper sharemanMapper;
	@Override
	public List<Shareman> selectSharemanList(WorkidAndComnoRequest req) {
		SharemanExample example = new SharemanExample();
		String sharetype = "1";
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andCerdidEqualTo(req.getComno()).andSharetypeEqualTo(sharetype);
		return sharemanMapper.selectByExample(example);
	}
	@Override
	public List<Shareman> selectSharemanList2(WorkidAndComnoRequest req) {
		String sharetype = "2";
		SharemanExample example = new SharemanExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andCerdidEqualTo(req.getComno()).andSharetypeEqualTo(sharetype);
		return sharemanMapper.selectByExample(example);
	}

}
