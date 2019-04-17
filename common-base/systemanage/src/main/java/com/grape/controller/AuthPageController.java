package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.MenuResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.RoleMenuRequest;
import com.grape.controller.request.RoleIdRequest;
import com.grape.controller.response.bean.MenuBean;
import com.grape.controller.response.bean.SecondMenuBean;
import com.grape.model.db.Menu;
import com.grape.model.db.Rolemenu;
import com.grape.service.MenuService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/authPageManage")
public class AuthPageController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/selectAllSecondMenu")
	@ApiOperation(value="查找一级菜单下的二级子菜单",notes="查找子菜单的接口一",httpMethod="POST",response=MenuResponse.class)
	public Response selectAllSecondMenu(@RequestBody RoleIdRequest req){
		List<MenuBean> menuList = new ArrayList<MenuBean>();
		List<Menu> menus = menuService.selectFirstMenu();
		List<Rolemenu> roleMenus = menuService.selectRoleMenu(req);
		List<String> menuids = new ArrayList<String>();
		if(roleMenus!=null && roleMenus.size()>0){
			for(Rolemenu rolemenu:roleMenus){
				menuids.add(rolemenu.getMenuid());
			}
		}
		for(int i=0;i<menus.size();i++){
			MenuBean menubean = new MenuBean();
			String menuname = menus.get(i).getMenuname();
			String menuid = menus.get(i).getMenuid();
			//查找一级菜单下的二级菜单列表
			List<Menu> list = menuService.selectMenuByFirstMenuid(menuid);
			List<SecondMenuBean> menunames = new ArrayList<SecondMenuBean>();
			for(int j=0;j<list.size();j++){
				SecondMenuBean secondMenuBean = new SecondMenuBean();
				String name = list.get(j).getMenuname();
				String menuno = list.get(j).getMenuid();
				secondMenuBean.setMenuName(name);
				secondMenuBean.setMenuNo(menuno);
				menunames.add(secondMenuBean);
			}
			//将一级菜单名称加入到list中
			menubean.setMenuName(menuname);
			menubean.setMenuNo(menuid);
			//将二级菜单列表加入到一级菜单下属菜单中
			menubean.setChildren(menunames);
			menuList.add(menubean);
		}
		return new MenuResponse(menuList,menuids);
	}
	
	@RequestMapping("/saveAllRoleMenu")
	@ApiOperation(value="保存角色能看到的菜单列表",notes="保存菜单的接口一",httpMethod="POST",response=RestfulResponse.class)
	public Response saveAllRoleMenu(@RequestBody RoleMenuRequest req){
		String roleid = req.getRoleid();
		menuService.deleteRoleMenu(roleid);
		List<MenuBean> list = req.getMenulist();
		for(int i=0;i<list.size();i++){
			MenuBean bean = new MenuBean();
			bean = list.get(i);
			String firstmenuid = bean.getMenuNo();
			//将一级菜单与角色相关联
			menuService.insertRoleMenu(roleid,firstmenuid);
			//获取已经选取的二级菜单列表
			List<SecondMenuBean> secondList = new ArrayList<SecondMenuBean>();
			secondList = bean.getChildren();
			if(secondList!=null && secondList.size()>0){
				for(SecondMenuBean secondMenuBean:secondList){
					String key = secondMenuBean.getMenuNo();
					//将二级菜单与角色相关联
					menuService.insertRoleMenu(roleid,key);
				}
			}
		}
		return new RestfulResponse();
	}
}
