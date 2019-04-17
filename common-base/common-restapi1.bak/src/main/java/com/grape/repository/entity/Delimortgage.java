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

@Table(name = "delimortgage")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Delimortgage {//尽调抵押物信息表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键ID

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//流水编号

	@Column(name = "isbasement", nullable = true, length = 1)
	private String isbasement;//是否有地下室

	@Column(name = "housestate", nullable = true, length = 12)
	private String housestate;//房产状态

	@Column(name = "follorpurpose", nullable = true, length = 80)
	private String follorpurpose;//土地用途

	@Column(name = "ismaritalproperty", nullable = true, length = 1)
	private String ismaritalproperty;//是否为婚内财产

	@Column(name = "floors", nullable = true, length = 4)
	private String floors;//总层数

	@Column(name = "numberoflayers", nullable = true, length = 4)
	private String numberoflayers;//所在层数

	@Column(name = "degreedecoration", nullable = true, length = 30)
	private String degreedecoration;//装修程度

	@Column(name = "houseorientation", nullable = true, length = 30)
	private String houseorientation;//房屋朝向

	@Column(name = "buildingstructure", nullable = true, length = 30)
	private String buildingstructure;//房屋结构

	@Column(name = "buildingtype", nullable = true, length = 30)
	private String buildingtype;//建筑类型

	@Column(name = "buyhousedate", nullable = true, length = 1)
	private String buyhousedate;//购房日期

	@Column(name = "isrentout", nullable = true, length = 1)
	private String isrentout;//是否出租

	@Column(name = "iselevatorroom", nullable = true, length = 1)
	private String iselevatorroom;//是否为电梯房

	@Column(name = "issubwaynaer", nullable = true, length = 1)
	private String issubwaynaer;//300米内是否有地铁

	@Column(name = "ishospitalnear", nullable = true, length = 1)
	private String ishospitalnear;//周边是否配备大型医院

	@Column(name = "isschoolnear", nullable = true, length = 1)
	private String isschoolnear;//周边是否配备公立学校

	@Column(name = "issupermarketnear", nullable = true, length = 1)
	private String issupermarketnear;//周边是否配备大型超市

	@Column(name = "issoleresidence", nullable = true, length = 1)
	private String issoleresidence;//抵押物是否为唯一住宅

	@Column(name = "historyrate", nullable = true, length = 17)
	private Double historyrate;//历史成交价

	@Column(name = "buyerfasttransprice", nullable = true, length = 17)
	private Double buyerfasttransprice;//当前快速成交价（买方）

	@Column(name = "sellersfasttransprice", nullable = true, length = 17)
	private Double sellersfasttransprice;//当前快速成交价（卖方）

	@Column(name = "hangingprice", nullable = true, length = 17)
	private Double hangingprice;//经纪网站挂盘价

	@Column(name = "currenthangingprice", nullable = true, length = 17)
	private Double currenthangingprice;//当前挂盘价

	@Column(name = "houseunitprice", nullable = true, length = 17)
	private Double houseunitprice;//房产评估单价

	@Column(name = "housetotalprice", nullable = true, length = 17)
	private Double housetotalprice;//房产评估总价

	@Column(name = "isjudgenotclearly", nullable = true, length = 1)
	private String isjudgenotclearly;//产权证描述对于抵押物性质判定是否不清晰

	@Column(name = "issalelimit", nullable = true, length = 1)
	private String issalelimit;//是否属于指定销售特定人员房产

	@Column(name = "isnotsameofhouse", nullable = true, length = 1)
	private String isnotsameofhouse;//实地勘查抵押物小区名称、地址是否和产权证不一致

	@Column(name = "isselfreform", nullable = true, length = 1)
	private String isselfreform;//是否存在私自改建、违建等情形

	@Column(name = "isproblemcase", nullable = true, length = 1)
	private String isproblemcase;//是否有催收函、律师函、门锁被撬、监控等情形

	@Column(name = "issinglebuilding", nullable = true, length = 1)
	private String issinglebuilding;//是否为独栋无社区的楼盘

	@Column(name = "isnotsameofowner", nullable = true, length = 1)
	private String isnotsameofowner;//是否存在被面谈人与产权人不一致或为代持物业

	@Column(name = "isgeneration", nullable = true, length = 1)
	private String isgeneration;//是否有代持嫌疑

	@Column(name = "isbadactionperson", nullable = true, length = 1)
	private String isbadactionperson;//是否有残疾、瘫痪和行动不便等人士居住

	@Column(name = "isnotsameoffamilyinfo", nullable = true, length = 1)
	private String isnotsameoffamilyinfo;//生活痕迹是否与婚育状况不一致

	@Column(name = "istenantbiggerdatedue", nullable = true, length = 1)
	private String istenantbiggerdatedue;//是否承租期大于贷款到期日

	@Column(name = "isimportdefects", nullable = true, length = 1)
	private String isimportdefects;//询价中是否发现本抵押物的重要缺陷（如凶宅

	@Column(name = "islistingsale", nullable = true, length = 1)
	private String islistingsale;//询价中是否存在本抵押物正在挂牌销售

	@Column(name = "longtimenorecord", nullable = true, length = 1)
	private String longtimenorecord;//抵押房产是否长期（6个月以上）无成交记录

	@Column(name = "mortgageview", nullable = true)
	private String mortgageview;//抵押物尽调意见

	@Column(name = "comments", nullable = true)
	private String comments;//特别注意事项尽调意见

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}