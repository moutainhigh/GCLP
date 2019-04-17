package com.grape.controller.bean;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RealpriceBean {

	@Length(max=255,min=0,message="实地挂盘价图片地址不能超出255位")
	@ApiModelProperty(value = "实地挂盘价图片地址", example = "", dataType="varchar(255)", required = true )
    private String realpriceprice;	
	
	@Length(max=10,min=0,message="")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String id;
	
}
