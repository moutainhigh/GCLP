package com.grape.controller.request;

import java.util.List;

import org.hibernate.validator.constraints.Length;

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
public class AllPersonRequest extends RestfulRequest{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Length(max=80,min=0,message="用户名称不能超出80位")
    @ApiModelProperty(value = "用户名称", example = "", dataType="varchar(80)", required = true )
    private String workername;

    @Length(max=6,min=0,message="所属机构不能超出6位")
    @ApiModelProperty(value = "所属机构", example = "", dataType="varchar(6)", required = true )
    private String organizationid;

}
