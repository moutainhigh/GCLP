package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//尽调抵押物信息表
public class Delimortgage implements Serializable {
	@Length(max=19,min=0,message="主键ID不能超出19位")
	@ApiModelProperty(value = "主键ID", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=300,min=0,message="不能超出300位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(300)", required = true )
    private String houseaddressnotes;

	@Length(max=1,min=0,message="房屋坐落地址是否与描述一致不能超出1位")
	@ApiModelProperty(value = "房屋坐落地址是否与描述一致", example = "", dataType="char(1)", required = true )
    private String houseaddressflg;

	@Length(max=80,min=0,message="其他开发商不能超出80位")
	@ApiModelProperty(value = "其他开发商", example = "", dataType="varchar(80)", required = true )
    private String otherdeveloper;

	@Length(max=4,min=0,message="开发商不能超出4位")
	@ApiModelProperty(value = "开发商", example = "", dataType="varchar(4)", required = true )
    private String developer;

	@Length(max=4,min=0,message="落户人口不能超出4位")
	@ApiModelProperty(value = "落户人口", example = "", dataType="varchar(4)", required = true )
    private String fallpopulation;

	@Length(max=4,min=0,message="常驻人口不能超出4位")
	@ApiModelProperty(value = "常驻人口", example = "", dataType="varchar(4)", required = true )
    private String livepeople;

	@Length(max=10,min=0,message="人均居住面积不能超出10位")
	@ApiModelProperty(value = "人均居住面积", example = "", dataType="varchar(10)", required = true )
    private String livesize;

	@Length(max=4,min=0,message="占地面积不能超出4位")
	@ApiModelProperty(value = "占地面积", example = "", dataType="varchar(4)", required = true )
    private String areasize;

	@Length(max=4,min=0,message="套内面积不能超出4位")
	@ApiModelProperty(value = "套内面积", example = "", dataType="varchar(4)", required = true )
    private String insidesize;

	@Length(max=4,min=0,message="车库面积不能超出4位")
	@ApiModelProperty(value = "车库面积", example = "", dataType="varchar(4)", required = true )
    private String carhousesize;

	@Length(max=300,min=0,message="车库情况说明不能超出300位")
	@ApiModelProperty(value = "车库情况说明", example = "", dataType="varchar(300)", required = true )
    private String chrhousenotes;

	@Length(max=1,min=0,message="是否有车库不能超出1位")
	@ApiModelProperty(value = "是否有车库", example = "", dataType="char(1)", required = true )
    private String havacarhouse;

	@Length(max=4,min=0,message="地下室面积不能超出4位")
	@ApiModelProperty(value = "地下室面积", example = "", dataType="varchar(4)", required = true )
    private String basementsize;

	@Length(max=1,min=0,message="是否有地下室不能超出1位")
	@ApiModelProperty(value = "是否有地下室", example = "", dataType="char(1)", required = true )
    private String isbasement;

	@Length(max=12,min=0,message="房产状态不能超出12位")
	@ApiModelProperty(value = "房产状态", example = "", dataType="varchar(12)", required = true )
    private String housestate;

	@Length(max=80,min=0,message="土地用途不能超出80位")
	@ApiModelProperty(value = "土地用途", example = "", dataType="varchar(80)", required = true )
    private String follorpurpose;

	@Length(max=300,min=0,message="是否为婚内财产情况说明不能超出300位")
	@ApiModelProperty(value = "是否为婚内财产情况说明", example = "", dataType="varchar(300)", required = true )
    private String ismaritalpropertynotes;

	@Length(max=1,min=0,message="是否为婚内财产不能超出1位")
	@ApiModelProperty(value = "是否为婚内财产", example = "", dataType="char(1)", required = true )
    private String ismaritalproperty;

	@Length(max=4,min=0,message="总层数不能超出4位")
	@ApiModelProperty(value = "总层数", example = "", dataType="varchar(4)", required = true )
    private String floors;

	@Length(max=4,min=0,message="所在层数不能超出4位")
	@ApiModelProperty(value = "所在层数", example = "", dataType="varchar(4)", required = true )
    private String numberoflayers;

	@Length(max=30,min=0,message="装修程度不能超出30位")
	@ApiModelProperty(value = "装修程度", example = "", dataType="varchar(30)", required = true )
    private String degreedecoration;

	@Length(max=30,min=0,message="房屋朝向不能超出30位")
	@ApiModelProperty(value = "房屋朝向", example = "", dataType="varchar(30)", required = true )
    private String houseorientation;

	@Length(max=30,min=0,message="建筑类型不能超出30位")
	@ApiModelProperty(value = "建筑类型", example = "", dataType="varchar(30)", required = true )
    private String buildingtype;

	@Length(max=300,min=0,message="购房日期证明文件不能超出300位")
	@ApiModelProperty(value = "购房日期证明文件", example = "", dataType="varchar(300)", required = true )
    private String buyhousedoc;

	@Length(max=1,min=0,message="购房日期不能超出1位")
	@ApiModelProperty(value = "购房日期", example = "", dataType="char(1)", required = true )
    private String buyhousedate;

	@ApiModelProperty(value = "出租期限(结束)", example = "", dataType="datetime", required = true )
    private Date isrentoutdate2;

	@ApiModelProperty(value = "出租期限", example = "", dataType="datetime", required = true )
    private Date isrentoutdate;

	@Length(max=1,min=0,message="是否出租不能超出1位")
	@ApiModelProperty(value = "是否出租", example = "", dataType="char(1)", required = true )
    private String isrentout;

	@Length(max=1,min=0,message="是否为电梯房不能超出1位")
	@ApiModelProperty(value = "是否为电梯房", example = "", dataType="char(1)", required = true )
    private String iselevatorroom;

	@Length(max=1,min=0,message="300米内是否有地铁不能超出1位")
	@ApiModelProperty(value = "300米内是否有地铁", example = "", dataType="char(1)", required = true )
    private String issubwaynaer;

	@Length(max=1,min=0,message="周边是否配备大型医院不能超出1位")
	@ApiModelProperty(value = "周边是否配备大型医院", example = "", dataType="char(1)", required = true )
    private String ishospitalnear;

	@Length(max=1,min=0,message="周边是否配备公立学校不能超出1位")
	@ApiModelProperty(value = "周边是否配备公立学校", example = "", dataType="char(1)", required = true )
    private String isschoolnear;

	@Length(max=1,min=0,message="周边是否配备大型超市不能超出1位")
	@ApiModelProperty(value = "周边是否配备大型超市", example = "", dataType="char(1)", required = true )
    private String issupermarketnear;

	@Length(max=1,min=0,message="抵押物是否为唯一住宅不能超出1位")
	@ApiModelProperty(value = "抵押物是否为唯一住宅", example = "", dataType="char(1)", required = true )
    private String issoleresidence;

	@Length(max=17,min=0,message="历史成交价不能超出17位")
	@ApiModelProperty(value = "历史成交价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal historyrate;

	@Length(max=17,min=0,message="当前快速成交价（买方）不能超出17位")
	@ApiModelProperty(value = "当前快速成交价（买方）", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal buyerfasttransprice;

	@Length(max=17,min=0,message="当前快速成交价（卖方）不能超出17位")
	@ApiModelProperty(value = "当前快速成交价（卖方）", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal sellersfasttransprice;

	@Length(max=17,min=0,message="经纪网站挂盘价不能超出17位")
	@ApiModelProperty(value = "经纪网站挂盘价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal hangingprice;

	@Length(max=17,min=0,message="当前挂盘价不能超出17位")
	@ApiModelProperty(value = "当前挂盘价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal currenthangingprice;

	@Length(max=17,min=0,message="房产评估单价不能超出17位")
	@ApiModelProperty(value = "房产评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal houseunitprice;

	@Length(max=17,min=0,message="房产评估总价不能超出17位")
	@ApiModelProperty(value = "房产评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal housetotalprice;

	@Length(max=300,min=0,message="产权证描述对于抵押物性质判定是否不清晰情况说明不能超出300位")
	@ApiModelProperty(value = "产权证描述对于抵押物性质判定是否不清晰情况说明", example = "", dataType="varchar(300)", required = true )
    private String isjudgenotclearlynotes;

	@Length(max=1,min=0,message="产权证描述对于抵押物性质判定是否不清晰不能超出1位")
	@ApiModelProperty(value = "产权证描述对于抵押物性质判定是否不清晰", example = "", dataType="char(1)", required = true )
    private String isjudgenotclearly;

	@Length(max=300,min=0,message="是否属于指定销售特定人员房产情况说明不能超出300位")
	@ApiModelProperty(value = "是否属于指定销售特定人员房产情况说明", example = "", dataType="varchar(300)", required = true )
    private String issalelimitnotes;

	@Length(max=1,min=0,message="是否属于指定销售特定人员房产不能超出1位")
	@ApiModelProperty(value = "是否属于指定销售特定人员房产", example = "", dataType="char(1)", required = true )
    private String issalelimit;

	@Length(max=300,min=0,message="实地勘查抵押物小区名称、地址是否和产权证不一致不能超出300位")
	@ApiModelProperty(value = "实地勘查抵押物小区名称、地址是否和产权证不一致", example = "", dataType="varchar(300)", required = true )
    private String isnotsameofhousenotes;

	@Length(max=1,min=0,message="实地勘查抵押物小区名称、地址是否和产权证不一致不能超出1位")
	@ApiModelProperty(value = "实地勘查抵押物小区名称、地址是否和产权证不一致", example = "", dataType="char(1)", required = true )
    private String isnotsameofhouse;

	@Length(max=300,min=0,message="是否存在私自改建、违建等情形情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在私自改建、违建等情形情况说明", example = "", dataType="varchar(300)", required = true )
    private String isselfreformnotes;

	@Length(max=1,min=0,message="是否存在私自改建、违建等情形不能超出1位")
	@ApiModelProperty(value = "是否存在私自改建、违建等情形", example = "", dataType="char(1)", required = true )
    private String isselfreform;

	@Length(max=300,min=0,message="是否涉及拆迁、安全隐患或疏通性较差的情形情况说明不能超出300位")
	@ApiModelProperty(value = "是否涉及拆迁、安全隐患或疏通性较差的情形情况说明", example = "", dataType="varchar(300)", required = true )
    private String isnotsafehousenotes;

	@Length(max=1,min=0,message="是否涉及拆迁、安全隐患或疏通性较差的情形不能超出1位")
	@ApiModelProperty(value = "是否涉及拆迁、安全隐患或疏通性较差的情形", example = "", dataType="char(1)", required = true )
    private String isnotsafehouse;

	@Length(max=300,min=0,message="是否有催收函、律师函、门锁被撬、监控等情形情况说明不能超出300位")
	@ApiModelProperty(value = "是否有催收函、律师函、门锁被撬、监控等情形情况说明", example = "", dataType="varchar(300)", required = true )
    private String isproblemcasenotes;

	@Length(max=1,min=0,message="是否有催收函、律师函、门锁被撬、监控等情形不能超出1位")
	@ApiModelProperty(value = "是否有催收函、律师函、门锁被撬、监控等情形", example = "", dataType="char(1)", required = true )
    private String isproblemcase;

	@Length(max=300,min=0,message="是否为独栋无社区的楼盘情况说明不能超出300位")
	@ApiModelProperty(value = "是否为独栋无社区的楼盘情况说明", example = "", dataType="varchar(300)", required = true )
    private String issinglebuildingnotes;

	@Length(max=1,min=0,message="是否为独栋无社区的楼盘不能超出1位")
	@ApiModelProperty(value = "是否为独栋无社区的楼盘", example = "", dataType="char(1)", required = true )
    private String issinglebuilding;

	@Length(max=300,min=0,message="是否存在被面谈人与产权人不一致或为代持物业情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在被面谈人与产权人不一致或为代持物业情况说明", example = "", dataType="varchar(300)", required = true )
    private String isnotsameofownernotes;

	@Length(max=1,min=0,message="是否存在被面谈人与产权人不一致或为代持物业不能超出1位")
	@ApiModelProperty(value = "是否存在被面谈人与产权人不一致或为代持物业", example = "", dataType="char(1)", required = true )
    private String isnotsameofowner;

	@Length(max=300,min=0,message="是否有代持嫌疑情况说明不能超出300位")
	@ApiModelProperty(value = "是否有代持嫌疑情况说明", example = "", dataType="varchar(300)", required = true )
    private String isgenerationnotes;

	@Length(max=1,min=0,message="是否有代持嫌疑不能超出1位")
	@ApiModelProperty(value = "是否有代持嫌疑", example = "", dataType="char(1)", required = true )
    private String isgeneration;

	@Length(max=1,min=0,message="是否有残疾、瘫痪和行动不便等人士居住不能超出1位")
	@ApiModelProperty(value = "是否有残疾、瘫痪和行动不便等人士居住", example = "", dataType="char(1)", required = true )
    private String isbadactionperson;

	@Length(max=300,min=0,message="生活痕迹是否与婚育状况不一致情况说明不能超出300位")
	@ApiModelProperty(value = "生活痕迹是否与婚育状况不一致情况说明", example = "", dataType="varchar(300)", required = true )
    private String isnotsamenotes;

	@Length(max=1,min=0,message="生活痕迹是否与婚育状况不一致不能超出1位")
	@ApiModelProperty(value = "生活痕迹是否与婚育状况不一致", example = "", dataType="char(1)", required = true )
    private String isnotsameoffamilyinfo;

	@Length(max=300,min=0,message="是否承租期大于贷款到期日情况说明不能超出300位")
	@ApiModelProperty(value = "是否承租期大于贷款到期日情况说明", example = "", dataType="varchar(300)", required = true )
    private String dateduebignotes;

	@Length(max=1,min=0,message="是否承租期大于贷款到期日不能超出1位")
	@ApiModelProperty(value = "是否承租期大于贷款到期日", example = "", dataType="char(1)", required = true )
    private String istenantbiggerdatedue;

	@Length(max=300,min=0,message="询价中是否发现本抵押物的重要缺陷（如凶宅情况说明不能超出300位")
	@ApiModelProperty(value = "询价中是否发现本抵押物的重要缺陷（如凶宅情况说明", example = "", dataType="varchar(300)", required = true )
    private String importdefectsnotes;

	@Length(max=1,min=0,message="询价中是否发现本抵押物的重要缺陷（如凶宅不能超出1位")
	@ApiModelProperty(value = "询价中是否发现本抵押物的重要缺陷（如凶宅", example = "", dataType="char(1)", required = true )
    private String isimportdefects;

	@Length(max=300,min=0,message="询价中是否存在本抵押物正在挂牌销售情况说明不能超出300位")
	@ApiModelProperty(value = "询价中是否存在本抵押物正在挂牌销售情况说明", example = "", dataType="varchar(300)", required = true )
    private String islistingsalenotes;

	@Length(max=1,min=0,message="询价中是否存在本抵押物正在挂牌销售不能超出1位")
	@ApiModelProperty(value = "询价中是否存在本抵押物正在挂牌销售", example = "", dataType="char(1)", required = true )
    private String islistingsale;

	@Length(max=300,min=0,message="抵押房产是否长期（6个月以上）无成交记录情况说明不能超出300位")
	@ApiModelProperty(value = "抵押房产是否长期（6个月以上）无成交记录情况说明", example = "", dataType="varchar(300)", required = true )
    private String longtimenorecordnotes;

	@Length(max=1,min=0,message="抵押房产是否长期（6个月以上）无成交记录不能超出1位")
	@ApiModelProperty(value = "抵押房产是否长期（6个月以上）无成交记录", example = "", dataType="char(1)", required = true )
    private String longtimenorecord;

	@Length(max=600,min=0,message="其他图片存放地址不能超出600位")
	@ApiModelProperty(value = "其他图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String otherpicaddr;

	@Length(max=600,min=0,message="阳台图片存放地址不能超出600位")
	@ApiModelProperty(value = "阳台图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String balconyaddr;

	@Length(max=600,min=0,message="房间图片存放地址不能超出600位")
	@ApiModelProperty(value = "房间图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String roomaddr;

	@Length(max=600,min=0,message="客厅图片存放地址不能超出600位")
	@ApiModelProperty(value = "客厅图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String livingroomaddr;

	@Length(max=600,min=0,message="抵押物门牌标志不能超出600位")
	@ApiModelProperty(value = "抵押物门牌标志", example = "", dataType="varchar(600)", required = true )
    private String mortgagedooraddr;

	@Length(max=600,min=0,message="单元门口照片存放地址不能超出600位")
	@ApiModelProperty(value = "单元门口照片存放地址", example = "", dataType="varchar(600)", required = true )
    private String unitdooraddr;

	@Length(max=600,min=0,message="小区门口图片存放地址不能超出600位")
	@ApiModelProperty(value = "小区门口图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String districtdooraddr;

	@Length(max=600,min=0,message="中介图片存放地址不能超出600位")
	@ApiModelProperty(value = "中介图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String insidepicaddr;

	@Length(max=600,min=0,message="超市图片存放地址不能超出600位")
	@ApiModelProperty(value = "超市图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String supmarketpicaddr;

	@Length(max=600,min=0,message="地铁图片存放地址不能超出600位")
	@ApiModelProperty(value = "地铁图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String subwaypicaddr;

	@Length(max=600,min=0,message="医院图片存放地址不能超出600位")
	@ApiModelProperty(value = "医院图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String hospitalpicaddr;

	@Length(max=600,min=0,message="学校图片存放地址不能超出600位")
	@ApiModelProperty(value = "学校图片存放地址", example = "", dataType="varchar(600)", required = true )
    private String schoolpicaddr;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=1,min=0,message="是否为学位房不能超出1位")
	@ApiModelProperty(value = "是否为学位房", example = "", dataType="varchar(1)", required = true )
    private String degreeroom;

	@Length(max=1,min=0,message="室不能超出1位")
	@ApiModelProperty(value = "室", example = "", dataType="varchar(1)", required = true )
    private String room;

	@Length(max=1,min=0,message="厅不能超出1位")
	@ApiModelProperty(value = "厅", example = "", dataType="varchar(1)", required = true )
    private String hall;

	@Length(max=1,min=0,message="卫不能超出1位")
	@ApiModelProperty(value = "卫", example = "", dataType="varchar(1)", required = true )
    private String toilet;

	@Length(max=1,min=0,message="阳台不能超出1位")
	@ApiModelProperty(value = "阳台", example = "", dataType="varchar(1)", required = true )
    private String balcony;

	@ApiModelProperty(value = "抵押物尽调意见", example = "", dataType="longtext", required = true )
    private String mortgageview;

	@ApiModelProperty(value = "特别注意事项尽调意见", example = "", dataType="longtext", required = true )
    private String comments;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getHouseaddressnotes() {
        return houseaddressnotes;
    }

    public void setHouseaddressnotes(String houseaddressnotes) {
        this.houseaddressnotes = houseaddressnotes == null ? null : houseaddressnotes.trim();
    }

    public String getHouseaddressflg() {
        return houseaddressflg;
    }

    public void setHouseaddressflg(String houseaddressflg) {
        this.houseaddressflg = houseaddressflg == null ? null : houseaddressflg.trim();
    }

    public String getOtherdeveloper() {
        return otherdeveloper;
    }

    public void setOtherdeveloper(String otherdeveloper) {
        this.otherdeveloper = otherdeveloper == null ? null : otherdeveloper.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getFallpopulation() {
        return fallpopulation;
    }

    public void setFallpopulation(String fallpopulation) {
        this.fallpopulation = fallpopulation == null ? null : fallpopulation.trim();
    }

    public String getLivepeople() {
        return livepeople;
    }

    public void setLivepeople(String livepeople) {
        this.livepeople = livepeople == null ? null : livepeople.trim();
    }

    public String getLivesize() {
        return livesize;
    }

    public void setLivesize(String livesize) {
        this.livesize = livesize == null ? null : livesize.trim();
    }

    public String getAreasize() {
        return areasize;
    }

    public void setAreasize(String areasize) {
        this.areasize = areasize == null ? null : areasize.trim();
    }

    public String getInsidesize() {
        return insidesize;
    }

    public void setInsidesize(String insidesize) {
        this.insidesize = insidesize == null ? null : insidesize.trim();
    }

    public String getCarhousesize() {
        return carhousesize;
    }

    public void setCarhousesize(String carhousesize) {
        this.carhousesize = carhousesize == null ? null : carhousesize.trim();
    }

    public String getChrhousenotes() {
        return chrhousenotes;
    }

    public void setChrhousenotes(String chrhousenotes) {
        this.chrhousenotes = chrhousenotes == null ? null : chrhousenotes.trim();
    }

    public String getHavacarhouse() {
        return havacarhouse;
    }

    public void setHavacarhouse(String havacarhouse) {
        this.havacarhouse = havacarhouse == null ? null : havacarhouse.trim();
    }

    public String getBasementsize() {
        return basementsize;
    }

    public void setBasementsize(String basementsize) {
        this.basementsize = basementsize == null ? null : basementsize.trim();
    }

    public String getIsbasement() {
        return isbasement;
    }

    public void setIsbasement(String isbasement) {
        this.isbasement = isbasement == null ? null : isbasement.trim();
    }

    public String getHousestate() {
        return housestate;
    }

    public void setHousestate(String housestate) {
        this.housestate = housestate == null ? null : housestate.trim();
    }

    public String getFollorpurpose() {
        return follorpurpose;
    }

    public void setFollorpurpose(String follorpurpose) {
        this.follorpurpose = follorpurpose == null ? null : follorpurpose.trim();
    }

    public String getIsmaritalpropertynotes() {
        return ismaritalpropertynotes;
    }

    public void setIsmaritalpropertynotes(String ismaritalpropertynotes) {
        this.ismaritalpropertynotes = ismaritalpropertynotes == null ? null : ismaritalpropertynotes.trim();
    }

    public String getIsmaritalproperty() {
        return ismaritalproperty;
    }

    public void setIsmaritalproperty(String ismaritalproperty) {
        this.ismaritalproperty = ismaritalproperty == null ? null : ismaritalproperty.trim();
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors == null ? null : floors.trim();
    }

    public String getNumberoflayers() {
        return numberoflayers;
    }

    public void setNumberoflayers(String numberoflayers) {
        this.numberoflayers = numberoflayers == null ? null : numberoflayers.trim();
    }

    public String getDegreedecoration() {
        return degreedecoration;
    }

    public void setDegreedecoration(String degreedecoration) {
        this.degreedecoration = degreedecoration == null ? null : degreedecoration.trim();
    }

    public String getHouseorientation() {
        return houseorientation;
    }

    public void setHouseorientation(String houseorientation) {
        this.houseorientation = houseorientation == null ? null : houseorientation.trim();
    }

    public String getBuildingtype() {
        return buildingtype;
    }

    public void setBuildingtype(String buildingtype) {
        this.buildingtype = buildingtype == null ? null : buildingtype.trim();
    }

    public String getBuyhousedoc() {
        return buyhousedoc;
    }

    public void setBuyhousedoc(String buyhousedoc) {
        this.buyhousedoc = buyhousedoc == null ? null : buyhousedoc.trim();
    }

    public String getBuyhousedate() {
        return buyhousedate;
    }

    public void setBuyhousedate(String buyhousedate) {
        this.buyhousedate = buyhousedate == null ? null : buyhousedate.trim();
    }

    public Date getIsrentoutdate2() {
        return isrentoutdate2;
    }

    public void setIsrentoutdate2(Date isrentoutdate2) {
        this.isrentoutdate2 = isrentoutdate2;
    }

    public Date getIsrentoutdate() {
        return isrentoutdate;
    }

    public void setIsrentoutdate(Date isrentoutdate) {
        this.isrentoutdate = isrentoutdate;
    }

    public String getIsrentout() {
        return isrentout;
    }

    public void setIsrentout(String isrentout) {
        this.isrentout = isrentout == null ? null : isrentout.trim();
    }

    public String getIselevatorroom() {
        return iselevatorroom;
    }

    public void setIselevatorroom(String iselevatorroom) {
        this.iselevatorroom = iselevatorroom == null ? null : iselevatorroom.trim();
    }

    public String getIssubwaynaer() {
        return issubwaynaer;
    }

    public void setIssubwaynaer(String issubwaynaer) {
        this.issubwaynaer = issubwaynaer == null ? null : issubwaynaer.trim();
    }

    public String getIshospitalnear() {
        return ishospitalnear;
    }

    public void setIshospitalnear(String ishospitalnear) {
        this.ishospitalnear = ishospitalnear == null ? null : ishospitalnear.trim();
    }

    public String getIsschoolnear() {
        return isschoolnear;
    }

    public void setIsschoolnear(String isschoolnear) {
        this.isschoolnear = isschoolnear == null ? null : isschoolnear.trim();
    }

    public String getIssupermarketnear() {
        return issupermarketnear;
    }

    public void setIssupermarketnear(String issupermarketnear) {
        this.issupermarketnear = issupermarketnear == null ? null : issupermarketnear.trim();
    }

    public String getIssoleresidence() {
        return issoleresidence;
    }

    public void setIssoleresidence(String issoleresidence) {
        this.issoleresidence = issoleresidence == null ? null : issoleresidence.trim();
    }

    public BigDecimal getHistoryrate() {
        return historyrate;
    }

    public void setHistoryrate(BigDecimal historyrate) {
        this.historyrate = historyrate;
    }

    public BigDecimal getBuyerfasttransprice() {
        return buyerfasttransprice;
    }

    public void setBuyerfasttransprice(BigDecimal buyerfasttransprice) {
        this.buyerfasttransprice = buyerfasttransprice;
    }

    public BigDecimal getSellersfasttransprice() {
        return sellersfasttransprice;
    }

    public void setSellersfasttransprice(BigDecimal sellersfasttransprice) {
        this.sellersfasttransprice = sellersfasttransprice;
    }

    public BigDecimal getHangingprice() {
        return hangingprice;
    }

    public void setHangingprice(BigDecimal hangingprice) {
        this.hangingprice = hangingprice;
    }

    public BigDecimal getCurrenthangingprice() {
        return currenthangingprice;
    }

    public void setCurrenthangingprice(BigDecimal currenthangingprice) {
        this.currenthangingprice = currenthangingprice;
    }

    public BigDecimal getHouseunitprice() {
        return houseunitprice;
    }

    public void setHouseunitprice(BigDecimal houseunitprice) {
        this.houseunitprice = houseunitprice;
    }

    public BigDecimal getHousetotalprice() {
        return housetotalprice;
    }

    public void setHousetotalprice(BigDecimal housetotalprice) {
        this.housetotalprice = housetotalprice;
    }

    public String getIsjudgenotclearlynotes() {
        return isjudgenotclearlynotes;
    }

    public void setIsjudgenotclearlynotes(String isjudgenotclearlynotes) {
        this.isjudgenotclearlynotes = isjudgenotclearlynotes == null ? null : isjudgenotclearlynotes.trim();
    }

    public String getIsjudgenotclearly() {
        return isjudgenotclearly;
    }

    public void setIsjudgenotclearly(String isjudgenotclearly) {
        this.isjudgenotclearly = isjudgenotclearly == null ? null : isjudgenotclearly.trim();
    }

    public String getIssalelimitnotes() {
        return issalelimitnotes;
    }

    public void setIssalelimitnotes(String issalelimitnotes) {
        this.issalelimitnotes = issalelimitnotes == null ? null : issalelimitnotes.trim();
    }

    public String getIssalelimit() {
        return issalelimit;
    }

    public void setIssalelimit(String issalelimit) {
        this.issalelimit = issalelimit == null ? null : issalelimit.trim();
    }

    public String getIsnotsameofhousenotes() {
        return isnotsameofhousenotes;
    }

    public void setIsnotsameofhousenotes(String isnotsameofhousenotes) {
        this.isnotsameofhousenotes = isnotsameofhousenotes == null ? null : isnotsameofhousenotes.trim();
    }

    public String getIsnotsameofhouse() {
        return isnotsameofhouse;
    }

    public void setIsnotsameofhouse(String isnotsameofhouse) {
        this.isnotsameofhouse = isnotsameofhouse == null ? null : isnotsameofhouse.trim();
    }

    public String getIsselfreformnotes() {
        return isselfreformnotes;
    }

    public void setIsselfreformnotes(String isselfreformnotes) {
        this.isselfreformnotes = isselfreformnotes == null ? null : isselfreformnotes.trim();
    }

    public String getIsselfreform() {
        return isselfreform;
    }

    public void setIsselfreform(String isselfreform) {
        this.isselfreform = isselfreform == null ? null : isselfreform.trim();
    }

    public String getIsnotsafehousenotes() {
        return isnotsafehousenotes;
    }

    public void setIsnotsafehousenotes(String isnotsafehousenotes) {
        this.isnotsafehousenotes = isnotsafehousenotes == null ? null : isnotsafehousenotes.trim();
    }

    public String getIsnotsafehouse() {
        return isnotsafehouse;
    }

    public void setIsnotsafehouse(String isnotsafehouse) {
        this.isnotsafehouse = isnotsafehouse == null ? null : isnotsafehouse.trim();
    }

    public String getIsproblemcasenotes() {
        return isproblemcasenotes;
    }

    public void setIsproblemcasenotes(String isproblemcasenotes) {
        this.isproblemcasenotes = isproblemcasenotes == null ? null : isproblemcasenotes.trim();
    }

    public String getIsproblemcase() {
        return isproblemcase;
    }

    public void setIsproblemcase(String isproblemcase) {
        this.isproblemcase = isproblemcase == null ? null : isproblemcase.trim();
    }

    public String getIssinglebuildingnotes() {
        return issinglebuildingnotes;
    }

    public void setIssinglebuildingnotes(String issinglebuildingnotes) {
        this.issinglebuildingnotes = issinglebuildingnotes == null ? null : issinglebuildingnotes.trim();
    }

    public String getIssinglebuilding() {
        return issinglebuilding;
    }

    public void setIssinglebuilding(String issinglebuilding) {
        this.issinglebuilding = issinglebuilding == null ? null : issinglebuilding.trim();
    }

    public String getIsnotsameofownernotes() {
        return isnotsameofownernotes;
    }

    public void setIsnotsameofownernotes(String isnotsameofownernotes) {
        this.isnotsameofownernotes = isnotsameofownernotes == null ? null : isnotsameofownernotes.trim();
    }

    public String getIsnotsameofowner() {
        return isnotsameofowner;
    }

    public void setIsnotsameofowner(String isnotsameofowner) {
        this.isnotsameofowner = isnotsameofowner == null ? null : isnotsameofowner.trim();
    }

    public String getIsgenerationnotes() {
        return isgenerationnotes;
    }

    public void setIsgenerationnotes(String isgenerationnotes) {
        this.isgenerationnotes = isgenerationnotes == null ? null : isgenerationnotes.trim();
    }

    public String getIsgeneration() {
        return isgeneration;
    }

    public void setIsgeneration(String isgeneration) {
        this.isgeneration = isgeneration == null ? null : isgeneration.trim();
    }

    public String getIsbadactionperson() {
        return isbadactionperson;
    }

    public void setIsbadactionperson(String isbadactionperson) {
        this.isbadactionperson = isbadactionperson == null ? null : isbadactionperson.trim();
    }

    public String getIsnotsamenotes() {
        return isnotsamenotes;
    }

    public void setIsnotsamenotes(String isnotsamenotes) {
        this.isnotsamenotes = isnotsamenotes == null ? null : isnotsamenotes.trim();
    }

    public String getIsnotsameoffamilyinfo() {
        return isnotsameoffamilyinfo;
    }

    public void setIsnotsameoffamilyinfo(String isnotsameoffamilyinfo) {
        this.isnotsameoffamilyinfo = isnotsameoffamilyinfo == null ? null : isnotsameoffamilyinfo.trim();
    }

    public String getDateduebignotes() {
        return dateduebignotes;
    }

    public void setDateduebignotes(String dateduebignotes) {
        this.dateduebignotes = dateduebignotes == null ? null : dateduebignotes.trim();
    }

    public String getIstenantbiggerdatedue() {
        return istenantbiggerdatedue;
    }

    public void setIstenantbiggerdatedue(String istenantbiggerdatedue) {
        this.istenantbiggerdatedue = istenantbiggerdatedue == null ? null : istenantbiggerdatedue.trim();
    }

    public String getImportdefectsnotes() {
        return importdefectsnotes;
    }

    public void setImportdefectsnotes(String importdefectsnotes) {
        this.importdefectsnotes = importdefectsnotes == null ? null : importdefectsnotes.trim();
    }

    public String getIsimportdefects() {
        return isimportdefects;
    }

    public void setIsimportdefects(String isimportdefects) {
        this.isimportdefects = isimportdefects == null ? null : isimportdefects.trim();
    }

    public String getIslistingsalenotes() {
        return islistingsalenotes;
    }

    public void setIslistingsalenotes(String islistingsalenotes) {
        this.islistingsalenotes = islistingsalenotes == null ? null : islistingsalenotes.trim();
    }

    public String getIslistingsale() {
        return islistingsale;
    }

    public void setIslistingsale(String islistingsale) {
        this.islistingsale = islistingsale == null ? null : islistingsale.trim();
    }

    public String getLongtimenorecordnotes() {
        return longtimenorecordnotes;
    }

    public void setLongtimenorecordnotes(String longtimenorecordnotes) {
        this.longtimenorecordnotes = longtimenorecordnotes == null ? null : longtimenorecordnotes.trim();
    }

    public String getLongtimenorecord() {
        return longtimenorecord;
    }

    public void setLongtimenorecord(String longtimenorecord) {
        this.longtimenorecord = longtimenorecord == null ? null : longtimenorecord.trim();
    }

    public String getOtherpicaddr() {
        return otherpicaddr;
    }

    public void setOtherpicaddr(String otherpicaddr) {
        this.otherpicaddr = otherpicaddr == null ? null : otherpicaddr.trim();
    }

    public String getBalconyaddr() {
        return balconyaddr;
    }

    public void setBalconyaddr(String balconyaddr) {
        this.balconyaddr = balconyaddr == null ? null : balconyaddr.trim();
    }

    public String getRoomaddr() {
        return roomaddr;
    }

    public void setRoomaddr(String roomaddr) {
        this.roomaddr = roomaddr == null ? null : roomaddr.trim();
    }

    public String getLivingroomaddr() {
        return livingroomaddr;
    }

    public void setLivingroomaddr(String livingroomaddr) {
        this.livingroomaddr = livingroomaddr == null ? null : livingroomaddr.trim();
    }

    public String getMortgagedooraddr() {
        return mortgagedooraddr;
    }

    public void setMortgagedooraddr(String mortgagedooraddr) {
        this.mortgagedooraddr = mortgagedooraddr == null ? null : mortgagedooraddr.trim();
    }

    public String getUnitdooraddr() {
        return unitdooraddr;
    }

    public void setUnitdooraddr(String unitdooraddr) {
        this.unitdooraddr = unitdooraddr == null ? null : unitdooraddr.trim();
    }

    public String getDistrictdooraddr() {
        return districtdooraddr;
    }

    public void setDistrictdooraddr(String districtdooraddr) {
        this.districtdooraddr = districtdooraddr == null ? null : districtdooraddr.trim();
    }

    public String getInsidepicaddr() {
        return insidepicaddr;
    }

    public void setInsidepicaddr(String insidepicaddr) {
        this.insidepicaddr = insidepicaddr == null ? null : insidepicaddr.trim();
    }

    public String getSupmarketpicaddr() {
        return supmarketpicaddr;
    }

    public void setSupmarketpicaddr(String supmarketpicaddr) {
        this.supmarketpicaddr = supmarketpicaddr == null ? null : supmarketpicaddr.trim();
    }

    public String getSubwaypicaddr() {
        return subwaypicaddr;
    }

    public void setSubwaypicaddr(String subwaypicaddr) {
        this.subwaypicaddr = subwaypicaddr == null ? null : subwaypicaddr.trim();
    }

    public String getHospitalpicaddr() {
        return hospitalpicaddr;
    }

    public void setHospitalpicaddr(String hospitalpicaddr) {
        this.hospitalpicaddr = hospitalpicaddr == null ? null : hospitalpicaddr.trim();
    }

    public String getSchoolpicaddr() {
        return schoolpicaddr;
    }

    public void setSchoolpicaddr(String schoolpicaddr) {
        this.schoolpicaddr = schoolpicaddr == null ? null : schoolpicaddr.trim();
    }

    public Date getChgdt() {
        return chgdt;
    }

    public void setChgdt(Date chgdt) {
        this.chgdt = chgdt;
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public String getDegreeroom() {
        return degreeroom;
    }

    public void setDegreeroom(String degreeroom) {
        this.degreeroom = degreeroom == null ? null : degreeroom.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall == null ? null : hall.trim();
    }

    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet == null ? null : toilet.trim();
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony == null ? null : balcony.trim();
    }

    public String getMortgageview() {
        return mortgageview;
    }

    public void setMortgageview(String mortgageview) {
        this.mortgageview = mortgageview == null ? null : mortgageview.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Delimortgage other = (Delimortgage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getHouseaddressnotes() == null ? other.getHouseaddressnotes() == null : this.getHouseaddressnotes().equals(other.getHouseaddressnotes()))
            && (this.getHouseaddressflg() == null ? other.getHouseaddressflg() == null : this.getHouseaddressflg().equals(other.getHouseaddressflg()))
            && (this.getOtherdeveloper() == null ? other.getOtherdeveloper() == null : this.getOtherdeveloper().equals(other.getOtherdeveloper()))
            && (this.getDeveloper() == null ? other.getDeveloper() == null : this.getDeveloper().equals(other.getDeveloper()))
            && (this.getFallpopulation() == null ? other.getFallpopulation() == null : this.getFallpopulation().equals(other.getFallpopulation()))
            && (this.getLivepeople() == null ? other.getLivepeople() == null : this.getLivepeople().equals(other.getLivepeople()))
            && (this.getLivesize() == null ? other.getLivesize() == null : this.getLivesize().equals(other.getLivesize()))
            && (this.getAreasize() == null ? other.getAreasize() == null : this.getAreasize().equals(other.getAreasize()))
            && (this.getInsidesize() == null ? other.getInsidesize() == null : this.getInsidesize().equals(other.getInsidesize()))
            && (this.getCarhousesize() == null ? other.getCarhousesize() == null : this.getCarhousesize().equals(other.getCarhousesize()))
            && (this.getChrhousenotes() == null ? other.getChrhousenotes() == null : this.getChrhousenotes().equals(other.getChrhousenotes()))
            && (this.getHavacarhouse() == null ? other.getHavacarhouse() == null : this.getHavacarhouse().equals(other.getHavacarhouse()))
            && (this.getBasementsize() == null ? other.getBasementsize() == null : this.getBasementsize().equals(other.getBasementsize()))
            && (this.getIsbasement() == null ? other.getIsbasement() == null : this.getIsbasement().equals(other.getIsbasement()))
            && (this.getHousestate() == null ? other.getHousestate() == null : this.getHousestate().equals(other.getHousestate()))
            && (this.getFollorpurpose() == null ? other.getFollorpurpose() == null : this.getFollorpurpose().equals(other.getFollorpurpose()))
            && (this.getIsmaritalpropertynotes() == null ? other.getIsmaritalpropertynotes() == null : this.getIsmaritalpropertynotes().equals(other.getIsmaritalpropertynotes()))
            && (this.getIsmaritalproperty() == null ? other.getIsmaritalproperty() == null : this.getIsmaritalproperty().equals(other.getIsmaritalproperty()))
            && (this.getFloors() == null ? other.getFloors() == null : this.getFloors().equals(other.getFloors()))
            && (this.getNumberoflayers() == null ? other.getNumberoflayers() == null : this.getNumberoflayers().equals(other.getNumberoflayers()))
            && (this.getDegreedecoration() == null ? other.getDegreedecoration() == null : this.getDegreedecoration().equals(other.getDegreedecoration()))
            && (this.getHouseorientation() == null ? other.getHouseorientation() == null : this.getHouseorientation().equals(other.getHouseorientation()))
            && (this.getBuildingtype() == null ? other.getBuildingtype() == null : this.getBuildingtype().equals(other.getBuildingtype()))
            && (this.getBuyhousedoc() == null ? other.getBuyhousedoc() == null : this.getBuyhousedoc().equals(other.getBuyhousedoc()))
            && (this.getBuyhousedate() == null ? other.getBuyhousedate() == null : this.getBuyhousedate().equals(other.getBuyhousedate()))
            && (this.getIsrentoutdate2() == null ? other.getIsrentoutdate2() == null : this.getIsrentoutdate2().equals(other.getIsrentoutdate2()))
            && (this.getIsrentoutdate() == null ? other.getIsrentoutdate() == null : this.getIsrentoutdate().equals(other.getIsrentoutdate()))
            && (this.getIsrentout() == null ? other.getIsrentout() == null : this.getIsrentout().equals(other.getIsrentout()))
            && (this.getIselevatorroom() == null ? other.getIselevatorroom() == null : this.getIselevatorroom().equals(other.getIselevatorroom()))
            && (this.getIssubwaynaer() == null ? other.getIssubwaynaer() == null : this.getIssubwaynaer().equals(other.getIssubwaynaer()))
            && (this.getIshospitalnear() == null ? other.getIshospitalnear() == null : this.getIshospitalnear().equals(other.getIshospitalnear()))
            && (this.getIsschoolnear() == null ? other.getIsschoolnear() == null : this.getIsschoolnear().equals(other.getIsschoolnear()))
            && (this.getIssupermarketnear() == null ? other.getIssupermarketnear() == null : this.getIssupermarketnear().equals(other.getIssupermarketnear()))
            && (this.getIssoleresidence() == null ? other.getIssoleresidence() == null : this.getIssoleresidence().equals(other.getIssoleresidence()))
            && (this.getHistoryrate() == null ? other.getHistoryrate() == null : this.getHistoryrate().equals(other.getHistoryrate()))
            && (this.getBuyerfasttransprice() == null ? other.getBuyerfasttransprice() == null : this.getBuyerfasttransprice().equals(other.getBuyerfasttransprice()))
            && (this.getSellersfasttransprice() == null ? other.getSellersfasttransprice() == null : this.getSellersfasttransprice().equals(other.getSellersfasttransprice()))
            && (this.getHangingprice() == null ? other.getHangingprice() == null : this.getHangingprice().equals(other.getHangingprice()))
            && (this.getCurrenthangingprice() == null ? other.getCurrenthangingprice() == null : this.getCurrenthangingprice().equals(other.getCurrenthangingprice()))
            && (this.getHouseunitprice() == null ? other.getHouseunitprice() == null : this.getHouseunitprice().equals(other.getHouseunitprice()))
            && (this.getHousetotalprice() == null ? other.getHousetotalprice() == null : this.getHousetotalprice().equals(other.getHousetotalprice()))
            && (this.getIsjudgenotclearlynotes() == null ? other.getIsjudgenotclearlynotes() == null : this.getIsjudgenotclearlynotes().equals(other.getIsjudgenotclearlynotes()))
            && (this.getIsjudgenotclearly() == null ? other.getIsjudgenotclearly() == null : this.getIsjudgenotclearly().equals(other.getIsjudgenotclearly()))
            && (this.getIssalelimitnotes() == null ? other.getIssalelimitnotes() == null : this.getIssalelimitnotes().equals(other.getIssalelimitnotes()))
            && (this.getIssalelimit() == null ? other.getIssalelimit() == null : this.getIssalelimit().equals(other.getIssalelimit()))
            && (this.getIsnotsameofhousenotes() == null ? other.getIsnotsameofhousenotes() == null : this.getIsnotsameofhousenotes().equals(other.getIsnotsameofhousenotes()))
            && (this.getIsnotsameofhouse() == null ? other.getIsnotsameofhouse() == null : this.getIsnotsameofhouse().equals(other.getIsnotsameofhouse()))
            && (this.getIsselfreformnotes() == null ? other.getIsselfreformnotes() == null : this.getIsselfreformnotes().equals(other.getIsselfreformnotes()))
            && (this.getIsselfreform() == null ? other.getIsselfreform() == null : this.getIsselfreform().equals(other.getIsselfreform()))
            && (this.getIsnotsafehousenotes() == null ? other.getIsnotsafehousenotes() == null : this.getIsnotsafehousenotes().equals(other.getIsnotsafehousenotes()))
            && (this.getIsnotsafehouse() == null ? other.getIsnotsafehouse() == null : this.getIsnotsafehouse().equals(other.getIsnotsafehouse()))
            && (this.getIsproblemcasenotes() == null ? other.getIsproblemcasenotes() == null : this.getIsproblemcasenotes().equals(other.getIsproblemcasenotes()))
            && (this.getIsproblemcase() == null ? other.getIsproblemcase() == null : this.getIsproblemcase().equals(other.getIsproblemcase()))
            && (this.getIssinglebuildingnotes() == null ? other.getIssinglebuildingnotes() == null : this.getIssinglebuildingnotes().equals(other.getIssinglebuildingnotes()))
            && (this.getIssinglebuilding() == null ? other.getIssinglebuilding() == null : this.getIssinglebuilding().equals(other.getIssinglebuilding()))
            && (this.getIsnotsameofownernotes() == null ? other.getIsnotsameofownernotes() == null : this.getIsnotsameofownernotes().equals(other.getIsnotsameofownernotes()))
            && (this.getIsnotsameofowner() == null ? other.getIsnotsameofowner() == null : this.getIsnotsameofowner().equals(other.getIsnotsameofowner()))
            && (this.getIsgenerationnotes() == null ? other.getIsgenerationnotes() == null : this.getIsgenerationnotes().equals(other.getIsgenerationnotes()))
            && (this.getIsgeneration() == null ? other.getIsgeneration() == null : this.getIsgeneration().equals(other.getIsgeneration()))
            && (this.getIsbadactionperson() == null ? other.getIsbadactionperson() == null : this.getIsbadactionperson().equals(other.getIsbadactionperson()))
            && (this.getIsnotsamenotes() == null ? other.getIsnotsamenotes() == null : this.getIsnotsamenotes().equals(other.getIsnotsamenotes()))
            && (this.getIsnotsameoffamilyinfo() == null ? other.getIsnotsameoffamilyinfo() == null : this.getIsnotsameoffamilyinfo().equals(other.getIsnotsameoffamilyinfo()))
            && (this.getDateduebignotes() == null ? other.getDateduebignotes() == null : this.getDateduebignotes().equals(other.getDateduebignotes()))
            && (this.getIstenantbiggerdatedue() == null ? other.getIstenantbiggerdatedue() == null : this.getIstenantbiggerdatedue().equals(other.getIstenantbiggerdatedue()))
            && (this.getImportdefectsnotes() == null ? other.getImportdefectsnotes() == null : this.getImportdefectsnotes().equals(other.getImportdefectsnotes()))
            && (this.getIsimportdefects() == null ? other.getIsimportdefects() == null : this.getIsimportdefects().equals(other.getIsimportdefects()))
            && (this.getIslistingsalenotes() == null ? other.getIslistingsalenotes() == null : this.getIslistingsalenotes().equals(other.getIslistingsalenotes()))
            && (this.getIslistingsale() == null ? other.getIslistingsale() == null : this.getIslistingsale().equals(other.getIslistingsale()))
            && (this.getLongtimenorecordnotes() == null ? other.getLongtimenorecordnotes() == null : this.getLongtimenorecordnotes().equals(other.getLongtimenorecordnotes()))
            && (this.getLongtimenorecord() == null ? other.getLongtimenorecord() == null : this.getLongtimenorecord().equals(other.getLongtimenorecord()))
            && (this.getOtherpicaddr() == null ? other.getOtherpicaddr() == null : this.getOtherpicaddr().equals(other.getOtherpicaddr()))
            && (this.getBalconyaddr() == null ? other.getBalconyaddr() == null : this.getBalconyaddr().equals(other.getBalconyaddr()))
            && (this.getRoomaddr() == null ? other.getRoomaddr() == null : this.getRoomaddr().equals(other.getRoomaddr()))
            && (this.getLivingroomaddr() == null ? other.getLivingroomaddr() == null : this.getLivingroomaddr().equals(other.getLivingroomaddr()))
            && (this.getMortgagedooraddr() == null ? other.getMortgagedooraddr() == null : this.getMortgagedooraddr().equals(other.getMortgagedooraddr()))
            && (this.getUnitdooraddr() == null ? other.getUnitdooraddr() == null : this.getUnitdooraddr().equals(other.getUnitdooraddr()))
            && (this.getDistrictdooraddr() == null ? other.getDistrictdooraddr() == null : this.getDistrictdooraddr().equals(other.getDistrictdooraddr()))
            && (this.getInsidepicaddr() == null ? other.getInsidepicaddr() == null : this.getInsidepicaddr().equals(other.getInsidepicaddr()))
            && (this.getSupmarketpicaddr() == null ? other.getSupmarketpicaddr() == null : this.getSupmarketpicaddr().equals(other.getSupmarketpicaddr()))
            && (this.getSubwaypicaddr() == null ? other.getSubwaypicaddr() == null : this.getSubwaypicaddr().equals(other.getSubwaypicaddr()))
            && (this.getHospitalpicaddr() == null ? other.getHospitalpicaddr() == null : this.getHospitalpicaddr().equals(other.getHospitalpicaddr()))
            && (this.getSchoolpicaddr() == null ? other.getSchoolpicaddr() == null : this.getSchoolpicaddr().equals(other.getSchoolpicaddr()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getDegreeroom() == null ? other.getDegreeroom() == null : this.getDegreeroom().equals(other.getDegreeroom()))
            && (this.getRoom() == null ? other.getRoom() == null : this.getRoom().equals(other.getRoom()))
            && (this.getHall() == null ? other.getHall() == null : this.getHall().equals(other.getHall()))
            && (this.getToilet() == null ? other.getToilet() == null : this.getToilet().equals(other.getToilet()))
            && (this.getBalcony() == null ? other.getBalcony() == null : this.getBalcony().equals(other.getBalcony()))
            && (this.getMortgageview() == null ? other.getMortgageview() == null : this.getMortgageview().equals(other.getMortgageview()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getHouseaddressnotes() == null) ? 0 : getHouseaddressnotes().hashCode());
        result = prime * result + ((getHouseaddressflg() == null) ? 0 : getHouseaddressflg().hashCode());
        result = prime * result + ((getOtherdeveloper() == null) ? 0 : getOtherdeveloper().hashCode());
        result = prime * result + ((getDeveloper() == null) ? 0 : getDeveloper().hashCode());
        result = prime * result + ((getFallpopulation() == null) ? 0 : getFallpopulation().hashCode());
        result = prime * result + ((getLivepeople() == null) ? 0 : getLivepeople().hashCode());
        result = prime * result + ((getLivesize() == null) ? 0 : getLivesize().hashCode());
        result = prime * result + ((getAreasize() == null) ? 0 : getAreasize().hashCode());
        result = prime * result + ((getInsidesize() == null) ? 0 : getInsidesize().hashCode());
        result = prime * result + ((getCarhousesize() == null) ? 0 : getCarhousesize().hashCode());
        result = prime * result + ((getChrhousenotes() == null) ? 0 : getChrhousenotes().hashCode());
        result = prime * result + ((getHavacarhouse() == null) ? 0 : getHavacarhouse().hashCode());
        result = prime * result + ((getBasementsize() == null) ? 0 : getBasementsize().hashCode());
        result = prime * result + ((getIsbasement() == null) ? 0 : getIsbasement().hashCode());
        result = prime * result + ((getHousestate() == null) ? 0 : getHousestate().hashCode());
        result = prime * result + ((getFollorpurpose() == null) ? 0 : getFollorpurpose().hashCode());
        result = prime * result + ((getIsmaritalpropertynotes() == null) ? 0 : getIsmaritalpropertynotes().hashCode());
        result = prime * result + ((getIsmaritalproperty() == null) ? 0 : getIsmaritalproperty().hashCode());
        result = prime * result + ((getFloors() == null) ? 0 : getFloors().hashCode());
        result = prime * result + ((getNumberoflayers() == null) ? 0 : getNumberoflayers().hashCode());
        result = prime * result + ((getDegreedecoration() == null) ? 0 : getDegreedecoration().hashCode());
        result = prime * result + ((getHouseorientation() == null) ? 0 : getHouseorientation().hashCode());
        result = prime * result + ((getBuildingtype() == null) ? 0 : getBuildingtype().hashCode());
        result = prime * result + ((getBuyhousedoc() == null) ? 0 : getBuyhousedoc().hashCode());
        result = prime * result + ((getBuyhousedate() == null) ? 0 : getBuyhousedate().hashCode());
        result = prime * result + ((getIsrentoutdate2() == null) ? 0 : getIsrentoutdate2().hashCode());
        result = prime * result + ((getIsrentoutdate() == null) ? 0 : getIsrentoutdate().hashCode());
        result = prime * result + ((getIsrentout() == null) ? 0 : getIsrentout().hashCode());
        result = prime * result + ((getIselevatorroom() == null) ? 0 : getIselevatorroom().hashCode());
        result = prime * result + ((getIssubwaynaer() == null) ? 0 : getIssubwaynaer().hashCode());
        result = prime * result + ((getIshospitalnear() == null) ? 0 : getIshospitalnear().hashCode());
        result = prime * result + ((getIsschoolnear() == null) ? 0 : getIsschoolnear().hashCode());
        result = prime * result + ((getIssupermarketnear() == null) ? 0 : getIssupermarketnear().hashCode());
        result = prime * result + ((getIssoleresidence() == null) ? 0 : getIssoleresidence().hashCode());
        result = prime * result + ((getHistoryrate() == null) ? 0 : getHistoryrate().hashCode());
        result = prime * result + ((getBuyerfasttransprice() == null) ? 0 : getBuyerfasttransprice().hashCode());
        result = prime * result + ((getSellersfasttransprice() == null) ? 0 : getSellersfasttransprice().hashCode());
        result = prime * result + ((getHangingprice() == null) ? 0 : getHangingprice().hashCode());
        result = prime * result + ((getCurrenthangingprice() == null) ? 0 : getCurrenthangingprice().hashCode());
        result = prime * result + ((getHouseunitprice() == null) ? 0 : getHouseunitprice().hashCode());
        result = prime * result + ((getHousetotalprice() == null) ? 0 : getHousetotalprice().hashCode());
        result = prime * result + ((getIsjudgenotclearlynotes() == null) ? 0 : getIsjudgenotclearlynotes().hashCode());
        result = prime * result + ((getIsjudgenotclearly() == null) ? 0 : getIsjudgenotclearly().hashCode());
        result = prime * result + ((getIssalelimitnotes() == null) ? 0 : getIssalelimitnotes().hashCode());
        result = prime * result + ((getIssalelimit() == null) ? 0 : getIssalelimit().hashCode());
        result = prime * result + ((getIsnotsameofhousenotes() == null) ? 0 : getIsnotsameofhousenotes().hashCode());
        result = prime * result + ((getIsnotsameofhouse() == null) ? 0 : getIsnotsameofhouse().hashCode());
        result = prime * result + ((getIsselfreformnotes() == null) ? 0 : getIsselfreformnotes().hashCode());
        result = prime * result + ((getIsselfreform() == null) ? 0 : getIsselfreform().hashCode());
        result = prime * result + ((getIsnotsafehousenotes() == null) ? 0 : getIsnotsafehousenotes().hashCode());
        result = prime * result + ((getIsnotsafehouse() == null) ? 0 : getIsnotsafehouse().hashCode());
        result = prime * result + ((getIsproblemcasenotes() == null) ? 0 : getIsproblemcasenotes().hashCode());
        result = prime * result + ((getIsproblemcase() == null) ? 0 : getIsproblemcase().hashCode());
        result = prime * result + ((getIssinglebuildingnotes() == null) ? 0 : getIssinglebuildingnotes().hashCode());
        result = prime * result + ((getIssinglebuilding() == null) ? 0 : getIssinglebuilding().hashCode());
        result = prime * result + ((getIsnotsameofownernotes() == null) ? 0 : getIsnotsameofownernotes().hashCode());
        result = prime * result + ((getIsnotsameofowner() == null) ? 0 : getIsnotsameofowner().hashCode());
        result = prime * result + ((getIsgenerationnotes() == null) ? 0 : getIsgenerationnotes().hashCode());
        result = prime * result + ((getIsgeneration() == null) ? 0 : getIsgeneration().hashCode());
        result = prime * result + ((getIsbadactionperson() == null) ? 0 : getIsbadactionperson().hashCode());
        result = prime * result + ((getIsnotsamenotes() == null) ? 0 : getIsnotsamenotes().hashCode());
        result = prime * result + ((getIsnotsameoffamilyinfo() == null) ? 0 : getIsnotsameoffamilyinfo().hashCode());
        result = prime * result + ((getDateduebignotes() == null) ? 0 : getDateduebignotes().hashCode());
        result = prime * result + ((getIstenantbiggerdatedue() == null) ? 0 : getIstenantbiggerdatedue().hashCode());
        result = prime * result + ((getImportdefectsnotes() == null) ? 0 : getImportdefectsnotes().hashCode());
        result = prime * result + ((getIsimportdefects() == null) ? 0 : getIsimportdefects().hashCode());
        result = prime * result + ((getIslistingsalenotes() == null) ? 0 : getIslistingsalenotes().hashCode());
        result = prime * result + ((getIslistingsale() == null) ? 0 : getIslistingsale().hashCode());
        result = prime * result + ((getLongtimenorecordnotes() == null) ? 0 : getLongtimenorecordnotes().hashCode());
        result = prime * result + ((getLongtimenorecord() == null) ? 0 : getLongtimenorecord().hashCode());
        result = prime * result + ((getOtherpicaddr() == null) ? 0 : getOtherpicaddr().hashCode());
        result = prime * result + ((getBalconyaddr() == null) ? 0 : getBalconyaddr().hashCode());
        result = prime * result + ((getRoomaddr() == null) ? 0 : getRoomaddr().hashCode());
        result = prime * result + ((getLivingroomaddr() == null) ? 0 : getLivingroomaddr().hashCode());
        result = prime * result + ((getMortgagedooraddr() == null) ? 0 : getMortgagedooraddr().hashCode());
        result = prime * result + ((getUnitdooraddr() == null) ? 0 : getUnitdooraddr().hashCode());
        result = prime * result + ((getDistrictdooraddr() == null) ? 0 : getDistrictdooraddr().hashCode());
        result = prime * result + ((getInsidepicaddr() == null) ? 0 : getInsidepicaddr().hashCode());
        result = prime * result + ((getSupmarketpicaddr() == null) ? 0 : getSupmarketpicaddr().hashCode());
        result = prime * result + ((getSubwaypicaddr() == null) ? 0 : getSubwaypicaddr().hashCode());
        result = prime * result + ((getHospitalpicaddr() == null) ? 0 : getHospitalpicaddr().hashCode());
        result = prime * result + ((getSchoolpicaddr() == null) ? 0 : getSchoolpicaddr().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getDegreeroom() == null) ? 0 : getDegreeroom().hashCode());
        result = prime * result + ((getRoom() == null) ? 0 : getRoom().hashCode());
        result = prime * result + ((getHall() == null) ? 0 : getHall().hashCode());
        result = prime * result + ((getToilet() == null) ? 0 : getToilet().hashCode());
        result = prime * result + ((getBalcony() == null) ? 0 : getBalcony().hashCode());
        result = prime * result + ((getMortgageview() == null) ? 0 : getMortgageview().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        return result;
    }
}
