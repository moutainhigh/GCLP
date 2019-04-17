package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

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
public class RefundfinanceRequest extends RestfulRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=19,min=0,message="主键不能超出19位")
	@ApiModelProperty(value = "主键", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="审批历史关联id不能超出19位")
	@ApiModelProperty(value = "审批历史关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Digits(integer=12,fraction=5,message="服务费收取金额不能超出17位")
	@ApiModelProperty(value = "服务费收取金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal serveramount;

	@ApiModelProperty(value = "服务费收取日期", example = "", dataType="datetime", required = true )
    private Date serverdate;

	@Digits(integer=12,fraction=5,message="审查费费用不能超出17位")
	@ApiModelProperty(value = "审查费费用", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal approvalamount;

	@ApiModelProperty(value = "审查费收取日期", example = "", dataType="datetime", required = true )
    private Date approvaldate;

	@Digits(integer=12,fraction=5,message="提前放款保证金不能超出17位")
	@ApiModelProperty(value = "提前放款保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal prepaymentamount;

	@ApiModelProperty(value = "提前放款保证金收取日期", example = "", dataType="datetime", required = true )
    private Date prepaymemtdate;

	@Digits(integer=12,fraction=5,message="利息金额不能超出17位")
	@ApiModelProperty(value = "利息金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal rateamount;

	@ApiModelProperty(value = "利息收取金额", example = "", dataType="datetime", required = true )
    private Date ratedate;

	@Digits(integer=12,fraction=5,message="本金金额不能超出17位")
	@ApiModelProperty(value = "本金金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal loanamount;

	@ApiModelProperty(value = "本金收取日期", example = "", dataType="datetime", required = true )
    private Date loandate;

	@Length(max=2000,min=0,message="审批意见不能超出2000位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(2000)", required = true )
    private String notation;
	
	@Length(max=10,min=0,message="节点不能超出10位")
	@ApiModelProperty(value = "节点", example = "FDD001", dataType="varchar(10)", required = true )
    private String nodeid;
	
	@Length(max=8,min=0,message="操作不能超出8位")
	@ApiModelProperty(value = "操作", example = "同意", dataType="varchar(8)", required = true )
    private String operation;
	
	@Length(max=8,min=0,message="下一节点操作人不能超出8位")
	@ApiModelProperty(value = "下一节点操作人", example = "FDD00401", dataType="varchar(8)", required = true )
    private String nextactor;
}
