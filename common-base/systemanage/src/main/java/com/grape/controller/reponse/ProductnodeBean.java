package com.grape.controller.reponse;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.grape.model.db.Proctask;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductnodeBean {
	
	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
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
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String fork;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String branch;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String tonode;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(1)", required = true )
    private String lane;

	@Length(max=4,min=0,message="不能超出4位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(4)", required = true )
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
	@ApiModelProperty(value = "", example = "", dataType="varchar(2)", required = true )
    private String approvenum;

	@Length(max=2,min=0,message="节点状态不能超出2位")
	@ApiModelProperty(value = "节点状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@Length(max=2,min=0,message="是否虚拟节点不能超出2位")
	@ApiModelProperty(value = "是否虚拟节点", example = "", dataType="varchar(2)", required = true )
    private String istruenode;

	@Length(max=2,min=0,message="审批类型不能超出2位")
	@ApiModelProperty(value = "审批类型", example = "", dataType="varchar(2)", required = true )
    private String bussinesstype;
	
	private List<Proctask> proctasks;
}
