package com.grape.controller.reponse;

import java.util.List;


import com.grape.controller.response.bean.MortgageInfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class MortgageInfoResponse extends RestfulResponse{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="抵押物信息审查",required=true)
	private String reviewInformation;
	@ApiModelProperty(value = "抵押物信息", example = "", dataType="", required = true )
	private List<MortgageInfo> mortgageInfoList;

}
