package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.request.RoleIdRequest;
import com.grape.model.db.Menu;
import com.grape.model.db.MenuExample;
import com.grape.model.db.Rolemenu;
import com.grape.model.db.RolemenuExample;
import com.grape.model.mapper.base.MenuMapper;
import com.grape.model.mapper.base.RolemenuMapper;
import com.grape.service.MenuService;
import com.grape.util.Util;

@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	private MenuMapper menuMapper;
	
	@Autowired
	private RolemenuMapper rolemenuMapper;
	@Override
	public List<Menu> selectFirstMenu() {
		String id = "1";
		MenuExample example = new MenuExample();
		example.createCriteria().andMenuidLike(id+"%");
		List<Menu> list = menuMapper.selectByExample(example);
		if(list!=null){
			return list;
		}
		return null;
	}
	@Override
	public List<Menu> selectMenuByFirstMenuid(String menuid) {
		MenuExample example = new MenuExample();
		example.createCriteria().andSuperidEqualTo(menuid);
		List<Menu> list = menuMapper.selectByExample(example);
		if(list!=null){
			return list;
		}
		return null;
	}
	@Override
	public void insertRoleMenu(String roleid, String firstmenuid) {
		Rolemenu rolemenu = new Rolemenu();
		rolemenu.setId(Util.getID());
		rolemenu.setMenuid(firstmenuid);
		rolemenu.setRoleid(roleid);
		rolemenu.setMenutype("0");
		rolemenu.setChgdt(new Date());
		rolemenu.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		rolemenuMapper.insertSelective(rolemenu);
	}
	@Override
	public void deleteRoleMenu(String roleid) {
		RolemenuExample example = new RolemenuExample(); 
		example.createCriteria().andRoleidEqualTo(roleid);
		rolemenuMapper.deleteByExample(example);
		
	}
	@Override
	public List<Rolemenu> selectRoleMenu(RoleIdRequest req) {
		RolemenuExample example = new RolemenuExample();
		example.createCriteria().andRoleidEqualTo(req.getRoleid());
		List<Rolemenu> list = rolemenuMapper.selectByExample(example);
		return list;
	}

}
