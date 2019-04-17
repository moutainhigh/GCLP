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

@Table(name = "sysparameter")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Sysparameter {//系统参数表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "parametertype", nullable = true, length = 12)
	private String parametertype;//参数类型

	@Column(name = "parametername", nullable = true, length = 12)
	private String parametername;//参数名称

	@Column(name = "parametercontent", nullable = true, length = 10)
	private String parametercontent;//参数内容

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}