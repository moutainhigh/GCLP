package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Digits;

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
public class ChanapprovalformRequest extends RestfulRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=8,min=0,message="建议总授信期限不能超出8位")
	@ApiModelProperty(value = "建议总授信期限", example = "", dataType="varchar(8)", required = true )
    private String suggestuseterm;

	@Digits(integer=12,fraction=5,message="建议总授信额度整数位不能超过12位，小数位不能超出5位")
	@ApiModelProperty(value = "建议总授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal suggestuseamount;

	@Length(max=1,min=0,message="面签是否需要质检不能超出1位")
	@ApiModelProperty(value = "面签是否需要质检", example = "", dataType="char(1)", required = true )
    private String facesignflg;

	@Length(max=1,min=0,message="是否同意期待贷款申请金额不能超出1位")
	@ApiModelProperty(value = "是否同意期待贷款申请金额", example = "", dataType="char(1)", required = true )
    private String agreeexpectloanflg;

	@Digits(integer=3,fraction=6,message="建议申请利率整数位不能超过3位，小数位不能超出6位")
	@ApiModelProperty(value = "建议申请利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal suggestapplyrate;

	@Length(max=2,min=0,message="建议客户等级不能超出2位")
	@ApiModelProperty(value = "建议客户等级", example = "", dataType="varchar(2)", required = true )
    private String suggestleavel;

	@Digits(integer=12,fraction=5,message="建议申请金额整数位不能超过12位，小数位不能超出5位")
	@ApiModelProperty(value = "建议申请金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal suggestapplyamount;

	@Length(max=4,min=0,message="建议申请年限不能超出4位")
	@ApiModelProperty(value = "建议申请年限", example = "", dataType="varchar(4)", required = true )
    private String suggestapplyterm;

	@Length(max=80,min=0,message="建议还款方式不能超出80位")
	@ApiModelProperty(value = "建议还款方式", example = "", dataType="varchar(80)", required = true )
    private String suggestrepayway;

	@Length(max=1000,min=0,message="人工核实意见不能超出1000位")
	@ApiModelProperty(value = "人工核实意见", example = "", dataType="varchar(1000)", required = true )
    private String personchecknote;

	@Length(max=1000,min=0,message="诉讼核实意见不能超出1000位")
	@ApiModelProperty(value = "诉讼核实意见", example = "", dataType="varchar(1000)", required = true )
    private String lawchecknote;

	@Length(max=1000,min=0,message="诉讼情况说明（借款人）不能超出1000位")
	@ApiModelProperty(value = "诉讼情况说明（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String lawnote;

	@Length(max=1000,min=0,message="收入情况说明（借款人）不能超出1000位")
	@ApiModelProperty(value = "收入情况说明（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String incomenote;

	@Length(max=1000,min=0,message="资产情况说明（借款人）不能超出1000位")
	@ApiModelProperty(value = "资产情况说明（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String assetnote;

	@Length(max=1000,min=0,message="负债情况说明（借款人）不能超出1000位")
	@ApiModelProperty(value = "负债情况说明（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String debtnote;

	@Length(max=1000,min=0,message="审批意见不能超出1000位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(1000)", required = true )
    private String natation;

	@Length(max=19,min=0,message="节点不能超出19位")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar(19)", required = true )
    private String nodeid;

	@Length(max=1000,min=0,message="情况说明补充意见不能超出1000位")
	@ApiModelProperty(value = "情况说明补充意见", example = "", dataType="varchar(1000)", required = true )
    private String situationnote;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@ApiModelProperty(value = "审批时间", example = "", dataType="datetime", required = true )
    private Date approvaldate;

	@Digits(integer=3,fraction=6,message="抵押率整数位不能超过3位，小数位不能超出6位")
	@ApiModelProperty(value = "抵押率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgagerate;

	@Digits(integer=3,fraction=6,message="总抵押成数整数位不能超过3位，小数位不能超出6位")
	@ApiModelProperty(value = "总抵押成数", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal totalmortgage;

	@Digits(integer=3,fraction=6,message="抵押费率整数位不能超过3位，小数位不能超出6位")
	@ApiModelProperty(value = "抵押费率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgagefeerate;

	@Length(max=1000,min=0,message="产品说明不能超出1000位")
	@ApiModelProperty(value = "产品说明", example = "", dataType="varchar(1000)", required = true )
    private String productremark;

	@Length(max=1000,min=0,message="其他条件和要求不能超出1000位")
	@ApiModelProperty(value = "其他条件和要求", example = "", dataType="varchar(1000)", required = true )
    private String otheridea;

	@Length(max=1000,min=0,message="抵押物信息审查不能超出1000位")
	@ApiModelProperty(value = "抵押物信息审查", example = "", dataType="varchar(1000)", required = true )
    private String mortgagenote;

	@Length(max=1000,min=0,message="基础信息审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "基础信息审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String baseinfonote;

	@Length(max=1000,min=0,message="贷款信息审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "贷款信息审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String loannote;

	@Length(max=1000,min=0,message="信用记录审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "信用记录审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String creditinfonote;

	@Length(max=1000,min=0,message="征信审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "征信审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String creditinvestnote;

	@Length(max=1000,min=0,message="覆盖情况（借款人）不能超出1000位")
	@ApiModelProperty(value = "覆盖情况（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String revertnote;

	@Length(max=1000,min=0,message="我司还款情况（借款人）不能超出1000位")
	@ApiModelProperty(value = "我司还款情况（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String companyrepaynote;

	@Length(max=500,min=0,message="基本信息审查（担保方）不能超出500位")
	@ApiModelProperty(value = "基本信息审查（担保方）", example = "", dataType="varchar(500)", required = true )
    private String baseinfonote1;

	@Length(max=500,min=0,message="诉讼审查不能超出500位")
	@ApiModelProperty(value = "诉讼审查", example = "", dataType="varchar(500)", required = true )
    private String lownote1;

	@Length(max=500,min=0,message="贷款信息审查不能超出500位")
	@ApiModelProperty(value = "贷款信息审查", example = "", dataType="varchar(500)", required = true )
    private String loaninfonote1;

	@Length(max=500,min=0,message="信用信息审查不能超出500位")
	@ApiModelProperty(value = "信用信息审查", example = "", dataType="varchar(500)", required = true )
    private String creditinfonote1;

	@Length(max=500,min=0,message="征信信息审查不能超出500位")
	@ApiModelProperty(value = "征信信息审查", example = "", dataType="varchar(500)", required = true )
    private String creditinverstnote1;

	@Length(max=500,min=0,message="资产信息审查不能超出500位")
	@ApiModelProperty(value = "资产信息审查", example = "", dataType="varchar(500)", required = true )
    private String assetinfonote1;

	@Length(max=500,min=0,message="负债信息审查不能超出500位")
	@ApiModelProperty(value = "负债信息审查", example = "", dataType="varchar(500)", required = true )
    private String debtinfonote1;

	@Digits(integer=3,fraction=6,message="抵押率整数位不能超过3位，小数位不能超出6位")
	@ApiModelProperty(value = "抵押率（建议授信额度）", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal suggestmortgagerate;

	@Length(max=500,min=0,message="抵押物利率备注不能超出500位")
	@ApiModelProperty(value = "抵押物利率备注", example = "", dataType="varchar(500)", required = true )
    private String mortgageratenote;

	@Digits(integer=3,fraction=6,message="贷后资产负债率整数位不能超过3位，小数位不能超出6位")
	@ApiModelProperty(value = "贷后资产负债率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal afterloandebtrate;

	@Length(max=500,min=0,message="贷后资产负债率备注不能超出500位")
	@ApiModelProperty(value = "贷后资产负债率备注", example = "", dataType="varchar(500)", required = true )
    private String afterloandebtratenote;

	@Digits(integer=12,fraction=5,message="抵押率授信整数位不能超过12位，小数位不能超出5位")
	@ApiModelProperty(value = "抵押率授信", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal mortgagerateamount;

	@Digits(integer=12,fraction=5,message="负债率授信整数位不能超过12位，小数位不能超出5位")
	@ApiModelProperty(value = "负债率授信", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal debtrateamount;

	@Digits(integer=12,fraction=5,message="最高授信额度整数位不能超过12位，小数位不能超出5位")
	@ApiModelProperty(value = "最高授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal maxcreditamount;

	@Digits(integer=12,fraction=5,message="实际授信额度整数位不能超过12位，小数位不能超出5位")
	@ApiModelProperty(value = "实际授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal realcreditamount;

	@Length(max=8,min=0,message="操作不能超出8位")
	@ApiModelProperty(value = "操作", example = "同意", dataType="varchar(8)", required = true )
    private String operation;
	
	@Length(max=8,min=0,message="下一节点操作人不能超出8位")
	@ApiModelProperty(value = "下一节点操作人", example = "FDD00401", dataType="varchar(8)", required = true )
    private String nextactor;
	
	@ApiModelProperty(value = "退回节点", required = false, example="渠道报单")
    private String backNodeid;
	
	@ApiModelProperty(value = "返回类型", required = false, example="1")
    private String backflg;
	
	@ApiModelProperty(value = "审批历史类型", required = false, example="6")
    private String histtype;
	
	@ApiModelProperty(value = "分叉编号", required = true, example="0")
    private String forkid;
	
	@ApiModelProperty(value = "分支编号", required = true, example="0")
    private String branchid;
	
	@ApiModelProperty(value = "流程编号（产品码）", required = true, example="PRD004")
    private String processid;
	
	@Length(max=100,min=0,message="字段选择不能超出100位")
	@ApiModelProperty(value = "字段选择", example = "", dataType="varchar(100)", required = true )
    private String columnselect;

}
