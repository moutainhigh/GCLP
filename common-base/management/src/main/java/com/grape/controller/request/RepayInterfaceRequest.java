package com.grape.controller.request;

import java.math.BigDecimal;
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
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * @描述 还款参数封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/15 11:25
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RepayInterfaceRequest extends RestfulRequest {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "流水编号", required = true)
    @NotBlank(message = "流水编号不能为空")
    private String workid;

    @ApiModelProperty(value = "还款期号", required = true)
    @NotNull(message = "还款期号不能为空")
    private Integer refundissue;

    @ApiModelProperty(value = "还款类型", required = true)
    @NotNull(message = "还款类型不能为空")
    private String repaytype;

    @ApiModelProperty(value = "还款时间", required = true)
    @NotNull(message = "还款时间不能为空")
    private Date realityrefunddate;

    @ApiModelProperty(value = "还本金额", required = true)
    @NotNull(message = "还本金额不能为空")
    private BigDecimal refundmoney;

    @ApiModelProperty(value = "还息金额")
    @NotNull(message = "还息金额不能为空")
    private BigDecimal refundinterest;

    @ApiModelProperty(value = "违约金额")
    private BigDecimal breachofcontract;

    @ApiModelProperty(value = "罚息金额")
    private BigDecimal interestmoney;

    @ApiModelProperty(value = "滞纳金额")
    private BigDecimal delayingpayment;

}