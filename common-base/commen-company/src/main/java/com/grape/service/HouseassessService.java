package com.grape.service;

import java.util.List;
import java.util.Map;

import com.grape.controller.reponse.bean.ChannelAssessinfo;
import com.grape.model.db.Assessmodel;
import com.grape.model.db.Buildingproperty;
import com.grape.model.db.Houseassess;

public interface HouseassessService {
	
		boolean houseassessAdd(Houseassess houseassess);
		boolean houseassessUpdate(Houseassess houseassess);
		boolean houseassessAddOrUpdate(Houseassess houseassess);
		
		void houseassessDelete(String workid,String mortgageno,String channel);
		List<Houseassess> findHouseassessList(String workid,String mortgageno);
		List<Map<String, Object>> findHouseassessList2(String channel,String workid);
		
		Houseassess findHouseassess(String channel,String workid,String mortgageno);
		
		List<ChannelAssessinfo> findAssessinfoList(String workid,String mortgageno);
		
		Assessmodel findAssessmodelDefault();
		
		List<Buildingproperty> findBuildingpropertyByMortgageno(String mortgageno);
} 
