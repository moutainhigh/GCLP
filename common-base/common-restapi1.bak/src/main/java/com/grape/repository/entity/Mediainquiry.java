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

@Table(name = "mediainquiry")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Mediainquiry {//中介询价表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//询价编号

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//贷款流水号

	@Column(name = "agency", nullable = true, length = 80)
	private String agency;//中介名称

	@Column(name = "evalamt", nullable = true, length = 17)
	private Double evalamt;//评估金额

	@Column(name = "evaltime", nullable = true)
	private Date evaltime;//询价时间

}