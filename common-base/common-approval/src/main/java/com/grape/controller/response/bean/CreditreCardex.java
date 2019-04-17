package com.grape.controller.response.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreditreCardex {
	@Length(max=32,min=0,message="")
	@ApiModelProperty(value = "债务人", example = "", dataType="varchar(32)", required = true )
    private String custname;

	@ApiModelProperty(value = "对外担保是否已结清", example = "", dataType="varchar(1)", required = true )
    private String isclearedup;

	@Length(max=40,min=0,message="对外担保的五级分类不能超出40位")
	@ApiModelProperty(value = "对外担保的五级分类", example = "", dataType="varchar(40)", required = true )
    private String fiveguarantee;
}
