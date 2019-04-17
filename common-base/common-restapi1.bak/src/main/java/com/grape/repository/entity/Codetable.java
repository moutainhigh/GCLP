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

@Table(name = "codetable")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Codetable {//码表

	@EmbeddedId
	private CodetableKey codetableKey;

	@Column(name = "coddes", nullable = true, length = 100)
	private String coddes;//码表中文内容

	@Column(name = "idx", nullable = true, length = 8)
	private Double idx;//顺序

	@Column(name = "removeflg", nullable = true, length = 1)
	private String removeflg;//是否移除标志

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//修改时间

	@Column(name = "descriptions", nullable = true, length = 40)
	private String descriptions;//描述

}