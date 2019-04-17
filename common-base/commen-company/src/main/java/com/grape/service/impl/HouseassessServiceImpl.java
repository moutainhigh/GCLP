package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.bean.ChannelAssessinfo;
import com.grape.model.db.Assessmodel;
import com.grape.model.db.AssessmodelExample;
import com.grape.model.db.Buildingproperty;
import com.grape.model.db.BuildingpropertyExample;
import com.grape.model.db.Houseassess;
import com.grape.model.db.HouseassessExample;
import com.grape.model.mapper.base.AssessmodelMapper;
import com.grape.model.mapper.base.BuildingpropertyMapper;
import com.grape.model.mapper.base.HouseassessMapper;
import com.grape.model.mapper.external.HouseassessExMapper;
import com.grape.service.HouseassessService;
import com.grape.tool.Util;

@Service
public class HouseassessServiceImpl implements HouseassessService {

	@Autowired
	HouseassessMapper houseassessMapper;
	
	@Autowired
	HouseassessExMapper houseassessExMapper;
	
	@Autowired
	AssessmodelMapper assessmodelMapper;
	
	@Autowired
	BuildingpropertyMapper buildingpropertyMapper;
	@Override
	public boolean houseassessAdd(Houseassess houseassess) {
		int flag;
		flag = houseassessMapper.insert(houseassess);
		if(flag==1){
			return true;
		}
		return false;
	}

	@Override
	public boolean houseassessUpdate(Houseassess houseassess) {
		int flag;
		flag = houseassessMapper.updateByPrimaryKey(houseassess);
		if(flag==1){
			return true;
		}
		return false;
	}

	@Override
	public boolean houseassessAddOrUpdate(Houseassess houseassess) {
		int flag;
		String workid = houseassess.getWorkid();
		String mortgageno = houseassess.getMortgageno();
		String channel = houseassess.getChannel();
		Houseassess oldhouseassess = houseassessMapper.selectByPrimaryKey(workid, mortgageno, channel);
		if(oldhouseassess!=null){
			houseassess.setFilename(oldhouseassess.getFilename());
			flag = houseassessMapper.updateByPrimaryKey(houseassess);
			
		}else{
			flag = houseassessMapper.insert(houseassess);
			
		}
		if(flag==1){
			return true;
		}
		return false;
	}

	@Override
	public List<Map<String, Object>> findHouseassessList2(String assessid,String workid) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(assessid)){
			map.put("assessid", assessid);
		}
		if(!Util.isBlank(workid)){
			map.put("workid", workid);
		}
		
		List<Map<String, Object>> result = houseassessExMapper.findHouseassessListByParam2(map);
		if(result.size()>0){
			return result;
		}
		return null;
	}

	@Override
	public Houseassess findHouseassess(String assessid, String workid,String mortgageno) {
		
		return houseassessMapper.selectByPrimaryKey(workid, mortgageno, assessid);
	}

	@Override
	public List<Houseassess> findHouseassessList(String workid, String mortgageno) {
		HouseassessExample example = new HouseassessExample();
		example.createCriteria().andWorkidEqualTo(workid)
		.andMortgagenoEqualTo(mortgageno);

		return houseassessMapper.selectByExample(example);
	}

	@Override
	public List<ChannelAssessinfo> findAssessinfoList(String workid, String mortgageno) {
		Map<String, String> paramMap = new HashMap<>();
		if(!Util.isBlank(workid)){
			paramMap.put("workid",workid);
		}
		if(!Util.isBlank(mortgageno)){
			paramMap.put("mortgageno", mortgageno);
		}
		
		
		return houseassessExMapper.findAssessinfoListByParam(paramMap);
	}

	@Override
	public void houseassessDelete(String workid,String mortgageno,String channel) {
		houseassessMapper.deleteByPrimaryKey(workid, mortgageno, channel);
	}

	@Override
	public Assessmodel findAssessmodelDefault() {
		AssessmodelExample example = new AssessmodelExample();
		List<Assessmodel> list = assessmodelMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<Buildingproperty> findBuildingpropertyByMortgageno(String mortgageno) {
		BuildingpropertyExample example = new BuildingpropertyExample();
		example.createCriteria().andMortgageidEqualTo(mortgageno);
		List<Buildingproperty> buildingproperties = buildingpropertyMapper.selectByExample(example);
		
		return buildingproperties;
	}




}
