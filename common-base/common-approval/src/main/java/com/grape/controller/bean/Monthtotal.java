package com.grape.controller.bean;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Monthtotal {
	@ApiModelProperty(value="每月流水总计")
	private BigDecimal incomeamount;
	
	@ApiModelProperty(value="月份")
	private String incomedate;
}
