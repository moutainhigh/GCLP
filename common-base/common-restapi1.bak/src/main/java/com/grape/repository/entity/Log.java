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

@Table(name = "log")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Log {//日志表

	@Id
	@Column(name = "logid", nullable = false, length = 19)
	private String logid;//日志主键

	@Column(name = "type", nullable = true, length = 10)
	private String type;//类型

	@Column(name = "typevalue", nullable = true, length = 40)
	private String typevalue;//类型描述

	@Column(name = "descriptions", nullable = true)
	private String descriptions;//描述

	@Column(name = "checktl", nullable = true, length = 8)
	private String checktl;//记录人

	@Column(name = "organizationno", nullable = true, length = 5)
	private String organizationno;//机构编号

	@Column(name = "departmentno", nullable = true, length = 6)
	private String departmentno;//部门编号

	@Column(name = "ref_logid", nullable = true, length = 19)
	private String ref_logid;//

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改日期

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改时间

}