package com.grape.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.grape.controller.reponse.bean.Menuinfo;

import com.grape.controller.reponse.bean.Roleinfo;
import com.grape.controller.reponse.bean.Userinfo;
import com.grape.model.db.City;
import com.grape.model.db.Organization;
import com.grape.model.db.Person;
import com.grape.model.db.Userrole;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.base.CityMapper;
import com.grape.model.mapper.base.OrganizationMapper;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.model.mapper.external.UserinfoExMapper;
import com.grape.service.PersonService;
import com.grape.service.UserinfoService;
import com.grape.tool.Util;



@Service

public class UserinfoServiceImpl extends BaseMapper implements UserinfoService {

	@Autowired
	UserinfoExMapper userinfoExMapper;
	@Autowired
	PersonMapper personMapper;
	@Autowired
	PersonService personService;
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	CityMapper cityMapper;
	@Autowired
	OrganizationMapper organizationMapper;
	
	@Override
	public Userinfo findUserinfoByWorkerid(String workerid) {
		
		Person person = personMapper.selectByPrimaryKey(workerid);
		Userinfo userinfo = new Userinfo();
		userinfo.setUsrename(person.getWorkername());
		userinfo.setWorkerid(person.getWorkerid());
		if(!Util.isBlank(person.getCity())){
			City city = cityMapper.selectByPrimaryKey(person.getCity());
			if(city!=null){
				userinfo.setCity(city.getCityname());
				userinfo.setCitycode(city.getCitycode());
			}
			
		}
		if(!Util.isBlank(person.getOrganizationid())){
			Organization organization = organizationMapper.selectByPrimaryKey(person.getOrganizationid());
			userinfo.setOrganizationno(organization.getOrganizationno());
			userinfo.setOrgbelongsto(organization.getOrgbelongsto());
			
		}
		Map<String, Object> roleparam = new HashMap<String, Object>();
		roleparam.put("workerid", workerid);
		List<Roleinfo> roleinfos = userinfoExMapper.findRoleinfoByParam(roleparam);
		
		if(roleinfos.size()>0){
			userinfo.setRoleinfos(roleinfos);
			
			Map<String, Object> menuparam = new HashMap<String, Object>();
			List<String> roleids = new ArrayList<String>();
			for (Roleinfo roleinfo : roleinfos) {
				roleids.add(roleinfo.getRoleid());
			}
			menuparam.put("roleids", roleids);
			
			List<Menuinfo> menuifnos = userinfoExMapper.findMenuinfoByParam(menuparam);
			
			userinfo.setMenuinfos(menuifnos);
			
			
		}
		return userinfo;
	}


	@Override
	public List<Userrole> findUserroleByUsername(String username) {
		
		
		Person person = personService.findPersonByWorkeridOrPhone(username);
		Map<String, String> param = new HashMap<>();
		param.put("workerid", person.getWorkerid());
		List<Userrole> userroles = userinfoExMapper.findUserroleByWorkerid(param);
		if(userroles.size()>0){
			return userroles;
		}
		return null;
	}


	

	@Override
	public List<Roleinfo> findRoleinfoByUsername(String username) {
		Person person = personService.findPersonByWorkeridOrPhone(username);
		Map<String, Object> param = new HashMap<>();
		param.put("workerid", person.getWorkerid());
		List<Roleinfo> roleinfos = userinfoExMapper.findRoleinfoByParam(param);
		if(roleinfos.size()>0){
			return roleinfos;
		}
		return null;
	}

	@Override
	public String logonInPhone(String phone, String password) {
		ResponseEntity<String> result =null;
		 
		 LinkedMultiValueMap<String, String> param = new LinkedMultiValueMap<String, String>();
		 param.add("username","phone"+phone);
		 param.add("password",password);
		 param.add("grant_type","password");
		 HttpHeaders headers = new HttpHeaders();  
		 headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED); 
		 
		 /**
		  * 解决http basic验证(授权中心会验证client_id和其凭证)
		  */
			String token = null;
			try {
				token = Base64Utils.encodeToString(("clientid" + ":" + "secret").getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e1) {
				throw new RuntimeException();
			}
			headers.set("Authorization", "Basic " + token);
		
		 
		 HttpEntity<LinkedMultiValueMap<String, String>> httpEntity = new HttpEntity<LinkedMultiValueMap<String, String>>(param, headers); 
		 String text=null;
		
		 try{
			/**
			 * 远程post请求验证账号密码获取token
			 */
		
		    result = restTemplate.postForEntity("http://127.0.0.1:9999/auth/oauth/token", httpEntity,String.class);
		   
		    if(result.getStatusCode().is2xxSuccessful()){
		    	 text=result.getBody();
		    	 return text;
		    }else{
		    	
		    	throw new IllegalStateException();
		    }
		 }catch (Exception e) {  
			
			throw new IllegalStateException(e);
		 } 
			
	}

	
	
	
	
}
