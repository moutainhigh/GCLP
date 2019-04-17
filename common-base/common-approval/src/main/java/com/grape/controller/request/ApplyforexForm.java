package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplyforexForm {

	@Length(max=80,min=0,message="客户名称不能超出80位")
    @ApiModelProperty(value = "客户名称", example = "李四", required = true)
    private String custname;
	
	@NotNull
	@Length(max=32,min=0,message="身份证号不能超出32位")
    @NotEmpty(message = "身份证号不能为空")
    @ApiModelProperty(value = "身份证号", example = "360721197606092416", required = true)
    private String cerdid;
	
	@Length(max=9,min=0,message="批复利率不能超出9位")
	@ApiModelProperty(value = "批复利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestrate;
	
}
