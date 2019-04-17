package com.grape.workflow.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Workproc;
import com.grape.model.mapper.base.WorkprocMapper;
import com.grape.workflow.service.WorkProcService;

/**
 * 
 * 类型说明
 * @author lijl
 * @version 1.0 - 2015年4月17日
 */
@Service
public class WorkProcServiceImpl implements WorkProcService {

	@Autowired
	private WorkprocMapper workprocMapper;
	
	public Workproc getWorkprocByWorkId(String workid) {
		return  workprocMapper.selectByPrimaryKey(workid);
	}

	
}
