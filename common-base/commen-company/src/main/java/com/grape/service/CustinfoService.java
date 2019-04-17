package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.bean.WaihuCustinfo;
import com.grape.model.db.Codetable;
import com.grape.model.db.Custinfo;

public interface CustinfoService {
	
	public List<WaihuCustinfo> findMainborrower(String workid);
	
	public List<WaihuCustinfo> findCoborrower(String workid);
	
	public List<WaihuCustinfo> findGuarantor(String workid);
	
	public List<WaihuCustinfo> findMortgagor(String workid);
	
	public Custinfo findCustinfoByPrimarkey(String workid,String certid);
	
	public List<Custinfo> findCustinfoByWorkid(String workid);
	
	public Codetable findCodetableByCusttype(String codflg);
}
