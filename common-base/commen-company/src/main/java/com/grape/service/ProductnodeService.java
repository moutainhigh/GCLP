package com.grape.service;

import com.grape.model.db.Productnode;

public interface ProductnodeService {
	
	Productnode findByNodeid(String nodeid);
}
