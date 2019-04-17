package com.grape.service;

import java.util.List;
import java.util.Map;

import com.grape.workflow.Execution;

public interface RuleDataService {
	
	List<Map<Object,Object>> getDataBySql(String sqlid,Map<Object,Object> params)throws Exception;
	
	void loadExpressData(Execution execution,String expression)throws Exception;
	
	void loadExpressData(Map<Object, Object> data,String expression)throws Exception;
	
}
