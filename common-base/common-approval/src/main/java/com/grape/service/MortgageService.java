package com.grape.service;

import java.util.List;

import com.grape.controller.request.IdRequest;
import com.grape.controller.request.MortgageRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Mortgage;


public interface MortgageService {

	public Mortgage queryMortgageById(IdRequest req);

	public void updateMortgage(MortgageRequest req);
	
	public void insertMortgage(MortgageRequest req);

	public List<Mortgage> queryMortgageByWorkid(WorkidRequest req);

	void deleteMortgage(IdRequest req);

	List<Mortgage> queryAllMortgage();

	public Mortgage selectByMortgageid(String mortgageid);

	public List<Mortgage> queryMortgageByWorkidAndCerdid(WorkidAndCerdidRequest req);

	void insertMortgage(Mortgage req) ;
}
