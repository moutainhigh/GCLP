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
public class MsgUpdateRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;


    
    @NotNull
    @NotEmpty(message = "消息编号不能为空")
    @Length(max=19,min=0,message="消息编号最多为19位")
    @ApiModelProperty(value = "消息编号", example = "1234567890123456789", required = true)
    private String msgid;
    
    @NotNull
    @NotEmpty(message = "流水号不能为空")
    @ApiModelProperty(value = "流水号", example = "1234567890", required = true)
    private String workid;
    
    @NotNull
    @NotEmpty(message = "节点不能为空")
    @ApiModelProperty(value = "节点", example = "", required = true)
    private String nodeid;
    
    
}
