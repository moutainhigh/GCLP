package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Userapprove;

@Mapper
public interface WorkflowExMapper {
	
	List<Userapprove> findApproveUsers(Map<String,String> map);
	
}
