package com.grape.controller.request;

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
public class OverdueinfoBean{
	
	@ApiModelProperty(value = "授信金额（元）", example = "", required = true)
    private BigDecimal creditamount;
	
	@ApiModelProperty(value = "贷款金额（元）", example = "", required = true)
    private BigDecimal sumofamount;
	
	@ApiModelProperty(value = "贷款利率", example = "", required = true)
    private BigDecimal interestrate;
	
	@ApiModelProperty(value = "贷款年限", example = "", required = true)
    private String loanlimittime;
	
	@ApiModelProperty(value = "还款方式", example = "", required = true)
    private String repaymethod;
	
	@ApiModelProperty(value = "剩余本金（元）", example = "", required = true)
    private BigDecimal loanbalance;
	
	@ApiModelProperty(value = "审批成数", example = "", required = true)
    private BigDecimal Aprob;
	
	@ApiModelProperty(value = "剩余贷款年限", example = "", required = true)
    private Long remainingdays ;
	
	@ApiModelProperty(value = "应还本金（元）", example = "", required = true)
    private BigDecimal overduecorpussum ;
	
	@ApiModelProperty(value = "应还利息（元）", example = "", required = true)
    private BigDecimal overdueaccrualsum;
	
	@ApiModelProperty(value = "应还款日期", example = "", required = true)
    private Timestamp overduedate;
	
	@ApiModelProperty(value = "当前逾期天数（天）", example = "", required = true)
    private Integer overduenum;
	
	@ApiModelProperty(value = "累计逾期天数（天）", example = "", required = true)
    private Integer addoverduedaynum;
	
	/*@ApiModelProperty(value = "当月应缴罚息（元）", example = "", required = true)
    private  ;*/
	
	@ApiModelProperty(value = "累计应缴罚息（元）", example = "", required = true)
    private BigDecimal defaultinterest;
	
}
