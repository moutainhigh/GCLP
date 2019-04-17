package com.grape.controller.reponse.bean;

import java.sql.Timestamp;

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
public class Msginfo {
	
	
	@ApiModelProperty(value="贷款流水号",required=true)
	private String workid;
	@ApiModelProperty(value="消息编号",required=true)
	private String id;
	@ApiModelProperty(value="消息类型",required=true)
	private String msgtype;
	@ApiModelProperty(value="消息类型名称",required=true)
	private String msgtypename;
	@ApiModelProperty(value="消息内容",required=true)
	private String content;
	@ApiModelProperty(value="消息状态",required=true)
	private String state;
	@ApiModelProperty(value="消息状态名称",required=true)
	private String statename;
	@ApiModelProperty(value="节点",required=true)
	private String nodeid;
	@ApiModelProperty(value="产品编号",required=true)
	private String productno;
	@ApiModelProperty(value="发送人",required=true)
	private String senduser;
	@ApiModelProperty(value="发送时间",required=true)
	private Timestamp chgdt;
	
	
}
