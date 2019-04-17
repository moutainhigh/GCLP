package com.grape.controller.reponse;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConstractBean {
	@ApiModelProperty(value = "", example = "", dataType="varchar(29)", required = true )
    private String id;
	
	@Length(max=11,min=0,message="不能超出11位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(11)", required = true )
    private String productno;

	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String aera;

	@Length(max=20,min=0,message="渠道不能超出20位")
	@ApiModelProperty(value = "渠道", example = "", dataType="varchar(20)", required = true )
    private String channelno;
	
	@ApiModelProperty(value="渠道名称")
	private String channame;

	@Length(max=255,min=0,message="文件名不能超出255位")
	@ApiModelProperty(value = "文件名", example = "", dataType="varchar(255)", required = true )
    private String filename;

	@ApiModelProperty(value = "时间", example = "", dataType="datetime", required = true )
    private Date time;

	@Length(max=20,min=0,message="上传人不能超出20位")
	@ApiModelProperty(value = "上传人", example = "", dataType="varchar(20)", required = true )
    private String uploadperson;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;
	
	@ApiModelProperty(value="产品名称")
	private String productname;
	
	@Length(max=999,min=0,message="不能超出999位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(999)", required = true )
    private String url;

	@Length(max=2,min=0,message="合同状态不能超出2位")
	@ApiModelProperty(value = "合同状态", example = "", dataType="varchar(2)", required = true )
    private String state;
	
	
}
