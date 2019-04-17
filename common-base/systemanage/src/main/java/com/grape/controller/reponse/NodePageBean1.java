package com.grape.controller.reponse;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NodePageBean1 {
	@Length(max=10,min=0,message="id不能超出10位")
	@ApiModelProperty(value = "id", example = "", dataType="char(10)", required = true )
    private String id;

	@Length(max=10,min=0,message="产品编号不能超出10位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="char(10)", required = true )
    private String productno;

	@Length(max=10,min=0,message="节点不能超出10位")
	@ApiModelProperty(value = "节点", example = "", dataType="char(10)", required = true )
    private String nodeid;

	@Length(max=10,min=0,message="页面不能超出10位")
	@ApiModelProperty(value = "页面", example = "", dataType="char(10)", required = true )
    private String pageid;
	
	@Length(max=10,min=0,message="页面不能超出10位")
	@ApiModelProperty(value = "页面名称", example = "", dataType="char(10)", required = true )
    private String pagename;

	@Length(max=10,min=0,message="是否可编辑不能超出10位")
	@ApiModelProperty(value = "是否可编辑", example = "", dataType="char(10)", required = true )
    private String editflg;

	@Length(max=10,min=0,message="是否可查看不能超出10位")
	@ApiModelProperty(value = "是否可查看", example = "", dataType="char(10)", required = true )
    private String viewflg;

	@Length(max=80,min=0,message="页面所属按钮不能超出80位")
	@ApiModelProperty(value = "页面所属按钮", example = "", dataType="varchar(80)", required = true )
    private String pagebutton;

	@Length(max=1,min=0,message="在基本信息页展示不能超出1位")
	@ApiModelProperty(value = "在基本信息页展示", example = "", dataType="char(1)", required = true )
    private String basepageflg;

	@Length(max=1,min=0,message="在审批信息页展示不能超出1位")
	@ApiModelProperty(value = "在审批信息页展示", example = "", dataType="char(1)", required = true )
    private String approvalpageflg;

	@Length(max=10,min=0,message="最后修改人不能超出10位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="char(10)", required = true )
    private String chgtl;

	@Length(max=10,min=0,message="最后修改时间不能超出10位")
	@ApiModelProperty(value = "最后修改时间", example = "", dataType="char(10)", required = true )
    private String chgdt;
}
