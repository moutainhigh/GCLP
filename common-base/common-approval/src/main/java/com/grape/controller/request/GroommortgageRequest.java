package com.grape.controller.request;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Groommortgage;

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
public class GroommortgageRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="当地《不动产权证登记受理凭证》是否收取不能超出1位")
	@ApiModelProperty(value = "当地《不动产权证登记受理凭证》是否收取", example = "", dataType="char(1)", required = true )
    private String housediplomabackflg;

	@Length(max=300,min=0,message="当地《不动产权证登记受理凭证》是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "当地《不动产权证登记受理凭证》是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String housediplomabacknote;

	@Length(max=1,min=0,message="当地不动产登记信息查询结果是否收取不能超出1位")
	@ApiModelProperty(value = "当地不动产登记信息查询结果是否收取", example = "", dataType="char(1)", required = true )
    private String housediplomaresultflg;

	@Length(max=300,min=0,message="当地不动产登记信息查询结果是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "当地不动产登记信息查询结果是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String housediplomaresultnote;

	@Length(max=1,min=0,message="其三证三章或股权质押是否收取不能超出1位")
	@ApiModelProperty(value = "其三证三章或股权质押是否收取", example = "", dataType="char(1)", required = true )
    private String diplomabackflg;

	@Length(max=300,min=0,message="其三证三章或股权质押是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "其三证三章或股权质押是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String diplomabacknote;
	
}
