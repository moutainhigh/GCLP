package com.grape.controller.bean;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepaymethodAndratetypeBean {

	@ApiModelProperty(value="还款方式",example="")
	private String Repaymethod;
	
	@ApiModelProperty(value="利率类型",example="")
	private String Ratetype;
}
