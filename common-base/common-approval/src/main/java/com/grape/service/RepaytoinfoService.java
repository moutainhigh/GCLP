package com.grape.service;

import java.util.List;

import com.grape.controller.request.IdRequest;
import com.grape.controller.request.RepaytoInfoRequest;
import com.grape.controller.request.WorkidAndOrgRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Repaytoinfo;

public interface RepaytoinfoService {

	List<Repaytoinfo> selectRepaytoinfoByWorkid(WorkidRequest req);

	void insertRepaytoinfo(RepaytoInfoRequest req);

	Repaytoinfo selectFinalrepaytoinfo(String workid);

	void insertRepaytoinfo(Repaytoinfo repay);

	Repaytoinfo selectRepaytoinfoByWorkidAndOrg(WorkidAndOrgRequest req);
	
	List<Repaytoinfo> selectRepaytoinfoOrderbytime(WorkidRequest req);
	
	List<Repaytoinfo> selectRepaytoinfoOrderbytime2(WorkidRequest req);
	
	Repaytoinfo selectById(String string) ;
	
	void updateRepaytoinfo(Repaytoinfo repay) ;

	Repaytoinfo selectBaohanrepaytoinfo(String workid);

	Repaytoinfo selectFourRepaytoinfo(RepaytoInfoRequest req);

	List<Repaytoinfo> selectisfinalRepayToInfo(String workid);

}
