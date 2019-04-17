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
* @version 创建时间：2019年3月11日 下午3:24:25  
*/
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class CompanyRequest extends RestfulRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=6,min=0,message="机构编号不能超出6位")
	@ApiModelProperty(value = "机构编号", example = "", dataType="varchar(6)", required = true )
    private String organizationno;

	@Length(max=60,min=0,message="机构名称不能超出60位")
	@ApiModelProperty(value = "机构名称", example = "", dataType="varchar(60)", required = true )
    private String organizationname;

	@Length(max=16,min=0,message="机构所属不能超出16位")
	@ApiModelProperty(value = "机构所属", example = "", dataType="varchar(16)", required = true )
    private String orgbelongsto;

	@Length(max=80,min=0,message="联系人不能超出80位")
	@ApiModelProperty(value = "联系人", example = "", dataType="varchar(80)", required = true )
    private String linkman;

	@Length(max=20,min=0,message="联系电话不能超出20位")
	@ApiModelProperty(value = "联系电话", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@Length(max=200,min=0,message="办公地址不能超出200位")
	@ApiModelProperty(value = "办公地址", example = "", dataType="varchar(200)", required = true )
    private String address;

	@Length(max=1,min=0,message="机构代码不能超出1位")
	@ApiModelProperty(value = "机构代码", example = "", dataType="char(1)", required = true )
    private String organizationcode;

	@Length(max=1,min=0,message="机构级别不能超出1位")
	@ApiModelProperty(value = "机构级别", example = "", dataType="char(1)", required = true )
    private String orgleavel;

	@Length(max=30,min=0,message="公司简称不能超出30位")
	@ApiModelProperty(value = "公司简称", example = "", dataType="varchar(30)", required = true )
    private String orgofch;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "机构描述", example = "", dataType="longtext", required = true )
    private String description;
}
