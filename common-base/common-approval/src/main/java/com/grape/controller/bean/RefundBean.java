package com.grape.controller.bean;


import java.util.List;

import com.grape.model.db.Refundment;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RefundBean {

	@ApiModelProperty(value="退款信息",example="")
	private Refundment refundment;
	
	@ApiModelProperty(value="他项权证",example="")
	private List<List<ImageBean1>> imagelist;
	
	private String productno;
}
