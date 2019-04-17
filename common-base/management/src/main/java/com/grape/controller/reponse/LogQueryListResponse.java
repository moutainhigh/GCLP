package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.LogQueryListBean;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @描述 分页查询日志结果封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 15:41
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class LogQueryListResponse extends RestfulResponse {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分页查询日志结果集", required = true)
    private List<LogQueryListBean> logQueryListBeanlist;

    @ApiModelProperty(value = "总条数", required = true)
    private int CountInfo;

}
