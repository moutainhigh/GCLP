package com.grape.controller.response.bean;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustruleByOptionBean {
    @Length(max=8,min=0,message="状态不能超出8位")
    @ApiModelProperty(value = "状态", example = "", dataType="char(8)", required = true )
    private String status;

    @Length(max=16,min=0,message="规则名字不能超出16位")
    @ApiModelProperty(value = "规则名字", example = "", dataType="varchar(16)", required = true )
    private String rulename ;
    
    private Integer pagenum;
    
    private Integer pagesize;
}
