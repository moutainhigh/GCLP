package com.grape.controller.request;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.model.db.Proctask;

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
public class ProductNodeRequest extends RestfulResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "节点类型", example = "", dataType="varchar(20)", required = true )
    private String type;

	@Length(max=19,min=0,message="节点编号不能超出19位")
	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(19)", required = true )
    private String nodeid;

	@Length(max=80,min=0,message="节点名称不能超出80位")
	@ApiModelProperty(value = "节点名称", example = "", dataType="varchar(80)", required = true )
    private String nodename;

	@Length(max=6,min=0,message="产品编号不能超出6位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "主干", example = "", dataType="varchar(19)", required = true )
    private String fork;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "汇合", example = "", dataType="varchar(19)", required = true )
    private String branch;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "下一节点", example = "", dataType="varchar(19)", required = true )
    private String tonode;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(1)", required = true )
    private String lane;

	@Length(max=4,min=0,message="分配类型不能超出4位")
	@ApiModelProperty(value = "分配类型", example = "", dataType="varchar(4)", required = true )
    private String assignmode;

	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String authority;

	@Length(max=20,min=0,message="审批阶段不能超出20位")
	@ApiModelProperty(value = "审批阶段", example = "", dataType="varchar(20)", required = true )
    private String stage;

	@Length(max=19,min=0,message="下一审批人指派目标节点不能超出19位")
	@ApiModelProperty(value = "下一审批人指派目标节点", example = "", dataType="varchar(19)", required = true )
    private String assigntagnode;

	@Length(max=2,min=0,message="处理时间不能超出2位")
	@ApiModelProperty(value = "处理时间", example = "", dataType="varchar(2)", required = true )
    private String processtime;

	@Length(max=2,min=0,message="不能超出2位")
	@ApiModelProperty(value = "会签数量", example = "", dataType="varchar(2)", required = true )
    private String approvenum;
	
	@Length(max=2,min=0,message="节点状态不能超出2位")
	@ApiModelProperty(value = "节点状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@Length(max=2,min=0,message="是否虚拟节点不能超出2位")
	@ApiModelProperty(value = "是否真实节点", example = "", dataType="varchar(2)", required = true )
    private String istruenode;
	
	@Length(max=2,min=0,message="审批类型不能超出2位")
	@ApiModelProperty(value = "审批类型", example = "", dataType="varchar(2)", required = true )
    private String bussinesstype;
	
	@ApiModelProperty(value="节点任务列表信息")
	private List<Proctask> proctasks;
	
}
