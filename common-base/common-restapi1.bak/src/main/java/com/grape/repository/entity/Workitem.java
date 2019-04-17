package com.grape.repository.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Table(name = "workitem")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Workitem {//流程条数表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "fork", nullable = true, length = 20)
	private String fork;//分支

	@Column(name = "branch", nullable = true, length = 20)
	private String branch;//子流程标志

	@Column(name = "node", nullable = true, length = 20)
	private String node;//节点

	@Column(name = "state", nullable = true, length = 1)
	private String state;//状态

	@Column(name = "departlv", nullable = true, length = 120)
	private String departlv;//部门等级

	@Column(name = "roleid", nullable = true, length = 4)
	private String roleid;//操作角色

	@Column(name = "userid", nullable = true, length = 8)
	private String userid;//操作人

	@Column(name = "version", nullable = true)
	private Date version;//时间

}