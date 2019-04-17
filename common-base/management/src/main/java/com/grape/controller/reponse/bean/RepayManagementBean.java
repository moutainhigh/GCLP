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
public class RepayManagementBean {

    @ApiModelProperty(value = "期数", example = "", required = true)
    private Integer repayterm;

    @ApiModelProperty(value = "应还本金", example = "", required = true)
    private BigDecimal repaycapital;

    @ApiModelProperty(value = "应还利息", example = "", required = true)
    private BigDecimal repayaccrual;

    @ApiModelProperty(value = "应还款日期", example = "", required = true)
    private Timestamp repaydate;

    @ApiModelProperty(value = "实还本金", example = "", required = true)
    private BigDecimal refundmoneySum;

    @ApiModelProperty(value = "实还利息", example = "", required = true)
    private BigDecimal refundinterestSum;

    @ApiModelProperty(value = "实际还款日期", example = "", required = true)
    private Timestamp realityrefunddate;

    @ApiModelProperty(value = "应缴罚息", example = "", required = true)
    private BigDecimal defaultinterest;

    @ApiModelProperty(value = "实缴罚息", example = "", required = true)
    private BigDecimal interestmoneySum;

    @ApiModelProperty(value = "罚息缴纳日期", example = "", required = true)
    private Timestamp interestmoneydate;

    @ApiModelProperty(value = "逾期天数", example = "", required = true)
    private Integer overduedays;

    @ApiModelProperty(value = "应缴滞纳金", example = "", required = true)
    private BigDecimal delayingpayment;

    @ApiModelProperty(value = "实缴滞纳金", example = "", required = true)
    private BigDecimal delayingpaymentSum;

    @ApiModelProperty(value = "滞纳金缴纳日期", example = "", required = true)
    private Timestamp delayingpaymentdate;

    @ApiModelProperty(value = "滞纳金天数", example = "", required = true)
    private Integer latefeedays;

    @ApiModelProperty(value = "还款类型", example = "", required = true)
    private String repaymethod;

    @ApiModelProperty(value = "还款状态", example = "", required = true)
    private Integer status;

    public RepayManagementBean(Integer repayterm, BigDecimal repaycapital,
                               BigDecimal repayaccrual, Timestamp repaydate,
                               BigDecimal refundmoneySum, BigDecimal refundinterestSum,
                               BigDecimal defaultinterest, BigDecimal interestmoneySum,
                               Integer overduedays, BigDecimal delayingpayment,
                               BigDecimal delayingpaymentSum, Integer latefeedays, Integer status) {
        super();
        this.repayterm = repayterm;
        this.repaycapital = repaycapital;
        this.repayaccrual = repayaccrual;
        this.repaydate = repaydate;
        this.refundmoneySum = refundmoneySum;
        this.refundinterestSum = refundinterestSum;
        this.defaultinterest = defaultinterest;
        this.interestmoneySum = interestmoneySum;
        this.overduedays = overduedays;
        this.delayingpayment = delayingpayment;
        this.delayingpaymentSum = delayingpaymentSum;
        this.latefeedays = latefeedays;
        this.status = status;
    }

}
