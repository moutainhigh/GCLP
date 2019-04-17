package com.grape.service;

import java.util.List;

import com.grape.controller.request.CustinfoForm;
import com.grape.controller.request.WorkidAndCerdidAndQuerytypeReq;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Litigationinfo;

public interface LitigationinfoService {

	void insertLitigationinfo(CustinfoForm req);

	void updateLitigationinfo(CustinfoForm req);

	List<Litigationinfo> selectLitiByCerdidAndWorkid(WorkidAndCerdidRequest req);
	
	Litigationinfo selectByThreeid(WorkidAndCerdidAndQuerytypeReq reqs) ;

}
