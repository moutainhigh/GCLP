package com.grape.controller.response.bean;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreditreNum {


	@Length(max=32,min=0,message="")
	@ApiModelProperty(value = "债务人", example = "", dataType="varchar(32)", required = true )
    private String custname;
	
	@Length(max=10,min=0,message="本人查询不能超出10位")
	@ApiModelProperty(value = "本人查询", example = "", dataType="varchar(10)", required = true )
    private String inquire;
	
	@Length(max=10,min=0,message="贷款审批不能超出10位")
	@ApiModelProperty(value = "贷款审批", example = "", dataType="varchar(10)", required = true )
    private String loanapproval;
	
	@Length(max=10,min=0,message="信用卡记录不能超出10位")
	@ApiModelProperty(value = "信用卡记录", example = "", dataType="varchar(10)", required = true )
    private String creditapproval;
	
	@Length(max=10,min=0,message="贷后管理不能超出10位")
	@ApiModelProperty(value = "贷后管理", example = "", dataType="varchar(10)", required = true )
    private String postloanmana;
	
	@Length(max=10,min=0,message="担保资格审查不能超出10位")
	@ApiModelProperty(value = "担保资格审查", example = "", dataType="varchar(10)", required = true )
    private String gqexamination;
	
	@ApiModelProperty(value = "贷款信息审查", example = "", dataType="varchar(1)", required = true )
    private String creditinvestnote;
}
