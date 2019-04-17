package com.grape.service;

import java.util.List;

import com.grape.controller.bean.ProductexBean;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.response.bean.ChanapprovalBean;
import com.grape.controller.response.bean.CreditreCard;
import com.grape.controller.response.bean.CreditreCardex;
import com.grape.controller.response.bean.CreditreCode;
import com.grape.controller.response.bean.CreditreCodeex;
import com.grape.controller.response.bean.CreditreNum;
import com.grape.controller.response.bean.MortAndCustBean;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Custinfo;

public interface ProductexService {
	ProductexBean selectProductex(String workid) ;
	
	List<Custinfo> queryByworkid(String workid) ;
	//征信信息
	CreditreCard selectCreditreCard1(WorkidAndCerdidRequest req) ;
	
	CreditreCardex selectCreditreCardex1(WorkidAndCerdidRequest req) ;
	
	CreditreCard selectCreditreCard2(WorkidAndCerdidRequest req) ; 
	
	CreditreCardex selectCreditreCardex2(WorkidAndCerdidRequest req) ; 
	
	CreditreCode selectCreditreCode1(WorkidAndCerdidRequest req) ; 
	
	CreditreCodeex selectCreditreCodeex1(WorkidAndCerdidRequest req) ; 
	
	CreditreCode selectCreditreCode2(WorkidAndCerdidRequest req) ; 
	
	CreditreCodeex selectCreditreCodeex2(WorkidAndCerdidRequest req) ; 
	
	CreditreNum selectCreditreNum1(WorkidAndCerdidRequest req) ;
	
	CreditreNum selectCreditreNum2(WorkidAndCerdidRequest req) ;
	//
	
	ChanapprovalBean selectChanByWorkid(String workid) ;
	
	MortAndCustBean selectmortbycre(WorkidAndCerdidRequest req) ;
	//
	
	Chanapprovalform selectChanappro(String workid) ;
}
