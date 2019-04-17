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

@Table(name = "overduefollow")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Overduefollow {//逾期跟进表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "followman", nullable = true, length = 8)
	private String followman;//跟进人

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//流水编号

	@Column(name = "followcontent", nullable = true)
	private String followcontent;//跟进内容

	@Column(name = "overduecust", nullable = true, length = 80)
	private String overduecust;//逾期客户

	@Column(name = "overdueamount", nullable = true, length = 17)
	private Double overdueamount;//逾期金额

	@Column(name = "overdueday", nullable = true, length = 4)
	private String overdueday;//逾期天数

	@Column(name = "followdate", nullable = true)
	private Date followdate;//跟进日期

}