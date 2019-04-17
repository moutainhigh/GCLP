package com.grape.service;

import java.util.Map;

import com.grape.model.db.Codetable;

public interface CodeTableService {
	
	Map<String, String> getCodeMap(String type);
	
	Codetable findByPrimarkey(String codtyp,String codflg);
}
