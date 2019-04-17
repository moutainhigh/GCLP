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

@Table(name = "workproc")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Workproc {//流程进度表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "process", nullable = true, length = 80)
	private String process;//流程类型

	@Column(name = "departid", nullable = true, length = 9)
	private String departid;//部门编号

	@Column(name = "creator", nullable = true, length = 8)
	private String creator;//创建人

	@Column(name = "createdate", nullable = true, length = 8)
	private String createdate;//创建日期

	@Column(name = "createtime", nullable = true, length = 6)
	private String createtime;//创建时间

}