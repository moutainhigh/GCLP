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

@Table(name = "accessrule")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Accessrule {//产品规则表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "productno", nullable = true, length = 6)
	private String productno;//产品码

	@Column(name = "expression", nullable = true, length = 120)
	private String expression;//表达式

	@Column(name = "admittancetype", nullable = true, length = 1)
	private String admittancetype;//准入类型

	@Column(name = "isattention", nullable = true, length = 1)
	private String isattention;//命中时是否尽调注意事项

	@Column(name = "isworkidtice", nullable = true, length = 1)
	private String isworkidtice;//命中时是否审批注意事项

	@Column(name = "remark", nullable = true, length = 200)
	private String remark;//备注

}