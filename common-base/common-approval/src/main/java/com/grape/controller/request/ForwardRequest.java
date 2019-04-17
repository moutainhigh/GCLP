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
public class ForwardRequest extends RestfulRequest{
	
	/**
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

	@ApiModelProperty(value = "当前处理人员", required = true, example="0")
	private String userid;

}
