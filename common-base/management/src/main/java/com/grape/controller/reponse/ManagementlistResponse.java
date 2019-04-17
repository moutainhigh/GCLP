package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.ManagementlistBean;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @描述 管理列表结果返回集
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/16 13:48
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ManagementlistResponse extends RestfulResponse {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分页查询结果集", required = true)
    private List<ManagementlistBean> managementlistBean;

    @ApiModelProperty(value = "总条数", required = true)
    private int countInfo;

}
