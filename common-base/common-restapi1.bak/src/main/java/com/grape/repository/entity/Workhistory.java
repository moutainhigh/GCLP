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

@Table(name = "workhistory")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Workhistory {//审批历史记录表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//流水编号

	@Column(name = "userid", nullable = true, length = 8)
	private String userid;//审批人

	@Column(name = "node", nullable = true, length = 4)
	private String node;//节点

	@Column(name = "nextnode", nullable = true, length = 4)
	private String nextnode;//下一节点

	@Column(name = "notation", nullable = true)
	private String notation;//审批意见

	@Column(name = "operation", nullable = true, length = 80)
	private String operation;//操作

	@Column(name = "operdate", nullable = true, length = 8)
	private String operdate;//操作日期

	@Column(name = "opertime", nullable = true, length = 6)
	private String opertime;//操作时间

}