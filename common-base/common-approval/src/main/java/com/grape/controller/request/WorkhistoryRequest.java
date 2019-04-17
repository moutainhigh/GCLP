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
public class WorkhistoryRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="申请编号",required=true,example="0000000001")
	@Length(min=0,max=10,message="workid最大长度为10")
	private String workid;
	
	@ApiModelProperty(value="审批人",required=true,example="32920908")
	@Length(min=0,max=8,message="审批人最大长度为8")
	private String userid;
	
	@ApiModelProperty(value="节点",required=true,example="0102")
	@Length(min=0,max=4,message="节点最大长度为4")
	private String node;
	
	@ApiModelProperty(value="下一节点",required=true,example="0103")
	@Length(min=0,max=4,message="下一节点最大长度为4")
	private String nextnode;
	
	@ApiModelProperty(value="审批意见",required=true,example="无")
	private String notation;
	
	@ApiModelProperty(value="操作",required=true,example="退回")
	@Length(min=0,max=80,message="操作最大长度为80")
	private String operation;
	
	@ApiModelProperty(value="操作日期",required=true,example="20190909")
	@Length(min=0,max=8,message="操作日期最大长度为8")
	private String operdate;
	
	@ApiModelProperty(value="操作时间",required=true,example="12:12:12")
	@Length(min=0,max=6,message="操作时间最大长度为6")
	private String opertime;
	

}
