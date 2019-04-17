package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class FlowHandleRequest extends RestfulRequest{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "操作人编号", required = true, example="00000001")
    private String actor;
	
	@ApiModelProperty(value = "流水号", required = true, example="0000000001")
    private String workid;
	
	@ApiModelProperty(value = "分叉编号", required = true, example="0")
    private String forkid;
	
	@ApiModelProperty(value = "分支编号", required = true, example="0")
    private String branchid;
	
	@ApiModelProperty(value = "流程编号（产品码）", required = true, example="房抵贷001号")
    private String processid;
	
	@ApiModelProperty(value = "操作节点", required = true, example="风控一级审批")
    private String nodeid;
	
	@ApiModelProperty(value = "操作", required = true, example="同意")
    private String operation;
	
	@ApiModelProperty(value = "意见内容", required = true, example="同意贷款")
    private String notation;
	
	@ApiModelProperty(value = "下一环节审批人编号", required = true, example="00000002")
    private String nextActor;
	
	@ApiModelProperty(value = "审批历史类型", required = true, example="00000002")
    private String histtype;
	
	@ApiModelProperty(value = "退回节点", required = false, example="渠道报单")
    private String backNodeid;
	
	@ApiModelProperty(value = "返回类型", required = false, example="1")
    private String backflg;
	
}
