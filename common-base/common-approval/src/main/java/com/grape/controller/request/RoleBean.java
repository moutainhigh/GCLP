package com.grape.controller.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoleBean {
	@ApiModelProperty(value = "用户名", example = "", dataType="char(19)", required = true )
    private String workerName;

	@ApiModelProperty(value = "用户角色", example = "", dataType="char(19)", required = true )
    private String roleName;

	@ApiModelProperty(value = "待办数量", example = "", dataType="int", required = true )
    private int total;
	
	@ApiModelProperty(value = "工作号", example = "", dataType="int", required = true )
    private String workerid;
	
	@ApiModelProperty(value = "节点名称", example = "", dataType="int", required = true )
	private String nodename ;
	
	@ApiModelProperty(value = "节点", example = "", dataType="int", required = true )
	private String nodeid ;

	public RoleBean(String nodename , String nodeid) {
		this.nodename = nodename ;
		this.nodeid = nodeid ;
	}

	public RoleBean() {
	}
}
