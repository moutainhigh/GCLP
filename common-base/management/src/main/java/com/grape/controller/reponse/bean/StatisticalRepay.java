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
public class StatisticalRepay {

    @ApiModelProperty(value = "剩余天数", required = true)
    private Long reminddays;

    @ApiModelProperty(value = "已还本金", required = true)
    private BigDecimal refundmoneySum;

    @ApiModelProperty(value = "已还利息", required = true)
    private BigDecimal refundinterestSum;

    @ApiModelProperty(value = "应缴罚息", required = true)
    private BigDecimal penaltIinterestSum;

    @ApiModelProperty(value = "已缴滞纳金", required = true)
    private BigDecimal rdelayingSum;

    @ApiModelProperty(value = "已缴违约金", required = true)
    private BigDecimal breachofcontractSum;

    @ApiModelProperty(value = "欠缴本金", required = true)
    private BigDecimal overduecorpusSum;

    @ApiModelProperty(value = "欠缴利息", required = true)
    private BigDecimal overdueaccrualSum;

    @ApiModelProperty(value = "欠缴罚息", required = true)
    private BigDecimal defaultinterestSum;

    @ApiModelProperty(value = "欠缴滞纳金", required = true)
    private BigDecimal odelayingSum;

    @ApiModelProperty(value = "累计逾期天数", required = true)
    private Integer addoverduedaynum;

    @ApiModelProperty(value = "当前提前还款违约金", required = true)
    private BigDecimal breachOfContract;

    @ApiModelProperty(value = "展期差额", required = true)
    private BigDecimal difference;

    public StatisticalRepay(Long reminddays, BigDecimal refundmoneySum,
                            BigDecimal refundinterestSum, BigDecimal penaltIinterestSum,
                            BigDecimal rdelayingSum, BigDecimal breachofcontractSum,
                            BigDecimal overduecorpusSum, BigDecimal overdueaccrualSum,
                            BigDecimal defaultinterestSum, BigDecimal odelayingSum,
                            Integer addoverduedaynum) {
        super();
        this.reminddays = reminddays;
        this.refundmoneySum = refundmoneySum;
        this.refundinterestSum = refundinterestSum;
        this.penaltIinterestSum = penaltIinterestSum;
        this.rdelayingSum = rdelayingSum;
        this.breachofcontractSum = breachofcontractSum;
        this.overduecorpusSum = overduecorpusSum;
        this.overdueaccrualSum = overdueaccrualSum;
        this.defaultinterestSum = defaultinterestSum;
        this.odelayingSum = odelayingSum;
        this.addoverduedaynum = addoverduedaynum;
    }
}
