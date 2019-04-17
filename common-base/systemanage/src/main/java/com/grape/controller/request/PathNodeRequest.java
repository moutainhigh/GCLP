package com.grape.controller.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Procbranch;

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
public class PathNodeRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
