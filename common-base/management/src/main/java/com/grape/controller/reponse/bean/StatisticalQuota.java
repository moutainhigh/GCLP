package com.grape.controller.reponse.bean;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class StatisticalQuota {

    @ApiModelProperty(value = "总授信额度", required = true)
    private BigDecimal totalquota;

    @ApiModelProperty(value = "剩余授信额度", required = true)
    private BigDecimal remainingquota;

    @ApiModelProperty(value = "本月放款总额", required = true)
    private BigDecimal monthlendingquota;

    @ApiModelProperty(value = "累计放款总额", required = true)
    private BigDecimal totallendingquota;

    @ApiModelProperty(value = "已用额度", required = true)
    private BigDecimal usedquota;

}
