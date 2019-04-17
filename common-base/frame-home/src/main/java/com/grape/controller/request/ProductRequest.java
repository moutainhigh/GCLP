package com.grape.controller.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
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
public class ProductRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;

    @NotNull
    @NotEmpty(message = "产品类型为空")
    @Length(max=2,min=1,message="产品类型最大2位，最小一位")
    @ApiModelProperty(value = "产品类型", example = "1", required = true)
    private String producttype;
    @NotNull
    @NotEmpty(message = "当前查询页为空")
    @Length(max=999,min=0,message="")
    @ApiModelProperty(value = "当前查询页", example = "0", required = true)
    private String currentpage;
    
    @NotNull
    @NotEmpty(message = "查询条数不能为空")
    @Length(max=10,min=0,message="查询条数最多为10条")
    @ApiModelProperty(value = "查询条数", example = "1", required = true)
    private String size;
}
