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

@Table(name = "repayplan")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Repayplan {//还款计划表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//申请编号

	@Column(name = "repaydate", nullable = true)
	private Date repaydate;//应还款日期

	@Column(name = "repayamount", nullable = true, length = 17)
	private Double repayamount;//应还款金额

	@Column(name = "repaycapital", nullable = true, length = 17)
	private Double repaycapital;//应还款本金

	@Column(name = "repayaccrual", nullable = true, length = 17)
	private Double repayaccrual;//应还款利息

	@Column(name = "repayterm", nullable = true, length = 4)
	private String repayterm;//还款期数

	@Column(name = "repaymethod", nullable = true, length = 30)
	private String repaymethod;//还款期数

	@Column(name = "repayaccount", nullable = true, length = 19)
	private String repayaccount;//还款账号

	@Column(name = "repayperson", nullable = true, length = 80)
	private String repayperson;//还款人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}