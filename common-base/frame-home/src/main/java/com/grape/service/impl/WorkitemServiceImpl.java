package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Workitem;
import com.grape.model.db.WorkitemExample;
import com.grape.model.mapper.base.WorkitemMapper;
import com.grape.service.WorkitemService;
@Service
public class WorkitemServiceImpl implements WorkitemService {

	@Autowired
	WorkitemMapper workitemMapper;
	@Override
	public Workitem findWorkitemByWorkid(String workid) throws Exception {
		WorkitemExample example = new WorkitemExample();
		example.setOrderByClause("CHGDT DESC");
		example.createCriteria().andWorkidEqualTo(workid);
		List<Workitem> workitems = workitemMapper.selectByExample(example);
		if(workitems.size()>0){
			return workitems.get(0);
		}
		return null;
	}
	@Override
	public Workitem findWorkitemByWorkid(String workid, String nodeid) throws Exception {
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andWorkidEqualTo(workid).andNodeEqualTo(nodeid);
		List<Workitem> workitems = workitemMapper.selectByExample(example);
		if(!workitems.isEmpty()){
			return workitems.get(0);
		}
		return null;
	}

}
