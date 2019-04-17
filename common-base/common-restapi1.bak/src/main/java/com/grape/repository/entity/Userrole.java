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

@Table(name = "userrole")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Userrole {//用户角色表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//授权编号

	@Column(name = "workerid", nullable = true, length = 8)
	private String workerid;//用户编号

	@Column(name = "roleid", nullable = true, length = 4)
	private String roleid;//角色编号

	@Column(name = "type", nullable = true, length = 1)
	private String type;//授权类型

	@Column(name = "authworkerid", nullable = true, length = 8)
	private String authworkerid;//授权人

	@Column(name = "authstate", nullable = true)
	private Date authstate;//授权开始时间

	@Column(name = "authend", nullable = true)
	private Date authend;//授权结束日期

}