package com.grape.service;

import java.util.List;

import com.grape.controller.request.DebtinfoListRequest;
import com.grape.controller.request.DebtinfoRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Debtinfo;

public interface DebtinfoService {

	public List<Debtinfo> queryDebtByWorkidAndCerdid(WorkidAndCerdidRequest req);

	void insertDebtinfo(DebtinfoListRequest req);

	void updateDebtinfo(DebtinfoListRequest req);

	void deleteDebtinfo(IdRequest req);

	public List<Debtinfo> queryDebtByWorkidAndCerdid(DebtinfoListRequest req);

	public void deleteDebtinfo(DebtinfoListRequest req);
	
	public List<Debtinfo> queryByWorkid(String workid) ;
	
	void insertDebtinfo(DebtinfoRequest req) ;
	
	void insertDebtin(Debtinfo debt) ;

	public Chanapprovalform queryChanapprovalByWorkid(String workid);

}
