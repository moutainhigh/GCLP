package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepaytoInfoRequest2 extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<String> ids ; 

	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(10)", required = true )
    private String nodeid;
	
	@ApiModelProperty(value = "操作", example = "", dataType="varchar(10)", required = true )
    private String operation;

}
