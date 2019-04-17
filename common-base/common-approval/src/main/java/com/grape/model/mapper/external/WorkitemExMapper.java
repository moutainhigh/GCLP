package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Workitem;

@Mapper
public interface WorkitemExMapper {
	public List<Workitem> selectDate(String nodeid) ;

	public List<Workitem> selectWorkitemByNodename(Map<String, Object> map);
}
