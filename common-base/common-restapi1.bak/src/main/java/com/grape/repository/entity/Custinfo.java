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

@Table(name = "custinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Custinfo {//申请人信息表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//贷款流水号

	@Column(name = "custno", nullable = true, length = 10)
	private String custno;//客户编号

	@Column(name = "custtype", nullable = true, length = 4)
	private String custtype;//客户类型

	@Column(name = "custname", nullable = true, length = 80)
	private String custname;//客户姓名

	@Column(name = "sex", nullable = true, length = 1)
	private String sex;//性别

	@Column(name = "cerdid", nullable = true, length = 32)
	private String cerdid;//身份证号

	@Column(name = "birthday", nullable = true)
	private Date birthday;//出生年月

	@Column(name = "telnumber", nullable = true, length = 20)
	private String telnumber;//电话号码

	@Column(name = "familyaddress", nullable = true, length = 300)
	private String familyaddress;//家庭住址

	@Column(name = "age", nullable = true, length = 4)
	private String age;//年龄

	@Column(name = "censusregister", nullable = true, length = 120)
	private String censusregister;//户籍

	@Column(name = "maritalstatus", nullable = true, length = 1)
	private String maritalstatus;//婚姻状况

	@Column(name = "islitigation", nullable = true, length = 1)
	private String islitigation;//是否有诉讼记录

	@Column(name = "job", nullable = true, length = 80)
	private String job;//职业

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//操作时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//操作人

}