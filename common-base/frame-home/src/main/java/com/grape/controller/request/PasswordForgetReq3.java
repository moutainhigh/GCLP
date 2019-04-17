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
public class PasswordForgetReq3 extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;
    
    @NotNull
    @NotEmpty(message = "手机号")
    @Length(max=11,min=11,message="手机号为11位")
    @ApiModelProperty(value = "手机号", example = "13888888888", required = true)
    private String phone;
    
    
    @NotNull
    @NotEmpty(message = "新密码为空")
    @Length(max=80,min=0,message="密码不能超过80位")
    @ApiModelProperty(value = "新密码", example = "12345678", required = true)
    private String newPassword;
    
    @NotNull
    @NotEmpty(message = "校验码为空")
    @Length(max=80,min=0,message="校验码为8位")
    @ApiModelProperty(value = "校验码", example = "12345678", required = true)
    private String valicode;


}
