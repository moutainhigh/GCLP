package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.request.ComTypeRequest;
import com.grape.controller.request.CompanyRequest;
import com.grape.model.db.Department;
import com.grape.model.db.Organization;
import com.grape.model.db.OrganizationExample;
import com.grape.model.db.Person;
import com.grape.model.mapper.base.DepartmentMapper;
import com.grape.model.mapper.base.OrganizationMapper;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.service.CompanyService;
import com.grape.util.Md5Encrypt;
import com.grape.util.Util;

/** 
* @author cwc
* @version 创建时间：2019年3月12日 上午10:41:12  
*/
@Service
public class CompanyServiceImpl implements CompanyService{
	
	private static final Logger log = LoggerFactory.getLogger(CompanyServiceImpl.class);
	@Autowired
	private OrganizationMapper organizationMapper;
	@Autowired
	private DepartmentMapper departmentMapper;
	@Autowired
	private PersonMapper personMapper;
	@Override
	public void insertCompany(CompanyRequest companyRequest) {
		Organization org = new Organization();
		try {
			Util.transferFields(companyRequest, org);
		} catch (Exception e) {
			log.info("转换实体类错误");
		}
		//将企业信息插入
		organizationMapper.insertSelective(org);
		//插入完企业信息后需要默认新增一个系统管理部门
		Department department = new Department();
		department.setDepartmentname("系统管理部");
		department.setDepartmentno(companyRequest.getOrganizationno()+"001");
		department.setChgdt(new Date());
		department.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		department.setOrganizationno(companyRequest.getOrganizationno());
		departmentMapper.insertSelective(department);
		//需要新增一个系统管理员用户，该用户使用公司电话号码作为用户名
		Person person = new Person();
		person.setDepartment(companyRequest.getOrganizationno()+"001");
		person.setMobilephone(companyRequest.getTelnumber());
		person.setWorkerid(companyRequest.getOrganizationno()+"01");
		person.setWorkername(companyRequest.getOrganizationname());
		person.setOrganizationid(companyRequest.getOrganizationno());
		//将密码使用MD5加密后设为默认管理员密码
		String password = Md5Encrypt.MD5Encode("00000000");
		person.setPassword(password);
		person.setChgdt(new Date());
		person.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		personMapper.insertSelective(person);
	}
	@Override
	public List<Organization> selectAllOrganization() {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria();
		List<Organization> orgs = organizationMapper.selectByExampleWithBLOBs(example);
		return orgs;
	}
	@Override
	public void deleteCompanyByComno(String organizationno) {
		organizationMapper.deleteByPrimaryKey(organizationno);
		
	}
	@Override
	public Organization selectCompanyByOrgno(String organizationno) {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andOrganizationnoEqualTo(organizationno);
		List<Organization> orgs = organizationMapper.selectByExampleWithBLOBs(example);
		if(orgs!=null && orgs.size()>0){
			return orgs.get(0);
		}
		return null;
	}
	@Override
	public List<Organization> selectOrganizationByType(ComTypeRequest req) {
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andOrgbelongstoEqualTo(req.getOrgtype());
		List<Organization> orgs = organizationMapper.selectByExampleWithBLOBs(example);
		if(orgs!=null && orgs.size()>0){
			return orgs;
		}
		return null;
	}
	@Override
	public void updateOrganication(CompanyRequest req) {
		Organization org = new Organization();
		try {
			Util.transferFields(req, org);
		} catch (Exception e) {
			log.info("机构实体类转换出错");
		}
		organizationMapper.updateByPrimaryKeySelective(org);
	}
	
}
