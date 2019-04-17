package com.grape.controller.response.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class RolePersonBean {
	@Length(max=80,min=0,message="角色名称不能超出80位")
    @ApiModelProperty(value = "角色名称", example = "", dataType="varchar(80)", required = true )
    private String rolename;

    @Length(max=80,min=0,message="角色id不能超出80位")
    @ApiModelProperty(value = "角色id", example = "", dataType="varchar(80)", required = true )
    private String roleid;
	
    List<String> workername ;
}
