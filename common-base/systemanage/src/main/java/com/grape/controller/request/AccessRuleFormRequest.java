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
public class AccessRuleFormRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=6,min=0,message="产品码不能超出6位")
	@ApiModelProperty(value = "产品码", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=80,min=0,message="规则名称不能超出80位")
	@ApiModelProperty(value = "规则名称", example = "", dataType="varchar(80)", required = true )
    private String rulename;

	@Length(max=1000,min=0,message="表达式不能超出1000位")
	@ApiModelProperty(value = "表达式", example = "", dataType="varchar(1000)", required = true )
    private String expression;

	@Length(max=1,min=0,message="准入类型不能超出1位")
	@ApiModelProperty(value = "准入类型", example = "", dataType="char(1)", required = true )
    private String admittancetype;

	@Length(max=1,min=0,message="命中时是否尽调注意事项不能超出1位")
	@ApiModelProperty(value = "命中时是否尽调注意事项", example = "", dataType="char(1)", required = true )
    private String isattention;

	@Length(max=1,min=0,message="命中时是否审批注意事项不能超出1位")
	@ApiModelProperty(value = "命中时是否审批注意事项", example = "", dataType="char(1)", required = true )
    private String isworkidtice;

	@Length(max=200,min=0,message="异常提示信息不能超出200位")
	@ApiModelProperty(value = "异常提示信息", example = "", dataType="varchar(200)", required = true )
    private String remark;

	@Length(max=2,min=0,message="校验类型[是否必要条件]不能超出2位")
	@ApiModelProperty(value = "校验类型[是否必要条件]", example = "", dataType="varchar(2)", required = true )
    private String validtype;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String rulestype;

	@Length(max=2,min=0,message="规则状态不能超出2位")
	@ApiModelProperty(value = "规则状态", example = "", dataType="varchar(2)", required = true )
    private String state;

}
