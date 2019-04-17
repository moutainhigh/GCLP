package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class CreditrecordRequest extends RestfulRequest{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@NotBlank
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "0000000001", dataType="varchar(10)", required = true )
    private String workid;

	@NotNull
	@NotBlank
	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "99999999999999999", dataType="varchar(32)", required = true )
    private String cerdid;

	@ApiModelProperty(value = "征信报告日期", example = "2019-09-09", dataType="datetime", required = true )
    private Date creditreportdate;

	@Length(max=1,min=0,message="贷款征信记录是否空白不能超出1位")
	@ApiModelProperty(value = "贷款征信记录是否空白", example = "Y", dataType="char(1)", required = true )
    private String isblackofloancredit;

	@Length(max=1,min=0,message="信用卡征信记录是否空白不能超出1位")
	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "Y", dataType="char(1)", required = true )
    private String isblackofcreditcard2;

	@Length(max=1,min=0,message="信用卡征信记录是否空白不能超出1位")
	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "Y", dataType="char(1)", required = true )
    private String isblackofcreditcard;

	@Length(max=1,min=0,message="信用卡征信记录是否空白不能超出1位")
	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "Y", dataType="char(1)", required = true )
    private String isblackofloancredit2;

	@Length(max=1,min=0,message="信用记录是否包含止付、冻结、呆账不能超出1位")
	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "Y", dataType="char(1)", required = true )
    private String iswarnofcredit2;

	@Length(max=1,min=0,message="信用记录是否包含止付、冻结、呆账不能超出1位")
	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "Y", dataType="char(1)", required = true )
    private String iswarnofcredit;

	@Length(max=1,min=0,message="当前是否逾期不能超出1位")
	@ApiModelProperty(value = "当前是否逾期", example = "Y", dataType="char(1)", required = true )
    private String isoverdue2;

	@Length(max=1,min=0,message="当前是否逾期不能超出1位")
	@ApiModelProperty(value = "当前是否逾期", example = "Y", dataType="char(1)", required = true )
    private String isoverdue;

	@Length(max=1,min=0,message="近24个月内是否有逾期记录不能超出1位")
	@ApiModelProperty(value = "近24个月内是否有逾期记录", example = "Y", dataType="char(1)", required = true )
    private String isrecentoverdue2;

	@Length(max=1,min=0,message="近24个月内是否有逾期记录不能超出1位")
	@ApiModelProperty(value = "近24个月内是否有逾期记录", example = "Y", dataType="char(1)", required = true )
    private String isrecentoverdue;

	@Length(max=1,min=0,message="当前逾期是否已结清不能超出1位")
	@ApiModelProperty(value = "当前逾期是否已结清", example = "Y", dataType="char(1)", required = true )
    private String overdueclearflg2;

	@Length(max=1,min=0,message="当前逾期是否已结清不能超出1位")
	@ApiModelProperty(value = "当前逾期是否已结清", example = "Y", dataType="char(1)", required = true )
    private String overdueclearflg;

	@Length(max=4,min=0,message="当前逾期笔数不能超出4位")
	@ApiModelProperty(value = "当前逾期笔数", example = "12", dataType="varchar(4)", required = true )
    private String overduecount2;

	@Length(max=4,min=0,message="当前逾期笔数不能超出4位")
	@ApiModelProperty(value = "当前逾期笔数", example = "12", dataType="varchar(4)", required = true )
    private String overduecount;

	@Length(max=10,min=0,message="当前逾期天数不能超出10位")
	@ApiModelProperty(value = "当前逾期天数", example = "1", dataType="varchar(10)", required = true )
    private String overdueday2;

	@Length(max=10,min=0,message="当前逾期天数不能超出10位")
	@ApiModelProperty(value = "当前逾期天数", example = "1", dataType="varchar(10)", required = true )
    private String overdueday;

	@Length(max=17,min=0,message="当前逾期金额不能超出17位")
	@ApiModelProperty(value = "当前逾期金额", example = "10000", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount2;

	@Length(max=17,min=0,message="当前逾期金额不能超出17位")
	@ApiModelProperty(value = "当前逾期金额", example = "10000", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount;

	@Length(max=10,min=0,message="最高逾期次数不能超出10位")
	@ApiModelProperty(value = "最高逾期次数", example = "1", dataType="varchar(10)", required = true )
    private String maxoverduecount2;

	@Length(max=10,min=0,message="最高逾期次数不能超出10位")
	@ApiModelProperty(value = "最高逾期次数", example = "1", dataType="varchar(10)", required = true )
    private String maxoverduecount;

	@Length(max=10,min=0,message="累计逾期次数不能超出10位")
	@ApiModelProperty(value = "累计逾期次数", example = "1", dataType="varchar(10)", required = true )
    private String totaloverduecount2;

	@Length(max=10,min=0,message="累计逾期次数不能超出10位")
	@ApiModelProperty(value = "累计逾期次数", example = "1", dataType="varchar(10)", required = true )
    private String totaloverduecount;
	
	
	
}
