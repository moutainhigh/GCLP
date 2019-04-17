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

@Table(name = "repayinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Repayinfo {//还款表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//申请编号

	@Column(name = "repayamount", nullable = true, length = 17)
	private Double repayamount;//还款金额

	@Column(name = "repaytype", nullable = true, length = 32)
	private String repaytype;//还款方式

	@Column(name = "repayperson", nullable = true, length = 80)
	private String repayperson;//还款人

	@Column(name = "repayaccount", nullable = true, length = 19)
	private String repayaccount;//还款账号

	@Column(name = "repaybank", nullable = true, length = 80)
	private String repaybank;//还款账户银行

	@Column(name = "repaytime", nullable = true)
	private Date repaytime;//还款日期

	@Column(name = "payee", nullable = true, length = 80)
	private String payee;//收款人

	@Column(name = "accountnumber", nullable = true, length = 19)
	private String accountnumber;//收款账号

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}