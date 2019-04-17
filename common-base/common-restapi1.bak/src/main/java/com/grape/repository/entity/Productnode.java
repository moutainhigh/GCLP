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

@Table(name = "productnode")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Productnode {//产品节点表

	@Id
	@Column(name = "nodeid", nullable = false, length = 4)
	private String nodeid;//节点编号

	@Column(name = "nodename", nullable = true, length = 80)
	private String nodename;//节点名称

	@Column(name = "productno", nullable = true, length = 6)
	private String productno;//产品编号

	@Column(name = "hgtl", nullable = true, length = 8)
	private String hgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}