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
public class StatisticalAreaQuota{

	@ApiModelProperty(value = "总授信额度", example = "", required = true)
    private BigDecimal totalcreditline;
	
	@ApiModelProperty(value = "本月放款总额", example = "", required = true)
    private BigDecimal monthlendingquota;
	
	@ApiModelProperty(value = "累计放款总额", example = "", required = true)
    private BigDecimal totallendingquota;
	
}
