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
public class RepaymentplanBean{
	
	@ApiModelProperty(value = "期数", example = "", required = true)
    private Integer repayterm;
	
	@ApiModelProperty(value = "应还本息", example = "", required = true)
    private BigDecimal repayamount;
	
	@ApiModelProperty(value = "应还本金", example = "", required = true)
    private BigDecimal repaycapital;
	
	@ApiModelProperty(value = "应还利息", example = "", required = true)
    private BigDecimal repayaccrual;
	
	@ApiModelProperty(value = "贷款余额", example = "", required = true)
    private BigDecimal loanbalance;
	
}
