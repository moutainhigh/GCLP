package com.grape.controller.request;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class AssessAddRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;

    @NotNull
    @NotEmpty(message = "流水号不能为空")
    @Length(max=10,min=0,message="流水号为10位")
    @ApiModelProperty(value = "流水号", example = "0000000000", required = true)
    private String workid;
  
    @NotNull
    @NotEmpty(message = "抵押物编号为空")
    @Length(max=19,min=0,message="抵押物编号为19位")
    @ApiModelProperty(value = "抵押物编号", example = "1808061456587569101", required = true)
    private String mortgageno;
    @NotNull
    @NotEmpty(message = "节点")
    @ApiModelProperty(value = "节点", example = "PRD111", required = true)
    private String nodeid;
    @NotNull
    @NotEmpty(message = "评估渠道为空")
    @ApiModelProperty(value = "评估渠道", example = "其他", required = true)
    private String channel;
    
    @NotNull
    @NotEmpty(message = "渠道评估单价")
    @ApiModelProperty(value = "渠道评估单价", example = "44300.00", required = true)
    private String price;
    
    @NotNull
    @NotEmpty(message = "建筑面积")
    @ApiModelProperty(value = "建筑面积", example = "123", required = true)
    private String floor;
    @NotNull
    @NotEmpty(message = "附件名称")
    @ApiModelProperty(value = "附件名称", example = "新增估价.jpg", required = true)
    private String filename;
    
   
}
