package com.grape.service;

import java.util.List;

import com.grape.controller.request.DiliapplicateRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Deliapplicateinfo;

public interface DiliapplicateinfoService {

	public Deliapplicateinfo queryApplyByWorkid(WorkidAndCerdidRequest req);

	public void insertApplicateinfo(DiliapplicateRequest req);
	
	public void updateApplicateinfo(DiliapplicateRequest req);

	public void deleteApplicateinfo(String workid,String cerdid);
	
	public List<Deliapplicateinfo> queryByworkid(String workid) ;
	
	public void insertApp(Deliapplicateinfo req) ;
}
