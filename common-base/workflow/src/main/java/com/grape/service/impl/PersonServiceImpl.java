package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.model.db.Department;
import com.grape.model.db.Person;
import com.grape.model.db.Userrole;
import com.grape.model.db.UserroleExample;
import com.grape.model.mapper.base.DepartmentMapper;
import com.grape.model.mapper.base.OrganizationMapper;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.model.mapper.base.UserroleMapper;
import com.grape.service.PersonService;
import com.grape.workflow.bean.Actor;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonMapper personMapper;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Autowired
	private OrganizationMapper organizationMapper;
	
	@Autowired
	private UserroleMapper userroleMapper;
	
	@Override
	public Actor getCurrentActor() {
		String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		return getActor(workerid);
	}

	@Override
	public Actor getActor(String workerid) {
		
		Person person = personMapper.selectByPrimaryKey(workerid);
		
		if(person!=null){
			Department depart = departmentMapper.selectByPrimaryKey(person.getDepartment());
			
			if(depart!=null){
				
				UserroleExample example = new UserroleExample();
				example.createCriteria().andWorkeridEqualTo(workerid);
				List<Userrole> roles = userroleMapper.selectByExample(example);
				
				return new Actor(person, depart, roles);
			}
		}
		
		return null;
	}

}
