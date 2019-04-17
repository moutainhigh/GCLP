package com.grape.controller.response.bean;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChanapprovalBean {
	@Length(max=17,min=0,message="建议总授信额度不能超出17位")
	@ApiModelProperty(value = "总授信金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal suggestuseamount;
	
	@Length(max=17,min=0,message="建议申请金额不能超出17位")
	@ApiModelProperty(value = "贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal suggestapplyamount;

	@Length(max=9,min=0,message="抵押率不能超出9位")
	@ApiModelProperty(value = "抵押率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgagerate;
	
	@Length(max=9,min=0,message="总抵押成数不能超出9位")
	@ApiModelProperty(value = "总抵押成数", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal totalmortgage;
	
	@Length(max=9,min=0,message="服务费率不能超出9位")
	@ApiModelProperty(value = "服务费率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgagefeerate;
	
	@Length(max=8,min=0,message="建议总授信期限不能超出8位")
	@ApiModelProperty(value = "总授信期限", example = "", dataType="varchar(8)", required = true )
    private String suggestuseterm;
	
	@Length(max=4,min=0,message="建议申请年限不能超出4位")
	@ApiModelProperty(value = "贷款期限", example = "", dataType="varchar(4)", required = true )
    private String suggestapplyterm;

	@Length(max=80,min=0,message="建议还款方式不能超出80位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(80)", required = true )
    private String suggestrepayway;

	@Length(max=9,min=0,message="建议申请利率不能超出9位")
	@ApiModelProperty(value = "贷款利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal suggestapplyrate;
	
	@Length(max=1000,min=0,message="其他条件和要求不能超出1000位")
	@ApiModelProperty(value = "其他条件和要求", example = "", dataType="varchar(1000)", required = true )
    private String otheridea;
	
	@Length(max=1000,min=0,message="其他条件和要求不能超出1000位")
	@ApiModelProperty(value = "担保条件", example = "", dataType="varchar(1000)", required = true )
    private String promidea;
}
