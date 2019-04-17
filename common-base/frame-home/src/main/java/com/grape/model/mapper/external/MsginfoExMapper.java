package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.Msginfo;
@Mapper
public interface MsginfoExMapper {
	
	List<Msginfo> findMsginfoByWorkerid(Map<String, String> param);
	
	Integer countByMsginfos(Map<String, String> param);
	
	List<Msginfo> findNewMsginfoByWorkerid(Map<String, String> param);
	
	Integer countByNewMsginfos(Map<String, String> param);
	
}
