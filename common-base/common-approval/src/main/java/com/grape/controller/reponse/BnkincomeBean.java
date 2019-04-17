package com.grape.controller.reponse;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.grape.controller.bean.Monthtotal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BnkincomeBean{
	
	@Length(max=80,min=0,message="所属银行不能超出80位")
	@ApiModelProperty(value = "所属银行", example = "", dataType="varchar(80)", required = true )
    private String bnkname;
	
	@ApiModelProperty(value = "身份证号", example = "", dataType="varchar(80)", required = true )
    private String cerdid;

	@Length(max=19,min=0,message="银行账户不能超出19位")
	@ApiModelProperty(value = "银行账户", example = "", dataType="varchar(19)", required = true )
    private String bnkaccount;

	@ApiModelProperty(value = "流水日期", example = "", dataType="datetime", required = true )
    private Date incomedate;
	
	@ApiModelProperty(value = "单个账户流水总计", example = "", required = true )
	private BigDecimal totalamount;

	@Length(max=80,min=0,message="其他所属银行不能超出80位")
	@ApiModelProperty(value = "其他所属银行", example = "", dataType="varchar(80)", required = true )
    private String banname2;
	
	@Length(max=40,min=0,message="薪资来源不能超出40位")
	@ApiModelProperty(value = "薪资来源", example = "", dataType="varchar(40)", required = true )
    private String amountsource;

	@Length(max=4,min=0,message="收入计算方式不能超出4位")
	@ApiModelProperty(value = "收入计算方式", example = "", dataType="varchar(4)", required = true )
    private String incomeway;
	
	@ApiModelProperty(value = "流水信息", example = "", dataType="varchar(80)", required = true )
    private List<BnkincomeinfoBean> bnkincomeinfo;
	
	@ApiModelProperty(value = "流水信息", example = "", dataType="varchar(80)", required = true )
    private List<Monthtotal> monthtotal;
	
	@ApiModelProperty(value = "收入来源描述", example = "", dataType="varchar(80)", required = true )
    private String incomedesc;
    
}
