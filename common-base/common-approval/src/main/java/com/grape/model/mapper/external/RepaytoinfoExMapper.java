package com.grape.model.mapper.external;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Repaytoinfo;

@Mapper
public interface RepaytoinfoExMapper {
	Repaytoinfo selecttwo(WorkidRequest req) ;
	
	Repaytoinfo selectthree(WorkidRequest req) ;
	
	Repaytoinfo selectfour(WorkidRequest req) ;

	Repaytoinfo selectSecondResult(WorkidRequest req);

	Repaytoinfo selectFinalRepaytoinfo(Map<String, Object> map);
}
