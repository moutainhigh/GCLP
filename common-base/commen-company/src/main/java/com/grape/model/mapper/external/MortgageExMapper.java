package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MortgageExMapper {
		
	List<Map<String, Object>> findMortgagelistByParam(Map<String, String> map);
	
	Map<String, Object> findMortgageByParam(Map<String, String> map);
}
