package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.bean.WorkitemBean;
import com.grape.model.db.Productnode;

@Mapper
public interface ProductnodeExMapper {
	
	List<Productnode> selectProDate();

	List<WorkitemBean> selectNameByWorkid(Map<String, Object> map);
}
