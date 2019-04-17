package com.grape.controller.response.bean;


import java.math.BigDecimal;
import java.util.List;


import io.swagger.annotations.ApiModelProperty;

import lombok.Getter;

import lombok.Setter;


@Getter
@Setter

public class MortgageInfo {
	
	
	@ApiModelProperty(value="基本信息",required=true)
	private MortgageInfoBean mortgageinfo;

	@ApiModelProperty(value="综合评估单价",required=true)
	private BigDecimal controlprice;
	@ApiModelProperty(value="综合评估总价",required=true)
	private BigDecimal controltotal;
	@ApiModelProperty(value="线上评估单价",required=true)
	private BigDecimal onlineprice;
	@ApiModelProperty(value="线上评估总价",required=true)
	private BigDecimal onlinetotal;
	@ApiModelProperty(value="渠道评估信息",required=true)
	private List<ChannelassessInfo> channelassessInfos;
}
