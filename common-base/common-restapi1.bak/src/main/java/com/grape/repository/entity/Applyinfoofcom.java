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

@Table(name = "applyinfoofcom")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Applyinfoofcom {//申请人信息表（公司）

	@Id
	@Column(name = "custno", nullable = false, length = 10)
	private String custno;//客户编号

	@Column(name = "applyertype", nullable = true, length = 2)
	private String applyertype;//申请人类型

	@Column(name = "applymainbody", nullable = true, length = 80)
	private String applymainbody;//申请主体

	@Column(name = "orgname", nullable = true, length = 80)
	private String orgname;//企业名称

	@Column(name = "socialcreditcode", nullable = true, length = 30)
	private String socialcreditcode;//统一社会信用代码

	@Column(name = "managetype", nullable = true, length = 2)
	private String managetype;//经营类型

	@Column(name = "juridical", nullable = true, length = 80)
	private String juridical;//法定代表人

	@Column(name = "comstartdate", nullable = true)
	private Date comstartdate;//公司成立日期

	@Column(name = "comenddate", nullable = true)
	private Date comenddate;//营业期限至

	@Column(name = "registcapital", nullable = true, length = 17)
	private Double registcapital;//注册资本

	@Column(name = "contricapital", nullable = true, length = 17)
	private Double contricapital;//认缴资本

	@Column(name = "comaddress", nullable = true, length = 200)
	private String comaddress;//公司注册地址

	@Column(name = "realcomaddress", nullable = true, length = 200)
	private String realcomaddress;//公司实际经营地址

	@Column(name = "managearea", nullable = true, length = 80)
	private String managearea;//经营范围

	@Column(name = "industry", nullable = true, length = 2)
	private String industry;//行业分类

	@Column(name = "shareholder", nullable = true, length = 80)
	private String shareholder;//股东信息

	@Column(name = "mianbusiness", nullable = true, length = 80)
	private String mianbusiness;//主要产品及业务

	@Column(name = "mainsupplier", nullable = true, length = 80)
	private String mainsupplier;//主要供应商

	@Column(name = "maincustomer", nullable = true, length = 80)
	private String maincustomer;//主要客户

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}