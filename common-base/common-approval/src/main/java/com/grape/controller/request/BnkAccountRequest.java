package com.grape.controller.request;

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
public class BnkAccountRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="打划款账户名不能超出80位")
	@ApiModelProperty(value = "打划款账户名", example = "", dataType="varchar(80)", required = true )
    private String accountname;

	@Length(max=19,min=0,message="打划款账户不能超出19位")
	@ApiModelProperty(value = "打划款账户", example = "", dataType="varchar(19)", required = true )
    private String account;

	@Length(max=80,min=0,message="打划款开户行不能超出80位")
	@ApiModelProperty(value = "打划款开户行", example = "", dataType="varchar(80)", required = true )
    private String bnk;

	@Length(max=120,min=0,message="还款开户行不能超出120位")
	@ApiModelProperty(value = "还款开户行", example = "", dataType="varchar(120)", required = true )
    private String repayaccountbnk;

	@Length(max=80,min=0,message="还款账户名不能超出80位")
	@ApiModelProperty(value = "还款账户名", example = "", dataType="varchar(80)", required = true )
    private String repayaccountname;

	@Length(max=19,min=0,message="还款账号不能超出19位")
	@ApiModelProperty(value = "还款账号", example = "", dataType="varchar(19)", required = true )
    private String repayaccount;


}
