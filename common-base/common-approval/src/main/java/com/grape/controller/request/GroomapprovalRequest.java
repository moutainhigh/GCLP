package com.grape.controller.request;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Groommortgage;

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
public class GroomapprovalRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;
	
	@ApiModelProperty(value = "审批历史关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=6,min=0,message="节点id不能超出6位")
	@ApiModelProperty(value = "节点id", example = "", dataType="varchar(6)", required = true )
    private String nodeid;

	@Length(max=1,min=0,message="债权回购承诺函是否收取不能超出1位")
	@ApiModelProperty(value = "债权回购承诺函是否收取", example = "", dataType="char(1)", required = true )
    private String debtbackflg;

	@Length(max=300,min=0,message="债权回购承诺函是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "债权回购承诺函是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String debtbacknote;

	@Length(max=1,min=0,message="推荐函是否回收不能超出1位")
	@ApiModelProperty(value = "推荐函是否回收", example = "", dataType="char(1)", required = true )
    private String groombackflg;

	@Length(max=300,min=0,message="推荐函是否回收情况说明不能超出300位")
	@ApiModelProperty(value = "推荐函是否回收情况说明", example = "", dataType="varchar(300)", required = true )
    private String groombacknote;

	@Length(max=300,min=0,message="渠道保证金是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "渠道保证金是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String chanpromisenote;

	@Length(max=1,min=0,message="渠道保证金是否收取不能超出1位")
	@ApiModelProperty(value = "渠道保证金是否收取", example = "", dataType="char(1)", required = true )
    private String chanpromiseflg;

	@Length(max=1,min=0,message="提前放款申请书是否收取不能超出1位")
	@ApiModelProperty(value = "提前放款申请书是否收取", example = "", dataType="char(1)", required = true )
    private String preoutloanbackflg;

	@Length(max=300,min=0,message="提前放款申请书是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "提前放款申请书是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String preoutloanbacknote;

	@Length(max=300,min=0,message="审批意见不能超出300位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(300)", required = true )
    private String notation;
	
	@Length(max=8,min=0,message="操作不能超出8位")
	@ApiModelProperty(value = "操作", example = "同意", dataType="varchar(8)", required = true )
    private String operation;
	
	@Length(max=8,min=0,message="下一节点操作人不能超出8位")
	@ApiModelProperty(value = "下一节点操作人", example = "FDD00401", dataType="varchar(8)", required = true )
    private String nextactor;
	
	@ApiModelProperty(value = "运营审批抵押物信息", example = "", required = true )
	private List<GroommortgageRequest> list;
	
}
