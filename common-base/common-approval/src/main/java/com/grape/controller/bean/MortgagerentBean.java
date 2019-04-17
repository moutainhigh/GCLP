package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MortgagerentBean {
	@ApiModelProperty(value = "抵押物id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@ApiModelProperty(value = "抵押物id", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@ApiModelProperty(value = "月租金收入", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal monthamount;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;
	
	@ApiModelProperty(value = "抵押物名称", example = "", dataType="varchar(8)", required = true )
    private String martgagename;
}
