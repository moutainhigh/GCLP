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
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @描述 业务量统计参数封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 11:22
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class BusinessStatisticsRequest extends RestfulRequest {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "片区/城市,可以为空")
    private String areaid;

    @ApiModelProperty(value = "产品,可以为空")
    private String productno;

    @ApiModelProperty(value = "渠道方编号,可以为空")
    private String channelno;

    @ApiModelProperty(value = "资金方编号,可以为空")
    private String fundno;

    @ApiModelProperty(value = "通道方编号,可以为空")
    private String aisleno;

    @ApiModelProperty(value = "平台方编号,可以为空")
    private String terrcaeno;

    @ApiModelProperty(value = "起始时间,可以为空")
    @NotNull(message = "起始时间不能为空")
    private Date startDate;

    @ApiModelProperty(value = "终止时间,可以为空")
    @NotNull(message = "终止时间不能为空")
    private Date endDate;

}