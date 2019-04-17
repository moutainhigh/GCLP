package com.grape.controller.bean;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroommortgageBean {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="审批信息关联编号不能超出19位")
	@ApiModelProperty(value = "审批信息关联编号", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="当地《不动产权证登记受理凭证》是否收取不能超出1位")
	@ApiModelProperty(value = "当地《不动产权证登记受理凭证》是否收取", example = "", dataType="char(1)", required = true )
    private String housediplomabackflg;

	@Length(max=300,min=0,message="当地《不动产权证登记受理凭证》是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "当地《不动产权证登记受理凭证》是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String housediplomabacknote;

	@Length(max=1,min=0,message="当地不动产登记信息查询结果是否收取不能超出1位")
	@ApiModelProperty(value = "当地不动产登记信息查询结果是否收取", example = "", dataType="char(1)", required = true )
    private String housediplomaresultflg;

	@Length(max=300,min=0,message="当地不动产登记信息查询结果是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "当地不动产登记信息查询结果是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String housediplomaresultnote;

	@Length(max=1,min=0,message="其三证三章或股权质押是否收取不能超出1位")
	@ApiModelProperty(value = "其三证三章或股权质押是否收取", example = "", dataType="char(1)", required = true )
    private String diplomabackflg;

	@Length(max=300,min=0,message="其三证三章或股权质押是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "其三证三章或股权质押是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String diplomabacknote;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;
	
	@Length(max=80,min=0,message="抵押物名称不能超出80位")
	@ApiModelProperty(value = "抵押物名称", example = "", dataType="varchar(80)", required = true )
    private String martgagename;
}
