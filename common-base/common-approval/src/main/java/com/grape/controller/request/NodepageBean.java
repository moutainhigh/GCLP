package com.grape.controller.request;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NodepageBean {
	@ApiModelProperty(value = "页面", example = "", dataType="char(10)", required = true )
    private String pageid;

	@ApiModelProperty(value = "是否可编辑", example = "", dataType="char(10)", required = true )
    private String editflg;

	@ApiModelProperty(value = "是否可查看", example = "", dataType="char(10)", required = true )
    private String viewflg;

	@ApiModelProperty(value = "在基本信息页展示", example = "", dataType="char(1)", required = true )
    private String basepageflg;

	@ApiModelProperty(value = "在审批信息页展示", example = "", dataType="char(1)", required = true )
    private String approvalpageflg;
	
	@ApiModelProperty(value = "页面所属按钮", example = "", dataType="varchar(80)", required = true )
    private String pagebutton;
	
	@ApiModelProperty(value = "页面名称", example = "", dataType="char(1)", required = true )
    private String pagename;
}
