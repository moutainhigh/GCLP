package com.grape.controller.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * @描述 管理列表参数封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/16 13:34
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ManagementlistRequest extends RestfulRequest {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "起始时间", required = true)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startDate;

    @ApiModelProperty(value = "终止时间", required = true)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDate;

    @ApiModelProperty(value = "产品", required = true)
    private String productno;

    @ApiModelProperty(value = "流水编号", required = true)
    private String workid;

    @ApiModelProperty(value = "姓名", required = true)
    private String custname;

    @ApiModelProperty(value = "身份证号", required = true)
    private String cerdid;

    @ApiModelProperty(value = "房产证号", required = true)
    private String houseno;

    @ApiModelProperty(value = "页码数", example = "1", required = true)
    @NotNull(message = "页码数不能为空")
    private int pagenum;

    @ApiModelProperty(value = "查询条数", example = "10", required = true)
    @NotNull(message = "查询条数不能为空")
    private int pagesize;

}