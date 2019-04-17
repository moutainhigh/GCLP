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
public class AssessUpdateRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;

    @NotNull
    @NotEmpty(message = "流水号为空")
    @Length(max=10,min=0,message="流水号为10位")
    @ApiModelProperty(value = "流水号", example = "0000000000", required = true)
    private String workid;
    
    @NotNull
    @NotEmpty(message = "抵押物编号")
    @Length(max=19,min=0,message="抵押物编号为19位")
    @ApiModelProperty(value = "抵押物编号", example = "1808061456587569101", required = true)
    private String mortgageno;
    
    @NotNull
    @NotEmpty(message = "建筑面积")
   
    @ApiModelProperty(value = "建筑面积", example = "111.11", required = true)
    private String floorarea;
    
    @NotNull
    @NotEmpty(message = "快速成交价")
    
    @ApiModelProperty(value = "快速成交价", example = "42333.78", required = true)
    private String quickprice;
    
    @NotNull
    @NotEmpty(message = "一般成交价")
  
    @ApiModelProperty(value = "一般成交价", example = "44444.34", required = true)
    private String generalprice;

    
   
}
