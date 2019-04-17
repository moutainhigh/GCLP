package com.grape.controller.reponse.bean;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class DoctaskUnfinish {
	
	@ApiModelProperty(value="流水编号",required=true)
	private String workid;
	@ApiModelProperty(value="城市",required=true)
	private String city;
	@ApiModelProperty(value="渠道商",required=true)
	private String organizationname;
	@ApiModelProperty(value="产品类型",required=true)
	private String producttype;
	@ApiModelProperty(value="产品类型名称",required=true)
	private String producttypename;
	@ApiModelProperty(value="产品编号",required=true)
	private String productno;
	@ApiModelProperty(value="产品名称",required=true)
	private String productname;
	@ApiModelProperty(value="主借款人",required=true)
	private String borrower;
	@ApiModelProperty(value="共同借款人",required=true)
	private List<String> coborrower;
	@ApiModelProperty(value="担保人",required=true)
	private List<String> guarantor;
	@ApiModelProperty(value="抵押人",required=true)
	private List<String> mortgagor;
	@ApiModelProperty(value="产权证编号",required=true)
	private List<String> houseno;
	@ApiModelProperty(value="保存时间",required=true)
	private Date savetime;
	@ApiModelProperty(value="节点",required=true)
	private String node;
	
	
	
}
