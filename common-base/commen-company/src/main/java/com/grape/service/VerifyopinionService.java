package com.grape.service;

import com.grape.model.db.Verifyopinion;

public interface VerifyopinionService {
	
		void insert(Verifyopinion verifyopinion);
		
		void update(Verifyopinion verifyopinion);
		
		Verifyopinion findVerifyopinionById(String workid)throws Exception;
}
