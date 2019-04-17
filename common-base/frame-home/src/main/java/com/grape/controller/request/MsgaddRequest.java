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
public class MsgaddRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;
    @NotNull
    @NotEmpty(message = "流水号为空")
    @ApiModelProperty(value = "流水号", example = "1234567890", required = true)
    private String workid;
    
    @NotNull
    @NotEmpty(message = "消息内容为空")

    @ApiModelProperty(value = "消息内容", example = "消息内容", required = true)
    private String content;

    
    @NotNull
    @NotEmpty(message = "发送人为空")
    @ApiModelProperty(value = "发送人", example = "12345678", required = true)
    private String senduser;
    
    @NotNull		
    @NotEmpty(message = "接收人为空")

    @ApiModelProperty(value = "接收人", example = "12345678(如果是多个接收人中间用“,”隔开)", required = true)
    private String recuser;
    @NotNull
    
    @NotEmpty(message = "流水号为空")
    @Length(max=2,min=0,message="消息类型最大2位")
    @ApiModelProperty(value = "消息类型", example = "01", required = true)
    private String msgtype;
    
  
}
