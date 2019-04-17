package com.grape.controller.reponse;

import java.util.List;

import com.grape.model.db.Procbranch;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PathNodeBean {
	
	@ApiModelProperty(value="汇聚主键ID")
	private String conditionid;
	
	@ApiModelProperty(value="节点名称")
	private String nodename;
	
	@ApiModelProperty(value="节点编号")
	private String nodeid;
	
	@ApiModelProperty(value="分支数量")
	private String appear;
	
	@ApiModelProperty(value="分支列表信息")
	private List<Procbranch> procbranchs;
	
	@ApiModelProperty(value="分支结束节点")
	private String branchendnode;
	
	@ApiModelProperty(value="分支结束跳转节点")
	private String branchendtonode;
}
