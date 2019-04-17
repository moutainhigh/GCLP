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

@Table(name = "nodepage")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Nodepage {//节点页面表

	@Id
	@Column(name = "id", nullable = false, length = 10)
	private String id;//id

	@Column(name = "productno", nullable = true, length = 10)
	private String productno;//产品编号

	@Column(name = "nodeid", nullable = true, length = 10)
	private String nodeid;//节点

	@Column(name = "pageid", nullable = true, length = 10)
	private String pageid;//页面

	@Column(name = "editflg", nullable = true, length = 10)
	private String editflg;//是否可编辑

	@Column(name = "viewflg", nullable = true, length = 10)
	private String viewflg;//是否可查看

	@Column(name = "chgtl", nullable = true, length = 10)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true, length = 10)
	private String chgdt;//最后修改时间

}