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
public class ContractRequest extends RestfulRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@ApiModelProperty(value="产品编号")
	private String productno;
	
	@ApiModelProperty(value="合同名称")
	private String constractname;
	
	@ApiModelProperty(value="适用区域")
	private String area;
	
	@ApiModelProperty(value="适用公司")
	private String channo;
	
	@ApiModelProperty(value="合同名称")
	private String state;
	
	@ApiModelProperty(value="页面编号")
	private Integer pagenum;
	
	@ApiModelProperty(value="页面数量")
	private Integer pagesize;

}
