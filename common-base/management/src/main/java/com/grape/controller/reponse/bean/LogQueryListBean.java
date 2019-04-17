package com.grape.controller.reponse.bean;

import java.sql.Timestamp;

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
public class LogQueryListBean {

    @ApiModelProperty(value = "操作时间", required = true)
    private Timestamp chgdt;

    @ApiModelProperty(value = "操作人", required = true)
    private String checktl;

    @ApiModelProperty(value = "模块", required = true)
    private String coddes;

    @ApiModelProperty(value = "日志详情", required = true)
    private String descriptions;

    @ApiModelProperty(value = "IP", required = true)
    private String ref_logid;

}
