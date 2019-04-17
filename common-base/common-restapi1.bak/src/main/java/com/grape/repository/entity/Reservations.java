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

@Table(name = "reservations")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Reservations {//预约下户信息表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "reservationtime", nullable = true)
	private Date reservationtime;//预约时间

	@Column(name = "custname", nullable = true, length = 80)
	private String custname;//预约客户名称

	@Column(name = "reservationplace", nullable = true, length = 300)
	private String reservationplace;//预约地点

	@Column(name = "custcontactway", nullable = true, length = 30)
	private String custcontactway;//客户联系方式

	@Column(name = "dueofplanform", nullable = true, length = 80)
	private String dueofplanform;//平台尽调专员

	@Column(name = "chanassistant", nullable = true, length = 80)
	private String chanassistant;//渠道协助人

	@Column(name = "relationworkid", nullable = true, length = 10)
	private String relationworkid;//关联流水编号

	@Column(name = "chgtl", nullable = true, length = 10)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}