package com.grape.controller.request;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BnkIncomeRequest extends RestfulRequest{

	private static final long serialVersionUID = 1L;
	
	@Length(max=80,min=0,message="所属银行不能超出80位")
	@ApiModelProperty(value = "所属银行", example = "", dataType="varchar(80)", required = true )
    private String bnkname;

	@Length(max=17,min=0,message="月流水金额不能超出17位")
	@ApiModelProperty(value = "月流水金额", example = "", dataType="decimal(17,5)", required = true )
    private String amount;

	@Length(max=19,min=0,message="银行账户不能超出19位")
	@ApiModelProperty(value = "银行账户", example = "", dataType="varchar(19)", required = true )
    private String bnkaccount;
	
	@Length(max=80,min=0,message="其他所属银行不能超出80位")
	@ApiModelProperty(value = "其他所属银行", example = "", dataType="varchar(80)", required = true )
    private String banname2;
	
	@Length(max=40,min=0,message="薪资来源不能超出40位")
	@ApiModelProperty(value = "薪资来源", example = "", dataType="varchar(40)", required = true )
    private String amountsource;

	@Length(max=4,min=0,message="收入计算方式不能超出4位")
	@ApiModelProperty(value = "收入计算方式", example = "", dataType="varchar(4)", required = true )
    private String incomeway;

}
