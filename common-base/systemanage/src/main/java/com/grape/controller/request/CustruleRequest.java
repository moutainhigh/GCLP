package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Custrule;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class CustruleRequest extends RestfulRequest{
    @Length(max=19,min=0,message="编号不能超出19位")
    @ApiModelProperty(value = "编号", example = "", dataType="varchar(19)", required = true )
    private String id;

    @Length(max=1000,min=0,message="规则表达式不能超出1000位")
    @ApiModelProperty(value = "规则表达式", example = "", dataType="varchar(1000)", required = true )
    private String expression;

    @Length(max=7,min=0,message="命中时得分不能超出7位")
    @ApiModelProperty(value = "命中时得分", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal score1;

    @Length(max=7,min=0,message="不命中时得分不能超出7位")
    @ApiModelProperty(value = "不命中时得分", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal score2;

    @Length(max=120,min=0,message="描述不能超出120位")
    @ApiModelProperty(value = "描述", example = "", dataType="varchar(120)", required = true )
    private String description;

    @Length(max=8,min=0,message="修改人不能超出8位")
    @ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    @ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgtm;

    @Length(max=8,min=0,message="状态不能超出8位")
    @ApiModelProperty(value = "状态", example = "", dataType="char(8)", required = true )
    private String status;

    @Length(max=16,min=0,message="规则名字不能超出16位")
    @ApiModelProperty(value = "规则名字", example = "", dataType="varchar(16)", required = true )
    private String rulename;
}
