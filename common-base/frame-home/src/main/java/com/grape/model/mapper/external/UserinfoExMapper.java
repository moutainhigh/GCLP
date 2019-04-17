package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.Menuinfo;
import com.grape.controller.reponse.bean.Roleinfo;
import com.grape.model.db.Person;
import com.grape.model.db.Userrole;

@Mapper
public interface UserinfoExMapper {
	
	List<Roleinfo> findRoleinfoByParam(Map<String, Object> param);
	
	List<Menuinfo> findMenuinfoByParam(Map<String, Object> param);
	
	List<Person> findPersonByWorkeridOrPhone(Map<String, String> param);
	
	List<Userrole> findUserroleByWorkerid(Map<String, String> param);
}
