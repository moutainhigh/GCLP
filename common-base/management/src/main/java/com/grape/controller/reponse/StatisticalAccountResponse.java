package com.grape.controller.reponse;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @描述 查看账户统计信息返回类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 16:07
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class StatisticalAccountResponse extends RestfulResponse {

    @ApiModelProperty(value = "单笔保证金", example = "99999.99999", required = true)
    private BigDecimal singledepositSum;

    @ApiModelProperty(value = "履约保证金", example = "99999.99999", required = true)
    private BigDecimal marginbalanceSum;

    @ApiModelProperty(value = "备用金", example = "99999.99999", required = true)
    private BigDecimal accountremianSum;

}
