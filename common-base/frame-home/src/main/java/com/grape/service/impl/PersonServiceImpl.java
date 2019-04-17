package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.bean.Personinfo;
import com.grape.controller.reponse.bean.Roleinfo;
import com.grape.model.db.Codetable;
import com.grape.model.db.Department;
import com.grape.model.db.Organization;
import com.grape.model.db.Person;
import com.grape.model.db.PersonExample;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.model.mapper.base.DepartmentMapper;
import com.grape.model.mapper.base.OrganizationMapper;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.model.mapper.external.UserinfoExMapper;
import com.grape.service.PersonService;
import com.grape.service.UserinfoService;
import com.grape.tool.Util;
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonMapper personMapper;
	@Autowired
	UserinfoExMapper userinfoExMapper;
	@Autowired
	UserinfoService userinfoService;
	@Autowired
	OrganizationMapper organizationMapper;
	@Autowired
	CodetableMapper codetableMapper;
	@Autowired
	DepartmentMapper departmentMapper;
	@Override
	public Person findPersonByPhone(String phone) {
		PersonExample example = new PersonExample();
		example.createCriteria().andMobilephoneEqualTo(phone);
		List<Person> persons = personMapper.selectByExample(example);
		if(persons.size()>0){
			return persons.get(0);
		}
		return null;
	}
	@Override
	public Person findPersonByWorkeridOrPhone(String username) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("workerid", username);
		map.put("mobilephone", username);
		List<Person> persons = userinfoExMapper.findPersonByWorkeridOrPhone(map);
		if(persons.size()>0){
			return persons.get(0);
		}
		return null;
	}
	@Override
	public boolean checkPassword(Person person, String password) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(encoder.matches(password, person.getPassword())){
			return true;
		}
		return false;
	}
	@Override
	public boolean updatePassword(Person person, String newPassword) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		person.setPassword(encoder.encode(newPassword));
		int flag;
		flag = personMapper.updateByPrimaryKey(person);
		if(flag==1)
			return true;
		return false;
	}
	@Override
	public boolean resetPassword(String username, String newPasword) {
		Person person = findPersonByWorkeridOrPhone(username);
		
		return updatePassword(person, newPasword);
	}
	@Override
	public boolean useradd(Person person) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = encoder.encode(person.getPassword());
		person.setPassword(password);
		int flag;
		flag = personMapper.insert(person);
		if(flag==1){
			return true;
		}
		return false;
	}
	@Override
	public boolean resetPasswordByPerson(Person person, String newPassword) {
		
		return updatePassword(person, newPassword);
	}
	@Override
	public Personinfo findPersoninfoByUsername(String username) {
		
		try {
			Person person = findPersonByWorkeridOrPhone(username);
		
			Map<String, Object> param = new HashMap<>();
			param.put("workerid", person.getWorkerid());
			
			Personinfo personinfo = new Personinfo();
			personinfo.setWorkerid(person.getWorkerid());
			personinfo.setWorkername(person.getWorkername());
			if(!Util.isBlank(person.getDepartment())){
				personinfo.setDepartmentno(person.getDepartment());
				Department department = departmentMapper.selectByPrimaryKey(person.getDepartment());
				if(department!=null){
					personinfo.setDepartment(department.getDepartmentname());
				}
			}
			
			personinfo.setMobilephone(person.getMobilephone());
			personinfo.setEmail(person.getEmail());
			
			if(person.getOrganizationid()!=null){
				Organization organization = organizationMapper.selectByPrimaryKey(person.getOrganizationid());
				personinfo.setOrganization(organization.getOrganizationname());
				
				String orgbelongsto = organization.getOrgbelongsto();
				if(!Util.isBlank(orgbelongsto)){
					personinfo.setOrgbelongsto(orgbelongsto);
					Codetable codetable = codetableMapper.selectByPrimaryKey("COMPANYTYPE",orgbelongsto);
					personinfo.setOrgbelongstoname(codetable.getCoddes());
				}
				
				
			}
			
			
			List<Roleinfo> roleinfos = userinfoExMapper.findRoleinfoByParam(param);
			
			if(roleinfos.size()>0){
				personinfo.setRoleinfos(roleinfos);
			}
			return personinfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	@Override
	public boolean updatePerson(Person person) {
		int flag;
		flag = personMapper.updateByPrimaryKey(person);
		if(flag==1){
			return true;
		}
		return false;
	}





}
