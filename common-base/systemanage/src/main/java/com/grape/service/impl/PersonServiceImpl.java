package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.tomcat.util.security.MD5Encoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.request.CompanyRequest;
import com.grape.controller.request.DepnoRequest;
import com.grape.controller.request.PersonRequest;
import com.grape.model.db.Person;
import com.grape.model.db.PersonExample;
import com.grape.model.db.Userrole;
import com.grape.model.db.UserroleExample;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.model.mapper.base.UserroleMapper;
import com.grape.model.mapper.external.PersonExMapper;
import com.grape.service.PersonService;
import com.grape.util.Md5Encrypt;
import com.grape.util.Util;

@Service
public class PersonServiceImpl implements PersonService {
	private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
    @Autowired
    private PersonMapper personMapper ;
    @Autowired
    private PersonExMapper personExMapper ;
    @Autowired
    private UserroleMapper userRoleMapper;

    @Override
    public void inseretPerson(PersonRequest request) {
        Person person = new Person() ;
        try {
            Util.transferFields(request, person);
            String password="00000000";
            String mdspwd = Md5Encrypt.MD5Encode(password);
            person.setPassword(mdspwd);
        } catch (Exception e) {
        	log.info("实体类转换出错");
        }
        //将用户的角色插入到用户角色表中
        List<String> jobs = request.getJob();
        if(jobs!=null && jobs.size()>0){
        	for(String job:jobs){
        		Userrole userrole = new Userrole();
        		userrole.setId(Util.getID());
        		userrole.setRoleid(job);
        		userrole.setWorkerid(request.getWorkerid());
        		userRoleMapper.insertSelective(userrole);
        	}
        }
        personMapper.insertSelective(person) ;
    }

    @Override
    public void deletePerson(PersonRequest request) {
        Person person = new Person() ;
        try {
            Util.transferFields(request, person);
        } catch (Exception e) {

        }
        //state == 3 means that member quit or out of their station , even on vacation or get sick
        person.setState("3");
        personMapper.updateByPrimaryKey(person) ;
    }

    @Override
    public void alterPerson(PersonRequest request) {
    	String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        Person person = new Person() ;
        try {
            Util.transferFields(request, person);
            person.setChgdt(new Date());
            person.setChgtl(workerid);
        } catch (Exception e) {
        	log.info("实体类转换出错");
        }
        //state == 3 means that member quit or out of their station , even on vacation or get sick
        person.setState("3");
        personMapper.updateByPrimaryKey(person) ;
        
    }

    @Override
    public List<Person> selectPersonByTerm(PersonRequest request) {
        Person person = new Person() ;
        person.setWorkerid(request.getWorkerid());
        return personExMapper.selectByTerm(person);
    }

	@Override
	public void updatePersonInfoByWorkeridAndComno(CompanyRequest req) {
		Person person = new Person();
		person.setMobilephone(req.getTelnumber());
		PersonExample example = new PersonExample();
		example.createCriteria().andWorkeridEqualTo(req.getOrganizationno()+"01").andOrganizationidEqualTo(req.getOrganizationno());
		personMapper.updateByExampleSelective(person, example);
	}

	@Override
	public List<Person> selectPersonListByDepno(DepnoRequest req) {
		PersonExample example = new PersonExample();
		example.createCriteria().andDepartmentEqualTo(req.getDepartmentno());
		List<Person> persons = personMapper.selectByExample(example);
		return persons;
	}

	@Override
	public List<Person> selectPersonListByDepnoAndComno(String departmentno, String organizationno) {
		PersonExample example = new PersonExample();
		example.createCriteria().andDepartmentEqualTo(departmentno).andOrganizationidEqualTo(organizationno);
		List<Person> persons = personMapper.selectByExample(example);
		return persons;
		
	}

	@Override
	public List<Person> selectPersonByComno(String comno) {
		PersonExample example = new PersonExample();
		example.createCriteria().andOrganizationidEqualTo(comno).andWorkeridNotEqualTo(comno+"001");
		List<Person> persons = personMapper.selectByExample(example);
		return persons;
	}

	@Override
	public Person selectPersonByWorkerid(String chgtl) {
		Person person = personMapper.selectByPrimaryKey(chgtl);
		return person;
	}

	@Override
	public List<Userrole> selectUserRoleByWorkerid(String workerid) {
		UserroleExample example = new UserroleExample();
		example.createCriteria().andWorkeridEqualTo(workerid);
		List<Userrole> list = userRoleMapper.selectByExample(example);
		return list;
	}
}
