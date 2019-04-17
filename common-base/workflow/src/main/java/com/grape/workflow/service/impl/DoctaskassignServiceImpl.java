package com.grape.workflow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Doctasksign;
import com.grape.model.db.DoctasksignExample;
import com.grape.model.mapper.base.DoctasksignMapper;
import com.grape.workflow.service.DoctaskassignService;

@Service
public class DoctaskassignServiceImpl implements DoctaskassignService {

	@Autowired
	private DoctasksignMapper doctasksignMapper;
	
	@Override
	public void addDoctaskassign(Doctasksign doctasksign) {
		doctasksignMapper.insert(doctasksign);
	}

	@Override
	public void cleanDoctaskassign(String workid, String nodeid) {
		
		DoctasksignExample example = new DoctasksignExample();
		example.createCriteria().andWorkidEqualTo(workid).andNodeidEqualTo(nodeid);
		doctasksignMapper.deleteByExample(example);
		
	}

	@Override
	public int countAssignNum(String workid, String nodeid) {
		DoctasksignExample example = new DoctasksignExample();
		example.createCriteria().andWorkidEqualTo(workid).andNodeidEqualTo(nodeid);
		List<Doctasksign> list = doctasksignMapper.selectByExample(example);
		return list.size();
	}

}
