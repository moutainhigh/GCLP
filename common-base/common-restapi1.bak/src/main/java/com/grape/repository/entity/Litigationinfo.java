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

@Table(name = "litigationinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Litigationinfo {//诉讼信息表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "isborrlitigation", nullable = true, length = 1)
	private String isborrlitigation;//借款人是否有诉讼记录

	@Column(name = "iscomlitigation", nullable = true, length = 1)
	private String iscomlitigation;//公司是否有诉讼记录

	@Column(name = "litigationstate", nullable = true, length = 10)
	private String litigationstate;//诉讼状态

	@Column(name = "litigationtype", nullable = true, length = 10)
	private String litigationtype;//诉讼类型

	@Column(name = "isdishonest", nullable = true, length = 1)
	private String isdishonest;//是否是失信人

	@Column(name = "litigationexplain", nullable = true, length = 300)
	private String litigationexplain;//诉讼情况说明

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//操作日期

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//操作人

}