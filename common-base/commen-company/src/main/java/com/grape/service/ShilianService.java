package com.grape.service;

import com.grape.controller.reponse.bean.SLQueryPriceResponseBean;
import com.grape.model.db.Exchannel;



public interface ShilianService {
	
	SLQueryPriceResponseBean findSLQueryPrice(Exchannel exchannel,String queryid,String workid,int cityCode,String houseaddress,Float floorarea);
	
	SLQueryPriceResponseBean findSLqueryPriceRecord(String queryid,String workid);
}
