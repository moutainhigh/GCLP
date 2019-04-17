package com.grape.model.mapper.external;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.response.bean.CreditreCard;
import com.grape.controller.response.bean.CreditreCardex;
import com.grape.controller.response.bean.CreditreCode;
import com.grape.controller.response.bean.CreditreCodeex;
import com.grape.controller.response.bean.CreditreNum;

@Mapper
public interface CreditrecodeExMapper {
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
}
