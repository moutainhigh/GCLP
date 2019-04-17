package com.grape.service;

import com.grape.controller.request.DoctaskRequest;
import com.grape.model.db.Doctask;
import com.grape.model.db.Product;

public interface DoctaskService {
	public Doctask queryByWorkid(DoctaskRequest req) ;

	public Doctask queryByWorkid(String workid);
	
	void updateDoctask(DoctaskRequest req) ;

	public void updateDoctaskByWorkid(Doctask doc);

	Product findProductByNo(String productNo);
	
}
