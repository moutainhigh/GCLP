package com.grape.controller.request;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Debtinfo;

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
public class DebtinfoListRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*@NotNull
	@NotBlank
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value="申请编号",example="0000000001",required=true)
	private String workid;
	
	@NotNull
	@Length(max=12,min=0,message="负债类型不能超出12位")
	@ApiModelProperty(value="负债类型",example="01",required=true)
	private String debttype;
	
	@NotNull
	@Length(max=80,min=0,message="借款人不能超出80位")
	@ApiModelProperty(value="借款人",example="李虎",required=true)
	private String borrowman;
	
	@NotNull
	@Length(max=80,min=0,message="金融机构不能超出80位")
	@ApiModelProperty(value="金融机构",example="四海金融",required=true)
	private String fananceorg;
	
	@NotNull
	@Length(max=17,min=0,message="借款总额不能超出17位")
	@ApiModelProperty(value="借款总额",example="1000000",required=true)
	private BigDecimal totalloan;
	
	@NotNull
	@Length(max=17,min=0,message="借款余额不能超出17位")
	@ApiModelProperty(value="借款余额",example="100000",required=true)
	private BigDecimal borrowremain;
	
	@NotNull
	@ApiModelProperty(value="开始日期",example="2018-09-09",required=true)
	private Date startdate;
	
	@NotNull
	@ApiModelProperty(value="结束日期",example="2019-09-09",required=true)
	private Date enddate;
	
	@NotNull
	@Length(max=80,min=0,message="抵押物产权编号不能超出80位")
	@ApiModelProperty(value="抵押物产权编号",example="001",required=true)
	private String pledgeno;
	
	@NotNull
	@Length(max=120,min=0,message="抵押物坐落地址不能超出120位")
	@ApiModelProperty(value="抵押物坐落地址",example="广东省深圳市宝安南路",required=true)
	private String pledgeaddress;
	
	@NotNull
	@Length(max=17,min=0,message="可用额度不能超出17位")
	@ApiModelProperty(value="可用额度",example="100000",required=true)
	private BigDecimal usefulposition;
	
	@NotNull
	@Length(max=17,min=0,message="已用额度不能超出17位")
	@ApiModelProperty(value="已用额度",example="1000",required=true)
	private BigDecimal usedposition;
	
	@NotNull
	@Length(max=8,min=0,message="折算比例不能超出8位")
	@ApiModelProperty(value="折算比例",example="76",required=true)
	private BigDecimal conversion;
	
	@NotNull
	@Length(max=600,min=0,message="负债情况说明不能超出600位")
	@ApiModelProperty(value = "负债情况说明", example = "", dataType="varchar(600)", required = true )
    private String debtinforemark;

	@NotNull
	@Length(max=1,min=0,message="是否有民间借贷记录不能超出1位")
	@ApiModelProperty(value = "是否有民间借贷记录", example = "", dataType="char(1)", required = true )
    private String havaloanflg;
	
	@NotNull
	@NotBlank
	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value="身份证号码",example="449898176709098765",required=true)
	private BigDecimal cerdid;
*/	
	@ApiModelProperty(value="负债信息",example="",required=true)
	private List<Debtinfo> list;
	
	@Length(max=1,min=0,message="是否有民间借贷记录不能超出1位")
	@ApiModelProperty(value = "是否有民间借贷记录", example = "", dataType="char(1)", required = true )
    private String havaloanflg;
	
	@Length(max=4,min=0,message="历史是否无民间借贷记录不能超出4位")
	@ApiModelProperty(value = "历史是否无民间借贷记录", example = "", dataType="varchar(4)", required = true )
    private String historicalhavaloanflg;
	
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;
	
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

}
