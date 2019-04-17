package com.grape.service;

import java.util.List;
import java.util.Map;

import com.grape.model.db.Mortgage;
import com.grape.model.db.Mortgagematch;

public interface MortgagematchService {
		
	List<Map<String,Object>> findMortgageParamList(String workid);
	
	Mortgagematch findMortgagematch(String mortgageno,String matchno);
	
	List<Mortgagematch> findMortgagematchByMatchflag(String mortgageno,String matchflag);
	
	List<Mortgagematch> findMortgagematchListByMortgageno(String mortgageno);
	
	void updateMortgagematch(Mortgagematch mortgagematch);
	
	Mortgage findMortgageById(String id);
	
	Map<String, Object> findMortgageByParam(String mortgageno);
	
	Mortgage findFirstMortgageByWorkid(String workid);
	
	List<Mortgage> findListByWorkid(String workid);
	
	Mortgagematch findInMatchFlag(String mortgageno);
}	
