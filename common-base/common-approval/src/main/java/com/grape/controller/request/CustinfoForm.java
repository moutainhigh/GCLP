package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Litigationinfo;

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
public class CustinfoForm extends RestfulRequest {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@NotBlank
	@ApiModelProperty(value = "申请编号", example = "0000000001", required = true)
    private String workid;
    
    /*@ApiModelProperty(value = "客户编号", example = "", required = true)
    private String custno;*/
    
	
	@Length(max=30,min=0,message="客户类型不能超出80位")
    @ApiModelProperty(value = "客户类型", example = "1", required = true)
    private String custtype;
	
	
	@Length(max=4,min=0,message="国籍不能超出4位")
    @ApiModelProperty(value = "国籍", example = "01", required = true)
    private String country;
	
	
	@Length(max=300,min=0,message="身份证正面不能超出300位")
    @ApiModelProperty(value = "身份证正面图片路径", example = "C://Image", required = true)
    private String creditimage;
	
	
	@Length(max=300,min=0,message="身份证反面不能超出300位")
    @ApiModelProperty(value = "身份证反面图片路径", example = "C://Image", required = true)
    private String creditimage2;
    
	
	@Length(max=80,min=0,message="客户名称不能超出80位")
    @ApiModelProperty(value = "客户名称", example = "李四", required = true)
    private String custname;
    
	
	@Length(max=1,min=0,message="性别不能超出1位")
    @ApiModelProperty(value = "性别", example = "1", required = true)
    private String sex;
    
	
	@NotBlank
	@Length(max=32,min=0,message="身份证号不能超出32位")
    @NotEmpty(message = "身份证号不能为空")
    @ApiModelProperty(value = "身份证号", example = "360721197606092416", required = true)
    private String cerdid;
	
	
	@Length(max=300,min=0,message="身份证地址不能超出300位")
    @ApiModelProperty(value = "身份证地址", example = "深圳市罗湖区宝安南路", required = true)
    private String cerditaddress;
    
    @ApiModelProperty(value = "出生年月日", example = "1999-01-01", required = true)
    private Date birthday;
    
	
	@Length(max=20,min=0,message="电话号码不能超出20位")
    @ApiModelProperty(value = "电话号码", example = "18788887777", required = true)
    private String telnumber;
    
	@Length(max=80,min=0,message="家庭住址省份不能超出80位")
	@ApiModelProperty(value = "家庭住址省份", example = "1", dataType="varchar(80)", required = true )
    private String familyaddressprovince;

	@Length(max=80,min=0,message="家庭住址市区不能超出80位")
	@ApiModelProperty(value = "家庭住址市区", example = "1", dataType="varchar(80)", required = true )
    private String familyaddresscity;

	@Length(max=80,min=0,message="家庭住址区不能超出80位")
	@ApiModelProperty(value = "家庭住址区", example = "1", dataType="varchar(80)", required = true )
    private String familyaddressarea;

	@Length(max=120,min=0,message="家庭住址详细信息不能超出120位")
	@ApiModelProperty(value = "家庭住址详细信息", example = "1", dataType="varchar(120)", required = true )
    private String familyaddressdetail;
	
	@ApiModelProperty(value = "公司是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String comhavalitigat;
	
	@Length(max=4,min=0,message="年龄不能超出4位")
    @ApiModelProperty(value = "年龄", example = "18", required = true)
    private String age;

	@Length(max=80,min=0,message="户籍省份不能超出80位")
	@ApiModelProperty(value = "户籍省份", example = "1", dataType="varchar(80)", required = true )
    private String censusregisterprovvince;

	@Length(max=80,min=0,message="户籍所属市区不能超出80位")
	@ApiModelProperty(value = "户籍所属市区", example = "1", dataType="varchar(80)", required = true )
    private String censusregistercity;
    
	
	@Length(max=1,min=0,message="婚姻状况不能超出1位")
    @ApiModelProperty(value = "婚姻状况", example = "1", required = true)
    private String maritalstatus;
    
	
	@Length(max=1,min=0,message="是否有诉讼记录不能超出1位")
    @ApiModelProperty(value = "是否有诉讼记录", example = "Y", required = true)
    private String islitigation;
    
	
	@Length(max=80,min=0,message="职业不能超出80位")
    @ApiModelProperty(value = "职业", example = "技术总监", required = true)
    private String job;
	
	@Length(max=500,min=0,message="职业情况说明不能超出500位")
	@ApiModelProperty(value = "职业情况说明", example = "", dataType="varchar(500)", required = true )
    private String jobnation;
	
	@Length(max=2,min=0,message="申请主体不能超出2位")
    @ApiModelProperty(value = "申请主体", example = "01", required = true)
    private String applymain;
	
	
	@Length(max=80,min=0,message="单位名称不能超出80位")
    @ApiModelProperty(value = "单位名称", example = "葡萄信息科技", required = true)
    private String comname;
	
	
	@Length(max=2,min=0,message="公司性质不能超出2位")
    @ApiModelProperty(value = "公司性质", example = "IT", required = true)
    private String comproperty;
	
	
	@Length(max=80,min=0,message="公司性质不能超出80位")
	@ApiModelProperty(value = "公司性质", example = "IT", dataType="varchar(80)", required = true )
    private String comproperty1;
	
	
	@Length(max=80,min=0,message="职位不能超出80位")
    @ApiModelProperty(value = "职业", example = "Java开发工程师", required = true)
    private String position;
	
	
//	@Length(max=17,min=0,message="月工资收入不能超出17位")
    @ApiModelProperty(value = "月工资收入", example = "100000", required = true)
    private BigDecimal monthincome;
	
	
    @ApiModelProperty(value = "公司实际经营地址", example = "坂田大道万家灯火", required = true)
    private String realcomaddress;
	
	
    @ApiModelProperty(value = "业务描述", example = "主营电子产品销售", required = true)
    private String busdescription;
	
//	@Length(max=17,min=0,message="营业收入不能超出17位")
    @ApiModelProperty(value = "营业收入", example = "1000000", required = true)
    private BigDecimal receipt;
	
	
//	@Length(max=17,min=0,message="净利润不能超出17位")
    @ApiModelProperty(value = "净利润", example = "1000000", required = true)
    private BigDecimal netmargin;
	
	
    @ApiModelProperty(value = "营业执照图片存放地址", example = "C://Image", required = true)
    private String busilicence;
	
	/*@Length(max=1,min=0,message="借款人是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "借款人是否有诉讼记录", example = "Y", dataType="char(1)", required = true )
    private String isborrlitigation;

	@Length(max=1,min=0,message="公司是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "公司是否有诉讼记录", example = "Y", dataType="char(1)", required = true )
    private String iscomlitigation;

	@Length(max=10,min=0,message="诉讼状态不能超出10位")
	@ApiModelProperty(value = "诉讼状态", example = "01", dataType="varchar(10)", required = true )
    private String litigationstate;

//	@Length(max=17,min=0,message="标的金额不能超出17位")
	@ApiModelProperty(value = "标的金额", example = "100000", dataType="decimal(17,5)", required = true )
    private BigDecimal targetamount;

	@Length(max=10,min=0,message="诉讼类型不能超出10位")
	@ApiModelProperty(value = "诉讼类型", example = "01", dataType="varchar(10)", required = true )
    private String litigationtype;

	@Length(max=1,min=0,message="是否是失信人不能超出1位")
	@ApiModelProperty(value = "是否是失信人", example = "Y", dataType="char(1)", required = true )
    private String isdishonest;

	@Length(max=300,min=0,message="诉讼情况说明不能超出300位")
	@ApiModelProperty(value = "诉讼情况说明", example = "无", dataType="varchar(300)", required = true )
    private String litigationexplain;*/
	
	@ApiModelProperty(value = "诉讼记录列表", example = "", dataType="varchar(80)", required = true )
	private List<LitigationinfoRequest> litigationinfos;
	
	@ApiModelProperty(value = "籍贯所属省份", example = "1", dataType="varchar(80)", required = true )
    private String nativeplaceprovince;

	@ApiModelProperty(value = "籍贯所属城市", example = "1", dataType="varchar(80)", required = true )
    private String nativeplacecity;

	@ApiModelProperty(value = "籍贯所属区域", example = "1", dataType="varchar(80)", required = true )
    private String nativeplacearea;
	
   /* @ApiModelProperty(value = "离婚时间", example = "2019-09-09", required = true)
    private Date discoverdate;
	
	
	@Length(max=2,min=0,message="离婚协议书不能超出2位")
    @ApiModelProperty(value = "离婚协议书", example = "1", required = true)
    private String discoversign;
	
	
	@Length(max=300,min=0,message="财产分配履行情况不能超出300位")
    @ApiModelProperty(value = "财产分配履行情况", example = "履行良好", required = true)
    private String estatedescription;
	
	
	@Length(max=1,min=0,message="是否有子女不能超出1位")
    @ApiModelProperty(value = "是否有子女", example = "Y", required = true)
    private String havachildflg;
	
	
	@Length(max=2,min=0,message="子女个数不能超出2位")
    @ApiModelProperty(value = "子女个数", example = "2", required = true)
    private String childcount;
	
	
	@Length(max=300,min=0,message="子女情况说明不能超出300位")
    @ApiModelProperty(value = "子女情况说明", example = "无", required = true)
    private String childdescription;*/
	
	
    @ApiModelProperty(value = "是否从事高危行业", example = "Y", required = true)
    private String dangerjob;
	
    @ApiModelProperty(value = "与主借款人关系", example = "1", required = true)
    private String relationship;
	
	@ApiModelProperty(value = "配偶关联身份证号码", example = "", dataType="varchar(32)", required = true )
    private String relationcerdid;

	@ApiModelProperty(value = "是否是配偶", example = "", dataType="char(1)", required = true )
    private String ismarrow;
	
	@ApiModelProperty(value = "节点编号", example = "1", required = true)
    private String nodeid;
	
}
