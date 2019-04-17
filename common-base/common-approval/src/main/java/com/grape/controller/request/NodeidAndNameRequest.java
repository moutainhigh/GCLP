package com.grape.controller.request;

import java.math.BigDecimal;

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
public class NodeidAndNameRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=80,min=0,message="操作名称")
	@ApiModelProperty(value = "操作", example = "", dataType="varchar", required = true )
	 private String name;

	@Length(max=5,min=0,message="节点")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar", required = true )
	private String nodeid;

	@Length(max=5,min=0,message="")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar", required = true )
	private String workid;
}
