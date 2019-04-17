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

@Table(name = "exceptloaninfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Exceptloaninfo {//期待贷款信息表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "expectapplyamount", nullable = true, length = 17)
	private Double expectapplyamount;//期待贷款金额

	@Column(name = "expectapplyrate", nullable = true, length = 8)
	private Double expectapplyrate;//期望申请利率

	@Column(name = "expectapplyyear", nullable = true, length = 4)
	private String expectapplyyear;//期望申请年限

	@Column(name = "repaymethod", nullable = true, length = 20)
	private String repaymethod;//还款方式

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}