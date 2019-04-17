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

@Table(name = "department")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Department {//

	@Id
	@Column(name = "departmentno", nullable = false, length = 6)
	private String departmentno;//部门编号

	@Column(name = "depbelongsto", nullable = true, length = 12)
	private String depbelongsto;//部门所属

	@Column(name = "organizationno", nullable = true, length = 6)
	private String organizationno;//所属公司编号

	@Column(name = "departmentname", nullable = true, length = 80)
	private String departmentname;//部门名称

	@Column(name = "linkman", nullable = true, length = 80)
	private String linkman;//联系人

	@Column(name = "telnumber", nullable = true, length = 20)
	private String telnumber;//联系电话

	@Column(name = "address", nullable = true, length = 200)
	private String address;//办公地址

	@Column(name = "departmentcode", nullable = true, length = 1)
	private String departmentcode;//部门代码

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}