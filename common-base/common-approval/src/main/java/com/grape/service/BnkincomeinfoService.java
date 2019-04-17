package com.grape.service;

import java.util.List;

import com.grape.controller.request.BnkincomeinfoRequest;
import com.grape.controller.request.CustinfoForm;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Bnkincomeinfo;

public interface BnkincomeinfoService {

	List<Bnkincomeinfo> queryByWorkid(String workid);

	List<Bnkincomeinfo> selectBnkincomeList(WorkidAndCerdidRequest req);

	void insertBnkcominfo(BnkincomeinfoRequest req) ;
	
	void updateBnkcominfo(BnkincomeinfoRequest req);

	void insertBnkincominfo(Bnkincomeinfo bnkincomeinfo) ;
}
