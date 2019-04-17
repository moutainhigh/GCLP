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

@Table(name = "postloaninfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Postloaninfo {//贷后信息表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "repaydateofmonth", nullable = true, length = 1)
	private String repaydateofmonth;//每月还款日

	@Column(name = "loanbalance", nullable = true, length = 17)
	private Double loanbalance;//贷款余额

	@Column(name = "accountstate", nullable = true, length = 10)
	private String accountstate;//账户状态

	@Column(name = "remainamount", nullable = true, length = 17)
	private Double remainamount;//剩下放款金额

	@Column(name = "overdueflg", nullable = true, length = 1)
	private String overdueflg;//逾期标识

	@Column(name = "overdueterm", nullable = true, length = 6)
	private String overdueterm;//逾期期数

	@Column(name = "overduecorpus", nullable = true, length = 17)
	private Double overduecorpus;//逾期本金

	@Column(name = "overdueaccrual", nullable = true, length = 17)
	private Double overdueaccrual;//逾期利息

	@Column(name = "defaultinterest", nullable = true, length = 17)
	private Double defaultinterest;//罚息

	@Column(name = "nextrepaydate", nullable = true)
	private Date nextrepaydate;//下次还款日

}