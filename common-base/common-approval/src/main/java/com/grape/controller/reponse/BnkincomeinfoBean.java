package com.grape.controller.reponse;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BnkincomeinfoBean{
	
	@Length(max=17,min=0,message="月流水金额不能超出17位")
	@ApiModelProperty(value = "月流水金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal amount;

	@ApiModelProperty(value = "流水日期", example = "", dataType="datetime", required = true )
    private Date incomedate;
    
}
