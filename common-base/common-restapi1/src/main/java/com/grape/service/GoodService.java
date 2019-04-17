package com.grape.service;

import java.util.List;
import java.util.Map;

import com.grape.repository.entity.Goods;

public interface GoodService {

	List<Goods> getGoodsByName(String name, int pagenum, int pagesize);
	List<Goods> getGoodsByName2(String name, int pagenum, int pagesize);
	List<Goods> getGoodsByName3(String name, int pagenum, int pagesize);
	List<Map<String, Object>> getGoodsByName4(String name, int pagenum, int pagesize);
}
