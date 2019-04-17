package com.grape.controller.response.bean;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuBean {
	
	@ApiModelProperty(value="一级菜单名称")
	private String MenuName;
	
	@ApiModelProperty(value="一级菜单编号")
	private String MenuNo;
	
	@ApiModelProperty(value="二级菜单列表")
	private List<SecondMenuBean> children;
	
}
