package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.Custmarrow;
import com.grape.model.db.Custinfo;

@Mapper
public interface CustinfoExMapper {

	Custmarrow selectCustmarrowinfo(Map<String, Object> map);
	
	List<Custinfo> selectCustinfoByWorkid(String workid) ;

}
