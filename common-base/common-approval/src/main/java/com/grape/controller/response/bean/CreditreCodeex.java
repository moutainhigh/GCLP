package com.grape.controller.response.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreditreCodeex {
	@Length(max=32,min=0,message="")
	@ApiModelProperty(value = "债务人", example = "", dataType="varchar(32)", required = true )
    private String custname;
	
	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "", dataType="char(1)", required = true )
    private String iswarnofcredit;
	
	@ApiModelProperty(value = "是否欠缴年费导致逾期", example = "", dataType="varchar(1)", required = true )
    private String isoverdueforpay;
}
