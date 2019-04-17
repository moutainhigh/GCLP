package com.grape.controller.request;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Mortgagestate;

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
public class RiskapprovalRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;
	
	@ApiModelProperty(value = "审批历史关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=1,min=0,message="审批条件是否已落实不能超出1位")
	@ApiModelProperty(value = "审批条件是否已落实", example = "", dataType="char(1)", required = true )
    private String conditiondownflg;

	@Length(max=300,min=0,message="审批条件落实意见不能超出300位")
	@ApiModelProperty(value = "审批条件落实意见", example = "", dataType="varchar(300)", required = true )
    private String conditiondownnote;

	@Length(max=1,min=0,message="是否建议放款不能超出1位")
	@ApiModelProperty(value = "是否建议放款", example = "", dataType="char(1)", required = true )
    private String suggestloanflg;

	@Length(max=300,min=0,message="建议放款意见情况说明不能超出300位")
	@ApiModelProperty(value = "建议放款意见情况说明", example = "", dataType="varchar(300)", required = true )
    private String suggestloannote;

	@Length(max=300,min=0,message="审批意见不能超出300位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(300)", required = true )
    private String notation;
	
	@ApiModelProperty(value="抵押物查档信息",example="",dataType="",required=true)
	private List<Mortgagestate> mortgagestates;
	
	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "00000000", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=6,min=0,message="节点不能超出6位")
	@ApiModelProperty(value = "节点", example = "FDD001", dataType="varchar(6)", required = true )
    private String nodeid;
	
	@Length(max=8,min=0,message="操作不能超出8位")
	@ApiModelProperty(value = "操作", example = "同意", dataType="varchar(8)", required = true )
    private String operation;
	
	@Length(max=8,min=0,message="下一节点操作人不能超出8位")
	@ApiModelProperty(value = "下一节点操作人", example = "FDD00401", dataType="varchar(8)", required = true )
    private String nextactor;
	
	@ApiModelProperty(value = "退回节点", required = false, example="渠道报单")
    private String backNodeid;
	
	@ApiModelProperty(value = "返回类型", required = false, example="1")
    private String backflg;
	
	@ApiModelProperty(value = "审批历史类型", required = false, example="6")
    private String histtype;
	
	@ApiModelProperty(value = "分叉编号", required = true, example="0")
    private String forkid;
	
	@ApiModelProperty(value = "分支编号", required = true, example="0")
    private String branchid;
	
	@ApiModelProperty(value = "流程编号（产品码）", required = true, example="PRD004")
    private String processid;

}
