package com.grape.workflow.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Role;
import com.grape.model.db.RoleExample;
import com.grape.model.db.Userrole;
import com.grape.model.db.UserroleExample;
import com.grape.model.mapper.base.RoleMapper;
import com.grape.model.mapper.base.UserroleMapper;
import com.grape.workflow.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleMapper roleMapper;
	
	@Autowired
	private UserroleMapper userroleMapper;
	
	@Override
	public Set<String> getAllRoles() {
		RoleExample example = new RoleExample();
		List<Role> roles = roleMapper.selectByExample(example);
		Set<String> roleSet = new HashSet<String>();
		if(roles!=null){
			for (Role role : roles) {
				roleSet.add(role.getRoleid());
			}
		}
		return roleSet;
	}

	@Override
	public String getNodeFirstAuthuserid(String userid, List<String> roles) {
		UserroleExample example = new UserroleExample();
		example.createCriteria().andAuthworkeridEqualTo(userid).andRoleidIn(roles);
		List<Userrole> list = userroleMapper.selectByExample(example);
		if(list!=null&&!list.isEmpty()){
			return list.get(0).getWorkerid();
		}
		return null;
	}

}
