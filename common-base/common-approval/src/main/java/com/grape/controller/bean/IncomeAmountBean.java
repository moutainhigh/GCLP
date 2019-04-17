package com.grape.controller.bean;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IncomeAmountBean {
	@ApiModelProperty(value="月收入金额")
	private BigDecimal amount;
	
	@ApiModelProperty(value="银行账号拼接中文")
	private String bnkincomeofch;
}
