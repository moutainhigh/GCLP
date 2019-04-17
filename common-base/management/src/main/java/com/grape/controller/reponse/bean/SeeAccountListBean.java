package com.grape.controller.reponse.bean;

import java.math.BigDecimal;

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
public class SeeAccountListBean{

	@ApiModelProperty(value = "企业ID", example = "", required = true)
    private String organizationno;
	
	@ApiModelProperty(value = "企业名字", example = "", required = true)
    private String organizationname;
	
	@ApiModelProperty(value = "单笔保证金", example = "", required = true)
	private BigDecimal singledepositSum;
	
	@ApiModelProperty(value = "履约保证金", example = "", required = true)
    private BigDecimal marginbalanceSum;
	
	@ApiModelProperty(value = "备用金", example = "", required = true)
    private BigDecimal accountremianSum;
	
}
