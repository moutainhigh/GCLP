package com.grape.controller.request;

import java.math.BigDecimal;

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
public class RedemptiontypeRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="原贷款银行不能超出80位")
	@ApiModelProperty(value = "原贷款银行", example = "", dataType="varchar(80)", required = true )
    private String beloanbank;

	@Length(max=80,min=0,message="新贷款银行不能超出80位")
	@ApiModelProperty(value = "新贷款银行", example = "", dataType="varchar(80)", required = true )
    private String newloanbank;

	@Length(max=17,min=0,message="原贷款金额不能超出17位")
	@ApiModelProperty(value = "原贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal applyamount;

	@Length(max=17,min=0,message="新批复金额不能超出17位")
	@ApiModelProperty(value = "新批复金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal osumofamount;

	@Length(max=80,min=0,message="赎楼账户名不能超出80位")
	@ApiModelProperty(value = "赎楼账户名", example = "", dataType="varchar(80)", required = true )
    private String redemaccountname;

	@Length(max=80,min=0,message="回款账户名不能超出80位")
	@ApiModelProperty(value = "回款账户名", example = "", dataType="varchar(80)", required = true )
    private String orepayaccountname;

	@Length(max=19,min=0,message="赎楼账号不能超出19位")
	@ApiModelProperty(value = "赎楼账号", example = "", dataType="varchar(19)", required = true )
    private String redemaccount;

	@Length(max=19,min=0,message="回款账号不能超出19位")
	@ApiModelProperty(value = "回款账号", example = "", dataType="varchar(19)", required = true )
    private String orepayaccount;

	@Length(max=120,min=0,message="回款开户行不能超出120位")
	@ApiModelProperty(value = "回款开户行", example = "", dataType="varchar(120)", required = true )
    private String orepayaccountbnk;

	@Length(max=120,min=0,message="赎楼开户行不能超出120位")
	@ApiModelProperty(value = "赎楼开户行", example = "", dataType="varchar(120)", required = true )
    private String redemccountbnk;

	@Length(max=1,min=0,message="是否第三方回款不能超出1位")
	@ApiModelProperty(value = "是否第三方回款", example = "", dataType="varchar(1)", required = true )
    private String isthirdpartyrepay;

	@Length(max=1,min=0,message="是否第三方赎楼不能超出1位")
	@ApiModelProperty(value = "是否第三方赎楼", example = "", dataType="varchar(1)", required = true )
    private String isthirdpartyredem;

	@Length(max=600,min=0,message="赎楼方案情况说明不能超出600位")
	@ApiModelProperty(value = "赎楼方案情况说明", example = "", dataType="varchar(600)", required = true )
    private String redemdescription;
}
