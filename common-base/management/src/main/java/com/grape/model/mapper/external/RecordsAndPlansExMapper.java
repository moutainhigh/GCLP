package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.RepaymentplanBean;
import com.grape.controller.reponse.bean.RepayplanmainBean;
import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repaytoinfo;

/**
 * @描述 还款dao层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/15 9:54
 */
@Mapper
public interface RecordsAndPlansExMapper {

    /**
     * @描述 根据workId查询还款记录详情
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.RepayplanmainBean
     * @创建人 zyh
     * @创建时间 2018/11/15 9:55
     */
    RepayplanmainBean repayplanmainBean(Map<String, Object> map);

    /**
     * @描述 查询还款记录
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.RepaymentplanBean>
     * @创建人 zyh
     * @创建时间 2018/11/15 10:14
     */
    List<RepaymentplanBean> repaymentplanBeanlist(Map<String, Object> map);

    /**
     * @描述 查询还款记录数量
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/15 10:21
     */
    Integer repaymentplanBeanCount(Map<String, Object> map);

    List<Repaytoinfo> getrepaytoinfo(Map<String, Object> map);

    Map<String, Object> getProduct(Map<String, Object> map);

    Postloaninfo getPostloaninfo(Map<String, Object> map);
}
