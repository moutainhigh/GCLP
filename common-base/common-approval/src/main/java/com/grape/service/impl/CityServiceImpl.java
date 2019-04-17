package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Area;
import com.grape.model.db.City;
import com.grape.model.mapper.base.AreaMapper;
import com.grape.model.mapper.base.CityMapper;
import com.grape.service.CityService;
@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityMapper cityMapper;
	@Autowired
	private AreaMapper areaMapper;
	@Override
	public City selectCityById(String codeid) {
		
		return cityMapper.selectByPrimaryKey(codeid);
	}
	@Override
	public Area selectAreaById(String areaid) {
		
		return areaMapper.selectByPrimaryKey(areaid);
	}
	@Override
	public String getCityname(String codeid) {
		City city = cityMapper.selectByPrimaryKey(codeid);
		if(city!=null){
			return city.getCityname();
		}
		return null;
	}

}
