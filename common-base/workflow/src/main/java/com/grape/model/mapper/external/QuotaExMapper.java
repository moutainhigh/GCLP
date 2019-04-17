package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Account;
import com.grape.model.db.Accountquota;

@Mapper
public interface QuotaExMapper {
	
	Map<String,Object> getDoctaskInfo(Map<String, Object> map);
	
	List<Account> getAccountInfo(String linenumber);
	
	List<Accountquota> getAccountquotaInfo(String linenumber);
}
