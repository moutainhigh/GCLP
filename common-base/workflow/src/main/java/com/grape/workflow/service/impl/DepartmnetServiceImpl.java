package com.grape.workflow.service.impl;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.mapper.base.DepartmentMapper;
import com.grape.workflow.bean.Department;
import com.grape.workflow.dao.BaseDao;
import com.grape.workflow.service.DepartmentService;

@Service
public class DepartmnetServiceImpl extends BaseDao implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;

	public Department get(String departId) throws Exception {

		Department depart = null;
		com.grape.model.db.Department department = departmentMapper.selectByPrimaryKey(departId);
		depart = new Department(department);
		return depart;
	}

	public Department getSuperDepart(String departId) throws Exception {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("departId", departId);
		com.grape.model.db.DepartmentExample example = new com.grape.model.db.DepartmentExample();
		example.createCriteria().andSuperdepEqualTo(departId);
		List<com.grape.model.db.Department> list = departmentMapper.selectByExample(example);
		if(list!=null&&!list.isEmpty()){
			return new Department(list.get(0));
		}else{
			return null;
		}
	}

	public Department getHeadDepart(String departId) throws Exception {
		Department depart = null;
		while(true){
			depart = getSuperDepart(departId);
			if(depart.getSupperDepart()==null){
				break;
			}
		}
		return depart;
	}
}
