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
public class ProductNodeInfoRequest extends RestfulResponse{

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
	
	@Length(max=2,min=0,message="节点状态不能超出2位")
	@ApiModelProperty(value = "节点状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@Length(max=6,min=0,message="产品编号不能超出6位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(6)", required = true )
    private String productno;
	
	@ApiModelProperty(value="页面数量")
	private Integer pagenum;
	
	@ApiModelProperty(value="页面大小")
	private Integer pagesize;

	
}
