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

@Table(name = "creditrecode")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Creditrecode {//信用记录表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "creditreportdate", nullable = true)
	private Date creditreportdate;//征信报告日期

	@Column(name = "isblackofloancredit", nullable = true, length = 1)
	private String isblackofloancredit;//贷款征信记录是否空白

	@Column(name = "isblackofcreditcard", nullable = true, length = 1)
	private String isblackofcreditcard;//信用卡征信记录是否空白

	@Column(name = "iswarnofcredit", nullable = true, length = 1)
	private String iswarnofcredit;//信用记录是否包含止付、冻结、呆账

	@Column(name = "isoverdue", nullable = true, length = 1)
	private String isoverdue;//当前是否逾期

	@Column(name = "isrecentoverdue", nullable = true, length = 1)
	private String isrecentoverdue;//近24个月内是否有逾期记录

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//操作人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//操作时间

}