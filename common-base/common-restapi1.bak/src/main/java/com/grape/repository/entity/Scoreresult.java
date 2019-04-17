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

@Table(name = "scoreresult")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Scoreresult {//评分结果表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//

	@Column(name = "custgrade", nullable = true, length = 5)
	private Double custgrade;//

	@Column(name = "pledgegrade", nullable = true, length = 5)
	private Double pledgegrade;//

	@Column(name = "rategrade", nullable = true, length = 5)
	private Double rategrade;//

	@Column(name = "mortgagerate", nullable = true, length = 9)
	private Double mortgagerate;//

	@Column(name = "rate", nullable = true, length = 9)
	private Double rate;//

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//

}