package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.response.bean.Creditrecordbeans;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class CreditrecordResponse3 extends RestfulResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Creditrecordbeans creditrecordbeans1 ;
    
	private Creditrecordbeans creditrecordbeans2 ;
}
