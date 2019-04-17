package com.grape.controller.reponse.bean;

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
public class Userinfo {
	
	@ApiModelProperty(value="用户编号",required=true)
	private String workerid;
	
	@ApiModelProperty(value="用户名称",required=true)
	private String usrename;
	
	@ApiModelProperty(value="所属城市",required=true)
	private String city;
	
	@ApiModelProperty(value="所属城市编码",required=true)
	private String citycode;
	
	@ApiModelProperty(value="所属机构编号",required=true)
	private String organizationno;
	
	@ApiModelProperty(value="机构所属渠道编号",required=true)
	private String orgbelongsto;
	
	@ApiModelProperty(value="角色列表",required=true)
	private List<Roleinfo> roleinfos;
	
	@ApiModelProperty(value="菜单列表",required=true)
	private List<Menuinfo> menuinfos;
	

}
