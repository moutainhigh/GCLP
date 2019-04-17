package com.grape.service;



import com.grape.model.db.Doctask;
import com.grape.model.db.Product;


public interface DoctaskService {
		
		Doctask findByWorkid(String workid);
		
		Product findProductByNo(String productNo);
		
		
		
}
