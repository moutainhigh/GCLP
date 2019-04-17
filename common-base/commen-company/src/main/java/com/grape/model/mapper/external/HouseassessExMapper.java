package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.ChannelAssessinfo;
@Mapper
public interface HouseassessExMapper {
	
	List<ChannelAssessinfo> findAssessinfoListByParam(Map<String, String> param);
	
	List<Map<String, Object>> findHouseassessListByParam2(Map<String, String> param);
}
