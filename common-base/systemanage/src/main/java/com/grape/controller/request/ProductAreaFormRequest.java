package com.grape.controller.request;

import java.util.Date;

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
public class ProductAreaFormRequest extends RestfulRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=19,min=0,message="区域id不能超出19位")
	@ApiModelProperty(value = "区域id", example = "", dataType="varchar(19)", required = true )
    private String areaid;

	@Length(max=6,min=0,message="产品id不能超出6位")
	@ApiModelProperty(value = "产品id", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=80,min=0,message="描述不能超出80位")
	@ApiModelProperty(value = "描述", example = "", dataType="varchar(80)", required = true )
    private String description;

}
