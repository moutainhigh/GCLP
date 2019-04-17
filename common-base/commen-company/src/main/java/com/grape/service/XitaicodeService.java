package com.grape.service;

import com.grape.model.db.Xitaicode;

public interface XitaicodeService {
	
	Xitaicode findByCode(String citycode,String areacode);
}
