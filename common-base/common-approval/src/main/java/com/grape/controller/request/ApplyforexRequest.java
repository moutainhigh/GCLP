package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.response.bean.ComapplyBean;

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
public class ApplyforexRequest extends RestfulRequest{
	private static final long serialVersionUID = 1L;
	
	@Length(max=20,min=0,message="主借款人不能超出20位")
	@ApiModelProperty(value = "主借款人", example = "", dataType="varchar(20)", required = true )
    private String mainborrower;

	@Length(max=40,min=0,message="证件号码不能超出40位")
	@ApiModelProperty(value = "证件号码", example = "", dataType="varchar(40)", required = true )
    private String identifino;

	@Length(max=17,min=0,message="展期金额不能超出17位")
	@ApiModelProperty(value = "展期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal examount;

	@Length(max=9,min=0,message="展期年限不能超出9位")
	@ApiModelProperty(value = "展期年限", example = "", dataType="varchar(9)", required = true )
    private String exage;

	@Length(max=9,min=0,message="展期利率不能超出9位")
	@ApiModelProperty(value = "展期利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal exinterestrate;

	@Length(max=32,min=0,message="还款方式不能超出32位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(32)", required = true )
    private String repaymethod;

	@Length(max=255,min=0,message="展期原因不能超出255位")
	@ApiModelProperty(value = "展期原因", example = "", dataType="varchar(255)", required = true )
    private String exreason;

	@Length(max=19,min=0,message="展期流水不能超出19位")
	@ApiModelProperty(value = "展期流水", example = "", dataType="varchar(19)", required = true )
    private String newworkid;

	@Length(max=19,min=0,message="原贷款流水不能超出19位")
	@ApiModelProperty(value = "原贷款流水", example = "", dataType="varchar(19)", required = true )
    private String workid;
	
	/*@Length(max=19,min=0,message="共同借款人不能超出19位")
	@ApiModelProperty(value = "共同借款人", example = "", dataType="varchar(19)", required = true )
    private String comapply;

	@Length(max=19,min=0,message="国籍不能超出19位")
	@ApiModelProperty(value = "国籍", example = "", dataType="varchar(19)", required = true )
    private String nationality;

	@Length(max=40,min=0,message="证件号码不能超出40位2")
	@ApiModelProperty(value = "证件号码", example = "", dataType="varchar(40)", required = true )
    private String identi;*/
	
	List<ComapplyBean> comapplyBean ;
	
	@ApiModelProperty(value = "操作人", required = true, example="00000001")
    private String actor;
	
	@ApiModelProperty(value = "流程类型（产品编号）", required = true, example="PRD001")
    private String productno;
	
	@Length(max=8,min=0,message="操作不能超出8位")
	@ApiModelProperty(value = "操作", example = "同意", dataType="varchar(8)", required = true )
    private String operation;
	
	@Length(max=8,min=0,message="下一节点操作人不能超出8位")
	@ApiModelProperty(value = "下一节点操作人", example = "FDD00401", dataType="varchar(8)", required = true )
    private String nextactor;
	

}
