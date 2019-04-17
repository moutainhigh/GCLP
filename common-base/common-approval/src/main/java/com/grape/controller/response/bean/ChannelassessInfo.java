package com.grape.controller.response.bean;

import java.math.BigDecimal;



import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class ChannelassessInfo {
	
	@ApiModelProperty(value="评估渠道",required=true)
	private String assesschannel;
	@ApiModelProperty(value="评估单价",required=true)
	private BigDecimal assessprice;
	@ApiModelProperty(value="评估总价",required=true)
	private BigDecimal assesstotal;
}
