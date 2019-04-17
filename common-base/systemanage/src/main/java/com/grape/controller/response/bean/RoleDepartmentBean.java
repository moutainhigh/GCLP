package com.grape.controller.response.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RoleDepartmentBean {

    @ApiModelProperty(value = "person name", example = "", dataType="", required = true )
    private List<String> namelist;

    @ApiModelProperty(value = "role", example = "", dataType="", required = true )
    private String role;

    @ApiModelProperty(value = "department", example = "", dataType="", required = true )
    private String person;
}
