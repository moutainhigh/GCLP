package com.grape.controller.reponse.bean;


import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Mortgagematch;

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
public class MortgageAssessinfo {
	
	@ApiModelProperty(value="抵押物编号",required=true)
	private String mortgageno;
	@ApiModelProperty(value="抵押物名称",required=true)
	private String mortgagename;
	@ApiModelProperty(value="评估时间",required=true)
	private String assesstime;
	@ApiModelProperty(value="快速成交价",required=true)
	private BigDecimal quickprice;
	@ApiModelProperty(value="一般成交价",required=true)
	private BigDecimal generalprice;
	@ApiModelProperty(value="涨幅",required=true)
	private String gains;
	@ApiModelProperty(value="渠道评估信息列表",required=true)
	private List<ChannelAssessinfo> channelAssessinfos;
	
	@ApiModelProperty(value="抵押物匹配列表",required=true)
	private List<Mortgagematch> mortgagematchs;
	
}
