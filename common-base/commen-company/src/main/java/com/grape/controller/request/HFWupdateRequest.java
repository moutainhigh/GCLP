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
public class HFWupdateRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;
    @NotNull
    @NotEmpty(message = "流水号")
    @Length(max=10,min=0,message="流水号为10位")
    @ApiModelProperty(value = "流水号", example = "1234567890", required = true)
    private String workid;
  
    @NotNull
    @NotEmpty(message = "身份证号码")
    @Length(max=32,min=0,message="身份证号码最多为32位")
    @ApiModelProperty(value = "身份证号码", example = "330121196212241414", required = true)
    private String certid;
    
    @NotNull
    @NotEmpty(message = "诉讼状态")
    @Length(max=10,min=0,message="诉讼状态最大为10位")
    @ApiModelProperty(value = "诉讼状态", example = "", required = true)
    private String litigationstate;
  
    @NotNull
    @NotEmpty(message = "标的金额")
    @Length(max=17,min=0,message="标的金额最多为17位")
    @ApiModelProperty(value = "标的金额", example = "3301.00", required = true)
    private String targetamount;
    
    @NotNull
    @NotEmpty(message = "诉讼类型")
    @Length(max=10,min=0,message="诉讼类型最大10位")
    @ApiModelProperty(value = "诉讼类型", example = "", required = true)
    private String litigationtype;
  
}
