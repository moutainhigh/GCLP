package com.grape.controller.reponse.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class UserOfOrgBean {

    @ApiModelProperty(value = "用户编号", required = true)
    private String workerid;

    @ApiModelProperty(value = "直属上司", required = true)
    private String supervisor;

    @ApiModelProperty(value = "用户级别", required = true)
    private String plevel;

    @ApiModelProperty(value = "部门编号", required = true)
    private String departmentno;

    @ApiModelProperty(value = "部门级别", required = true)
    private String dlevel;

    @ApiModelProperty(value = "企业编号", required = true)
    private String organizationno;

    @ApiModelProperty(value = "企业类型", required = true)
    private String orgbelongsto;
}
