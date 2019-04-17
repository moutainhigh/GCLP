package com.grape.workflow.service;

import com.grape.model.db.Doctasksign;

public interface DoctaskassignService {

	void addDoctaskassign(Doctasksign doctasksign);
	
	void cleanDoctaskassign(String workid, String nodeid);
	
	int countAssignNum(String workid, String nodeid);
	
}
