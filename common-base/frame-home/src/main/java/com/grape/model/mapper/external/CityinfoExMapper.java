package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.CityAllinfo;
import com.grape.controller.reponse.bean.Cityinfo;
@Mapper
public interface CityinfoExMapper {
	
	List<Cityinfo> findCityinfoByCode(Map<String, String> param);
	
	List<CityAllinfo> findCityinfoAll();
}
