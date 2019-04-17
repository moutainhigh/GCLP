package com.grape.controller.request;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

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
//信用记录表
public class CreditrecodeRequest extends RestfulRequest {

	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@ApiModelProperty(value = "征信报告日期", example = "", dataType="datetime", required = true )
    private Date creditreportdate;

	@ApiModelProperty(value = "贷款征信记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofloancredit;

	@ApiModelProperty(value = "贷款征信记录空白情况说明", example = "", dataType="char(1)", required = true )
    private String isblackofcreditcard2;

	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofcreditcard;

	@ApiModelProperty(value = "信用卡征信记录空白情况说明", example = "", dataType="char(1)", required = true )
    private String isblackofloancredit2;

	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "", dataType="char(1)", required = true )
    private String iswarnofcredit2;

	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "", dataType="char(1)", required = true )
    private String iswarnofcredit;

	@ApiModelProperty(value = "当前是否逾期", example = "", dataType="char(1)", required = true )
    private String isoverdue2;

	@ApiModelProperty(value = "当前是否逾期", example = "", dataType="char(1)", required = true )
    private String isoverdue;

	@ApiModelProperty(value = "是否有逾期记录", example = "", dataType="char(1)", required = true )
    private String isrecentoverdue2;

	@Length(max=1,min=0,message="是否有逾期记录不能超出1位")
	@ApiModelProperty(value = "是否有逾期记录", example = "", dataType="char(1)", required = true )
    private String isrecentoverdue;

	@ApiModelProperty(value = "当前逾期是否已结清", example = "", dataType="char(1)", required = true )
    private String overdueclearflg2;

	@ApiModelProperty(value = "当前逾期是否已结清", example = "", dataType="char(1)", required = true )
    private String overdueclearflg;

	@ApiModelProperty(value = "当前逾期笔数", example = "", dataType="varchar(4)", required = true )
    private String overduecount2;

	@ApiModelProperty(value = "当前逾期笔数", example = "", dataType="varchar(4)", required = true )
    private String overduecount;

	@ApiModelProperty(value = "当前逾期天数", example = "", dataType="varchar(10)", required = true )
    private String overdueday2;

	@ApiModelProperty(value = "当前逾期天数", example = "", dataType="varchar(10)", required = true )
    private String overdueday;

	@ApiModelProperty(value = "当前逾期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount2;

	@ApiModelProperty(value = "当前逾期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount;

	@ApiModelProperty(value = "最高逾期次数", example = "", dataType="varchar(10)", required = true )
    private String maxoverduecount2;

	@ApiModelProperty(value = "最高逾期次数", example = "", dataType="varchar(10)", required = true )
    private String maxoverduecount;

	@ApiModelProperty(value = "累计逾期次数", example = "", dataType="varchar(10)", required = true )
    private String totaloverduecount2;

	@ApiModelProperty(value = "最高逾期天数", example = "", dataType="varchar(4)", required = true )
    private String maxoverdueday;

	@Length(max=2,min=0,message="最高逾期天数2不能超出2位")
	@ApiModelProperty(value = "最高逾期天数2", example = "", dataType="varchar(2)", required = true )
    private String maxoverdueday2;

	@ApiModelProperty(value = "累计逾期次数", example = "", dataType="varchar(10)", required = true )
    private String totaloverduecount;

	@ApiModelProperty(value = "是否欠缴年费导致逾期", example = "", dataType="varchar(1)", required = true )
    private String isoverdueforpay;

	@ApiModelProperty(value = "是否欠缴年费导致逾期2", example = "", dataType="varchar(1)", required = true )
    private String isoverdueforpay2;

	@ApiModelProperty(value = "是否有对外担保", example = "", dataType="varchar(1)", required = true )
    private String isguarantee;

	@ApiModelProperty(value = "逾期发生期间", example = "", dataType="varchar(20)", required = true )
    private String overdueperiod;

	@ApiModelProperty(value = "逾期发生期间2", example = "", dataType="varchar(20)", required = true )
    private String overdueperiod2;

	@ApiModelProperty(value = "对外担保是否已结清", example = "", dataType="varchar(1)", required = true )
    private String isclearedup;

	@Length(max=40,min=0,message="对外担保的五级分类不能超出40位")
	@ApiModelProperty(value = "对外担保的五级分类", example = "", dataType="varchar(40)", required = true )
    private String fiveguarantee;

	@ApiModelProperty(value = "征信查询次数", example = "", dataType="varchar(10)", required = true )
    private String frequencyofenquiry;

	@ApiModelProperty(value = "本人查询", example = "", dataType="varchar(10)", required = true )
    private String inquire;

	@ApiModelProperty(value = "贷款审批", example = "", dataType="varchar(10)", required = true )
    private String loanapproval;

	@ApiModelProperty(value = "信用卡记录", example = "", dataType="varchar(10)", required = true )
    private String creditapproval;

	@ApiModelProperty(value = "贷后管理", example = "", dataType="varchar(10)", required = true )
    private String postloanmana;

	@ApiModelProperty(value = "担保资格审查", example = "", dataType="varchar(10)", required = true )
    private String gqexamination;
	
    private static final long serialVersionUID = 1L;

  
}
