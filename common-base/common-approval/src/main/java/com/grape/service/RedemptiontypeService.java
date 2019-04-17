package com.grape.service;


import com.grape.controller.request.RedemptiontypeRequest;
import com.grape.model.db.Redemptiontype;

public interface RedemptiontypeService {
	void insertRedemptiontype(RedemptiontypeRequest req) ;
	
	Redemptiontype findRedemptiontypeByWorkid(String workid);

	void updateRedmptiontype(RedemptiontypeRequest req) ;

	void insertRedemption(Redemptiontype redemptiontype) ;
}
