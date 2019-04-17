package com.grape.service;

import java.util.List;

import com.grape.controller.request.WorkidAndNodeRequest;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.Workhistory;
import com.grape.model.db.Workitem;

public interface WorkitemService {
	public List<Workitem> selectDate(String node);
	
	public List<Workitem> selectByWorkid(String workid) ;

	public List<Workitem> selectByNodename(String workid);

	public List<Workitem> selectByNodeAndWorkid(WorkidAndNodeRequest req) ;

	void deleteWorkitemByFromAndWorkid(String fork, String workid);

	Workhistory selectByNextNodeid(String fork);

	void updateWorkItemSelective(Workitem workitem);
}
