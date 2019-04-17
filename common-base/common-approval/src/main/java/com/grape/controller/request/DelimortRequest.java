package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class DelimortRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "主键ID", example = "", dataType="varchar(19)", required = true )
    private String id;

	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@ApiModelProperty(value = "", example = "", dataType="varchar(300)", required = true )
    private String houseaddressnotes;

	@ApiModelProperty(value = "房屋坐落地址是否与描述一致", example = "", dataType="char(1)", required = true )
    private String houseaddressflg;

	@ApiModelProperty(value = "其他开发商", example = "", dataType="varchar(80)", required = true )
    private String otherdeveloper;

	@ApiModelProperty(value = "开发商", example = "", dataType="varchar(4)", required = true )
    private String developer;

	@ApiModelProperty(value = "落户人口", example = "", dataType="varchar(4)", required = true )
    private String fallpopulation;

	@ApiModelProperty(value = "常驻人口", example = "", dataType="varchar(4)", required = true )
    private String livepeople;

	@ApiModelProperty(value = "占地面积", example = "", dataType="varchar(4)", required = true )
    private String areasize;

	@ApiModelProperty(value = "套内面积", example = "", dataType="varchar(4)", required = true )
    private String insidesize;

	@ApiModelProperty(value = "车库面积", example = "", dataType="varchar(4)", required = true )
    private String carhousesize;

	@ApiModelProperty(value = "车库情况说明", example = "", dataType="varchar(300)", required = true )
    private String chrhousenotes;

	@ApiModelProperty(value = "是否有车库", example = "", dataType="char(1)", required = true )
    private String havacarhouse;

	@ApiModelProperty(value = "地下室面积", example = "", dataType="varchar(4)", required = true )
    private String basementsize;

	@ApiModelProperty(value = "是否有地下室", example = "", dataType="char(1)", required = true )
    private String isbasement;

	@ApiModelProperty(value = "房产状态", example = "", dataType="varchar(12)", required = true )
    private String housestate;

	@ApiModelProperty(value = "土地用途", example = "", dataType="varchar(80)", required = true )
    private String follorpurpose;

	@ApiModelProperty(value = "是否为婚内财产情况说明", example = "", dataType="varchar(300)", required = true )
    private String ismaritalpropertynotes;

	@ApiModelProperty(value = "是否为婚内财产", example = "", dataType="char(1)", required = true )
    private String ismaritalproperty;

	@ApiModelProperty(value = "总层数", example = "", dataType="varchar(4)", required = true )
    private String floors;

	@ApiModelProperty(value = "所在层数", example = "", dataType="varchar(4)", required = true )
    private String numberoflayers;

	@ApiModelProperty(value = "装修程度", example = "", dataType="varchar(30)", required = true )
    private String degreedecoration;

	@ApiModelProperty(value = "房屋朝向", example = "", dataType="varchar(30)", required = true )
    private String houseorientation;

/*	@ApiModelProperty(value = "房屋结构", example = "", dataType="varchar(30)", required = true )
    private String buildingstructure;*/
	
	@Length(max=10,min=0,message="人均居住面积不能超出10位")
	@ApiModelProperty(value = "人均居住面积", example = "", dataType="varchar(10)", required = true )
    private String livesize;

	@ApiModelProperty(value = "建筑类型", example = "", dataType="varchar(30)", required = true )
    private String buildingtype;

	@ApiModelProperty(value = "购房日期证明文件", example = "", dataType="varchar(300)", required = true )
    private String buyhousedoc;

	@ApiModelProperty(value = "购房日期", example = "", dataType="char(1)", required = true )
    private String buyhousedate;

	@ApiModelProperty(value = "出租期限", example = "", dataType="datetime", required = true )
    private Date isrentoutdate;
	
	@ApiModelProperty(value = "出租期限(结束)", example = "", dataType="datetime", required = true )
    private Date isrentoutdate2;

	@ApiModelProperty(value = "是否出租", example = "", dataType="char(1)", required = true )
    private String isrentout;

	@ApiModelProperty(value = "是否为电梯房", example = "", dataType="char(1)", required = true )
    private String iselevatorroom;

	@ApiModelProperty(value = "300米内是否有地铁", example = "", dataType="char(1)", required = true )
    private String issubwaynaer;

	@ApiModelProperty(value = "周边是否配备大型医院", example = "", dataType="char(1)", required = true )
    private String ishospitalnear;

	@ApiModelProperty(value = "周边是否配备公立学校", example = "", dataType="char(1)", required = true )
    private String isschoolnear;

	@ApiModelProperty(value = "周边是否配备大型超市", example = "", dataType="char(1)", required = true )
    private String issupermarketnear;

	@ApiModelProperty(value = "抵押物是否为唯一住宅", example = "", dataType="char(1)", required = true )
    private String issoleresidence;

	@ApiModelProperty(value = "历史成交价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal historyrate;

	@ApiModelProperty(value = "当前快速成交价（买方）", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal buyerfasttransprice;

	@ApiModelProperty(value = "当前快速成交价（卖方）", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal sellersfasttransprice;

	@ApiModelProperty(value = "经纪网站挂盘价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal hangingprice;

	@ApiModelProperty(value = "当前挂盘价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal currenthangingprice;

	@ApiModelProperty(value = "房产评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal houseunitprice;

	@ApiModelProperty(value = "房产评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal housetotalprice;

	@ApiModelProperty(value = "产权证描述对于抵押物性质判定是否不清晰情况说明", example = "", dataType="varchar(300)", required = true )
    private String isjudgenotclearlynotes;

	@ApiModelProperty(value = "产权证描述对于抵押物性质判定是否不清晰", example = "", dataType="char(1)", required = true )
    private String isjudgenotclearly;

	@ApiModelProperty(value = "是否属于指定销售特定人员房产情况说明", example = "", dataType="varchar(300)", required = true )
    private String issalelimitnotes;

	@ApiModelProperty(value = "是否属于指定销售特定人员房产", example = "", dataType="char(1)", required = true )
    private String issalelimit;

	@ApiModelProperty(value = "实地勘查抵押物小区名称、地址是否和产权证不一致", example = "", dataType="varchar(300)", required = true )
    private String isnotsameofhousenotes;

	@ApiModelProperty(value = "实地勘查抵押物小区名称、地址是否和产权证不一致", example = "", dataType="char(1)", required = true )
    private String isnotsameofhouse;

	@ApiModelProperty(value = "是否存在私自改建、违建等情形情况说明", example = "", dataType="varchar(300)", required = true )
    private String isselfreformnotes;

	@ApiModelProperty(value = "是否存在私自改建、违建等情形", example = "", dataType="char(1)", required = true )
    private String isselfreform;

	@ApiModelProperty(value = "是否涉及拆迁、安全隐患或疏通性较差的情形情况说明", example = "", dataType="varchar(300)", required = true )
    private String isnotsafehousenotes;

	@ApiModelProperty(value = "是否涉及拆迁、安全隐患或疏通性较差的情形", example = "", dataType="char(1)", required = true )
    private String isnotsafehouse;

	@ApiModelProperty(value = "是否有催收函、律师函、门锁被撬、监控等情形情况说明", example = "", dataType="varchar(300)", required = true )
    private String isproblemcasenotes;

	@ApiModelProperty(value = "是否有催收函、律师函、门锁被撬、监控等情形", example = "", dataType="char(1)", required = true )
    private String isproblemcase;

	@ApiModelProperty(value = "是否为独栋无社区的楼盘情况说明", example = "", dataType="varchar(300)", required = true )
    private String issinglebuildingnotes;

	@ApiModelProperty(value = "是否为独栋无社区的楼盘", example = "", dataType="char(1)", required = true )
    private String issinglebuilding;

	@ApiModelProperty(value = "是否存在被面谈人与产权人不一致或为代持物业情况说明", example = "", dataType="varchar(300)", required = true )
    private String isnotsameofownernotes;

	@ApiModelProperty(value = "是否存在被面谈人与产权人不一致或为代持物业", example = "", dataType="char(1)", required = true )
    private String isnotsameofowner;

	@ApiModelProperty(value = "是否有代持嫌疑情况说明", example = "", dataType="varchar(300)", required = true )
    private String isgenerationnotes;

	@ApiModelProperty(value = "是否有代持嫌疑", example = "", dataType="char(1)", required = true )
    private String isgeneration;

	@ApiModelProperty(value = "是否有残疾、瘫痪和行动不便等人士居住", example = "", dataType="char(1)", required = true )
    private String isbadactionperson;

	@ApiModelProperty(value = "生活痕迹是否与婚育状况不一致情况说明", example = "", dataType="varchar(300)", required = true )
    private String isnotsamenotes;

	@ApiModelProperty(value = "生活痕迹是否与婚育状况不一致", example = "", dataType="char(1)", required = true )
    private String isnotsameoffamilyinfo;

	@ApiModelProperty(value = "是否承租期大于贷款到期日情况说明", example = "", dataType="varchar(300)", required = true )
    private String dateduebignotes;

	@ApiModelProperty(value = "是否承租期大于贷款到期日", example = "", dataType="char(1)", required = true )
    private String istenantbiggerdatedue;

	@ApiModelProperty(value = "询价中是否发现本抵押物的重要缺陷（如凶宅情况说明", example = "", dataType="varchar(300)", required = true )
    private String importdefectsnotes;

	@ApiModelProperty(value = "询价中是否发现本抵押物的重要缺陷（如凶宅", example = "", dataType="char(1)", required = true )
    private String isimportdefects;

	@ApiModelProperty(value = "询价中是否存在本抵押物正在挂牌销售情况说明", example = "", dataType="varchar(300)", required = true )
    private String islistingsalenotes;

	@ApiModelProperty(value = "询价中是否存在本抵押物正在挂牌销售", example = "", dataType="char(1)", required = true )
    private String islistingsale;

	@ApiModelProperty(value = "抵押房产是否长期（6个月以上）无成交记录情况说明", example = "", dataType="varchar(300)", required = true )
    private String longtimenorecordnotes;

	@ApiModelProperty(value = "抵押房产是否长期（6个月以上）无成交记录", example = "", dataType="char(1)", required = true )
    private String longtimenorecord;
	
	@ApiModelProperty(value = "图片存放地址數組", example = "", dataType="varchar(600)", required = true )
    private List<ImageBean> imagelist;

	/*@ApiModelProperty(value = "其他图片存放地址", example = "", dataType="varchar(600)", required = true )
    private List<ImageBean> otherpicaddr;

	@ApiModelProperty(value = "阳台图片存放地址", example = "", dataType="varchar(600)", required = true )
    private List<ImageBean> balconyaddr;

	@ApiModelProperty(value = "房间图片存放地址", example = "", dataType="varchar(600)", required = true )
    private List<ImageBean> roomaddr;

	@ApiModelProperty(value = "客厅图片存放地址", example = "", dataType="varchar(600)", required = true )
    private List<ImageBean> livingroomaddr;

	@ApiModelProperty(value = "抵押物门牌标志", example = "", dataType="varchar(600)", required = true )
    private List<ImageBean> mortgagedooraddr;

	@ApiModelProperty(value = "单元门口照片存放地址", example = "", dataType="varchar(600)", required = true )
    private List<ImageBean> unitdooraddr;

	@ApiModelProperty(value = "小区门口图片存放地址", example = "", dataType="varchar(600)", required = true )
    private List<ImageBean> districtdooraddr;*/

	@ApiModelProperty(value = "抵押物尽调意见", example = "", dataType="longtext", required = true )
    private String mortgageview;

	@ApiModelProperty(value = "特别注意事项尽调意见", example = "", dataType="longtext", required = true )
    private String comments;

	@ApiModelProperty(value = "是否为学位房", example = "", dataType="varchar(1)", required = true )
    private String degreeroom;
	
	@ApiModelProperty(value = "室", example = "", dataType="varchar(1)", required = true )
    private String room;

	@ApiModelProperty(value = "厅", example = "", dataType="varchar(1)", required = true )
    private String hall;

	@ApiModelProperty(value = "卫", example = "", dataType="varchar(1)", required = true )
    private String toilet;

	@ApiModelProperty(value = "阳台", example = "", dataType="varchar(1)", required = true )
    private String balcony;
	
	@ApiModelProperty(value = "节点", example = "PDD004", dataType="varchar(6)", required = true )
    private String nodeid;

	@ApiModelProperty(value = "审批人", example = "123", dataType="varchar(8)", required = true )
    private String userid;
	
	@ApiModelProperty(value = "操作", example = "同意", dataType="varchar(8)", required = true )
    private String operation;
	
	@ApiModelProperty(value = "中介图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String insidepicaddr;

	@ApiModelProperty(value = "超市图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String supmarketpicaddr;

	@ApiModelProperty(value = "地铁图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String subwaypicaddr;

	@ApiModelProperty(value = "医院图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String hospitalpicaddr;

	@ApiModelProperty(value = "学校图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String schoolpicaddr;
	
}
