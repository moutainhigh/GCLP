package com.grape.service;

import java.util.List;

import com.grape.model.db.Callhist;

public interface CallhistService {
		
	List<Callhist> findCallhistByWorkid(String workid);
	
	void insert(Callhist callhist);
}
