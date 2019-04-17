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
public class ProcnodefileRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/*	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;
*/
	@Length(max=4,min=0,message="节点编号不能超出4位")
	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(4)", required = true )
    private String nodeid;
/*
	@Length(max=4,min=0,message="档案编号不能超出4位")
	@ApiModelProperty(value = "档案编号", example = "", dataType="varchar(4)", required = true )
    private String fileno;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;
*/
	@Length(max=10,min=0,message="产品编号不能超出10位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(10)", required = true )
    private String priductno;

	/*@Length(max=20,min=0,message="文件名不能超出20位")
	@ApiModelProperty(value = "文件名", example = "", dataType="varchar(20)", required = true )
    private String filename;

	@Length(max=10,min=0,message="类型不能超出10位")
	@ApiModelProperty(value = "类型", example = "", dataType="varchar(10)", required = true )
    private String type;*/
}
