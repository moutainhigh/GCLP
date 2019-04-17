package com.grape.controller.reponse;

import java.math.BigDecimal;
import java.util.List;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Repaynotation{
	@ApiModelProperty(value="产品名称")
	private String productname;
	@ApiModelProperty(value="借款人")
	private String custname;
	@ApiModelProperty(value="借款金额")
	private BigDecimal loanamount;
	@ApiModelProperty(value="贷款利率")
	private BigDecimal loanrate;
	@ApiModelProperty(value="总授信额度")
	private BigDecimal totalamount;
	@ApiModelProperty(value="总授信期限")
	private String totalterm;
	@ApiModelProperty(value="贷款期限")
	private String loanterm;
	@ApiModelProperty(value="审批意见")
	private List<String> notation;
}
