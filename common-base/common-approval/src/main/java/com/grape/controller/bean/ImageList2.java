package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageList2 {
	
	@Length(max=255,min=0,message="地址不能超出255位")
	@ApiModelProperty(value = "地址", example = "", dataType="varchar(255)", required = true )
    private String picture;
	
	@Length(max=10,min=0,message="")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String id;
		
}
