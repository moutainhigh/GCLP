package com.grape.service;

import java.util.List;

import com.grape.controller.request.ComnoRequest;
import com.grape.controller.request.DepartmentRequest;
import com.grape.controller.response.bean.RoleDepartmentBean;
import com.grape.model.db.Department;
import com.grape.model.db.Userrole;

/** 
* @author cwc
* @version 创建时间：2019年3月14日 上午10:47:58  
*/
public interface DepartmentService {

	List<Department> selectDepartmentList(ComnoRequest req);

	void insertDepartment(DepartmentRequest req);

	List<RoleDepartmentBean> selectByCompno(String organizationno) ;

	Department selectDepartmentByDepno(String departmentno);

	List<Userrole> selectUserRoleByWorkerid(String workerid);

	String selectRoleNameByRoleid(String roleid);

	List<Department> selectDepartmentBySuperDep(String depno);

}
