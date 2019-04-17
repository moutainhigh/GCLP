package com.grape.controller.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.Date;
@Setter
@Getter
public class CustinfoBean {
	@Length(max=10,min=0,message="贷款流水号不能超出10位")
	@ApiModelProperty(value = "贷款流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="身份证号不能超出32位")
	@ApiModelProperty(value = "身份证号", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=10,min=0,message="客户编号不能超出10位")
	@ApiModelProperty(value = "客户编号", example = "", dataType="varchar(10)", required = true )
    private String custno;

	@Length(max=30,min=0,message="客户类型不能超出30位")
	@ApiModelProperty(value = "客户类型", example = "", dataType="varchar(30)", required = true )
    private String custtype;

	@Length(max=80,min=0,message="客户姓名不能超出80位")
	@ApiModelProperty(value = "客户姓名", example = "", dataType="varchar(80)", required = true )
    private String custname;
	
	@ApiModelProperty(value = "配偶姓名", example = "", dataType="varchar(80)", required = true )
    private String marrowname;

	@Length(max=1,min=0,message="性别不能超出1位")
	@ApiModelProperty(value = "性别", example = "", dataType="varchar(1)", required = true )
    private String sex;

	@ApiModelProperty(value = "出生年月", example = "", dataType="datetime", required = true )
    private Date birthday;

	@Length(max=20,min=0,message="电话号码不能超出20位")
	@ApiModelProperty(value = "电话号码", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@Length(max=80,min=0,message="家庭住址省份不能超出80位")
	@ApiModelProperty(value = "家庭住址省份", example = "", dataType="varchar(80)", required = true )
    private String familyaddressprovince;

	@Length(max=80,min=0,message="家庭住址市区不能超出80位")
	@ApiModelProperty(value = "家庭住址市区", example = "", dataType="varchar(80)", required = true )
    private String familyaddresscity;

	@Length(max=80,min=0,message="家庭住址区不能超出80位")
	@ApiModelProperty(value = "家庭住址区", example = "", dataType="varchar(80)", required = true )
    private String familyaddressarea;
	
	@Length(max=80,min=0,message="家庭住址省份不能超出80位")
	@ApiModelProperty(value = "家庭住址省份中文描述", example = "", dataType="varchar(80)", required = true )
    private String familyaddressprovinceofch;

	@Length(max=80,min=0,message="家庭住址市区不能超出80位")
	@ApiModelProperty(value = "家庭住址市区中文描述", example = "", dataType="varchar(80)", required = true )
    private String familyaddresscityofch;

	@Length(max=80,min=0,message="家庭住址区不能超出80位")
	@ApiModelProperty(value = "家庭住址区中文描述", example = "", dataType="varchar(80)", required = true )
    private String familyaddressareaofch;

	@Length(max=120,min=0,message="家庭住址详细信息不能超出120位")
	@ApiModelProperty(value = "家庭住址详细信息", example = "", dataType="varchar(120)", required = true )
    private String familyaddressdetail;

	@Length(max=4,min=0,message="年龄不能超出4位")
	@ApiModelProperty(value = "年龄", example = "", dataType="varchar(4)", required = true )
    private String age;

	@Length(max=80,min=0,message="户籍省份不能超出80位")
	@ApiModelProperty(value = "户籍省份", example = "", dataType="varchar(80)", required = true )
    private String censusregisterprovvince;

	@Length(max=80,min=0,message="户籍所属市区不能超出80位")
	@ApiModelProperty(value = "户籍所属市区", example = "", dataType="varchar(80)", required = true )
    private String censusregistercity;
	
	@Length(max=80,min=0,message="户籍省份不能超出80位")
	@ApiModelProperty(value = "户籍省份中文描述", example = "", dataType="varchar(80)", required = true )
    private String censusregisterprovvinceofch;

	@Length(max=80,min=0,message="户籍所属市区不能超出80位")
	@ApiModelProperty(value = "户籍所属市区中文描述", example = "", dataType="varchar(80)", required = true )
    private String censusregistercityofch;

	@Length(max=1,min=0,message="婚姻状况不能超出1位")
	@ApiModelProperty(value = "婚姻状况", example = "", dataType="char(1)", required = true )
    private String maritalstatus;

	@Length(max=1,min=0,message="是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "是否有诉讼记录", example = "", dataType="varchar(1)", required = true )
    private String islitigation;

	@Length(max=80,min=0,message="职业不能超出80位")
	@ApiModelProperty(value = "职业", example = "", dataType="varchar(80)", required = true )
    private String job;
	
	@Length(max=500,min=0,message="职业情况说明不能超出500位")
	@ApiModelProperty(value = "职业情况说明", example = "", dataType="varchar(500)", required = true )
    private String jobnation;

	@ApiModelProperty(value = "操作时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="操作人不能超出8位")
	@ApiModelProperty(value = "操作人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=2,min=0,message="申请主体不能超出2位")
	@ApiModelProperty(value = "申请主体", example = "", dataType="varchar(2)", required = true )
    private String applymain;

	@Length(max=80,min=0,message="单位名称不能超出80位")
	@ApiModelProperty(value = "单位名称", example = "", dataType="varchar(80)", required = true )
    private String comname;

	@Length(max=80,min=0,message="公司性质不能超出80位")
	@ApiModelProperty(value = "公司性质", example = "", dataType="varchar(80)", required = true )
    private String comproperty1;

	@Length(max=2,min=0,message="公司性质不能超出2位")
	@ApiModelProperty(value = "公司性质", example = "", dataType="varchar(2)", required = true )
    private String comproperty;

	@Length(max=80,min=0,message="职位不能超出80位")
	@ApiModelProperty(value = "职位", example = "", dataType="varchar(80)", required = true )
    private String position;

	@Length(max=17,min=0,message="月工资收入不能超出17位")
	@ApiModelProperty(value = "月工资收入", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal monthincome;

	@Length(max=200,min=0,message="公司实际经营地址不能超出200位")
	@ApiModelProperty(value = "公司实际经营地址", example = "", dataType="varchar(200)", required = true )
    private String realcomaddress;

	@Length(max=17,min=0,message="营业收入不能超出17位")
	@ApiModelProperty(value = "营业收入", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal receipt;

	@Length(max=17,min=0,message="净利润不能超出17位")
	@ApiModelProperty(value = "净利润", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal netmargin;

	@Length(max=4,min=0,message="国家不能超出4位")
	@ApiModelProperty(value = "国家", example = "", dataType="varchar(4)", required = true )
    private String country;

	@Length(max=300,min=0,message="营业执照图片存放地址不能超出300位")
	@ApiModelProperty(value = "营业执照图片存放地址", example = "", dataType="varchar(300)", required = true )
    private String busilicence;

	@Length(max=300,min=0,message="身份证地址不能超出300位")
	@ApiModelProperty(value = "身份证地址", example = "", dataType="varchar(300)", required = true )
    private String cerditaddress;

	@Length(max=300,min=0,message="身份证正面图片路径不能超出300位")
	@ApiModelProperty(value = "身份证正面图片路径", example = "", dataType="varchar(300)", required = true )
    private String creditimage;

	@Length(max=300,min=0,message="身份证反面图片路径不能超出300位")
	@ApiModelProperty(value = "身份证反面图片路径", example = "", dataType="varchar(300)", required = true )
    private String creditimage2;

	@Length(max=80,min=0,message="籍贯所属省份不能超出80位")
	@ApiModelProperty(value = "籍贯所属省份", example = "", dataType="varchar(80)", required = true )
    private String nativeplaceprovince;

	@Length(max=80,min=0,message="籍贯所属城市不能超出80位")
	@ApiModelProperty(value = "籍贯所属城市", example = "", dataType="varchar(80)", required = true )
    private String nativeplacecity;

	@Length(max=80,min=0,message="籍贯所属区域不能超出80位")
	@ApiModelProperty(value = "籍贯所属区域", example = "", dataType="varchar(80)", required = true )
    private String nativeplacearea;
	
	@Length(max=80,min=0,message="籍贯所属省份不能超出80位")
	@ApiModelProperty(value = "籍贯所属省份中文描述", example = "", dataType="varchar(80)", required = true )
    private String nativeplaceprovinceofch;

	@Length(max=80,min=0,message="籍贯所属城市不能超出80位")
	@ApiModelProperty(value = "籍贯所属城市中文描述", example = "", dataType="varchar(80)", required = true )
    private String nativeplacecityofch;

	@Length(max=80,min=0,message="籍贯所属区域不能超出80位")
	@ApiModelProperty(value = "籍贯所属区域中文描述", example = "", dataType="varchar(80)", required = true )
    private String nativeplaceareaofch;

	@ApiModelProperty(value = "离婚时间", example = "", dataType="datetime", required = true )
    private Date discoverdate;

	@Length(max=2,min=0,message="离婚协议书不能超出2位")
	@ApiModelProperty(value = "离婚协议书", example = "", dataType="varchar(2)", required = true )
    private String discoversign;

	@Length(max=300,min=0,message="财产分配履行情况不能超出300位")
	@ApiModelProperty(value = "财产分配履行情况", example = "", dataType="varchar(300)", required = true )
    private String estatedescription;

	@Length(max=1,min=0,message="是否有子女不能超出1位")
	@ApiModelProperty(value = "是否有子女", example = "", dataType="char(1)", required = true )
    private String havachildflg;

	@Length(max=2,min=0,message="子女个数不能超出2位")
	@ApiModelProperty(value = "子女个数", example = "", dataType="varchar(2)", required = true )
    private String childcount;

	@Length(max=300,min=0,message="子女情况说明不能超出300位")
	@ApiModelProperty(value = "子女情况说明", example = "", dataType="varchar(300)", required = true )
    private String childdescription;

	@Length(max=1,min=0,message="是否从事高危行业不能超出1位")
	@ApiModelProperty(value = "是否从事高危行业", example = "", dataType="char(1)", required = true )
    private String dangerjob;

	@Length(max=4,min=0,message="与主借款人关系不能超出4位")
	@ApiModelProperty(value = "与主借款人关系", example = "", dataType="varchar(4)", required = true )
    private String relationship;

	@ApiModelProperty(value = "业务描述", example = "", dataType="text", required = true )
    private String busdescription;
	
	@ApiModelProperty(value = "配偶关联身份证号码", example = "", dataType="varchar(32)", required = true )
    private String relationcerdid;
	
	@ApiModelProperty(value = "是否是配偶", example = "", dataType="char(1)", required = true )
    private String ismarrow;

	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
	private String comhavalitigat;
}
