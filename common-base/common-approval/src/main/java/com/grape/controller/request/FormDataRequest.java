package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class FormDataRequest extends RestfulRequest{

    @ApiModelProperty(value = "主键ID", example = "", dataType="int(11)", required = true )
    private Integer id;

    @ApiModelProperty(value = "表单编号", example = "", dataType="varchar(19)", required = true )
    private String formid;

    @ApiModelProperty(value = "表单json数据", example = "", dataType="json", required = true )
    private Object formdata;

    @ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

    @ApiModelProperty(value = "存贮时间", example = "", dataType="datetime", required = true )
    private Date savetime;
}
