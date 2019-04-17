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
public class LiveRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;

    @NotNull	
    @NotEmpty(message = "流水号为空")
    @Length(max=10,min=0,message="流水号为10位")
    @ApiModelProperty(value = "流水号", example = "0000000000", required = true)
    private String workid;
    
    @NotNull	
    @NotEmpty(message = "抵押物编号")
   
    @ApiModelProperty(value = "抵押物编号", example = "0000000000123456789", required = true)
    private String mortgageno;
   
    @NotNull
    @NotEmpty(message = "节点为空")
    @ApiModelProperty(value = "节点", example = "PRODDDD", required = true)
    private String nodeid;
    
   

}
