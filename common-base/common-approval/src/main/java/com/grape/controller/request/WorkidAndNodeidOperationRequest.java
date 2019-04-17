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
public class WorkidAndNodeidOperationRequest extends RestfulRequest{
private static final long serialVersionUID = 1L;
	
	@NotNull
	@NotBlank
	@ApiModelProperty(value="申请编号",required=true,example="0000000001")
	@Length(min=0,max=10,message="workid最大长度为10")
	private String workid;
	
	@NotNull
	@NotBlank
	@Length(max=10,min=0,message="节点编号不能超出10位")
    @NotEmpty(message = "节点编号不能为空")
    @ApiModelProperty(value = "节点编号", example = "PRD00401", required = true)
    private String nodeid;
	
	@NotNull
	@NotBlank
	@ApiModelProperty(value = "操作", example = "001", required = true)
    private String operation;
	
	@NotNull
	@NotBlank
	@ApiModelProperty(value = "产品编号", example = "001", required = true)
    private String productno;
}
