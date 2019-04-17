package com.grape.service;

import com.grape.controller.reponse.RecordsAndPlansResponse;
import com.grape.util.PageBean;

/**
 * @描述 还款计划模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/15 9:40
 */
public interface RecordsAndPlansService {

    /**
     * @描述 分页查询还款计划
     * @参数 [workId, pageBean]
     * @返回值 com.grape.controller.reponse.RecordsAndPlansResponse
     * @创建人 zyh
     * @创建时间 2018/11/15 9:41
     */
    RecordsAndPlansResponse recordsAndPlansResponse(String workId, PageBean pageBean);

    /**
     * @描述 生成还款计划
     * @参数 [workId]
     * @返回值 void
     * @创建人 zyh
     * @创建时间 2018/11/15 9:41
     */
    void saveRepaymentplan(String workId);

}
