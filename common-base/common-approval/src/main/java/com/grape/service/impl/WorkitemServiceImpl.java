package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.WorkidAndNodeRequest;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.Workhistory;
import com.grape.model.db.WorkhistoryExample;
import com.grape.model.db.Workitem;
import com.grape.model.db.WorkitemExample;
import com.grape.model.mapper.base.NodebuttonMapper;
import com.grape.model.mapper.base.WorkhistoryMapper;
import com.grape.model.mapper.base.WorkitemMapper;
import com.grape.model.mapper.external.WorkitemExMapper;
import com.grape.service.WorkitemService;

@Service
public class WorkitemServiceImpl implements WorkitemService{
	@Autowired
	private WorkhistoryMapper workhistoryMapper;
	@Autowired
	private WorkitemExMapper workitemExMapper ;
	@Autowired
	private WorkitemMapper workitemMapper ;
	
	@Override
	public List<Workitem> selectDate(String node) {
		
		return workitemExMapper.selectDate(node);
	}

	@Override
	public List<Workitem> selectByWorkid(String workid) {
		WorkitemExample exam = new WorkitemExample() ;
		exam.createCriteria().andWorkidEqualTo(workid) ;
		return workitemMapper.selectByExample(exam);
	}

	@Override
	public List<Workitem> selectByNodename(String workid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		return workitemExMapper.selectWorkitemByNodename(map);
	}

	@Override
	public List<Workitem> selectByNodeAndWorkid(WorkidAndNodeRequest req) {
		WorkitemExample exam = new WorkitemExample() ;
		exam.createCriteria().andWorkidEqualTo(req.getWorkid()).andNodeEqualTo(req.getNodeid()) ;
		return workitemMapper.selectByExample(exam);
	}

	@Override
	public void updateWorkItemSelective(Workitem workitem) {
		workitemMapper.updateByPrimaryKeySelective(workitem);
	}

	@Override
	public void deleteWorkitemByFromAndWorkid(String fork, String workid) {
		WorkitemExample exam = new WorkitemExample() ;
		exam.createCriteria().andWorkidEqualTo(workid).andForkEqualTo(fork);
		workitemMapper.deleteByExample(exam);
	}

	@Override
	public Workhistory selectByNextNodeid(String fork) {
		Workhistory workhistory = new Workhistory();
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andNextnodeEqualTo(fork);
		List<Workhistory> workhistorys = workhistoryMapper.selectByExample(example);
		if(workhistorys!=null && !workhistorys.isEmpty()){
			workhistory = workhistorys.get(0);
		}
		return workhistory;
	}

}
