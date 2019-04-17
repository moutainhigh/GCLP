package com.grape.service;

import com.grape.model.db.Workitem;

public interface WorkitemService {
		
		Workitem findWorkitemByWorkid(String workid) throws Exception;
		
		Workitem findWorkitemByWorkid(String workid,String nodeid) throws Exception;
}	
