package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class AssetinfoBean {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=10,min=0,message="资产类型不能超出10位")
	@ApiModelProperty(value = "资产类型", example = "", dataType="varchar(10)", required = true )
    private String assettype;

	@Length(max=8,min=0,message="坐落地址区不能超出8位")
	@ApiModelProperty(value = "坐落地址区", example = "", dataType="varchar(8)", required = true )
    private String addresssarea;

	@Length(max=8,min=0,message="坐落地址市不能超出8位")
	@ApiModelProperty(value = "坐落地址市", example = "", dataType="varchar(8)", required = true )
    private String addresscity;

	@Length(max=8,min=0,message="坐落地址省不能超出8位")
	@ApiModelProperty(value = "坐落地址省", example = "", dataType="varchar(8)", required = true )
    private String addressprov;
	
	@Length(max=8,min=0,message="坐落地址区不能超出8位")
	@ApiModelProperty(value = "坐落地址区", example = "", dataType="varchar(8)", required = true )
    private String addresssareaofch;

	@Length(max=8,min=0,message="坐落地址市不能超出8位")
	@ApiModelProperty(value = "坐落地址市", example = "", dataType="varchar(8)", required = true )
    private String addresscityofch;

	@Length(max=8,min=0,message="坐落地址省不能超出8位")
	@ApiModelProperty(value = "坐落地址省", example = "", dataType="varchar(8)", required = true )
    private String addressprovofch;

	@Length(max=200,min=0,message="坐落地址详细信息不能超出200位")
	@ApiModelProperty(value = "坐落地址详细信息", example = "", dataType="varchar(200)", required = true )
    private String address;
	
	@ApiModelProperty(value = "坐落地址详细信息中文", example = "", dataType="varchar(200)", required = true )
    private String addressofch;

	@Length(max=1,min=0,message="是否提供产证不能超出1位")
	@ApiModelProperty(value = "是否提供产证", example = "1", dataType="char(1)", required = true )
    private String isprovidepaper;

	@Length(max=80,min=0,message="产权人不能超出80位")
	@ApiModelProperty(value = "产权人", example = "", dataType="varchar(80)", required = true )
    private String propertyowner;

	@Length(max=20,min=0,message="房产性质不能超出20位")
	@ApiModelProperty(value = "房产性质", example = "", dataType="varchar(20)", required = true )
    private String housenature;

	@Length(max=4,min=0,message="建筑面积不能超出4位")
	@ApiModelProperty(value = "建筑面积", example = "1000", dataType="varchar(4)", required = true )
    private String housearea;

	@ApiModelProperty(value = "购买时间", example = "", dataType="datetime", required = true )
    private Date buytime;

	@Length(max=17,min=0,message="购买价格不能超出17位")
	@ApiModelProperty(value = "购买价格", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal buyprice;

	@Length(max=10,min=0,message="资料选择类别不能超出10位")
	@ApiModelProperty(value = "资料选择类别", example = "", dataType="varchar(10)", required = true )
    private String docchoosetype;

	@Length(max=200,min=0,message="资产情况说明不能超出200位")
	@ApiModelProperty(value = "资产情况说明", example = "", dataType="varchar(200)", required = true )
    private String assetsituation;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;
}
