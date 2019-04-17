package com.grape.controller.bean;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductexBean {
	@ApiModelProperty(value = "合同编号", example = "", dataType="varchar(200)", required = true )
    private String contractno;

	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;
	
	@ApiModelProperty(value = "业务类型", example = "", dataType="varchar(6)", required = true )
    private String producttype;
	
	@ApiModelProperty(value = "主办", example = "", dataType="", required = true )
    private String workername;
	
	@ApiModelProperty(value = "产品", example = "", dataType="varchar(6)", required = true )
    private String productname;
	
	@ApiModelProperty(value = "渠道方", example = "", dataType="varchar(6)", required = true )
    private String organizationname;
	
	@ApiModelProperty(value = "城市", example = "", dataType="varchar(19)", required = true )
    private String areaname;
	
	@ApiModelProperty(value = "评级", example = "", dataType="", required = true )
    private String level;
	
	@ApiModelProperty(value = "产品说明", example = "", dataType="varchar(1000)", required = true )
    private String productremark;
}
