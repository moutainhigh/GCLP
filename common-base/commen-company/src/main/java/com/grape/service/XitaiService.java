package com.grape.service;

import com.grape.controller.reponse.bean.XTQueryPriceResponseBean;
import com.grape.model.db.Exchannel;

public interface XitaiService {
	
		XTQueryPriceResponseBean findQueryPrice(Exchannel exchannel,String citycode,String areacode,String mortgagename,String address,
				String floorarea,String floor,String height);
}
