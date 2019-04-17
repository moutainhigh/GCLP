package com.grape.controller.request;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RoleBeanRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "编号", required = true, example="00000001")
    private String nodeid;
	
	@ApiModelProperty(value = "地区号", required = true, example="0000000001")
    private String arerid;
	
	@ApiModelProperty(value = "渠道方编号", required = true, example="0")
    private String channelno;
	
	@ApiModelProperty(value = "产品编号", required = true, example="0")
    private String productno;
	
	@ApiModelProperty(value = "期望金额", required = true, example="0")
    private BigDecimal expectapplyamount;

	

}
