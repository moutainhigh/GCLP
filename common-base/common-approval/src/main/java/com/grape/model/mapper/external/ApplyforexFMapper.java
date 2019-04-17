package com.grape.model.mapper.external;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.request.StatisticalRepay;
import com.grape.model.db.Repayplan;
@Mapper
public interface ApplyforexFMapper {
	
	StatisticalRepay statisticalRepay(String workid);
	
	Repayplan selectRepaycapital(String workid) ;
	
	Repayplan selectRepayplanByWorkid(String workid) ;
	
	List<Repayplan> isApplyforex(String workid) ;
}
