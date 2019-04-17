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
public class SeeTradingBean{
	
	@ApiModelProperty(value = "交易时间", example = "", required = true)
    private Timestamp transtime;
	
	@ApiModelProperty(value = "明细", example = "", required = true)
    private BigDecimal transamount;
	
	@ApiModelProperty(value = "备注", example = "", required = true)
    private String tradingnote;
	
	@ApiModelProperty(value = "操作人", example = "", required = true)
    private String dealman;
	
	
}
