package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Person;

@Mapper
public interface SmsAlertsExMapper {
	
	List<Map<String, Object>> findRepaymentList(Map<String, String> map);
	
	List<Map<String, Object>> findOverdueList(Map<String, String> map);
	
	List<Map<String, Object>> findOverdueListInChannel(Map<String, String> map);
	
	List<Map<String, Object>> findOverdueListInTerrcae(Map<String, String> map);
	
	List<Map<String, Object>> findOverdueListInAisle(Map<String, String> map);
	
	List<Map<String, Object>> findOverdueListInFund(Map<String, String> map);
	
	List<Map<String, Object>> findOverdueListInUserid(Map<String, String> map);
	
	List<Person> findPersonInDaihou(Map<String, String> map);
}							  
