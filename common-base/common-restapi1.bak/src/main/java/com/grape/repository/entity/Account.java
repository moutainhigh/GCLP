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

@Table(name = "account")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Account {//

	@Id
	@Column(name = "accountno", nullable = false, length = 19)
	private String accountno;//

	@Column(name = "accountname", nullable = true, length = 80)
	private String accountname;//

	@Column(name = "accountbakno", nullable = true, length = 80)
	private String accountbakno;//

	@Column(name = "accountorg", nullable = true, length = 5)
	private String accountorg;//

	@Column(name = "accountremian", nullable = true)
	private Double accountremian;//

	@Column(name = "accounttype", nullable = true, length = 2)
	private String accounttype;//

	@Column(name = "bailamount", nullable = true)
	private Double bailamount;//

	@Column(name = "balanceaccountflg", nullable = true, length = 1)
	private String balanceaccountflg;//

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//

	@Column(name = "freezeamount", nullable = true)
	private Double freezeamount;//

	@Column(name = "lenders", nullable = true)
	private Double lenders;//

	@Column(name = "loanremian", nullable = true)
	private Double loanremian;//

	@Column(name = "permitchangeorg", nullable = true, length = 5)
	private String permitchangeorg;//

	@Column(name = "usefullimit", nullable = true)
	private Double usefullimit;//

}