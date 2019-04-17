package com.grape.controller.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

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
public class CustinfoRequest extends RestfulRequest {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "申请编号", example = "0000000001", required = true)
    private String workid;
    
    /*@ApiModelProperty(value = "客户编号", example = "", required = true)
    private String custno;*/
    
	@NotNull
	@Length(max=4,min=0,message="客户类型不能超出4位")
    @ApiModelProperty(value = "客户类型", example = "1", required = true)
    private String custtype;
	
	@NotNull
	@Length(max=2,min=0,message="申请人类型不能超出2位")
    @ApiModelProperty(value = "申请人类型", example = "1", required = true)
    private String applytype;
	
	@NotNull
	@Length(max=4,min=0,message="国籍不能超出4位")
    @ApiModelProperty(value = "国籍", example = "01", required = true)
    private String country;
	
	@NotNull
	@Length(max=300,min=0,message="身份证正面不能超出300位")
    @ApiModelProperty(value = "身份证正面图片路径", example = "C://Image", required = true)
    private String creditimage;
	
	@NotNull
	@Length(max=300,min=0,message="身份证反面不能超出300位")
    @ApiModelProperty(value = "身份证反面图片路径", example = "C://Image", required = true)
    private String creditimage2;
    
	@NotNull
	@Length(max=80,min=0,message="客户名称不能超出80位")
    @ApiModelProperty(value = "客户名称", example = "李四", required = true)
    private String custname;
    
	@NotNull
	@Length(max=1,min=0,message="性别不能超出1位")
    @ApiModelProperty(value = "性别", example = "1", required = true)
    private String sex;
    
	@NotNull
	@Length(max=32,min=0,message="身份证号不能超出32位")
    @NotEmpty(message = "身份证号不能为空")
    @ApiModelProperty(value = "身份证号", example = "360721197606092416", required = true)
    private String cerdid;
	
	@NotNull
	@Length(max=300,min=0,message="身份证地址不能超出300位")
    @NotEmpty(message = "身份证地址不能为空")
    @ApiModelProperty(value = "身份证地址", example = "深圳市罗湖区宝安南路", required = true)
    private String cerditaddress;
    
	@NotNull
    @ApiModelProperty(value = "出生年月日", example = "1999-01-01", required = true)
    private Date birthday;
    
	@NotNull
	@Length(max=20,min=0,message="电话号码不能超出20位")
    @ApiModelProperty(value = "电话号码", example = "18788887777", required = true)
    private String telnumber;
    
	@NotNull
	@Length(max=300,min=0,message="家庭住址不能超出300位")
    @ApiModelProperty(value = "家庭住址", example = "广东省深圳市罗湖区建设路222号", required = true)
    private String familyaddress;
    
	@NotNull
	@Length(max=4,min=0,message="年龄不能超出4位")
    @ApiModelProperty(value = "年龄", example = "18", required = true)
    private String age;

	@NotNull
	@Length(max=120,min=0,message="户籍不能超出120位")
    @ApiModelProperty(value = "户籍", example = "广东", required = true)
    private String censusregister;
    
	@NotNull
	@Length(max=1,min=0,message="婚姻状况不能超出1位")
    @ApiModelProperty(value = "婚姻状况", example = "1", required = true)
    private String maritalstatus;
    
	@NotNull
	@Length(max=1,min=0,message="是否有诉讼记录不能超出1位")
    @ApiModelProperty(value = "是否有诉讼记录", example = "Y", required = true)
    private String islitigation;
    
	@NotNull
	@Length(max=80,min=0,message="职业不能超出80位")
    @ApiModelProperty(value = "职业", example = "技术总监", required = true)
    private String job;
	
	@Length(max=500,min=0,message="职业情况说明不能超出500位")
	@ApiModelProperty(value = "职业情况说明", example = "", dataType="varchar(500)", required = true )
    private String jobnation;
	
	@NotNull
	@Length(max=2,min=0,message="申请主体不能超出2位")
    @ApiModelProperty(value = "申请主体", example = "01", required = true)
    private String applymain;
	
	@NotNull
	@Length(max=80,min=0,message="单位名称不能超出80位")
    @ApiModelProperty(value = "单位名称", example = "葡萄信息科技", required = true)
    private String comname;
	
	@NotNull
	@Length(max=2,min=0,message="公司性质不能超出2位")
    @ApiModelProperty(value = "公司性质", example = "IT", required = true)
    private String comproperty;
	
	@ApiModelProperty(value = "公司是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String comhavalitigat;
	
	@NotNull
	@Length(max=80,min=0,message="公司性质不能超出80位")
    @ApiModelProperty(value = "公司性质", example = "IT", required = true)
    private String comproperty1;
	
	@NotNull
	@Length(max=80,min=0,message="职位不能超出80位")
    @ApiModelProperty(value = "职业", example = "Java开发工程师", required = true)
    private String position;
	
	@NotNull
	@Length(max=17,min=0,message="月工资收入不能超出17位")
    @ApiModelProperty(value = "月工资收入", example = "100000", required = true)
    private String monthincome;
	
	@NotNull
	@Length(max=200,min=0,message="公司实际经营地址不能超出200位")
    @ApiModelProperty(value = "公司实际经营地址", example = "坂田大道万家灯火", required = true)
    private String realcomaddress;
	
	@NotNull
    @ApiModelProperty(value = "业务描述", example = "主营电子产品销售", required = true)
    private String busdescription;
	
	@NotNull
	@Length(max=17,min=0,message="营业收入不能超出17位")
    @ApiModelProperty(value = "营业收入", example = "1000000", required = true)
    private String receipt;
	
	@NotNull
	@Length(max=17,min=0,message="净利润不能超出17位")
    @ApiModelProperty(value = "净利润", example = "1000000", required = true)
    private String netmargin;
	
	@NotNull
	@Length(max=300,min=0,message="营业执照图片存放地址不能超出300位")
    @ApiModelProperty(value = "营业执照图片存放地址", example = "C://Image", required = true)
    private String busilicence;
}
