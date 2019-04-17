package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Callhist;
import com.grape.model.db.CallhistExample;
import com.grape.model.mapper.base.CallhistMapper;
import com.grape.service.CallhistService;
@Service
public class CallhistServiceImpl implements CallhistService {

	@Autowired
	CallhistMapper callhistMapper;
	@Override
	public List<Callhist> findCallhistByWorkid(String workid) {
		CallhistExample callhistExample = new CallhistExample();
		callhistExample.createCriteria().andWorkidEqualTo(workid);
		List<Callhist> callhists = callhistMapper.selectByExample(callhistExample);
		return callhists;
	}
	@Override
	public void insert(Callhist callhist) {
		callhistMapper.insert(callhist);
	}

}
