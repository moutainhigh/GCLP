package com.grape.service;

import java.util.List;

import com.grape.controller.request.AreaRequest;
import com.grape.model.db.Area;

public interface AreaService {
	public List<Area> queryByGbcode(AreaRequest req) ;

	public Area queryAreaById(String areaid);
}
