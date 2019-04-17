package com.grape.service;



import java.util.List;

import com.grape.controller.reponse.bean.Roleinfo;
import com.grape.controller.reponse.bean.Userinfo;
import com.grape.model.db.Userrole;

public interface UserinfoService {
	
	
	Userinfo findUserinfoByWorkerid(String workerid);
	
	String logonInPhone(String phone,String password);
	
	List<Userrole> findUserroleByUsername(String usename);
	
	List<Roleinfo> findRoleinfoByUsername(String username);
}
