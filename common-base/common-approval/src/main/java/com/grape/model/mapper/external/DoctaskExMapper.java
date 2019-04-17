package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.bean.Monthtotal;
import com.grape.controller.request.AllLoaninfo;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Houseassess;
import com.grape.model.db.Product;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.db.Workhistory;

@Mapper
public interface DoctaskExMapper {

	AllLoaninfo selectAllLoaninfo(Map<String, Object> map);
	
	List<Houseassess> selectHouseassess(String workid) ;

	Product selectProducttype(WorkidRequest req) ;
	
	/*Repaytoinfo selectFinalrepaytoinfo(WorkidRequest req) ;*/
	
	Product selectrepaymethodAndratetype(WorkidRequest req) ;

	List<Monthtotal> selectIncomeinfo(Map<String, Object> map);

	Chanapprovalform selectIncomeNotation(Map<String, Object> map);

	String selectAssessnotation(Map<String, Object> map);

	String selectAssessnotation2(Map<String, Object> map);

	List<Workhistory> selectWorkhisByWorkid(Map<String, Object> map);

}
