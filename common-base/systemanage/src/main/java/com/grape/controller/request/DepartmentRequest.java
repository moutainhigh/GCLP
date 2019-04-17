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

/** 
* @author cwc
* @version 创建时间：2019年3月14日 下午4:00:01  
*/

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class DepartmentRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=6,min=0,message="部门编号不能超出6位")
	@ApiModelProperty(value = "部门编号", example = "", dataType="varchar(6)", required = true )
    private String departmentno;

	@Length(max=12,min=0,message="部门所属不能超出12位")
	@ApiModelProperty(value = "部门所属", example = "", dataType="varchar(12)", required = true )
    private String depbelongsto;

	@Length(max=6,min=0,message="所属公司编号不能超出6位")
	@ApiModelProperty(value = "所属公司编号", example = "", dataType="varchar(6)", required = true )
    private String organizationno;

	@Length(max=80,min=0,message="部门名称不能超出80位")
	@ApiModelProperty(value = "部门名称", example = "", dataType="varchar(80)", required = true )
    private String departmentname;

	@Length(max=80,min=0,message="联系人不能超出80位")
	@ApiModelProperty(value = "联系人", example = "", dataType="varchar(80)", required = true )
    private String linkman;

	@Length(max=20,min=0,message="联系电话不能超出20位")
	@ApiModelProperty(value = "联系电话", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@Length(max=200,min=0,message="办公地址不能超出200位")
	@ApiModelProperty(value = "办公地址", example = "", dataType="varchar(200)", required = true )
    private String address;

	@Length(max=1,min=0,message="部门代码不能超出1位")
	@ApiModelProperty(value = "部门代码", example = "", dataType="char(1)", required = true )
    private String departmentcode;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=6,min=0,message="上级部门不能超出6位")
	@ApiModelProperty(value = "上级部门", example = "", dataType="varchar(6)", required = true )
    private String superdep;

	@Length(max=4,min=0,message="级别不能超出4位")
	@ApiModelProperty(value = "级别", example = "", dataType="varchar(4)", required = true )
    private String level;

}
