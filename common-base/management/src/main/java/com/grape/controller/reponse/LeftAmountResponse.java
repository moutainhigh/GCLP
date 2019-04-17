package com.grape.controller.reponse;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** 
* @author cwc
* @version 创建时间：2019年1月2日 上午9:52:49  
*/


@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class LeftAmountResponse extends RestfulResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="剩余应还本金")
	private String amount;
	
	@ApiModelProperty(value="剩余应还利息")
	private String rateamount;
	
	@ApiModelProperty(value="违约金")
	private String penalty;
	
}
