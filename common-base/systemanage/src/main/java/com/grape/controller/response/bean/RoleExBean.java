package com.grape.controller.response.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class RoleExBean {
    @Length(max=4,min=0,message="角色编号不能超出4位")
    @ApiModelProperty(value = "角色编号", example = "", dataType="varchar(4)", required = true )
    private String roleid;

    @Length(max=80,min=0,message="角色名称不能超出80位")
    @ApiModelProperty(value = "角色名称", example = "", dataType="varchar(80)", required = true )
    private String rolename;

    private String useflg;
}
