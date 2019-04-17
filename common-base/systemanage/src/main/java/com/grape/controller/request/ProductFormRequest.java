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
public class ProductFormRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=19,min=0,message="产品编号不能超出19位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(19)", required = true )
    private String productno;

	@Length(max=80,min=0,message="产品名称不能超出80位")
	@ApiModelProperty(value = "产品名称", example = "", dataType="varchar(80)", required = true )
    private String productname;

	@Length(max=2,min=0,message="产品类型不能超出2位")
	@ApiModelProperty(value = "产品类型", example = "", dataType="varchar(2)", required = true )
    private String producttype;

	@Length(max=800,min=0,message="产品描述不能超出800位")
	@ApiModelProperty(value = "产品描述", example = "", dataType="varchar(800)", required = true )
    private String description;

	@Length(max=17,min=0,message="产品最低贷款金额不能超出17位")
	@ApiModelProperty(value = "产品最低贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal minloanamount;

	@Length(max=17,min=0,message="产品最高贷款金额不能超出17位")
	@ApiModelProperty(value = "产品最高贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal maxloanamount;

	@Length(max=20,min=0,message="利率类型不能超出20位")
	@ApiModelProperty(value = "利率类型", example = "", dataType="varchar(20)", required = true )
    private String ratetype;

	@Length(max=9,min=0,message="最低利率（年）不能超出9位")
	@ApiModelProperty(value = "最低利率（年）", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal minrateofyear;

	@Length(max=9,min=0,message="最高利率（年）不能超出9位")
	@ApiModelProperty(value = "最高利率（年）", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal maxrateofyear;

	@Length(max=6,min=0,message="所属资金方企业编号不能超出6位")
	@ApiModelProperty(value = "所属资金方企业编号", example = "", dataType="varchar(6)", required = true )
    private String fundcomno;

	@Length(max=255,min=0,message="通道机构编号不能超出255位")
	@ApiModelProperty(value = "通道机构编号", example = "", dataType="varchar(255)", required = true )
    private String aislecomno;

	@Length(max=5,min=0,message="兜底机构不能超出5位")
	@ApiModelProperty(value = "兜底机构", example = "", dataType="varchar(5)", required = true )
    private String subsidycomno;

	@Length(max=5,min=0,message="档案管理机构不能超出5位")
	@ApiModelProperty(value = "档案管理机构", example = "", dataType="varchar(5)", required = true )
    private String docmanagecomno;

	@Length(max=5,min=0,message="回款要件管理机构不能超出5位")
	@ApiModelProperty(value = "回款要件管理机构", example = "", dataType="varchar(5)", required = true )
    private String receivedoccomno;

	@Length(max=5,min=0,message="出款要件管理机构不能超出5位")
	@ApiModelProperty(value = "出款要件管理机构", example = "", dataType="varchar(5)", required = true )
    private String outloandoccomno;

	@Length(max=16,min=0,message="资金方对接方式不能超出16位")
	@ApiModelProperty(value = "资金方对接方式", example = "", dataType="varchar(16)", required = true )
    private String buttmode;

	@Length(max=1,min=0,message="是否需要尽调直播不能超出1位")
	@ApiModelProperty(value = "是否需要尽调直播", example = "", dataType="char(1)", required = true )
    private String duediligenceflg;

	@Length(max=16,min=0,message="抵押办理方式不能超出16位")
	@ApiModelProperty(value = "抵押办理方式", example = "", dataType="varchar(16)", required = true )
    private String mortgagetype;

	@Length(max=1,min=0,message="是否生效不能超出1位")
	@ApiModelProperty(value = "是否生效", example = "", dataType="char(1)", required = true )
    private String takeeffectflg;

	@Length(max=1,min=0,message="是否允许渠道尽调不能超出1位")
	@ApiModelProperty(value = "是否允许渠道尽调", example = "", dataType="char(1)", required = true )
    private String permitchandueflg;

	@Length(max=1,min=0,message="是否允许资金方尽调不能超出1位")
	@ApiModelProperty(value = "是否允许资金方尽调", example = "", dataType="char(1)", required = true )
    private String permitfunddueflg;

	@Length(max=1,min=0,message="是否允许平台尽调不能超出1位")
	@ApiModelProperty(value = "是否允许平台尽调", example = "", dataType="char(1)", required = true )
    private String permitplaformdueflg;

	@Length(max=1,min=0,message="尽调是否系统对接不能超出1位")
	@ApiModelProperty(value = "尽调是否系统对接", example = "", dataType="char(1)", required = true )
    private String duesystemflg;

	@Length(max=1,min=0,message="通道风控审批是否系统对接不能超出1位")
	@ApiModelProperty(value = "通道风控审批是否系统对接", example = "", dataType="char(1)", required = true )
    private String issysriskapprovel;

	@Length(max=1,min=0,message="通道放款审批是否系统对接不能超出1位")
	@ApiModelProperty(value = "通道放款审批是否系统对接", example = "", dataType="char(1)", required = true )
    private String issysgrantapprovel;

	@Length(max=1,min=0,message="是否允许平台抵押办理不能超出1位")
	@ApiModelProperty(value = "是否允许平台抵押办理", example = "", dataType="char(1)", required = true )
    private String permitplaformmortflg;

	@Length(max=1,min=0,message="是否允许渠道抵押办理不能超出1位")
	@ApiModelProperty(value = "是否允许渠道抵押办理", example = "", dataType="char(1)", required = true )
    private String permitchanmortflg;

	@Length(max=1,min=0,message="是否允许资金方抵押办理不能超出1位")
	@ApiModelProperty(value = "是否允许资金方抵押办理", example = "", dataType="char(1)", required = true )
    private String permitfundmortflg;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="查档频率不能超出10位")
	@ApiModelProperty(value = "查档频率", example = "", dataType="varchar(10)", required = true )
    private String checkfrequency;

	@Length(max=1,min=0,message="是否进行经营场所尽调不能超出1位")
	@ApiModelProperty(value = "是否进行经营场所尽调", example = "", dataType="char(1)", required = true )
    private String companydiligenceflg;

	@Length(max=40,min=0,message="还款方式不能超出40位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(40)", required = true )
    private String repaymethod;

	@Length(max=2,min=0,message="产品状态不能超出2位")
	@ApiModelProperty(value = "产品状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@ApiModelProperty(value = "产品内容", example = "", dataType="longtext", required = true )
    private String content;


}
