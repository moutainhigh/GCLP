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

@Table(name = "person")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Person {//用户表

	@Id
	@Column(name = "workerid", nullable = false, length = 8)
	private String workerid;//用户编号

	@Column(name = "workername", nullable = true, length = 80)
	private String workername;//用户名称

	@Column(name = "password", nullable = true, length = 80)
	private String password;//密码

	@Column(name = "department", nullable = true, length = 6)
	private String department;//所属部门

	@Column(name = "state", nullable = true, length = 4)
	private String state;//状态

	@Column(name = "organizationid", nullable = true, length = 6)
	private String organizationid;//所属机构

	@Column(name = "telnumber", nullable = true, length = 20)
	private String telnumber;//电话号码

	@Column(name = "mobilephone", nullable = true, length = 11)
	private String mobilephone;//手机号码

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改日期

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "bnkno", nullable = true, length = 5)
	private String bnkno;//

	@Column(name = "clsno", nullable = true, length = 1)
	private String clsno;//

	@Column(name = "logon", nullable = true, length = 1)
	private String logon;//

	@Column(name = "mobphone", nullable = true, length = 30)
	private String mobphone;//

	@Column(name = "roleid", nullable = true, length = 8)
	private String roleid;//

	@Column(name = "teamno", nullable = true, length = 32)
	private String teamno;//

	@Column(name = "telephone", nullable = true, length = 30)
	private String telephone;//

	@Column(name = "tlrid", nullable = false, length = 40)
	private String tlrid;//

	@Column(name = "tlrname", nullable = true, length = 60)
	private String tlrname;//

	@Column(name = "tlrpwd", nullable = true, length = 80)
	private String tlrpwd;//

	@Column(name = "tlrrecst", nullable = true, length = 1)
	private String tlrrecst;//

}