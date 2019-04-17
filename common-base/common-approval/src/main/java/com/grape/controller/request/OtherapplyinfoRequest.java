package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class OtherapplyinfoRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="申请编号",example="0000000001",required=true)
	private String workid;
	
	@ApiModelProperty(value="借款用途说明",example="无",required=true)
	private String usageofloan;
	
	@ApiModelProperty(value="用款计划说明",example="无",required=true)
	private String usageloanplan;
	
	@ApiModelProperty(value="还款来源说明",example="无",required=true)
	private String repaysource;
	
	@ApiModelProperty(value="还款计划说明",example="无",required=true)
	private String repayplan;
	
}
