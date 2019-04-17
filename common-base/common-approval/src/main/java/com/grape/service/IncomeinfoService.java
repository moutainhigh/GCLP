package com.grape.service;


import java.util.List;

import com.grape.controller.bean.Monthtotal;
import com.grape.controller.request.IncomeinfoRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Incomeinfo;
import com.grape.model.db.Mortgagerent;

public interface IncomeinfoService {

	public Incomeinfo queryIncomeByWorkid(WorkidAndCerdidRequest req);

	void insertIncomeInfo(IncomeinfoRequest req);

	void updateincomeinfo(IncomeinfoRequest req);

	public void deleteincomeinfo(WorkidAndCerdidRequest req);

	public List<Mortgagerent> selectMortRent(WorkidAndCerdidRequest req);

	public List<Incomeinfo> queryInconeinfoByWorkid(String workid) ;

	public List<Mortgagerent> selectMortRentByWorkid(WorkidRequest req);

	public List<Monthtotal> selectMonthtotal(String workid);

	public Chanapprovalform selectIncomeNotation(String workid);

}
