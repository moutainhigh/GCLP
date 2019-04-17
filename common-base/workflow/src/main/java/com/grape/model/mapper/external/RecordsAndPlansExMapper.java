package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repaytoinfo;

@Mapper
public interface RecordsAndPlansExMapper {
	
	List<Repaytoinfo> getrepaytoinfo(Map<String, Object> map);
	
	Map<String,Object> getProduct(Map<String, Object> map);
	
	Postloaninfo getPostloaninfo(Map<String, Object> map);
}
