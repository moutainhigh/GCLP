package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.bean.HFWresultBean;
import com.grape.model.db.Litigationinfo;
import com.grape.model.db.Shixin;
import com.grape.model.db.Susong;

public interface HuifawangService {
		
	HFWresultBean findResultBean(String workid,String username,String cerdid);
	
	List<Susong> findSusongByWorkid(String workid);
	
	boolean litigationinfoInsertOrUpdate(Litigationinfo litigationinfo);
	
	Susong findSusongByPrimarykey(String keyid,String workid);
	
	Shixin findShixinByPrimarykey(String keyid,String workid);
	
	void insertOrUpdateSusong(Susong susong);
	
	void insertOrUpdateShixin(Shixin shixin);
}
