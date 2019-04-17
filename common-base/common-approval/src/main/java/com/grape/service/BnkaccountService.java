package com.grape.service;

import com.grape.controller.request.BnkAccountRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Bnkaccount;

public interface BnkaccountService {
	
	void insertBnkaccount(BnkAccountRequest req) ;
	
	void updateBnkaccount(BnkAccountRequest req);
	
	Bnkaccount queryBnkaccountByWorkid(String workid);

	void insertBnkaccounts(Bnkaccount bnk) ;
}
