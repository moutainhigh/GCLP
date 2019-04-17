package com.grape.controller.reponse.bean;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RepayplanmainBean{
	
	@ApiModelProperty(value = "客户名称", example = "", required = true)
    private String custname;
	
	@ApiModelProperty(value = "批复本金", example = "", required = true)
    private BigDecimal sumofamount;
	
	@ApiModelProperty(value = "成数", example = "", required = true)
    private BigDecimal cvs;
	
	@ApiModelProperty(value = "总授信金额", example = "", required = true)
    private BigDecimal totaluseamount;
	
	@ApiModelProperty(value = "总授信期限", example = "", required = true)
    private String totaluseterm;
	
	@ApiModelProperty(value = "批复期数", example = "", required = true)
    private String loanlimittime;
	
	@ApiModelProperty(value = "批复利率", example = "", required = true)
    private BigDecimal interestrate;
	
	@ApiModelProperty(value = "批复利率类型", example = "", required = true)
    private String icoddes;
	
	@ApiModelProperty(value = "名义利率", example = "", required = true)
    private BigDecimal realinterestrate;
	
	@ApiModelProperty(value = "名义利率类型", example = "", required = true)
    private String rcoddes;
	
	@ApiModelProperty(value = "还款银行", example = "", required = true)
    private String repayaccountbnk;
	
	@ApiModelProperty(value = "还款户名", example = "", required = true)
    private String repayaccountname;
	
	@ApiModelProperty(value = "还款账号", example = "", required = true)
    private String repayaccount;
	
	@ApiModelProperty(value = "还款方式", example = "", required = true)
    private String repaymethod;
	
	@ApiModelProperty(value = "字符成数", example = "", required = true)
    private String strcvs;

	public RepayplanmainBean(String custname, BigDecimal sumofamount,
			BigDecimal cvs, BigDecimal totaluseamount, String totaluseterm,
			String loanlimittime, BigDecimal interestrate, String icoddes,
			BigDecimal realinterestrate, String rcoddes,
			String repayaccountbnk, String repayaccountname,
			String repayaccount, String repaymethod) {
		super();
		this.custname = custname;
		this.sumofamount = sumofamount;
		this.cvs = cvs;
		this.totaluseamount = totaluseamount;
		this.totaluseterm = totaluseterm;
		this.loanlimittime = loanlimittime;
		this.interestrate = interestrate;
		this.icoddes = icoddes;
		this.realinterestrate = realinterestrate;
		this.rcoddes = rcoddes;
		this.repayaccountbnk = repayaccountbnk;
		this.repayaccountname = repayaccountname;
		this.repayaccount = repayaccount;
		this.repaymethod = repaymethod;
	}
}
