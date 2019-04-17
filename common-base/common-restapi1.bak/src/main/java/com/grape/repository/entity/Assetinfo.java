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

@Table(name = "assetinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Assetinfo {//资产信息表

	@Id
	@Column(name = "workid", nullable = false, length = 10)
	private String workid;//流水编号

	@Column(name = "assettype", nullable = true, length = 10)
	private String assettype;//资产类型

	@Column(name = "address", nullable = true, length = 200)
	private String address;//坐落地址

	@Column(name = "isprovidepaper", nullable = true, length = 1)
	private String isprovidepaper;//是否提供产证

	@Column(name = "propertyowner", nullable = true, length = 80)
	private String propertyowner;//产权人

	@Column(name = "housenature", nullable = true, length = 20)
	private String housenature;//房产性质

	@Column(name = "housearea", nullable = true, length = 4)
	private String housearea;//建筑面积

	@Column(name = "buytime", nullable = true)
	private Date buytime;//购买时间

	@Column(name = "buyprice", nullable = true, length = 17)
	private Double buyprice;//购买价格

	@Column(name = "docchoosetype", nullable = true, length = 10)
	private String docchoosetype;//资料选择类别

	@Column(name = "assetsituation", nullable = true, length = 200)
	private String assetsituation;//资产情况说明

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

}