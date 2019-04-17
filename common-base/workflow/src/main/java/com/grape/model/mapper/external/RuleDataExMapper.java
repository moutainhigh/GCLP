package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Codetask;

@Mapper
public interface RuleDataExMapper {
	
	List<Codetask> findTaskByNodeid(Map<String,String> map);
	
}
