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

@Table(name = "incomeofcom")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Incomeofcom {//收入情况表（公司）

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//申请编号

	@Column(name = "bankstream", nullable = true, length = 17)
	private Double bankstream;//银行流水

	@Column(name = "paydutyapplyinfo", nullable = true, length = 80)
	private String paydutyapplyinfo;//增值税纳税申报表

	@Column(name = "otherincome", nullable = true, length = 200)
	private String otherincome;//其他收入证明

	@Column(name = "incomeexplain", nullable = true, length = 200)
	private String incomeexplain;//其他收入证明

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}