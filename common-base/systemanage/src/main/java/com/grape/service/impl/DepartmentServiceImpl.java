package com.grape.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.grape.controller.request.ComnoRequest;
import com.grape.controller.request.DepartmentRequest;
import com.grape.controller.response.bean.RoleDepartmentBean;
import com.grape.model.db.Department;
import com.grape.model.db.DepartmentExample;
import com.grape.model.db.Role;
import com.grape.model.db.RoleExample;
import com.grape.model.db.Userrole;
import com.grape.model.db.UserroleExample;
import com.grape.model.mapper.base.DepartmentMapper;
import com.grape.model.mapper.base.RoleMapper;
import com.grape.model.mapper.base.UserroleMapper;
import com.grape.model.mapper.external.DepartmentRoleMapper;
import com.grape.service.DepartmentService;
import com.grape.util.Util;

/** 
* @author cwc陈武昌
* @version 创建时间：2019年3月14日 上午10:48:15  
*/
@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	private static final Logger log = LoggerFactory.getLogger(DepartmentServiceImpl.class);
	
	@Autowired
	private DepartmentMapper departmentMapper;
	@Autowired
	private DepartmentRoleMapper departmentRoleMapper ;
	@Autowired
	private UserroleMapper userroleMapper;
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public List<Department> selectDepartmentList(ComnoRequest req) {
		DepartmentExample example = new DepartmentExample();
		example.createCriteria().andOrganizationnoEqualTo(req.getOrganizationno());
		List<Department> list = departmentMapper.selectByExample(example);
		if(list!=null && !"".equals(list)){
			return list;
		}
		return null;
	}

	@Override
	public void insertDepartment(DepartmentRequest req) {
		Department dep = new Department();
		try {
			Util.transferFields(req, dep);
			dep.setChgdt(new Date());
			dep.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		departmentMapper.insertSelective(dep);
		
	}

	@Override
	public List<RoleDepartmentBean> selectByCompno(String organizationno) {
		List<RoleDepartmentBean> roleDepartmentBeans = departmentRoleMapper.selectByCompno(organizationno);
		String role ;
		String person ;
		List<String> nameList = new ArrayList<>() ;

		if(!CollectionUtils.isEmpty(roleDepartmentBeans)) {
			List<RoleDepartmentBean> list = selectSame(roleDepartmentBeans);
			return list;
		}
		return null ;
	}

	public List<RoleDepartmentBean> selectSame(List<RoleDepartmentBean> list) {
		for  ( int  i  =   0 ; i  <  list.size()  -   1 ; i ++ )  {
			for  ( int  j  =  list.size()  -   1 ; j  >  0; j -- )  {
				List<String> nameList = new ArrayList<>() ;
				if  (!list.get(j).getRole().equals(list.get(i).getRole()))  {
					nameList.add(list.get(j).getPerson()) ;
					list.get(j).setNamelist(nameList);
				}else {
					nameList.add(list.get(j).getPerson()) ;
					list.get(i).getNamelist().addAll(nameList) ;
					list.remove(j) ;
				}
			}
		}
		return list ;
	}

	@Override
	public Department selectDepartmentByDepno(String departmentno) {
		DepartmentExample example = new DepartmentExample();
		example.createCriteria().andDepartmentnoEqualTo(departmentno);
		List<Department> department = departmentMapper.selectByExample(example);
		if(department!=null && department.size()>0){
			return department.get(0);
		}
		return null;
	}

	@Override
	public List<Userrole> selectUserRoleByWorkerid(String workerid) {
		UserroleExample example = new UserroleExample();
		example.createCriteria().andWorkeridEqualTo(workerid);
		List<Userrole> list = userroleMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public String selectRoleNameByRoleid(String roleid) {
		RoleExample example = new RoleExample();
		example.createCriteria().andRoleidEqualTo(roleid);
		List<Role> list = roleMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			return list.get(0).getRolename();
		}
		return null;
	}

	@Override
	public List<Department> selectDepartmentBySuperDep(String depno) {
		DepartmentExample example = new DepartmentExample();
		example.createCriteria().andSuperdepEqualTo(depno);
		List<Department> departments = departmentMapper.selectByExample(example);
		if(departments!=null && departments.size()>0){
			return departments;
		}
		return null;
	}

}
