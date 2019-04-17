package com.grape.service;


import java.util.List;

import com.grape.controller.request.CreditrecodeRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Creditrecode;

public interface CreditrecordService {

	public Creditrecode queryCreditByWorkid(WorkidAndCerdidRequest req);

	void insertCreditInfo(CreditrecodeRequest req);

	void updateCreditrecord(CreditrecodeRequest req);

	void deleteCreditrecord(WorkidAndCerdidRequest req);
	
	List<Creditrecode> queryByWorkid(String workid) ;

}
