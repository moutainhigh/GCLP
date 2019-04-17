package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Xitaicode;
@Mapper
public interface XitaicodeExMapper {
	
	List<Xitaicode> findListByMap();
	
	void updatecitycode(Map<String, String> map);
}
