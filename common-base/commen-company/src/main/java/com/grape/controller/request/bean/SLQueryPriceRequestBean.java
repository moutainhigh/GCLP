package com.grape.controller.request.bean;


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
public class SLQueryPriceRequestBean {
	
	@JsonProperty("CityID")
	private int CityID;
	@JsonProperty("ConstructionId")
	private int ConstructionId;
	@JsonProperty("BuildingId")
	private int BuildingId;
	@JsonProperty("HouseId")
	private int HouseId;
	@JsonProperty("BuildArea")
	private Float BuildArea;
	@JsonProperty("CaseId")
	private String CaseId;
	@JsonProperty("Address")
	private String Address;
	@JsonProperty("NearRoad")
	private String NearRoad;
	@JsonProperty("LandSpace")
	private String LandSpace;
	@JsonProperty("PropertyTypeRate")
	private String PropertyTypeRate;
	@JsonProperty("Floor")
	private String Floor;
	@JsonProperty("TotalFloor")
	private String TotalFloor;
	@JsonProperty("HouseType")
	private String HouseType;
	@JsonProperty("Forward")
	private String Forward;
	@JsonProperty("Remark")
	private String Remark;
	
}
