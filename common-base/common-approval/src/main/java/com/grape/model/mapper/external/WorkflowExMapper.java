package com.grape.model.mapper.external;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.request.FlowHandleRequest;
@Mapper
public interface WorkflowExMapper {

	FlowHandleRequest selectWorkflow(Map<String,Object> map);
	
}
