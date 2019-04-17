package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.response.bean.ProductAreaBean;
import com.grape.model.db.Proctask;
import com.grape.model.db.Productnode;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ProductnodeAndTaskInfo extends RestfulResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="节点基本信息页")
	private ProductnodeBean productnode;
	
	@ApiModelProperty(value="节点路径页")
	private PathNodeBean pathNodeInfo;
	
	@ApiModelProperty(value="节点按键信息")
	private NodeButtonBean nodeButtonBean;
	
	@ApiModelProperty(value="节点页面信息")
	private NodePageBean nodePageBean;
	
	@ApiModelProperty(value="节点职务信息")
	private NodeRoleBean nodeRoleBean;
	
}
