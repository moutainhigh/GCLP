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

@Table(name = "grantapproval")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Grantapproval {//放款审批表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//

	@Column(name = "loanconfirmflg", nullable = true, length = 1)
	private String loanconfirmflg;//

	@Column(name = "contractsignflg", nullable = true, length = 1)
	private String contractsignflg;//

	@Column(name = "declaresignflg", nullable = true, length = 1)
	private String declaresignflg;//

	@Column(name = "mortgagestate", nullable = true, length = 4)
	private String mortgagestate;//

	@Column(name = "approvelcarryoutflg", nullable = true, length = 1)
	private String approvelcarryoutflg;//

	@Column(name = "suggestloanflg", nullable = true, length = 1)
	private String suggestloanflg;//

	@Column(name = "realestatecollectflg", nullable = true, length = 1)
	private String realestatecollectflg;//

	@Column(name = "resultcollectflg", nullable = true, length = 1)
	private String resultcollectflg;//

	@Column(name = "referenceflg", nullable = true, length = 1)
	private String referenceflg;//

	@Column(name = "sharepledgeflg", nullable = true, length = 1)
	private String sharepledgeflg;//

	@Column(name = "bailcollectflg", nullable = true, length = 1)
	private String bailcollectflg;//

	@Column(name = "preloanapplyflg", nullable = true, length = 1)
	private String preloanapplyflg;//

	@Column(name = "repayplanflg", nullable = true, length = 1)
	private String repayplanflg;//

	@Column(name = "feeamount", nullable = true, length = 17)
	private Double feeamount;//

	@Column(name = "loanapproveltype", nullable = true, length = 8)
	private String loanapproveltype;//

	@Column(name = "loanapprovelview", nullable = true)
	private String loanapprovelview;//

	@Column(name = "approver", nullable = true, length = 8)
	private String approver;//

	@Column(name = "approvelopinion", nullable = true)
	private String approvelopinion;//

}