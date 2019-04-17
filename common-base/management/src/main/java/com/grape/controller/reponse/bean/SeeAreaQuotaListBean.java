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
public class SeeAreaQuotaListBean{
	
	@ApiModelProperty(value = "城市", example = "", required = true)
    private String areaname;
	
	@ApiModelProperty(value = "本月放款总额", example = "", required = true)
    private BigDecimal monthlendingquota;
	
	@ApiModelProperty(value = "累计放款总额", example = "", required = true)
    private BigDecimal totallendingquota;
	
}
