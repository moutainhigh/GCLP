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

@Table(name = "houseassess")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Houseassess {//房产评估表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "assessprice", nullable = true, length = 17)
	private Double assessprice;//评估单价

	@Column(name = "assesstotal", nullable = true, length = 17)
	private Double assesstotal;//评估总价

	@Column(name = "transunitprice", nullable = true, length = 17)
	private Double transunitprice;//成交单价

	@Column(name = "totaltransprice", nullable = true, length = 17)
	private Double totaltransprice;//成交总价

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//修改日期

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//修改人

}