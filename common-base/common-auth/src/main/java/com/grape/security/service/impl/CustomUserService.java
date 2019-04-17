package com.grape.security.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.grape.model.db.Person;
import com.grape.model.db.PersonExample;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.security.bean.Authority;
import com.grape.security.bean.CustomUserDetails;

@Service//cai添加
public class CustomUserService implements UserDetailsService{


    @Autowired
    private PersonMapper personMapper;
    
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		PersonExample example = new PersonExample();
		List<Person> userinfos;
		
		//先用手机号查询用户信息，如果没有再用工作号查
		example.createCriteria().andMobilephoneEqualTo(userName);
		userinfos = personMapper.selectByExample(example);
		if(userinfos.isEmpty()){
			example.createCriteria().andWorkeridEqualTo(userName); 
			userinfos=personMapper.selectByExample(example);
		}

		List<Authority> authority = new ArrayList<Authority>();
		authority.add(new Authority("admin"));
		
		if (userinfos.size() > 0){
			Person userinfo = userinfos.get(0);
			return  new CustomUserDetails(userinfo.getWorkerid(), userinfo.getPassword(),authority);
		}
		return null;
	}

}
