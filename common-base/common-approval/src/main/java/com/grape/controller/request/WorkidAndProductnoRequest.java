package com.grape.controller.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

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
public class WorkidAndProductnoRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@NotBlank
	@ApiModelProperty(value="申请编号",required=true,example="0000000001")
	@Length(min=0,max=10,message="workid最大长度为10")
	private String workid;
	
	@NotNull
	@NotBlank
    @ApiModelProperty(value = "产品编号", example = "", required = true)
    private String productno;
	
	@ApiModelProperty(value = "节点编号（完善资料专用）", example = "", required = true)
    private String nodeid;
	
}
