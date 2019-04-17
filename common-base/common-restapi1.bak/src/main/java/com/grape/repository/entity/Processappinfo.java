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

@Table(name = "processappinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Processappinfo {//流程审批信息表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键id

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//流水编号

	@Column(name = "loanchangeflg", nullable = true, length = 1)
	private String loanchangeflg;//贷款信息是否修改

	@Column(name = "agreeloanflg", nullable = true, length = 1)
	private String agreeloanflg;//是否同意期望贷款申请信息

	@Column(name = "applyamount", nullable = true, length = 17)
	private Double applyamount;//申请金额

	@Column(name = "applyrate", nullable = true, length = 9)
	private Double applyrate;//申请利率

	@Column(name = "yearofapply", nullable = true, length = 4)
	private String yearofapply;//申请年限

	@Column(name = "repaymethod", nullable = true, length = 32)
	private String repaymethod;//还款方式

	@Column(name = "checkresult", nullable = true, length = 16)
	private String checkresult;//核实结果

	@Column(name = "checkview", nullable = true)
	private String checkview;//核实意见

	@Column(name = "approvetype", nullable = true, length = 16)
	private String approvetype;//审批类型

	@Column(name = "approveview", nullable = true)
	private String approveview;//审批意见

	@Column(name = "additionalinfo", nullable = true, length = 200)
	private String additionalinfo;//待补充资料

	@Column(name = "approveperson", nullable = true, length = 8)
	private String approveperson;//审批人

	@Column(name = "approvetime", nullable = true)
	private Date approvetime;//审批时间

}