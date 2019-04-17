package com.grape.service.impl;

import com.grape.controller.request.*;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.NodebuttonExample;
import com.grape.model.db.Noderole;
import com.grape.model.db.NoderoleExample;
import com.grape.model.mapper.base.NodebuttonMapper;
import com.grape.model.mapper.base.NoderoleMapper;
import com.grape.model.mapper.external.RoleExMapper;
import com.grape.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleExMapper roleExMapper ;
	@Autowired
	private NodebuttonMapper nodebuttonMapper ;
	@Autowired
	private NoderoleMapper noderoleMapper ;

	@Override
	public List<RoleBean> selectByRoleid(RoleBeanRequest req) {
		return roleExMapper.selectRole(req) ;
	}

	@Override
	public List<Nodebutton> selectByNodeidAndName(NodeidAndNameRequest req) {
		NodebuttonExample exam = new NodebuttonExample() ;
		exam.createCriteria().andNodeidEqualTo(req.getNodeid()).andNameEqualTo(req.getName()) ;
		List<Nodebutton> list = nodebuttonMapper.selectByExample(exam) ;
		return list ;
	}

	@Override
	public List<Nodebutton> selectByNodeid(String nodeid) {
		NodebuttonExample exam = new NodebuttonExample() ;
		exam.createCriteria().andNodeidEqualTo(nodeid) ;
		List<Nodebutton> list = nodebuttonMapper.selectByExample(exam) ;
		return list;
	}

	@Override
	public List<Noderole> selectByNext(String nextnodeid) {
		NoderoleExample exam = new NoderoleExample() ;
		exam.createCriteria().andNodeidEqualTo(nextnodeid) ;
		List<Noderole> list = noderoleMapper.selectByExample(exam) ;
		return list;
	}

	@Override
	public List<RoleBean> authorization(AuthorizationRequest req) {	
		
		return roleExMapper.authorization(req);
	}

	@Override
	public List<RoleBean> forward(ForwardRequest req) {
		
		return roleExMapper.forward(req);
	}


	@Override
	public List<RoleBean> sendback(SendBackRequest req) {
		
		return roleExMapper.sendback(req);
	}

	@Override
	public List<RoleBean> selectRoleEx(RoleBeanRequest req) {
		
		return roleExMapper.selectRoleEx(req);
	}

	@Override
	public String selectRoleFortotal(NodeidRequest req) {
		
		return roleExMapper.selectRoleFortotal(req);
	}

	@Override
	public Integer selectCount(String workerid) {
		Map<String , Object> map = new HashMap<>() ;
		map.put("userid" , workerid) ;
		return roleExMapper.selectCount(map);
	}
}
