package com.grape.controller.reponse;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Custmarrow {
	@ApiModelProperty(value = "贷款流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;
	
	@ApiModelProperty(value = "身份证号", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@ApiModelProperty(value = "客户编号", example = "", dataType="varchar(10)", required = true )
    private String custno;

	@ApiModelProperty(value = "客户类型", example = "", dataType="varchar(30)", required = true )
    private String custtype;

	@ApiModelProperty(value = "客户姓名", example = "", dataType="varchar(80)", required = true )
    private String custname;

	@ApiModelProperty(value = "性别", example = "", dataType="varchar(1)", required = true )
    private String sex;

	@ApiModelProperty(value = "出生年月", example = "", dataType="datetime", required = true )
    private Date birthday;

	@ApiModelProperty(value = "电话号码", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@ApiModelProperty(value = "家庭住址省份", example = "", dataType="varchar(80)", required = true )
    private String familyaddressprovince;

	@ApiModelProperty(value = "家庭住址市区", example = "", dataType="varchar(80)", required = true )
    private String familyaddresscity;

	@ApiModelProperty(value = "家庭住址区", example = "", dataType="varchar(80)", required = true )
    private String familyaddressarea;

	@ApiModelProperty(value = "家庭住址详细信息", example = "", dataType="varchar(120)", required = true )
    private String familyaddressdetail;

	@ApiModelProperty(value = "年龄", example = "", dataType="varchar(4)", required = true )
    private String age;

	@Length(max=80,min=0,message="户籍省份不能超出80位")
	@ApiModelProperty(value = "户籍省份", example = "", dataType="varchar(80)", required = true )
    private String censusregisterprovvince;

	@Length(max=80,min=0,message="户籍所属市区不能超出80位")
	@ApiModelProperty(value = "户籍所属市区", example = "", dataType="varchar(80)", required = true )
    private String censusregistercity;

	@Length(max=1,min=0,message="婚姻状况不能超出1位")
	@ApiModelProperty(value = "婚姻状况", example = "", dataType="char(1)", required = true )
    private String maritalstatus;

	@Length(max=1,min=0,message="是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "是否有诉讼记录", example = "", dataType="varchar(1)", required = true )
    private String islitigation;

	@Length(max=80,min=0,message="职业不能超出80位")
	@ApiModelProperty(value = "职业", example = "", dataType="varchar(80)", required = true )
    private String job;

	@Length(max=2,min=0,message="申请主体不能超出2位")
	@ApiModelProperty(value = "申请主体", example = "", dataType="varchar(2)", required = true )
    private String applymain;

	@Length(max=80,min=0,message="单位名称不能超出80位")
	@ApiModelProperty(value = "单位名称", example = "", dataType="varchar(80)", required = true )
    private String comname;

	@ApiModelProperty(value = "公司性质", example = "", dataType="varchar(80)", required = true )
    private String comproperty1;

	@ApiModelProperty(value = "公司性质", example = "", dataType="varchar(2)", required = true )
    private String comproperty;

	@ApiModelProperty(value = "职位", example = "", dataType="varchar(80)", required = true )
    private String position;

	@ApiModelProperty(value = "月工资收入", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal monthincome;

	@ApiModelProperty(value = "公司实际经营地址", example = "", dataType="varchar(200)", required = true )
    private String realcomaddress;

	@ApiModelProperty(value = "营业收入", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal receipt;

	@ApiModelProperty(value = "净利润", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal netmargin;

	@ApiModelProperty(value = "国家", example = "", dataType="varchar(4)", required = true )
    private String country;

	@ApiModelProperty(value = "营业执照图片存放地址", example = "", dataType="varchar(300)", required = true )
    private String busilicence;

	@ApiModelProperty(value = "身份证地址", example = "", dataType="varchar(300)", required = true )
    private String cerditaddress;

	@ApiModelProperty(value = "身份证正面图片路径", example = "", dataType="varchar(300)", required = true )
    private String creditimage;

	@ApiModelProperty(value = "身份证反面图片路径", example = "", dataType="varchar(300)", required = true )
    private String creditimage2;

	@ApiModelProperty(value = "籍贯所属省份", example = "", dataType="varchar(80)", required = true )
    private String nativeplaceprovince;

	@ApiModelProperty(value = "籍贯所属城市", example = "", dataType="varchar(80)", required = true )
    private String nativeplacecity;

	@ApiModelProperty(value = "籍贯所属区域", example = "", dataType="varchar(80)", required = true )
    private String nativeplacearea;

	@ApiModelProperty(value = "离婚时间", example = "", dataType="datetime", required = true )
    private Date discoverdate;

	@ApiModelProperty(value = "离婚协议书", example = "", dataType="varchar(2)", required = true )
    private String discoversign;

	@ApiModelProperty(value = "财产分配履行情况", example = "", dataType="varchar(300)", required = true )
    private String estatedescription;

	@ApiModelProperty(value = "是否有子女", example = "", dataType="char(1)", required = true )
    private String havachildflg;

	@ApiModelProperty(value = "子女个数", example = "", dataType="varchar(2)", required = true )
    private String childcount;

	@ApiModelProperty(value = "子女情况说明", example = "", dataType="varchar(300)", required = true )
    private String childdescription;

	@ApiModelProperty(value = "是否从事高危行业", example = "", dataType="char(1)", required = true )
    private String dangerjob;

	@ApiModelProperty(value = "与主借款人关系", example = "", dataType="varchar(4)", required = true )
    private String relationship;

	@ApiModelProperty(value = "业务描述", example = "", dataType="text", required = true )
    private String busdescription;
	
	@ApiModelProperty(value = "征信报告日期", example = "", dataType="datetime", required = true )
    private Date creditreportdate;

	@ApiModelProperty(value = "贷款征信记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofloancredit;

	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofcreditcard2;

	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofcreditcard;

	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofloancredit2;

	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "", dataType="char(1)", required = true )
    private String iswarnofcredit2;

	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "", dataType="char(1)", required = true )
    private String iswarnofcredit;

	@ApiModelProperty(value = "当前是否逾期", example = "", dataType="char(1)", required = true )
    private String isoverdue2;

	@ApiModelProperty(value = "当前是否逾期", example = "", dataType="char(1)", required = true )
    private String isoverdue;

	@ApiModelProperty(value = "近24个月内是否有逾期记录", example = "", dataType="char(1)", required = true )
    private String isrecentoverdue2;

	@ApiModelProperty(value = "近24个月内是否有逾期记录", example = "", dataType="char(1)", required = true )
    private String isrecentoverdue;

	@ApiModelProperty(value = "当前逾期是否已结清", example = "", dataType="char(1)", required = true )
    private String overdueclearflg2;

	@ApiModelProperty(value = "当前逾期是否已结清", example = "", dataType="char(1)", required = true )
    private String overdueclearflg;

	@ApiModelProperty(value = "当前逾期笔数", example = "", dataType="varchar(4)", required = true )
    private String overduecount2;

	@ApiModelProperty(value = "当前逾期笔数", example = "", dataType="varchar(4)", required = true )
    private String overduecount;

	@ApiModelProperty(value = "当前逾期天数", example = "", dataType="varchar(10)", required = true )
    private String overdueday2;

	@ApiModelProperty(value = "当前逾期天数", example = "", dataType="varchar(10)", required = true )
    private String overdueday;

	@ApiModelProperty(value = "当前逾期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount2;

	@ApiModelProperty(value = "当前逾期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount;

	@ApiModelProperty(value = "最高逾期次数", example = "", dataType="varchar(10)", required = true )
    private String maxoverduecount2;

	@ApiModelProperty(value = "最高逾期次数", example = "", dataType="varchar(10)", required = true )
    private String maxoverduecount;

	@ApiModelProperty(value = "累计逾期次数", example = "", dataType="varchar(10)", required = true )
    private String totaloverduecount2;

	@ApiModelProperty(value = "累计逾期次数", example = "", dataType="varchar(10)", required = true )
    private String totaloverduecount;
	
	@ApiModelProperty(value = "借款人是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String isborrlitigation;

	@ApiModelProperty(value = "公司是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String iscomlitigation;

	@ApiModelProperty(value = "诉讼状态", example = "", dataType="varchar(10)", required = true )
    private String litigationstate;

	@ApiModelProperty(value = "标的金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal targetamount;

	@ApiModelProperty(value = "诉讼类型", example = "", dataType="varchar(10)", required = true )
    private String litigationtype;

	@ApiModelProperty(value = "是否是失信人", example = "", dataType="char(1)", required = true )
    private String isdishonest;

	@ApiModelProperty(value = "诉讼情况说明", example = "", dataType="varchar(300)", required = true )
    private String litigationexplain;
}
