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

@Table(name = "repayfollow")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Repayfollow {//还款跟进表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "followman", nullable = true, length = 8)
	private String followman;//跟进人

	@Column(name = "workid", nullable = true, length = 8)
	private String workid;//流水编号

	@Column(name = "custno", nullable = true, length = 10)
	private String custno;//还款客户

	@Column(name = "repaydate", nullable = true)
	private Date repaydate;//还款日期

	@Column(name = "followcontent", nullable = true)
	private String followcontent;//跟进内容

	@Column(name = "repayamount", nullable = true, length = 17)
	private Double repayamount;//还款金额

	@Column(name = "followdate", nullable = true)
	private Date followdate;//跟进日期

}