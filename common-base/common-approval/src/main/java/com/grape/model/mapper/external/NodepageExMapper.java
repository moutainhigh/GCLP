package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.request.NodepageBean;

@Mapper
public interface NodepageExMapper {

	List<NodepageBean> selectNodePage(Map<String, Object> map);

}
