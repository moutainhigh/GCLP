package com.grape.workflow.service;

import com.grape.workflow.bean.Department;

public interface DepartmentService {
	/**
	 * 
	 * 根据部门编号获取部门信息
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @param departId 部门编号
	 * @return 部门信息
	 * @throws Exception
	 */
	public Department get(String departId) throws Exception;
	/**
	 * 
	 * 根据部门编号获取上级部门信息
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @param departId 部门编号
	 * @return （上级）部门信息
	 * @throws Exception
	 */
	public Department getSuperDepart(String departId) throws Exception;
	/**
	 * 
	 * 部门信息（总部）
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @return 部门信息
	 * @throws Exception
	 */
	public Department getHeadDepart(String departId) throws Exception;
}
