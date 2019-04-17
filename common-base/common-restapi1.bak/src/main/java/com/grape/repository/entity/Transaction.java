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

@Table(name = "transaction")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Transaction {//交易记录表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "accountno", nullable = true, length = 19)
	private String accountno;//账户账号

	@Column(name = "balancetype", nullable = true, length = 2)
	private String balancetype;//结算类型

	@Column(name = "transname", nullable = true, length = 80)
	private String transname;//交易账户

	@Column(name = "transaccount", nullable = true, length = 19)
	private String transaccount;//交易账号

	@Column(name = "transway", nullable = true, length = 2)
	private String transway;//交易方式

	@Column(name = "transamount", nullable = true, length = 17)
	private Double transamount;//交易金额

	@Column(name = "transtime", nullable = true)
	private Date transtime;//交易时间

	@Column(name = "accountamount", nullable = true, length = 17)
	private Double accountamount;//账户余额

	@Column(name = "dealman", nullable = true, length = 80)
	private String dealman;//操作人

}