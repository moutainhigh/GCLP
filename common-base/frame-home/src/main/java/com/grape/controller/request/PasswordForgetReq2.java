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
public class PasswordForgetReq2 extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;
    
    @NotNull
    @NotEmpty(message = "手机号为空")
    @Length(max=11,min=11,message="手机号必须为11位")
    @ApiModelProperty(value = "手机号", example = "13888888888", required = true)
    private String phone;
    
    @NotNull
    @NotEmpty(message = "验证码为空")
    @Length(max=6,min=0,message="验证码不能超过6位")
    @ApiModelProperty(value = "验证码", example = "123456", required = true)
    private String keyCode;
    
   

}
