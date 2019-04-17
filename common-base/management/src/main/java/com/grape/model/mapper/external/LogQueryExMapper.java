package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.LogQueryListBean;

/**
 * @描述 日志模块dao层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 15:48
 */
@Mapper
public interface LogQueryExMapper {

    /**
     * @描述 分页查询日志
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.LogQueryListBean>
     * @创建人 zyh
     * @创建时间 2018/11/14 15:48
     */
    List<LogQueryListBean> logQueryList(Map<String, Object> map);

    /**
     * @描述 查询日志数量
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 15:48
     */
    Integer logQueryCount(Map<String, Object> map);

}
