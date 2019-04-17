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

@Table(name = "debtinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Debtinfo {//负债信息表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "debttype", nullable = true, length = 12)
	private String debttype;//负债类型

	@Column(name = "borrowman", nullable = true, length = 80)
	private String borrowman;//借款人

	@Column(name = "fananceorg", nullable = true, length = 80)
	private String fananceorg;//金融机构

	@Column(name = "totalloan", nullable = true, length = 17)
	private Double totalloan;//借款总额

	@Column(name = "borrowremain", nullable = true, length = 17)
	private Double borrowremain;//借款余额

	@Column(name = "startdate", nullable = true)
	private Date startdate;//开始日期

	@Column(name = "enddate", nullable = true)
	private Date enddate;//结束日期

	@Column(name = "pledgeno", nullable = true, length = 80)
	private String pledgeno;//抵押物产权编号

	@Column(name = "pledgeaddress", nullable = true, length = 120)
	private String pledgeaddress;//抵押物坐落地址

	@Column(name = "usefulposition", nullable = true, length = 17)
	private Double usefulposition;//可用额度

	@Column(name = "usedposition", nullable = true, length = 17)
	private Double usedposition;//已用额度

	@Column(name = "conversion", nullable = true, length = 8)
	private Double conversion;//折算比例

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}