package com.grape.controller.request;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class MortgagefilingRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=19,min=0,message="抵押物查档ID不能超出19位")
	@ApiModelProperty(value = "抵押物查档ID", example = "", dataType="varchar(19)", required = true )
    private String mortgagefilingid;
	
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;
	
	@Length(max=1,min=0,message="抵押物是否有网签备案不能超出1位")
	@ApiModelProperty(value = "抵押物是否有网签备案", example = "", dataType="char(1)", required = true )
    private String isnetsign;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String closecount;

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
	
	@Length(max=80,min=0,message="前手一押不能超出80位")
	@ApiModelProperty(value = "前手一押", example = "", dataType="varchar(80)", required = true )
    private String fronthandone;

	@Length(max=80,min=0,message="前手二押不能超出80位")
	@ApiModelProperty(value = "前手二押", example = "", dataType="varchar(80)", required = true )
    private String fronthandtwo;

	@Length(max=40,min=0,message="前手一压机构名称不能超出40位")
	@ApiModelProperty(value = "前手一压机构名称", example = "", dataType="varchar(40)", required = true )
    private String oneagency;
	
	@Length(max=40,min=0,message="前手二押名称不能超出40位")
	@ApiModelProperty(value = "前手二押名称", example = "", dataType="varchar(40)", required = true )
    private String twoagency;

	
}
