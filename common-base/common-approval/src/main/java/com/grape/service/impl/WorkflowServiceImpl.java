package com.grape.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.FlowHandleRequest;
import com.grape.model.mapper.external.WorkflowExMapper;
import com.grape.service.WorkflowService;

@Service
public class WorkflowServiceImpl implements WorkflowService{
	@Autowired
	private WorkflowExMapper workflowExMapper;
	@Override
	public FlowHandleRequest selectWorkflow(String workid,String nodeid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		map.put("nodeid", nodeid);
		return workflowExMapper.selectWorkflow(map);
	}

}
