package com.grape.controller.request;


import javax.validation.constraints.NotNull;

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
public class LiveinfoUpdateRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;

    @NotNull
    @NotEmpty(message = "直播信息id为空")
    @ApiModelProperty(value = "直播信息id", example = "0000000000123456789", required = true)
    private String id;
    
    @NotNull
    @NotEmpty(message = "直播人")
    @ApiModelProperty(value = "直播人", example = "12345678", required = true)
    private String liveperson;
   
    @ApiModelProperty(value = "开始时间", example = "", required = true)
    private String livestarttime;
    
    @ApiModelProperty(value = "结束时间", example = "", required = true)
    private String liveendtime;
    
   
    
   

}
