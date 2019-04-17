package com.grape.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.BuildingpropertyRequest;
import com.grape.controller.request.MortgageidRequest;
import com.grape.model.db.Buildingproperty;
import com.grape.model.db.BuildingpropertyExample;
import com.grape.model.mapper.base.BuildingpropertyMapper;
import com.grape.service.BuildingpropertyService;
import com.grape.util.Util;

@Service
public class BuildingpropertyServiceImpl implements BuildingpropertyService{
	private static final Logger log = LoggerFactory.getLogger(CustinfoServiceImpl.class);
	
	@Autowired
	private BuildingpropertyMapper buildingpropertyMapper ; 
	
	@Override
	public List<Buildingproperty> queryByMortgageid(MortgageidRequest req) {
		BuildingpropertyExample example = new BuildingpropertyExample() ;
		example.createCriteria().andMortgageidEqualTo(req.getMortgageid()) ;
		List<Buildingproperty> list = buildingpropertyMapper.selectByExample(example) ;
		return list;
	}

	@Override
	public void insertBuildingproperty(BuildingpropertyRequest req) {
		Buildingproperty build = new Buildingproperty() ;
		try {
			Util.transferFields(req, build);
		} catch (Exception e) {
			log.info("实体转换出错"+e);
		}
		build.setId(Util.getID());
		buildingpropertyMapper.insertSelective(build) ;	
	}

	@Override
	public void insertBuilding(Buildingproperty build) {
		buildingpropertyMapper.insertSelective(build) ;
	}

}
