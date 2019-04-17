package com.grape.workflow.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkassignMapperExtra {
	
	@SuppressWarnings("rawtypes")
	public List  findWorkassignGenerateList(String workid,String orgno,String roleid,short lane );
	
}