package com.grape.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Person;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.model.mapper.external.OrganizationExMapper;
import com.grape.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	private PersonMapper personMapper;
	@Autowired
	private OrganizationExMapper organizationExMapper;
	@Override
	public Person selectByWorkerid(String userid) {
		return personMapper.selectByPrimaryKey(userid);
	}
	@Override
	public String selectOrgnoByOrganization(String org) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("org", org);
		return organizationExMapper.selectOrgnoByOrg(map);
	}

}
