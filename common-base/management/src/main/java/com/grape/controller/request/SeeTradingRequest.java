package com.grape.controller.request;

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
 * @描述 查看交易记录参数封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 16:54
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class SeeTradingRequest extends RestfulRequest {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "企业编号,可以为空", example = "COM01", required = false)
    private String organizationno;

    @ApiModelProperty(value = "账户类型", example = "01", required = true)
    @NotNull(message = "账户类型不能为空")
    private String accounttype;

    @ApiModelProperty(value = "页码数", example = "1", required = true)
    @NotNull(message = "页码数不能为空")
    private int pagenum;

    @ApiModelProperty(value = "查询条数", example = "10", required = true)
    @NotNull(message = "查询条数不能为空")
    private int pagesize;

}