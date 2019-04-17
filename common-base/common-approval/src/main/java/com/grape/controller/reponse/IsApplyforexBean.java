package com.grape.controller.reponse;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class IsApplyforexBean{


	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private boolean isApplyforex;
	
	@ApiModelProperty(value = "房抵贷或者赎楼贷", example = "", dataType="varchar(10)", required = true )
    private String producttype;
	
}
