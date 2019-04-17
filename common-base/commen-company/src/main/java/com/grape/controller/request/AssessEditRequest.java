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
public class AssessEditRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;

    @NotNull
    @NotEmpty(message = "流水号不能为空")
    @Length(max=10,min=0,message="流水号为10位")
    @ApiModelProperty(value = "流水号", example = "0000000000", required = true)
    private String workid;
    @NotNull
    @NotEmpty(message = "节点不能为空")
   
    @ApiModelProperty(value = "节点", example = "PRD", required = true)
    private String nodeid;
    @NotNull
    @NotEmpty(message = "抵押物编号为空")
    @Length(max=19,min=0,message="抵押物编号为19位")
    @ApiModelProperty(value = "抵押物编号", example = "1808061456587569101", required = true)
    private String mortgageno;
    
    @NotNull
    @NotEmpty(message = "旧评估渠道")
    @ApiModelProperty(value = "旧评估渠道", example = "世联", required = true)
    private String oldchannel;
    
  
    @ApiModelProperty(value = "其他参数", example = "其他", required = true)
    private String otherparam;
    

    @ApiModelProperty(value = "新评估渠道", example = "新世联", required = true)
    private String newchannel;
    
    @NotNull
    @NotEmpty(message = "新渠道评估单价")
    
    @ApiModelProperty(value = "新渠道评估单价", example = "440300.00", required = true)
    private String newprice;
    
    @NotNull
    @NotEmpty(message = "附件名称")
    
    @ApiModelProperty(value = "附件名称", example = "我要改价.jpg", required = true)
    private String filename;
    
   
}
