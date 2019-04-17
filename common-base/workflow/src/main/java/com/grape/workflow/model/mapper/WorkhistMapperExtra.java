package com.grape.workflow.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Workhistory;

@Mapper
public interface WorkhistMapperExtra {
	
	public List<Map<String,Object>>  findWorkHishByWorkid(String workid );
	public Workhistory findWorkHishByWorkid2(Map<String,Object>params);
	
}