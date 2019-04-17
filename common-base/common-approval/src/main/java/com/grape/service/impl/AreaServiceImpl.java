package com.grape.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.AreaRequest;
import com.grape.model.db.Area;
import com.grape.model.db.AreaExample;
import com.grape.model.mapper.base.AreaMapper;
import com.grape.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{
	private static final Logger log = LoggerFactory.getLogger(CustinfoServiceImpl.class);
	
	@Autowired
	private AreaMapper areaMapper ;

	@Override
	public List<Area> queryByGbcode(AreaRequest req) {
		AreaExample area = new AreaExample() ;
		area.createCriteria().andGbcodeEqualTo(req.getGbcode()).andAreatypeNotEqualTo("0") ;
		List<Area> arealist = areaMapper.selectByExample(area) ;
		return arealist;
	}

	@Override
	public Area queryAreaById(String areaid) {
		return areaMapper.selectByPrimaryKey(areaid);
	}


}
