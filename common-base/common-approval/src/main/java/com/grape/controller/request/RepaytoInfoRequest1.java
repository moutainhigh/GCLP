package com.grape.controller.request;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepaytoInfoRequest1 extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(10)", required = true )
    private String nodeid;
	
	@ApiModelProperty(value = "操作", example = "", dataType="varchar(10)", required = true )
    private String operation;

}
