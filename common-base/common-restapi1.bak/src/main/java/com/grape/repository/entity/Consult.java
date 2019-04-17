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

@Table(name = "consult")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Consult {//查档表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "consultman", nullable = true, length = 80)
	private String consultman;//查档人

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//流水编号

	@Column(name = "mortgageno", nullable = true, length = 19)
	private String mortgageno;//抵押物编号

	@Column(name = "consultresult", nullable = true, length = 10)
	private String consultresult;//查档结果

	@Column(name = "consultstate", nullable = true, length = 10)
	private String consultstate;//查档状态

	@Column(name = "consultdate", nullable = true)
	private Date consultdate;//查档日期

}