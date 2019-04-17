package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WorkflowInfo {
	@ApiModelProperty(value="收入金额列表")
	public List<IncomeAmountBean> amountlist;
	
	@ApiModelProperty(value="收入日期")
	public String incomedate;
	
	@ApiModelProperty(value="月份总收入金额")
	public BigDecimal totammonthamount;
}
