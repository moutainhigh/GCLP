package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DebtinfoBean {

	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=12,min=0,message="负债类型不能超出12位")
	@ApiModelProperty(value = "负债类型", example = "", dataType="varchar(12)", required = true )
    private String debttype;

	@Length(max=80,min=0,message="借款人不能超出80位")
	@ApiModelProperty(value = "借款人", example = "", dataType="varchar(80)", required = true )
    private String borrowman;

	@Length(max=80,min=0,message="金融机构不能超出80位")
	@ApiModelProperty(value = "金融机构", example = "", dataType="varchar(80)", required = true )
    private String fananceorg;

	@Length(max=17,min=0,message="借款总额不能超出17位")
	@ApiModelProperty(value = "借款总额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totalloan;

	@Length(max=17,min=0,message="借款余额不能超出17位")
	@ApiModelProperty(value = "借款余额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal borrowremain;

	@ApiModelProperty(value = "开始日期", example = "", dataType="datetime", required = true )
    private Date startdate;

	@ApiModelProperty(value = "结束日期", example = "", dataType="datetime", required = true )
    private Date enddate;

	@Length(max=80,min=0,message="抵押物产权编号不能超出80位")
	@ApiModelProperty(value = "抵押物产权编号", example = "", dataType="varchar(80)", required = true )
    private String pledgeno;

	@Length(max=120,min=0,message="抵押物坐落地址不能超出120位")
	@ApiModelProperty(value = "抵押物坐落地址", example = "", dataType="varchar(120)", required = true )
    private String pledgeaddress;

	@Length(max=17,min=0,message="可用额度不能超出17位")
	@ApiModelProperty(value = "可用额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal usefulposition;

	@Length(max=17,min=0,message="已用额度不能超出17位")
	@ApiModelProperty(value = "已用额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal usedposition;

	@Length(max=600,min=0,message="负债情况说明不能超出600位")
	@ApiModelProperty(value = "负债情况说明", example = "", dataType="varchar(600)", required = true )
    private String debtinforemark;

	@Length(max=1,min=0,message="是否有民间借贷记录不能超出1位")
	@ApiModelProperty(value = "是否有民间借贷记录", example = "", dataType="char(1)", required = true )
    private String havaloanflg;

	@Length(max=8,min=0,message="折算比例不能超出8位")
	@ApiModelProperty(value = "折算比例", example = "", dataType="decimal(8,5)", required = true )
    private BigDecimal conversion;

	@Length(max=120,min=0,message="坐落地址省份不能超出120位")
	@ApiModelProperty(value = "坐落地址省份", example = "", dataType="varchar(120)", required = true )
    private String addressprov;
	
	@ApiModelProperty(value = "坐落地址省份中文", example = "", dataType="varchar(120)", required = true )
    private String transaddressprov;

	@Length(max=120,min=0,message="坐落地址城市不能超出120位")
	@ApiModelProperty(value = "坐落地址城市", example = "", dataType="varchar(120)", required = true )
    private String addresscity;
	
	@ApiModelProperty(value = "坐落地址城市中文", example = "", dataType="varchar(120)", required = true )
    private String transaddresscity;

	@Length(max=120,min=0,message="坐落地址地区不能超出120位")
	@ApiModelProperty(value = "坐落地址地区", example = "", dataType="varchar(120)", required = true )
    private String addressarea;
	
	@ApiModelProperty(value = "坐落地址城市中文", example = "", dataType="varchar(120)", required = true )
    private String transaddressarea;

	@Length(max=120,min=0,message="详细坐落地址不能超出120位")
	@ApiModelProperty(value = "详细坐落地址", example = "", dataType="varchar(120)", required = true )
    private String address;
	
	@ApiModelProperty(value = "详细坐落地址中文", example = "", dataType="varchar(120)", required = true )
    private String addressofch;

	@Length(max=4,min=0,message="历史是否无民间借贷记录不能超出4位")
	@ApiModelProperty(value = "历史是否无民间借贷记录", example = "", dataType="varchar(4)", required = true )
    private String historicalhavaloanflg;

	@Length(max=40,min=0,message="产权证编号不能超出40位")
	@ApiModelProperty(value = "产权证编号", example = "", dataType="varchar(40)", required = true )
    private String noofcertificate;
	
}
