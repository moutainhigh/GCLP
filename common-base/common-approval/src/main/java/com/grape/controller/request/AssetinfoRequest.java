package com.grape.controller.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Assetinfo;

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
public class AssetinfoRequest extends RestfulRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "身份证号", example = "8989", required = true)
	private String cerdid;
	
	@ApiModelProperty(value = "申请编号", example = "0000000001", required = true)
    private String workid;
/*
	@NotNull
	@Length(max=10,min=0,message="资产类型不能超出10位")
	@ApiModelProperty(value = "*资产类型", example = "01", required = true)
    private String assettype;
	
	@NotNull
	@Length(max=200,min=0,message="坐落地址不能超出200位")
	@ApiModelProperty(value = "*坐落地址", example = "深圳市中审大厦", required = true)
    private String address;
	
	@NotNull
	@Length(max=1,min=0,message="*是否提供产证不能超出1位")
	@ApiModelProperty(value = "是否提供产证", example = "Y", required = true)
    private String isprovidepaper;
	
	@NotNull
	@Length(max=200,min=0,message="*产权人不能超出200位")
	@ApiModelProperty(value = "产权人", example = "张三", required = true)
    private String propertyowner;
	
	@NotNull
	@Length(max=20,min=0,message="房产性质不能超出20位")
	@ApiModelProperty(value = "房产性质", example = "01", required = true)
    private String housenature;
	
	@NotNull
	@Length(max=4,min=0,message="建筑面积不能超出4位")
	@ApiModelProperty(value = "建筑面积", example = "200", required = true)
    private String housearea;
	
	@NotNull
	@ApiModelProperty(value = "购买时间", example = "2018-06-15", required = true)
    private Date buytime;
	
	@NotNull
	@ApiModelProperty(value = "购买价格", example = "2000000", required = true)
    private BigDecimal buyprice;
	
	@NotNull
	@Length(max=10,min=0,message="资料选择类别不能超出10位")
	@ApiModelProperty(value = "资料选择类别", example = "01", required = true)
    private String docchoosetype;
	
	@NotNull
	@Length(max=200,min=0,message="资产情况说明不能超出200位")
	@ApiModelProperty(value = "资产情况说明", example = "无特殊情况", required = true)
    private String assetsituation;*/
	
	@ApiModelProperty(value = "资产情况", example = "", required = true)
	private List<Assetinfo> list;
	

}
