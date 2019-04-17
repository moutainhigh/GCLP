package com.grape.controller.response.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreditreCode {

	@Length(max=32,min=0,message="")
	@ApiModelProperty(value = "债务人", example = "", dataType="varchar(32)", required = true )
    private String custname;
	
	@Length(max=20,min=0,message="逾期发生期间不能超出20位")
	@ApiModelProperty(value = "逾期发生期间", example = "", dataType="varchar(20)", required = true )
    private String overdueperiod;
	
	@Length(max=10,min=0,message="累计逾期次数不能超出10位")
	@ApiModelProperty(value = "累计逾期次数", example = "", dataType="varchar(10)", required = true )
    private String totaloverduecount;
	
	@Length(max=4,min=0,message="最高逾期天数不能超出4位")
	@ApiModelProperty(value = "最高逾期天数", example = "", dataType="varchar(4)", required = true )
    private String maxoverdueday;
	
	@Length(max=1,min=0,message="当前是否逾期不能超出1位")
	@ApiModelProperty(value = "当前是否逾期", example = "", dataType="char(1)", required = true )
    private String isoverdue;
	
	@Length(max=4,min=0,message="当前逾期笔数不能超出4位")
	@ApiModelProperty(value = "当前逾期笔数", example = "", dataType="varchar(4)", required = true )
    private String overduecount;
	
	@Length(max=17,min=0,message="当前逾期金额不能超出17位")
	@ApiModelProperty(value = "当前逾期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount;
	
	@ApiModelProperty(value = "征信报告日期", example = "", dataType="datetime", required = true )
    private Date creditreportdate;
	
	@Length(max=1,min=0,message="是否有逾期记录不能超出1位")
	@ApiModelProperty(value = "是否有逾期记录", example = "", dataType="char(1)", required = true )
    private String isrecentoverdue;
	
	@Length(max=1,min=0,message="是否有对外担保不能超出1位")
	@ApiModelProperty(value = "是否有对外担保", example = "", dataType="varchar(1)", required = true )
    private String isguarantee;
	
	@ApiModelProperty(value = "贷款信息审查", example = "", dataType="varchar(1)", required = true )
    private String creditinvestnote;
}
