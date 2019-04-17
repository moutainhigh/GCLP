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

@Table(name = "product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Product {//产品表

	@Id
	@Column(name = "productno", nullable = false, length = 6)
	private String productno;//产品编号

	@Column(name = "productname", nullable = true, length = 80)
	private String productname;//产品名称

	@Column(name = "description", nullable = true, length = 800)
	private String description;//产品描述

	@Column(name = "organizationno", nullable = true, length = 5)
	private String organizationno;//产品所属机构

	@Column(name = "minloanamount", nullable = true, length = 17)
	private Double minloanamount;//产品最低贷款金额

	@Column(name = "maxloanamount", nullable = true, length = 17)
	private Double maxloanamount;//产品最高贷款金额

	@Column(name = "ratetype", nullable = true, length = 20)
	private String ratetype;//利率类型

	@Column(name = "minrateofyear", nullable = true, length = 9)
	private Double minrateofyear;//最低利率（年）

	@Column(name = "maxrateofyear", nullable = true, length = 9)
	private Double maxrateofyear;//最高利率（年）

	@Column(name = "subsidyorg", nullable = true, length = 5)
	private String subsidyorg;//兜底机构

	@Column(name = "docmanageorg", nullable = true, length = 5)
	private String docmanageorg;//档案管理机构

	@Column(name = "buttmode", nullable = true, length = 16)
	private String buttmode;//资金方对接方式

	@Column(name = "duediligenceflg", nullable = true, length = 1)
	private String duediligenceflg;//是否需要尽调直播

	@Column(name = "mortgagetype", nullable = true, length = 16)
	private String mortgagetype;//抵押办理方式

	@Column(name = "trustchannelflg", nullable = true, length = 1)
	private String trustchannelflg;//是否使用信托通道

	@Column(name = "trustcheckmodel", nullable = true, length = 16)
	private String trustcheckmodel;//信托审批模式

	@Column(name = "takeeffectflg", nullable = true, length = 1)
	private String takeeffectflg;//是否生效

	@Column(name = "permitchandueflg", nullable = true, length = 1)
	private String permitchandueflg;//是否允许渠道尽调

	@Column(name = "permitfunddueflg", nullable = true, length = 1)
	private String permitfunddueflg;//是否允许资金方尽调

	@Column(name = "permitplaformdueflg", nullable = true, length = 1)
	private String permitplaformdueflg;//是否允许平台尽调

	@Column(name = "duesystemflg", nullable = true, length = 1)
	private String duesystemflg;//尽调是否系统对接

	@Column(name = "riskapprovelpass", nullable = true, length = 40)
	private String riskapprovelpass;//风控审批通道

	@Column(name = "grantapprovelpass", nullable = true, length = 40)
	private String grantapprovelpass;//放款审批通道

	@Column(name = "issysriskapprovel", nullable = true, length = 1)
	private String issysriskapprovel;//通道风控审批是否系统对接

	@Column(name = "issysgrantapprovel", nullable = true, length = 1)
	private String issysgrantapprovel;//通道放款审批是否系统对接

	@Column(name = "permitplaformmortflg", nullable = true, length = 1)
	private String permitplaformmortflg;//是否允许平台抵押办理

	@Column(name = "permitchanmortflg", nullable = true, length = 1)
	private String permitchanmortflg;//是否允许渠道抵押办理

	@Column(name = "permitfundmortflg", nullable = true, length = 1)
	private String permitfundmortflg;//是否允许资金方抵押办理

	@Column(name = "outloandocmanager", nullable = true, length = 5)
	private String outloandocmanager;//出款要件管理机构

	@Column(name = "receivedocmanager", nullable = true, length = 5)
	private String receivedocmanager;//回款要件管理机构

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "checkfrequency", nullable = true, length = 10)
	private String checkfrequency;//查档频率

	@Column(name = "companydiligenceflg", nullable = true, length = 1)
	private String companydiligenceflg;//是否进行经营场所尽调

}