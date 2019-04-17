package com.grape.repository.entity;

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

@Table(name = "area")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Area {


	@Id
	@Column(name = "areaid", nullable = false, length = 19)
	private String areaid;

	@Column(name = "areaname", nullable = true, length = 80)
	private String areaname;

	@Column(name = "superiorarea", nullable = true, length = 19)
	private String superiorarea;

	@Column(name = "agentclass", nullable = true, length = 1)
	private String agentclass;

	@Column(name = "islimitsale", nullable = true, length = 1)
	private String islimitsale;

	@Column(name = "areaweight", nullable = true, length = 5)
	private Double areaweight;

	@Column(name = "limitsaleyear", nullable = true, length = 4)
	private String limitsaleyear;

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;
}