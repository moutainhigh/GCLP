package com.grape.service;


import com.grape.controller.request.OtherapplyinfoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Otherapplyinfo;

public interface OtherapplyinfoService {

	void updateOtherapplyinfo(OtherapplyinfoRequest req);

	void insertOtherapplyinfo(OtherapplyinfoRequest req);

	void deleteOtherapplyinfo(WorkidRequest req);

	public Otherapplyinfo queryOtherapplyinfoByWorkid(WorkidRequest req);

	Otherapplyinfo queryOtherapplyinfoByWorkid(OtherapplyinfoRequest req);

	void insertOtherapply(Otherapplyinfo otherapplyinfo) ;
}
