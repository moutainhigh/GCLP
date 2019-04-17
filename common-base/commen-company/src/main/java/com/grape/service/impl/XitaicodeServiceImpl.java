package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Xitaicode;
import com.grape.model.db.XitaicodeExample;
import com.grape.model.mapper.base.XitaicodeMapper;
import com.grape.service.XitaicodeService;
@Service
public class XitaicodeServiceImpl implements XitaicodeService{

	@Autowired
	XitaicodeMapper xitaicodeMapper;

	@Override
	public Xitaicode findByCode(String citycode, String areacode) {
		XitaicodeExample example = new XitaicodeExample();
		example.createCriteria().andCitycodeEqualTo(citycode).andAreacodeEqualTo(areacode);
		List<Xitaicode> xitaicodes = xitaicodeMapper.selectByExample(example);
		if(!xitaicodes.isEmpty()){
			return xitaicodes.get(0);
		}
		return null;
	}
	
	
	
	

}
