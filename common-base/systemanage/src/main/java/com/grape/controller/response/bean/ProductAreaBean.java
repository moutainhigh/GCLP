package com.grape.controller.response.bean;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductAreaBean {
	@Length(max=19,min=0,message="区域id不能超出19位")
	@ApiModelProperty(value = "区域id", example = "", dataType="varchar(19)", required = true )
    private String areaid;
	
	@Length(max=19,min=0,message="区域id不能超出19位")
	@ApiModelProperty(value = "区域名称", example = "", dataType="varchar(19)", required = true )
    private String areaname;

	@Length(max=6,min=0,message="产品id不能超出6位")
	@ApiModelProperty(value = "产品id", example = "", dataType="varchar(6)", required = true )
    private String productno;
	
	@Length(max=80,min=0,message="产品id不能超出80位")
	@ApiModelProperty(value = "产品名称", example = "", dataType="varchar(6)", required = true )
    private String productname;

	@Length(max=80,min=0,message="描述不能超出80位")
	@ApiModelProperty(value = "描述", example = "", dataType="varchar(80)", required = true )
    private String description;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="最后修改人不能超出10位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(10)", required = true )
    private String chgtl;
	
	@Length(max=6,min=0,message="产品类型不能超出6位")
	@ApiModelProperty(value = "产品类型", example = "", dataType="varchar(6)", required = true )
    private String producttype;
	
	@Length(max=6,min=0,message="产品类型名称不能超出6位")
	@ApiModelProperty(value = "产品类型名称", example = "", dataType="varchar(6)", required = true )
    private String producttypename;
}
