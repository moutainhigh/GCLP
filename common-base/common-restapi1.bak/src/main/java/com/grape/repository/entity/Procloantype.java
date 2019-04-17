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

@Table(name = "procloantype")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Procloantype {//产品放款类型表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "productno", nullable = true, length = 6)
	private String productno;//产品编号

	@Column(name = "termofloan", nullable = true, length = 32)
	private String termofloan;//放款条件

	@Column(name = "subloanflg", nullable = true, length = 1)
	private String subloanflg;//分次放款标识

	@Column(name = "firstloanratio", nullable = true, length = 9)
	private Double firstloanratio;//首次放款比例

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}