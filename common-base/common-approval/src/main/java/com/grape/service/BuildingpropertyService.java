package com.grape.service;

import java.util.List;

import com.grape.controller.request.BuildingpropertyRequest;
import com.grape.controller.request.MortgageidRequest;
import com.grape.model.db.Buildingproperty;

public interface BuildingpropertyService {
	public List<Buildingproperty> queryByMortgageid(MortgageidRequest req) ;
	
	void insertBuildingproperty(BuildingpropertyRequest req) ;
	
	void insertBuilding(Buildingproperty build) ;
}
