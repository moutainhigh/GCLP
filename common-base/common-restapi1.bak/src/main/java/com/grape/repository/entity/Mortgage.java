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

@Table(name = "mortgage")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Mortgage {//抵押物信息表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//抵押物编号

	@Column(name = "propertyowner", nullable = true, length = 80)
	private String propertyowner;//产权人

	@Column(name = "houseaddress", nullable = true, length = 300)
	private String houseaddress;//房屋坐落地址

	@Column(name = "martgagename", nullable = true, length = 80)
	private String martgagename;//抵押物名称

	@Column(name = "floorarea", nullable = true, length = 4)
	private String floorarea;//建筑面积

	@Column(name = "landuseage", nullable = true, length = 4)
	private String landuseage;//土地使用年限

	@Column(name = "mortgagefirsttype", nullable = true, length = 30)
	private String mortgagefirsttype;//抵押物一级类型

	@Column(name = "mortgagesecondtype", nullable = true, length = 30)
	private String mortgagesecondtype;//抵押物二级类型

	@Column(name = "landpurpose", nullable = true, length = 30)
	private String landpurpose;//土地用途

	@Column(name = "housepurpose", nullable = true, length = 20)
	private String housepurpose;//房屋用途

	@Column(name = "registrationdate", nullable = true)
	private Date registrationdate;//产权登记日期

	@Column(name = "housefinishdate", nullable = true)
	private Date housefinishdate;//竣工日期

	@Column(name = "buyhousedate", nullable = true)
	private Date buyhousedate;//购房日期

	@Column(name = "houseage", nullable = true, length = 4)
	private String houseage;//楼龄

	@Column(name = "landproperty", nullable = true, length = 16)
	private String landproperty;//土地性质

	@Column(name = "houseproperty", nullable = true, length = 12)
	private String houseproperty;//房屋性质

	@Column(name = "propertystate", nullable = true, length = 1)
	private String propertystate;//产权状态

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//流水编号

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//操作人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//操作时间

}