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

@Table(name = "noderole")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Noderole {//角色权限表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//id

	@Column(name = "productno", nullable = true, length = 6)
	private String productno;//产品编号

	@Column(name = "nodeid", nullable = true, length = 4)
	private String nodeid;//节点

	@Column(name = "redirecttype", nullable = true, length = 16)
	private String redirecttype;//跳转类型

	@Column(name = "lastnode", nullable = true, length = 4)
	private String lastnode;//上一节点

	@Column(name = "entercondition", nullable = true, length = 120)
	private String entercondition;//进入条件

	@Column(name = "nodetime", nullable = true, length = 4)
	private String nodetime;//节点时限

	@Column(name = "roleid", nullable = true, length = 4)
	private String roleid;//角色

	@Column(name = "chgdt", nullable = true, length = 8)
	private String chgdt;//最后修改人

	@Column(name = "chgtl", nullable = true)
	private Date chgtl;//最后修改时间

}