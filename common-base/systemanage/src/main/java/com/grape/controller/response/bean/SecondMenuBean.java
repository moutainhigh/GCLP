package com.grape.controller.response.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecondMenuBean {
	@ApiModelProperty(value="一级菜单名称")
	private String MenuName;
	
	@ApiModelProperty(value="一级菜单编号")
	private String MenuNo;
}
