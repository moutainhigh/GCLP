package com.grape.controller.response.bean;


import java.util.List;

import com.grape.controller.request.Haveloaninfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HaveLoanBean {
	@ApiModelProperty(value = "业务信息", example = "", dataType="", required = true )
	private List<Haveloaninfo> list;
	
	@ApiModelProperty(value = "是否曾在我司申请业务", example = "", dataType="", required = true )
    private String havaloanflg; 
}
