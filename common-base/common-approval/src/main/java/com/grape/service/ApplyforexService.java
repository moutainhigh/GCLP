package com.grape.service;

import java.util.List;

import com.grape.controller.request.ApplyforexRequest;
import com.grape.controller.request.StatisticalRepay;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Applyforex;
import com.grape.model.db.Product;
import com.grape.model.db.Repayplan;
import com.grape.model.db.Repaytoinfo;

public interface ApplyforexService {
	void insertApplyforex(ApplyforexRequest req);
	
	public int countByExample(WorkidRequest req) ;
	
	Product selectProducttype(WorkidRequest req) ;
	
	Repaytoinfo selectFinalrepaytoinfo(WorkidRequest req) ;
	
	StatisticalRepay statisticalRepay(String workid);
	
    Applyforex selectByPrimaryKey(String workid);
    
	Repayplan selectRepaycapital(String workid) ;
	
	List<Repayplan> isApplyforex(String workid) ;
	
	List<Applyforex> selectByWorkid(String workid) ;

	String selectByNewWorkid(String workid);

	List<Applyforex> selectByNewWorkids(String newWorkid) ;
}
