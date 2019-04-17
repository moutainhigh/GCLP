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

@Table(name = "doctask")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Doctask {//流水表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "relationworkid", nullable = true, length = 10)
	private String relationworkid;//关联流水编号

	@Column(name = "custno", nullable = true, length = 10)
	private String custno;//客户编号

	@Column(name = "departmentno", nullable = true, length = 6)
	private String departmentno;//部门编号

	@Column(name = "areaid", nullable = true, length = 19)
	private String areaid;//区域ID

	@Column(name = "channo", nullable = true, length = 6)
	private String channo;//渠道编号

	@Column(name = "fundpartyno", nullable = true, length = 6)
	private String fundpartyno;//资金方编号

	@Column(name = "state", nullable = true, length = 12)
	private String state;//状态

	@Column(name = "productno", nullable = true, length = 6)
	private String productno;//产品编号

	@Column(name = "applydate", nullable = true)
	private Date applydate;//申请日期

	@Column(name = "userid", nullable = true, length = 8)
	private String userid;//所属用户

	@Column(name = "type", nullable = true, length = 12)
	private String type;//流水类型

	@Column(name = "handleflg", nullable = true, length = 1)
	private String handleflg;//处理标识

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}