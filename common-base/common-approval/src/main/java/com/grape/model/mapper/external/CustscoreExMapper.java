package com.grape.model.mapper.external;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Custscore;

@Mapper
public interface CustscoreExMapper {
	List<Custscore> selectAll() ;
	
	int selectCountid() ;
}
