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
public class WaihuCalloutRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;

    @NotNull
    @NotEmpty(message = "流水号为空")
    @Length(max=10,min=0,message="流水号为10位")
    @ApiModelProperty(value = "流水号", example = "0000000000", required = true)
    private String workid;
    
    @NotNull
    @NotEmpty(message = "通话记录callid")
    @ApiModelProperty(value = "通话记录callid", example = "", required = true)
    private String callid;
    
    @NotNull
    @NotEmpty(message = "客户名称为空")
    @ApiModelProperty(value = "客户名称", example = "", required = true)
    private String custname;
    
    @NotNull
    @NotEmpty(message = "客户电话号码为空")
    @ApiModelProperty(value = "客户电话号码", example = "", required = true)
    private String custphone;
    
    @NotNull
    @NotEmpty(message = "客户类型")
    @Length(max=1,min=0,message="客户类型为1位")
    @ApiModelProperty(value = "客户类型", example = "", required = true)
    private String custtype;
    
    
   

}
