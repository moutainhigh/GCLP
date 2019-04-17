package com.grape.controller.bean;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class MortgagestateBean {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="审批信息关联id不能超出19位")
	@ApiModelProperty(value = "审批信息关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=19,min=0,message="抵押物id不能超出19位")
	@ApiModelProperty(value = "抵押物id", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=300,min=0,message="情况说明不能超出300位")
	@ApiModelProperty(value = "情况说明", example = "", dataType="varchar(300)", required = true )
    private String mortgagenote;

	@Length(max=4,min=0,message="查档状态不能超出4位")
	@ApiModelProperty(value = "查档状态", example = "", dataType="varchar(4)", required = true )
    private String mortgagestate;

	@Length(max=120,min=0,message="查档资料不能超出120位")
	@ApiModelProperty(value = "查档资料", example = "", dataType="varchar(120)", required = true )
    private List<String> checkstateimagelist;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;
}
