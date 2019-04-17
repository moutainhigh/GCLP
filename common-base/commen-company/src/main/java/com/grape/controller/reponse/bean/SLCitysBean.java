package com.grape.controller.reponse.bean;



import java.io.Serializable;

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
public class SLCitysBean implements Serializable{
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -6111666947636703507L;
		@JsonProperty("Id")
		private int Id;
		@JsonProperty("Name")
		private String Name;
		@JsonProperty("PId")
		private int PId;
		@JsonProperty("GBCode")
		private int GBCode;
		@JsonProperty("Type")
		private int Type;
	
}
