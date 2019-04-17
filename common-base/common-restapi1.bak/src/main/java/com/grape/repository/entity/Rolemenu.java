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

@Table(name = "rolemenu")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Rolemenu {//角色菜单表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//

	@Column(name = "roleid", nullable = true, length = 4)
	private String roleid;//

	@Column(name = "menuid", nullable = true, length = 6)
	private String menuid;//

	@Column(name = "editflg", nullable = true, length = 1)
	private String editflg;//

	@Column(name = "viewflg", nullable = true, length = 1)
	private String viewflg;//

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//

}