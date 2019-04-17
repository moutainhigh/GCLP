package com.grape.model.mapper.external;

import com.grape.controller.request.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleExMapper {
	
	List<RoleBean> selectRole(RoleBeanRequest req) ;
	
	List<RoleBean> authorization(AuthorizationRequest req) ;
	
	List<RoleBean> forward(ForwardRequest req) ;
	
	List<RoleBean> sendback(SendBackRequest req) ;
	
	List<RoleBean> selectRoleEx(RoleBeanRequest req) ;
	
	String selectRoleFortotal(NodeidRequest req) ;

	Integer selectCount(Map<String, Object> map);
}
