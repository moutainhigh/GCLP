package com.grape.service;

import java.util.List;

import com.grape.controller.request.AllLoaninfo;
import com.grape.controller.request.LoaninfoRequest;
import com.grape.controller.request.MortgagefilingidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Houseassess;
import com.grape.model.db.Loaninfo;
import com.grape.model.db.Product;
import com.grape.model.db.Redemptiontype;

public interface LoaninfoService {

	Loaninfo queryLoaninfoByWorkid(LoaninfoRequest req);

	AllLoaninfo queryAllLoaninfoByWorkid(WorkidRequest req);

	Loaninfo selectLoaninfoByMortgageid(MortgagefilingidRequest req);
	
	List<Houseassess> selectHouseassess(WorkidRequest req) ;
	
	List<Redemptiontype> selectRedemptiontypebyWorkid(WorkidRequest req) ;
	
	Product selectrepaymethodAndratetype(WorkidRequest req) ;

}
