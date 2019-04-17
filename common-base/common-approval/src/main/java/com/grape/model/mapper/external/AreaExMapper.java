package com.grape.model.mapper.external;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Area;

@Mapper
public interface AreaExMapper {
	List<Area> queryByGbcode(String gbcode) ;
}
