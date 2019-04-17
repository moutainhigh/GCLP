package com.grape.controller.response.bean;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Creditrecordbeans {
	@Length(max=1,min=0,message="贷款征信记录是否空白不能超出1位")
	@ApiModelProperty(value = "贷款征信记录是否空白", example = "Y", dataType="char(1)", required = true )
    private String isblackofloancredit;
	
	@Length(max=1,min=0,message="信用卡征信记录是否空白不能超出1位")
	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "Y", dataType="char(1)", required = true )
    private String isblackofcreditcard;
	
	@Length(max=1000,min=0,message="贷款信息审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "贷款信息审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String loannote;
	
	@Length(max=1,min=0,message="近24个月内是否有逾期记录不能超出1位")
	@ApiModelProperty(value = "近24个月内是否有逾期记录", example = "Y", dataType="char(1)", required = true )
    private String isrecentoverdue;
	
	@Length(max=1,min=0,message="是否有对外担保不能超出1位")
	@ApiModelProperty(value = "是否有对外担保", example = "", dataType="varchar(1)", required = true )
    private String isguarantee;
	
	@Length(max=500,min=0,message="信用信息审查不能超出500位")
	@ApiModelProperty(value = "信用信息审查", example = "", dataType="varchar(500)", required = true )
    private String creditinfonote;
	
	@Length(max=1,min=0,message="近24个月内是否有逾期记录不能超出1位")
	@ApiModelProperty(value = "近24个月内是否有逾期记录", example = "Y", dataType="char(1)", required = true )
    private String isrecentoverdue2;
	
	@Length(max=500,min=0,message="征信信息审查不能超出500位")
	@ApiModelProperty(value = "征信信息审查", example = "", dataType="varchar(500)", required = true )
    private String creditinverstnote;
	
	@Length(max=4,min=0,message="最高逾期天数不能超出4位")
	@ApiModelProperty(value = "最高逾期天数", example = "", dataType="varchar(4)", required = true )
    private String maxoverdueday;
	
	@Length(max=4,min=0,message="当前逾期笔数不能超出4位")
	@ApiModelProperty(value = "累积逾期次数", example = "", dataType="varchar(4)", required = true )
    private String sumoverduecount;
	
		@ApiModelProperty(value = "贷款征信", required = true,example="")
	    private List<CreditreCard> creditreCard;
		
		@ApiModelProperty(value = "贷款征信", required = true,example="")
	    private List<CreditreCardex> creditreCardex;
	    
	    @ApiModelProperty(value = "信用卡", required = true,example="")
	    private List<CreditreCode> creditreCode;
	    
	    @ApiModelProperty(value = "信用卡", required = true,example="")
	    private List<CreditreCodeex> creditreCodeex;
	    
	    @ApiModelProperty(value = "查询", required = true,example="")
	    private List<CreditreNum> creditreNum;
}
