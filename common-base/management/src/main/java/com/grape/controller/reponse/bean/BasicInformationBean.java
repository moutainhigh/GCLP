package com.grape.controller.reponse.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class BasicInformationBean {
	
	@ApiModelProperty(value = "抵押人", example = "", required = true)
	private List<String> mortgagor;
	
	@ApiModelProperty(value = "主借款人", example = "", required = true)
    private String custname;
	
	@ApiModelProperty(value = "合同编号", example = "", required = true )
    private String contractno;
	
	@ApiModelProperty(value = "流水编号", example = "", required = true )
    private String workid;
	
	@ApiModelProperty(value = "城市", example = "", required = true )
    private String areaname;

	@ApiModelProperty(value = "渠道商", example = "", required = true )
    private String organizationname;
	
	@ApiModelProperty(value = "业务类型", example = "", required = true )
    private String coddes;
	
	@ApiModelProperty(value = "产品", example = "", required = true )
    private String productname;
	
	@ApiModelProperty(value = "主办", example = "", required = true )
    private String workername;
	
	@ApiModelProperty(value = "总授信金额", example = "", required = true )
    private BigDecimal totaluseamount;

	@ApiModelProperty(value = "总授信期限", example = "", required = true )
    private String totaluseterm;
	
	@ApiModelProperty(value = "贷款金额", example = "", required = true )
    private BigDecimal sumofamount;

	@ApiModelProperty(value = "申请利率", example = "", required = true )
    private BigDecimal interestrate;

	@ApiModelProperty(value = "申请年限", example = "", required = true )
    private String loanlimittime;

	@ApiModelProperty(value = "还款方式", example = "", required = true )
    private String repaymethod;

	@ApiModelProperty(value = "审批成数", example = "", required = true )
    private BigDecimal cvs;
	
	@ApiModelProperty(value = "放款日期", example = "", required = true )
    private Timestamp firstloandate;
	
	@ApiModelProperty(value = "到期日期", example = "", required = true )
    private Timestamp maturitydate;
	
	@ApiModelProperty(value = "结清日期", example = "", required = true )
    private Timestamp settledate;
	
	@ApiModelProperty(value = "剩余本金", example = "", required = true )
    private BigDecimal loanbalance;
	
	@ApiModelProperty(value = "剩余贷款期数", example = "", required = true )
    private Long remainingdays;
	
	@ApiModelProperty(value = "打/划款账户名", example = "", required = true )
    private String accountname;
	
	@ApiModelProperty(value = "打/划款账号", example = "", required = true )
    private String account;
	
	@ApiModelProperty(value = "打/划款开户行", example = "", required = true )
    private String bnk;
	
	@ApiModelProperty(value = "还款账户名", example = "", required = true )
    private String repayaccountname;
	
	@ApiModelProperty(value = "还款账号", example = "", required = true )
    private String repayaccount;
	
	@ApiModelProperty(value = "还款开户行", example = "", required = true )
    private String repayaccountbnk;
	
	@ApiModelProperty(value = "借款用途", example = "", required = true )
    private String usageofloan;
	
	@ApiModelProperty(value = "用款计划说明", example = "", required = true )
    private String usageloanplan;
	
	@ApiModelProperty(value = "还款来源", example = "", required = true )
    private String repaysource;
	
	@ApiModelProperty(value = "还款计划说明", example = "", required = true )
    private String repayplan;

}
