package com.grape.controller.reponse.bean;




import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class OverdueAssessinfo {
	
	
	@ApiModelProperty(value="抵押物名称",required=true)
	private String mortgagename;
	@ApiModelProperty(value="综合评估总价",required=true)
	private BigDecimal totalprice;
	@ApiModelProperty(value="评估时间",required=true)
	private String assesstime;
	@ApiModelProperty(value="涨幅",required=true)
	private String gains;
	
	
	
}
