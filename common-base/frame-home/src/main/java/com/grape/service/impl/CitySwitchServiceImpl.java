package com.grape.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.bean.CityAllinfo;
import com.grape.controller.reponse.bean.Cityinfo;
import com.grape.model.db.City;
import com.grape.model.db.CityExample;
import com.grape.model.db.Codetable;
import com.grape.model.db.CodetableExample;
import com.grape.model.db.CodetaskExample;
import com.grape.model.mapper.base.CityMapper;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.model.mapper.external.CityinfoExMapper;
import com.grape.service.CitySwitchService;

@Service
public class CitySwitchServiceImpl implements CitySwitchService {

	@Autowired
	CityinfoExMapper cityExMapper;
	
	@Autowired
	CodetableMapper codetableMapper;
	
	@Autowired
	CityMapper cityMapper;
	@Override
	public List<Cityinfo> findCityByCode(String code) {
		Map<String, String> param = new HashMap<>();
		param.put("areacode", code);
		
		List<Cityinfo> citieinfos = cityExMapper.findCityinfoByCode(param);
		if(citieinfos.size()>0){
			return citieinfos;
		}
		return null;
	}
	@Override
	public List<CityAllinfo> findCytyAllinfo() {
		CodetableExample example = new CodetableExample();
		example.createCriteria().andCodtypEqualTo("AREATYPE");
		List<Codetable> codetables = codetableMapper.selectByExample(example);
		Map<String, String> map = new HashMap<>();
		List<Cityinfo> cityinfos;
		List<CityAllinfo> cityAllinfos = new ArrayList<>();
		if(codetables.size()>0){
			for (Codetable codetable : codetables) {
				map.put("areacode", codetable.getCodflg());
				cityinfos = cityExMapper.findCityinfoByCode(map);
				if(cityinfos.size()>0){
					CityAllinfo cityAllinfo = new CityAllinfo();
					cityAllinfo.setAreacode(codetable.getCodflg());
					cityAllinfo.setAreaname(codetable.getCoddes());
					cityAllinfo.setCityinfos(cityinfos);
					cityAllinfos.add(cityAllinfo);
				}
			}
		}
		return cityAllinfos;
	}
	@Override
	public City findCitycodeByCityname(String cityname) {
		CityExample cityExample = new CityExample();
		cityExample.createCriteria().andCitynameEqualTo(cityname);
		List<City> cities = cityMapper.selectByExample(cityExample);
		if(cities.size()>0){
			return cities.get(0);
		}
		return null;
	}

}
