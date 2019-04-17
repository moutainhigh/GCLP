package com.grape.service;

import java.util.List;

import com.grape.model.db.Phoneverification;
import com.grape.model.db.Riskinfo;

public interface PhoneverificationService {
	
	Phoneverification findPhoneverificationByWorkid(String workid);
	
	void insert(Phoneverification phoneverification);
	
	void update(Phoneverification phoneverification);
	
	void insertRiskinfo(Riskinfo riskinfo);
	
	List<Riskinfo> findRiskinfoByWorkid(String workid);
	
	void deleteRiskinfo(String workid);
}
