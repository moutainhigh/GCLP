package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.RestfulResponse;

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
public class FlowHandleResponse extends RestfulResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "流水编号", required = true, example="0000000001")
    private String workid;
	
	@ApiModelProperty(value = "产品码", required = true, example="PRD004")
    private String productno;
	
	@ApiModelProperty(value = "节点编号", required = true, example="PRD00401")
    private String nodeid;
	
	@ApiModelProperty(value = "主键id", required = true, example="0000000001")
    private String logid;
	
}
