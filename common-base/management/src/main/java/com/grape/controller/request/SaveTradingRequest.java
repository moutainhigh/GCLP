package com.grape.controller.request;

import java.math.BigDecimal;

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
 * @描述 新增交易记录参数封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 16:43
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class SaveTradingRequest extends RestfulRequest {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "企业编号", required = true)
    @NotNull(message = "企业编号不能为空")
    private String organizationno;

    @ApiModelProperty(value = "充值(1)扣费(2)", example = "1", required = true)
    @NotNull(message = "充值(1)扣费(2)不能为空")
    private String topupOrDeduction;

    @ApiModelProperty(value = "结算类型", required = true)
    @NotNull(message = "结算类型不能为空")
    private String balancetype;

    @ApiModelProperty(value = "交易金额", required = true)
    @NotNull(message = "交易金额不能为空")
    private BigDecimal transamount;

    @ApiModelProperty(value = "备注,可以为空")
    private String tradingnote;

}