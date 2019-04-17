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
public class RiskapprovalformRequest extends RestfulRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "0000000001", dataType="varchar(10)", required = true )
    private String workid;
	
	@ApiModelProperty(value = "审批历史关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=1,min=0,message="各个合同是否已签署正确不能超出1位")
	@ApiModelProperty(value = "各个合同是否已签署正确", example = "Y", dataType="char(1)", required = true )
    private String pactsignflg;

	@Length(max=300,min=0,message="各类合同是否正确签署情况说明不能超出300位")
	@ApiModelProperty(value = "各类合同是否正确签署情况说明", example = "无", dataType="varchar(300)", required = true )
    private String pactsignnote;

	@Length(max=1,min=0,message="各个声明文件是否已正确签署不能超出1位")
	@ApiModelProperty(value = "各个声明文件是否已正确签署", example = "Y", dataType="char(1)", required = true )
    private String statesignflg;

	@Length(max=300,min=0,message="各个声明文件是否已正确签署情况说明不能超出300位")
	@ApiModelProperty(value = "各个声明文件是否已正确签署情况说明", example = "无", dataType="varchar(300)", required = true )
    private String statesignnote;

	@Length(max=300,min=0,message="审批意见不能超出300位")
	@ApiModelProperty(value = "审批意见", example = "无", dataType="varchar(300)", required = true )
    private String notation;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "00000000", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=6,min=0,message="节点不能超出6位")
	@ApiModelProperty(value = "节点", example = "FDD001", dataType="varchar(6)", required = true )
    private String nodeid;
	
	@ApiModelProperty(value = "抵押物查档信息", example = "", dataType="", required = true )
	private List<Mortgagestate> list;
	
	@Length(max=8,min=0,message="操作不能超出8位")
	@ApiModelProperty(value = "操作", example = "同意", dataType="varchar(8)", required = true )
    private String operation;
	
	@Length(max=8,min=0,message="下一节点操作人不能超出8位")
	@ApiModelProperty(value = "下一节点操作人", example = "FDD00401", dataType="varchar(8)", required = true )
    private String nextactor;
	

}
