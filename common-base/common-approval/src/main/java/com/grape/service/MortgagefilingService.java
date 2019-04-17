package com.grape.service;

import java.util.List;

import com.grape.controller.request.MortgagefilingRequest;
import com.grape.controller.request.MortgagefilingidRequest;
import com.grape.model.db.Codetable;
import com.grape.model.db.Mortgagefiling;

public interface MortgagefilingService {

	void insertMortgagefiling(MortgagefilingRequest req);

	Mortgagefiling selectMortgagefiling(MortgagefilingidRequest req);

	void updateMortgagefiling(MortgagefilingRequest req);

	Mortgagefiling selectMortgageById(MortgagefilingRequest req);

	List<Codetable> selectCodeofCom();
	
	/**
	 * 查询抵押物查档信息
	 * @param mortgageid 抵押物id
	 * @return
	 */
	Mortgagefiling findMortgagefilingByMortgageid(String mortgageid);

	List<Mortgagefiling> selectMortgagefilingByWorkid(String workid);

	void insertMortgagefi(Mortgagefiling mortgagefiling) ;

}
