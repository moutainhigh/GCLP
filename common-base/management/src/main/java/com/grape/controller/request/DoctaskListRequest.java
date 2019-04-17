package com.grape.controller.request;

import java.util.Date;

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

import javax.validation.constraints.NotNull;

/**
 * @描述 流水查询参数封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 13:51
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class DoctaskListRequest extends RestfulRequest {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "起始时间,可以为空")
    private Date startDate;

    @ApiModelProperty(value = "终止时间,可以为空")
    private Date endDate;

    @ApiModelProperty(value = "流水状态,可以为空")
    private String nodeid;

    @ApiModelProperty(value = "产品,可以为空")
    private String productno;

    @ApiModelProperty(value = "流水编号,可以为空")
    private String workid;

    @ApiModelProperty(value = "姓名,可以为空")
    private String custname;

    @ApiModelProperty(value = "身份证号,可以为空")
    private String cerdid;

    @ApiModelProperty(value = "房产证号,可以为空")
    private String houseno;

    @ApiModelProperty(value = "页码数", example = "1", required = true)
    @NotNull(message = "页码数不能为空")
    private int pagenum;

    @ApiModelProperty(value = "查询条数", example = "10", required = true)
    @NotNull(message = "查询条数不能为空")
    private int pagesize;

	@ApiModelProperty(value = "待办已办标识", example = "", required = true)
    private String processflg;
	
}