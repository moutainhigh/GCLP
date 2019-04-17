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

@Table(name = "incomeinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Incomeinfo {//收入情况表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "receipts", nullable = true, length = 30)
	private String receipts;//收入进项

	@Column(name = "bnkno", nullable = true, length = 80)
	private String bnkno;//所属银行

	@Column(name = "bnkcard", nullable = true, length = 4)
	private String bnkcard;//银行账号

	@Column(name = "iscover", nullable = true, length = 1)
	private String iscover;//是否覆盖

	@Column(name = "halfyearreceipt", nullable = true, length = 30)
	private String halfyearreceipt;//近半年月进账项

	@Column(name = "halfyaerincome", nullable = true, length = 17)
	private Double halfyaerincome;//近半年月收入总额

	@Column(name = "rentincome", nullable = true, length = 17)
	private Double rentincome;//月租金收入

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}