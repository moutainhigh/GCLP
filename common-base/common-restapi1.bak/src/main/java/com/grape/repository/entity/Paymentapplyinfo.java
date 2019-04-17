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

@Table(name = "paymentapplyinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Paymentapplyinfo {//出款申请表

	@Id
	@Column(name = "loanamount", nullable = false, length = 17)
	private Double loanamount;//借款金额

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//申请编号

	@Column(name = "contractno", nullable = true, length = 40)
	private String contractno;//合同编号

	@Column(name = "applicationtime", nullable = true)
	private Date applicationtime;//出款申请时间

	@Column(name = "purductno", nullable = true, length = 6)
	private String purductno;//贷款产品

	@Column(name = "borrowername", nullable = true, length = 80)
	private String borrowername;//借款人姓名

	@Column(name = "custcerdid", nullable = true, length = 32)
	private String custcerdid;//借款人身份证

	@Column(name = "custtelnumber", nullable = true, length = 20)
	private String custtelnumber;//借款人电话号码

	@Column(name = "interestrate", nullable = true, length = 9)
	private Double interestrate;//年化利率

	@Column(name = "monthrepayamount", nullable = true, length = 17)
	private Double monthrepayamount;//月还款金额

	@Column(name = "lifeofloan", nullable = true, length = 4)
	private String lifeofloan;//借款期限

	@Column(name = "repaymethod", nullable = true, length = 40)
	private String repaymethod;//还款方式

	@Column(name = "examinationfee", nullable = true, length = 17)
	private Double examinationfee;//审查费

	@Column(name = "examinationrate", nullable = true, length = 9)
	private Double examinationrate;//担保费利率

	@Column(name = "guaranteefee", nullable = true, length = 17)
	private Double guaranteefee;//担保费金额

	@Column(name = "totalfee", nullable = true, length = 17)
	private Double totalfee;//出库前应收费用合计

	@Column(name = "fundamountname", nullable = true, length = 80)
	private String fundamountname;//打划款账户名

	@Column(name = "fundamount", nullable = true, length = 19)
	private String fundamount;//打划款账号

	@Column(name = "fundbank", nullable = true, length = 80)
	private String fundbank;//打划款开户行

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}