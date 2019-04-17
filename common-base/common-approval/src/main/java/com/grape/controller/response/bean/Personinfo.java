package com.grape.controller.response.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Personinfo {
	
	@ApiModelProperty(value="用户编号",required=true)
	private String workerid;
	@ApiModelProperty(value="用户名称",required=true)
	private String workername;
	@ApiModelProperty(value="所属机构",required=true)
	private String organization;
	@ApiModelProperty(value="所属部门",required=true)
	private String department;
	@ApiModelProperty(value="角色列表",required=true)
	private List<Roleinfo> roleinfos;
	@ApiModelProperty(value="产品名称",required=true)
	private String mobilephone;
	@ApiModelProperty(value="邮箱",required=true)
	private String email;
	@ApiModelProperty(value="机构所属编号",required=true)
	private String orgbelongsto;
	@ApiModelProperty(value="机构所属名称",required=true)
	private String orgbelongstoname;
	
	
}
