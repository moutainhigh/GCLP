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

@Table(name = "repaytoinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Repaytoinfo {//批复信息表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//Id主键

	@Column(name = "batchorg", nullable = true, length = 20)
	private String batchorg;//批复机构

	@Column(name = "sumofamount", nullable = true, length = 17)
	private Double sumofamount;//批复金额

	@Column(name = "interestrate", nullable = true, length = 9)
	private Double interestrate;//批复利率

	@Column(name = "loanlimittime", nullable = true, length = 4)
	private String loanlimittime;//贷款期限

	@Column(name = "useofloan", nullable = true, length = 200)
	private String useofloan;//贷款用途

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}