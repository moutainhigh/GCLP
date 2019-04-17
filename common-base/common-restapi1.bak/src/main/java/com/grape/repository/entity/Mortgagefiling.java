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

@Table(name = "mortgagefiling")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Mortgagefiling {//抵押物查档表

	@Id
	@Column(name = "mortgagefilingid", nullable = false, length = 19)
	private String mortgagefilingid;//抵押物查档ID

	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "isnetsign", nullable = true, length = 1)
	private String isnetsign;//抵押物是否有网签备案

	@Column(name = "ismortgageclose", nullable = true, length = 2)
	private String ismortgageclose;//抵押物是否曾有查封

	@Column(name = "legaldispute", nullable = true, length = 200)
	private String legaldispute;//扣押等法律纠纷记录

	@Column(name = "mortgagestate", nullable = true, length = 10)
	private String mortgagestate;//抵押物查档状态

	@Column(name = "mortgagecomorbank", nullable = true, length = 120)
	private String mortgagecomorbank;//抵押物现抵押银行或公司

	@Column(name = "queriesofmonth", nullable = true, length = 6)
	private String queriesofmonth;//抵押物单月查档人数

	@Column(name = "queriesoftotal", nullable = true, length = 6)
	private String queriesoftotal;//抵押物查档次数

	@Column(name = "mortgages1", nullable = true, length = 80)
	private String mortgages1;//抵押物顺位人一

	@Column(name = "mortgages2", nullable = true, length = 80)
	private String mortgages2;//抵押物顺位人二

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}