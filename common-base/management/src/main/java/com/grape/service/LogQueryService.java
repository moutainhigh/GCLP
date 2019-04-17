package com.grape.service;

import java.util.Date;

import com.grape.util.PageBean;

/**
 * @描述 日志模块Service层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 15:46
 */
public interface LogQueryService {

    /**
     * @描述 分页查询日志
     * @参数 [checktl, type, startDate, endDate, pagebean]
     * @返回值 com.grape.util.PageBean
     * @创建人 zyh
     * @创建时间 2018/11/14 15:46
     */
    PageBean logQueryListReponse(String checktl, String type, Date startDate, Date endDate, PageBean pagebean);

}
