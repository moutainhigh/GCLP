package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Noticeinfo;

@Mapper
public interface NoticeinfoExMapper {
		
	List<Noticeinfo> findNoticeinfosByDate();
	
	Integer countNoticeinfosByDate();
	
	List<Noticeinfo> findNoticeinfosByDateOf(Map<String,Object> param);
	
	Integer countNoticeinfosByDateOf();
}
