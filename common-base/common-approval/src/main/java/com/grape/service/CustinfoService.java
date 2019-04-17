package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.Custmarrow;
import com.grape.controller.request.AllLoaninfo;
import com.grape.controller.request.CerdidRequest;
import com.grape.controller.request.CustinfoForm;
import com.grape.controller.request.CustinfoRequest2;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Doctask;
import com.grape.model.db.Mortgage;


public interface CustinfoService {
	public List<Custinfo> querybyworkid(WorkidRequest req);
	
	public List<Custinfo> queryByCerdid(CerdidRequest cerdid);

	public Custinfo queryByCerdidAndWorkid(WorkidAndCerdidRequest req);

	public void insertCustinfo(CustinfoForm req);

	public void deleteCustinfo(WorkidAndCerdidRequest req);

	public void updateCustinfo(CustinfoForm req);

	public void completeCustinfo(CustinfoRequest2 req);

	public Custmarrow selectCustmarrow(WorkidAndCerdidRequest req);

	public Custinfo queryByCerdidAndWorkid(String workid, String cerdid);

	public List<Custinfo> selectMarrowinfo(WorkidAndCerdidRequest req);

	public List<Custinfo> selectByCerdid(WorkidAndCerdidRequest req);

	public AllLoaninfo selectDoctaskinfo(String workid);

	public List<Custinfo> selectByCerdid(String owner,String workid);

	public List<Custinfo> selectBymarriedAndCerdid(String ismarried, String relationcerdid,String workid);

	public void deleteCustinfo(Custinfo custinfo);

	public List<Custinfo> selectByCerdid1(String cerdid, String workid);

	public List<Custinfo> selectCustinfoByWorkid(String workid) ;

	void insertComcust(Custinfo custinfo) ;
}
