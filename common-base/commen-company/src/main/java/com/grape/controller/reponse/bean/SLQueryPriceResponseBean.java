package com.grape.controller.reponse.bean;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

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
public class SLQueryPriceResponseBean {
		
	@JsonProperty("CaseID")
	private String CaseID;
	
	@JsonProperty("Address")
	private String Address;
	
	@JsonProperty("UnitPrice")
	private BigDecimal UnitPrice;
	
	@JsonProperty("TotalPrice")
	private BigDecimal TotalPrice;
	
	@JsonProperty("QueryDate")
	private String QueryDate;
	
	@JsonProperty("AvgUnitPrice")
	private BigDecimal AvgUnitPrice;
	
	@JsonProperty("MaxPrice")
	private BigDecimal MaxPrice;
	
	@JsonProperty("MinPrice")
	private BigDecimal MinPrice;
	
	@JsonProperty("MangerPrice")
	private BigDecimal MangerPrice;
	
	@JsonProperty("Liveness")
	private int Liveness;
	
	@JsonProperty("TotalCellNumnber")
	private int TotalCellNumnber;
	
	@JsonProperty("QueryCount")
	private int QueryCount;
	
	@JsonProperty("ReturnCode")
	private int ReturnCode;
	
	@JsonProperty("Remark")
	private String Remark;
	
	@JsonProperty("PrintUrl")
	private String PrintUrl;
	
	@JsonProperty("EndDate")
	private String EndDate;
	
	@JsonProperty("ConstructionName")
	private String ConstructionName;
	
	@JsonProperty("ConstructionAlias")
	private String ConstructionAlias;
	
	@JsonProperty("BuildingName")
	private String BuildingName;
	
	@JsonProperty("HouseName")
	private String HouseName;
	
	@JsonProperty("AvgPrice")
	private int AvgPrice;
	
	@JsonProperty("PropertyType")
	private String PropertyType;
	
	@JsonProperty("QuotationCount")
	private String QuotationCount;
}
