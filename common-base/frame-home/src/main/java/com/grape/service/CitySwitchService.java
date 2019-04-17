package com.grape.service;

import java.util.List;
import com.grape.controller.reponse.bean.CityAllinfo;
import com.grape.controller.reponse.bean.Cityinfo;
import com.grape.model.db.City;

public interface CitySwitchService {
		
	List<Cityinfo>	findCityByCode(String code);
	
	List<CityAllinfo> findCytyAllinfo();
	
	City findCitycodeByCityname(String cityname);
}
