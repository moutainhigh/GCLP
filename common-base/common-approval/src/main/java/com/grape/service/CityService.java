package com.grape.service;

import com.grape.model.db.Area;
import com.grape.model.db.City;

public interface CityService {

	public City selectCityById(String codeid);

	public Area selectAreaById(String areaid);

	/**
	 * 查询对应城市名称
	 * @param codeid
	 * @return
	 */
	String getCityname(String codeid);

}
