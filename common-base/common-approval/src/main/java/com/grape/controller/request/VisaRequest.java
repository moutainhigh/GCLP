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
public class VisaRequest extends RestfulRequest{
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "预约时间", example = "2019-09-09", dataType="datetime", required = true )
	private Date reservationtime ;
	
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "0000000001", dataType="varchar(10)", required = true )
    private String workid;
	
	@Length(max=6,min=0,message="节点不能超出6位")
	@ApiModelProperty(value = "节点", example = "PDD004", dataType="varchar(6)", required = true )
    private String nodeid;
	
	@Length(max=8,min=0,message="操作不能超出8位")
	@ApiModelProperty(value = "操作", example = "同意", dataType="varchar(8)", required = true )
    private String operation;
	
	@Length(max=8,min=0,message="下一节点操作人不能超出8位")
	@ApiModelProperty(value = "下一节点操作人", example = "FDD00401", dataType="varchar(8)", required = true )
    private String nextactor;
	
	@ApiModelProperty(value = "审批历史类型", required = true, example="00000002")
    private String type;

}
