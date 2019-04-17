package com.grape.controller.reponse.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

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
public class SeeQuotaListBean{

	@ApiModelProperty(value = "企业ID", example = "", required = true)
    private String organizationno;
	
	@ApiModelProperty(value = "企业名字", example = "", required = true)
    private String organizationname;
	
	@ApiModelProperty(value = "企业类型", example = "", required = true)
    private String orgbelongsto;
	
	@ApiModelProperty(value = "总授信额度", example = "", required = true)
    private BigDecimal totalcreditline;
	
	@ApiModelProperty(value = "已用抵押额度", example = "", required = true)
    private BigDecimal mortgageamount;
	
	@ApiModelProperty(value = "已用赎楼额度", example = "", required = true)
    private BigDecimal foreclosurefloorlines;
	
	@ApiModelProperty(value = "剩余授信额度", example = "", required = true)
    private BigDecimal remainingamount;
	
	@ApiModelProperty(value = "账户金额", example = "", required = true)
    private BigDecimal accountremian;
	
	@ApiModelProperty(value = "冻结保证金金额", example = "", required = true)
    private BigDecimal freezeamount;
	
	@ApiModelProperty(value = "保证金余额", example = "", required = true)
    private BigDecimal marginbalance;
	
	@ApiModelProperty(value = "更新时间", example = "", required = true)
    private Timestamp chgdt;
	
	@ApiModelProperty(value = "账户编号", example = "", required = true)
    private String accountno;
	
	@ApiModelProperty(value = "本月放款总额", example = "", required = true)
    private BigDecimal monthlendingquota;
	
	@ApiModelProperty(value = "累计放款总额", example = "", required = true)
	private BigDecimal totallendingquota;
	
	@ApiModelProperty(value = "抵押授信额度", example = "", required = true)
    private BigDecimal mortgageratio;
	
	@ApiModelProperty(value = "赎楼授信额度", example = "", required = true)
	private BigDecimal foreclosurefloorratio;
	
}
