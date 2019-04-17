package com.grape.controller.reponse.bean;

import java.math.BigDecimal;
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
public class RepaymenthistoryBean{
	
	@ApiModelProperty(value = "还本金额", example = "", required = true)
    private BigDecimal refundmoney;
	
	@ApiModelProperty(value = "还息金额", example = "", required = true)
    private BigDecimal refundinterest;
	
	@ApiModelProperty(value = "还款时间", example = "", required = true)
    private Timestamp realityrefunddate;
	
	@ApiModelProperty(value = "罚息金额", example = "", required = true)
    private BigDecimal interestmoney;
	
	@ApiModelProperty(value = "罚息时间", example = "", required = true)
    private Timestamp interestmoneydate;
	
	@ApiModelProperty(value = "滞纳金额", example = "", required = true)
    private BigDecimal delayingpayment;
	
	@ApiModelProperty(value = "滞纳时间", example = "", required = true)
    private Timestamp delayingpaymentdate;
	
}
