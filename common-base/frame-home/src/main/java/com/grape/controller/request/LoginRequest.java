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
public class LoginRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;
    
    @NotNull
    @NotEmpty(message = "用户名为空")
    @Length(max=11,min=0,message="用户名不能超过11位")
    @ApiModelProperty(value = "用户名", example = "12345678", required = true)
    private String username;
    
   
    
    @NotNull
    @NotEmpty(message = "密码为空")
    @Length(max=80,min=0,message="密码不能超过80位")
    @ApiModelProperty(value = "密码", example = "12345678", required = true)
    private String password;

}
