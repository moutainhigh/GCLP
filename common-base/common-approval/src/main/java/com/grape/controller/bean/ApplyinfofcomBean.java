package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplyinfofcomBean {
	@Length(max=10,min=0,message="流水号不能超出10位")
	@ApiModelProperty(value = "流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=30,min=0,message="统一社会信用代码不能超出30位")
	@ApiModelProperty(value = "统一社会信用代码", example = "", dataType="varchar(30)", required = true )
    private String socialcreditcode;

	@Length(max=30,min=0,message="申请人类型不能超出30位")
	@ApiModelProperty(value = "申请人类型", example = "", dataType="varchar(30)", required = true )
    private String applyertype;

	@Length(max=80,min=0,message="申请主体不能超出80位")
	@ApiModelProperty(value = "申请主体", example = "", dataType="varchar(80)", required = true )
    private String applymainbody;

	@Length(max=80,min=0,message="企业名称不能超出80位")
	@ApiModelProperty(value = "企业名称", example = "", dataType="varchar(80)", required = true )
    private String orgname;

	@Length(max=20,min=0,message="经营类型不能超出20位")
	@ApiModelProperty(value = "经营类型", example = "", dataType="varchar(20)", required = true )
    private String managetype;

	@Length(max=80,min=0,message="法定代表人不能超出80位")
	@ApiModelProperty(value = "法定代表人", example = "", dataType="varchar(80)", required = true )
    private String juridical;

	@ApiModelProperty(value = "公司成立日期", example = "", dataType="datetime", required = true )
    private Date comstartdate;

	@ApiModelProperty(value = "营业期限至", example = "", dataType="datetime", required = true )
    private Date comenddate;

	@Length(max=17,min=0,message="注册资本不能超出17位")
	@ApiModelProperty(value = "注册资本", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal registcapital;

	@Length(max=17,min=0,message="认缴资本不能超出17位")
	@ApiModelProperty(value = "认缴资本", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal contricapital;

	@Length(max=300,min=0,message="公司注册地址详细地址不能超出300位")
	@ApiModelProperty(value = "公司注册地址详细地址", example = "", dataType="varchar(300)", required = true )
    private String comaddress;

	@Length(max=10,min=0,message="公司注册地址区不能超出10位")
	@ApiModelProperty(value = "公司注册地址区", example = "", dataType="varchar(10)", required = true )
    private String comaddressarea;

	@Length(max=30,min=0,message="公司注册地址城市不能超出30位")
	@ApiModelProperty(value = "公司注册地址城市", example = "", dataType="varchar(30)", required = true )
    private String comaddresscity;

	@Length(max=30,min=0,message="公司注册地址省份不能超出30位")
	@ApiModelProperty(value = "公司注册地址省份", example = "", dataType="varchar(30)", required = true )
    private String comaddressprovince;
	
	@ApiModelProperty(value = "公司注册地址区中文描述", example = "", dataType="varchar(10)", required = true )
    private String comaddressareaofch;

	@ApiModelProperty(value = "公司注册地址城市中文描述", example = "", dataType="varchar(30)", required = true )
    private String comaddresscityofch;

	@ApiModelProperty(value = "公司注册地址省份中文描述", example = "", dataType="varchar(30)", required = true )
    private String comaddressprovinceofch;

	@Length(max=300,min=0,message="公司实际经营地址不能超出300位")
	@ApiModelProperty(value = "公司实际经营地址", example = "", dataType="varchar(300)", required = true )
    private String realcomaddress;

	@Length(max=30,min=0,message="公司实际经营地址区不能超出30位")
	@ApiModelProperty(value = "公司实际经营地址区", example = "", dataType="varchar(30)", required = true )
    private String realcomaddressarea;

	@Length(max=30,min=0,message="公司实际经营地址城市不能超出30位")
	@ApiModelProperty(value = "公司实际经营地址城市", example = "", dataType="varchar(30)", required = true )
    private String realcomaddresscity;

	@ApiModelProperty(value = "公司实际经营地址省份中文描述", example = "", dataType="varchar(30)", required = true )
    private String realcomaddressprovinceofch;
	
	@ApiModelProperty(value = "公司实际经营地址区中文描述", example = "", dataType="varchar(30)", required = true )
    private String realcomaddressareaofch;

	@ApiModelProperty(value = "公司实际经营地址城市中文描述", example = "", dataType="varchar(30)", required = true )
    private String realcomaddresscityofch;

	@Length(max=30,min=0,message="公司实际经营地址省份不能超出30位")
	@ApiModelProperty(value = "公司实际经营地址省份", example = "", dataType="varchar(30)", required = true )
    private String realcomaddressprovince;

	@Length(max=80,min=0,message="经营范围不能超出80位")
	@ApiModelProperty(value = "经营范围", example = "", dataType="varchar(80)", required = true )
    private String managearea;

	@Length(max=6,min=0,message="行业分类不能超出6位")
	@ApiModelProperty(value = "行业分类", example = "", dataType="varchar(6)", required = true )
    private String industrysecond;

	@Length(max=6,min=0,message="行业分类不能超出6位")
	@ApiModelProperty(value = "行业分类", example = "", dataType="varchar(6)", required = true )
    private String industryfirst;
	
	@Length(max=6,min=0,message="行业分类不能超出6位")
	@ApiModelProperty(value = "行业分类中文描述", example = "", dataType="varchar(6)", required = true )
    private String industrysecondofch;

	@Length(max=6,min=0,message="行业分类不能超出6位")
	@ApiModelProperty(value = "行业分类中文描述", example = "", dataType="varchar(6)", required = true )
    private String industryfirstofch;

	@Length(max=80,min=0,message="主要产品及业务不能超出80位")
	@ApiModelProperty(value = "主要产品及业务", example = "", dataType="varchar(80)", required = true )
    private String mianbusiness;

	@Length(max=80,min=0,message="主要供应商不能超出80位")
	@ApiModelProperty(value = "主要供应商", example = "", dataType="varchar(80)", required = true )
    private String mainsupplier;

	@Length(max=80,min=0,message="主要客户不能超出80位")
	@ApiModelProperty(value = "主要客户", example = "", dataType="varchar(80)", required = true )
    private String maincustomer;
	
	@ApiModelProperty(value = "法人信息备注", example = "", dataType="varchar(1000)", required = true )
    private String shareremark;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;
}
