package com.grape.service;

import com.grape.controller.request.*;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.Noderole;

import java.util.List;

public interface RoleService {
	
	List<RoleBean> selectByRoleid(RoleBeanRequest req) ;
	
	List<Nodebutton> selectByNodeidAndName(NodeidAndNameRequest req) ;
	
	List<Nodebutton> selectByNodeid(String nodeid) ;
	
	List<Noderole> selectByNext(String nextnodeid) ;
	
	List<RoleBean> authorization(AuthorizationRequest req) ;
	
	List<RoleBean> forward(ForwardRequest req) ;
	
	List<RoleBean> sendback(SendBackRequest req) ;

	List<RoleBean> selectRoleEx(RoleBeanRequest req) ;
	
	String selectRoleFortotal(NodeidRequest req) ;

	Integer selectCount(String workerid) ;
}
