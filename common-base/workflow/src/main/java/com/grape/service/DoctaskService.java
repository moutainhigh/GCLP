package com.grape.service;

import com.grape.model.db.Doctask;

public interface DoctaskService {

	Doctask getDocktaskById(String workid);
	
	void saveDoctask(Doctask doctask);
	
	void updateDoctask(Doctask doctask);
	
}
