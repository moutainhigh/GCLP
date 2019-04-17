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
public class OverdueStatBean {

    @ApiModelProperty(value = "逾期天数", required = true)
    private String overdueday;

    @ApiModelProperty(value = "逾期笔数", required = true)
    private BigDecimal count;

    @ApiModelProperty(value = "逾期金额", required = true)
    private BigDecimal sum;

    @ApiModelProperty(value = "当前逾期率", required = true)
    private BigDecimal overdueprob;

    @ApiModelProperty(value = "上月逾期率", required = true)
    private BigDecimal lastoverdueprob;

}
