package com.grape.controller.response.bean;


import java.math.BigDecimal;
import java.util.Date;


import org.hibernate.validator.constraints.Length;


import io.swagger.annotations.ApiModelProperty;

import lombok.Getter;

import lombok.Setter;


@Getter
@Setter

public class MortgageInfoBean {
	
	
	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=2,min=0,message="抵押物类型不能超出2位")
	@ApiModelProperty(value = "抵押物类型", example = "", dataType="varchar(2)", required = true )
    private String mortgagetype;

	@Length(max=80,min=0,message="产权人不能超出80位")
	@ApiModelProperty(value = "产权人", example = "", dataType="varchar(80)", required = true )
    private String propertyowner;

	@Length(max=80,min=0,message="房屋坐落地址所属省份不能超出80位")
	@ApiModelProperty(value = "房屋坐落地址所属省份", example = "", dataType="varchar(80)", required = true )
    private String houseaddressprovince;

	@Length(max=80,min=0,message="房屋坐落地址所属城市不能超出80位")
	@ApiModelProperty(value = "房屋坐落地址所属城市", example = "", dataType="varchar(80)", required = true )
    private String houseaddresscity;

	@Length(max=80,min=0,message="房屋坐落地址所属区域不能超出80位")
	@ApiModelProperty(value = "房屋坐落地址所属区域", example = "", dataType="varchar(80)", required = true )
    private String houseaddressarea;

	@Length(max=300,min=0,message="房屋坐落地址详情不能超出300位")
	@ApiModelProperty(value = "房屋坐落地址详情", example = "", dataType="varchar(300)", required = true )
    private String houseaddressdetail;

	@Length(max=19,min=0,message="所属内区外区不能超出19位")
	@ApiModelProperty(value = "所属内区外区", example = "", dataType="varchar(19)", required = true )
    private String areaid;

	@Length(max=80,min=0,message="抵押物名称不能超出80位")
	@ApiModelProperty(value = "抵押物名称", example = "", dataType="varchar(80)", required = true )
    private String martgagename;

	@Length(max=80,min=0,message="建筑面积不能超出80位")
	@ApiModelProperty(value = "建筑面积", example = "", dataType="varchar(80)", required = true )
    private String floorarea;

	@Length(max=4,min=0,message="土地使用年限不能超出4位")
	@ApiModelProperty(value = "土地使用年限", example = "", dataType="varchar(4)", required = true )
    private String landuseage;

	@ApiModelProperty(value = "土地使用结束日期", example = "", dataType="datetime", required = true )
    private Date landuseenddate;

	@ApiModelProperty(value = "土地使用开始时间", example = "", dataType="datetime", required = true )
    private Date landusestartdate;

	@Length(max=30,min=0,message="抵押物一级类型不能超出30位")
	@ApiModelProperty(value = "抵押物一级类型", example = "", dataType="varchar(30)", required = true )
    private String mortgagefirsttype;

	@Length(max=30,min=0,message="抵押物二级类型不能超出30位")
	@ApiModelProperty(value = "抵押物二级类型", example = "", dataType="varchar(30)", required = true )
    private String mortgagesecondtype;

	@Length(max=80,min=0,message="其他土地用途不能超出80位")
	@ApiModelProperty(value = "其他土地用途", example = "", dataType="varchar(80)", required = true )
    private String otherlandpurpose;

	@Length(max=30,min=0,message="土地用途不能超出30位")
	@ApiModelProperty(value = "土地用途", example = "", dataType="varchar(30)", required = true )
    private String landpurpose;

	@Length(max=80,min=0,message="其他房屋用途不能超出80位")
	@ApiModelProperty(value = "其他房屋用途", example = "", dataType="varchar(80)", required = true )
    private String otherhousepurpose;

	@Length(max=20,min=0,message="房屋用途不能超出20位")
	@ApiModelProperty(value = "房屋用途", example = "", dataType="varchar(20)", required = true )
    private String housepurpose;

	@ApiModelProperty(value = "产权登记日期", example = "", dataType="datetime", required = true )
    private Date registrationdate;

	@ApiModelProperty(value = "竣工日期", example = "", dataType="datetime", required = true )
    private Date housefinishdate;

	@ApiModelProperty(value = "购房日期", example = "", dataType="datetime", required = true )
    private Date buyhousedate;

	@Length(max=4,min=0,message="楼龄不能超出4位")
	@ApiModelProperty(value = "楼龄", example = "", dataType="varchar(4)", required = true )
    private String houseage;

	@Length(max=16,min=0,message="土地性质不能超出16位")
	@ApiModelProperty(value = "土地性质", example = "", dataType="varchar(16)", required = true )
    private String landproperty;

	@Length(max=12,min=0,message="房屋性质不能超出12位")
	@ApiModelProperty(value = "房屋性质", example = "", dataType="varchar(12)", required = true )
    private String houseproperty;

	@Length(max=1,min=0,message="产权状态不能超出1位")
	@ApiModelProperty(value = "产权状态", example = "", dataType="char(1)", required = true )
    private String propertystate;

	@Length(max=4,min=0,message="空置时长（月）不能超出4位")
	@ApiModelProperty(value = "空置时长（月）", example = "", dataType="varchar(4)", required = true )
    private String nousetime;

	@Length(max=6,min=0,message="空置面积 不能超出6位")
	@ApiModelProperty(value = "空置面积 ", example = "", dataType="varchar(6)", required = true )
    private String nousearea;

	@Length(max=17,min=0,message="线上评估总价不能超出17位")
	@ApiModelProperty(value = "线上评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal netreportamount;

	@Length(max=17,min=0,message="线上评估单价不能超出17位")
	@ApiModelProperty(value = "线上评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal netreportprice;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="抵押物是否为唯一住宅不能超出1位")
	@ApiModelProperty(value = "抵押物是否为唯一住宅", example = "", dataType="char(1)", required = true )
    private String housesoloflg;

	@Length(max=600,min=0,message="房产证图片地址不能超出600位")
	@ApiModelProperty(value = "房产证图片地址", example = "", dataType="varchar(600)", required = true )
    private String certificateurl;

	@Length(max=19,min=0,message="产权证编号不能超出19位")
	@ApiModelProperty(value = "产权证编号", example = "", dataType="varchar(19)", required = true )
    private String houseno;

	@Length(max=600,min=0,message="情况说明不能超出600位")
	@ApiModelProperty(value = "情况说明", example = "", dataType="varchar(600)", required = true )
    private String description;

	@Length(max=19,min=0,message="土地证编号不能超出19位")
	@ApiModelProperty(value = "土地证编号", example = "", dataType="varchar(19)", required = true )
    private String landcertificateno;

	@Length(max=1,min=0,message="是否有土地证不能超出1位")
	@ApiModelProperty(value = "是否有土地证", example = "", dataType="varchar(1)", required = true )
    private String islandcertificate;

	@Length(max=9,min=0,message="产权证类型不能超出9位")
	@ApiModelProperty(value = "产权证类型", example = "", dataType="varchar(9)", required = true )
    private String propertytype;
	
	@Length(max=19,min=0,message="抵押物查档ID不能超出19位")
	@ApiModelProperty(value = "抵押物查档ID", example = "", dataType="varchar(19)", required = true )
    private String mortgagefilingid;

	@Length(max=19,min=0,message="抵押物id不能超出19位")
	@ApiModelProperty(value = "抵押物id", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	

	@Length(max=1,min=0,message="抵押物是否有网签备案不能超出1位")
	@ApiModelProperty(value = "抵押物是否有网签备案", example = "", dataType="char(1)", required = true )
    private String isnetsign;

	@Length(max=8,min=0,message="查封次数不能超出8位")
	@ApiModelProperty(value = "查封次数", example = "", dataType="varchar(8)", required = true )
    private String closecount;

	@Length(max=30,min=0,message="解除查封时间距今时长不能超出30位")
	@ApiModelProperty(value = "解除查封时间距今时长", example = "", dataType="varchar(30)", required = true )
    private String endclosetime;

	@ApiModelProperty(value = "解除查封时间", example = "", dataType="datetime", required = true )
    private Date endclosedate;

	@Length(max=2,min=0,message="抵押物是否曾有查封不能超出2位")
	@ApiModelProperty(value = "抵押物是否曾有查封", example = "", dataType="varchar(2)", required = true )
    private String ismortgageclose;

	@Length(max=200,min=0,message="扣押等法律纠纷记录不能超出200位")
	@ApiModelProperty(value = "扣押等法律纠纷记录", example = "", dataType="varchar(200)", required = true )
    private String legaldispute;

	@Length(max=10,min=0,message="抵押物查档状态不能超出10位")
	@ApiModelProperty(value = "抵押物查档状态", example = "", dataType="varchar(10)", required = true )
    private String mortgagestate;

	@Length(max=120,min=0,message="抵押物现抵押银行或公司不能超出120位")
	@ApiModelProperty(value = "抵押物现抵押银行或公司", example = "", dataType="varchar(120)", required = true )
    private String mortgagecomorbank;

	@Length(max=6,min=0,message="抵押物单月查档人数不能超出6位")
	@ApiModelProperty(value = "抵押物单月查档人数", example = "", dataType="varchar(6)", required = true )
    private String queriesofmonth;

	@Length(max=80,min=0,message="前手一押不能超出80位")
	@ApiModelProperty(value = "前手一押", example = "", dataType="varchar(80)", required = true )
    private String fronthandone;

	@Length(max=6,min=0,message="抵押物查档次数不能超出6位")
	@ApiModelProperty(value = "抵押物查档次数", example = "", dataType="varchar(6)", required = true )
    private String queriesoftotal;

	@Length(max=80,min=0,message="抵押物顺位人一不能超出80位")
	@ApiModelProperty(value = "抵押物顺位人一", example = "", dataType="varchar(80)", required = true )
    private String mortgages1;

	@Length(max=80,min=0,message="第一顺位抵押权人不能超出80位")
	@ApiModelProperty(value = "第一顺位抵押权人", example = "", dataType="varchar(80)", required = true )
    private String mortgagesman1;

	@Length(max=80,min=0,message="抵押物顺位人二不能超出80位")
	@ApiModelProperty(value = "抵押物顺位人二", example = "", dataType="varchar(80)", required = true )
    private String mortgages2;

	@Length(max=80,min=0,message="第二顺位抵押权人不能超出80位")
	@ApiModelProperty(value = "第二顺位抵押权人", example = "", dataType="varchar(80)", required = true )
    private String mortgagesman2;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=40,min=0,message="前手一压机构名称不能超出40位")
	@ApiModelProperty(value = "前手一压机构名称", example = "", dataType="varchar(40)", required = true )
    private String oneagency;

	@Length(max=80,min=0,message="前手二押不能超出80位")
	@ApiModelProperty(value = "前手二押", example = "", dataType="varchar(80)", required = true )
    private String fronthandtwo;

	@Length(max=40,min=0,message="前手二押名称不能超出40位")
	@ApiModelProperty(value = "前手二押名称", example = "", dataType="varchar(40)", required = true )
    private String twoagency;
	
	@ApiModelProperty(value="总层数",required=true)
	private String floors;
	@ApiModelProperty(value="所在层数",required=true)
	private String numberoflayers;
	@ApiModelProperty(value="是否为电梯房",required=true)
	private String iselevatorroom;
}
