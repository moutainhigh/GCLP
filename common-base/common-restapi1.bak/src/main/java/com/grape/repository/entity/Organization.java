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

@Table(name = "organization")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Organization {//机构表

	@Id
	@Column(name = "organizationno", nullable = false, length = 6)
	private String organizationno;//机构编号

	@Column(name = "organizationname", nullable = true, length = 60)
	private String organizationname;//机构名称

	@Column(name = "description", nullable = true)
	private String description;//机构描述

	@Column(name = "orgbelongsto", nullable = true, length = 16)
	private String orgbelongsto;//机构所属

	@Column(name = "linkman", nullable = true, length = 80)
	private String linkman;//联系人

	@Column(name = "telnumber", nullable = true, length = 20)
	private String telnumber;//联系电话

	@Column(name = "address", nullable = true, length = 200)
	private String address;//办公地址

	@Column(name = "organizationcode", nullable = true, length = 1)
	private String organizationcode;//机构代码

	@Column(name = "orgleavel", nullable = true, length = 1)
	private String orgleavel;//机构级别

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}