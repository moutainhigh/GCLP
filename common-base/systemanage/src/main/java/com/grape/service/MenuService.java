package com.grape.service;

import java.util.List;

import com.grape.controller.request.RoleIdRequest;
import com.grape.model.db.Menu;
import com.grape.model.db.Rolemenu;

public interface MenuService {

	List<Menu> selectFirstMenu();

	List<Menu> selectMenuByFirstMenuid(String menuid);

	void insertRoleMenu(String roleid, String firstmenuid);

	void deleteRoleMenu(String roleid);

	List<Rolemenu> selectRoleMenu(RoleIdRequest req);

}
