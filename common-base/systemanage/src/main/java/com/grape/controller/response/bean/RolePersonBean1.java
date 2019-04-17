package com.grape.controller.response.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Getter
@Setter
public class RolePersonBean1 {
	@Length(max=80,min=0,message="角色名称不能超出80位")
    @ApiModelProperty(value = "角色名称", example = "", dataType="varchar(80)", required = true )
    private String rolename;


    @Length(max=80,min=0,message="角色名称不能超出80位")
    @ApiModelProperty(value = "名称", example = "", dataType="varchar(80)", required = true )
    private String workername ;
}
