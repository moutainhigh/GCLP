package com.grape.controller.response.bean;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/** 
* @author cwc项目经理---陈戊长
* @version 创建时间：2019年3月15日 上午9:11:02  
*/
@Getter
@Setter
public class DepartmentBean {
	@ApiModelProperty(value="部门名称",notes="部门名称")
	private String departmentname;
	
	@ApiModelProperty(value="用户名称列表")
	private List<String> usernamnes; 
}
