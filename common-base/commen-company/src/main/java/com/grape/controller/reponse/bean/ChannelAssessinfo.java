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
public class ChannelAssessinfo {
	
	
	@ApiModelProperty(value="房屋坐落地址",required=true)
	private String houseaddress;
	@ApiModelProperty(value="评估渠道",required=true)
	private String channel;
	@ApiModelProperty(value="评估单价",required=true)
	private BigDecimal assessprice;
	@ApiModelProperty(value="评估总价",required=true)
	private BigDecimal assesstotal;
	@ApiModelProperty(value="附件名称",required=true)
	private String filename;
}
