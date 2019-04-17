package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;


import com.grape.controller.reponse.bean.DoctaskListBean;
import com.grape.controller.reponse.bean.UserOfOrgBean;

/**
 * @描述 流水Dao层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 14:53
 */
public interface DoctaskExMapper {

    /**
     * @描述 分页查询流水
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.DoctaskListBean>
     * @创建人 zyh
     * @创建时间 2018/11/14 14:53
     */
    List<DoctaskListBean> doctaskList(Map<String, Object> map);

    /**
     * @描述 查询流水数量
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 14:57
     */
    Integer doctaskCount(Map<String, Object> map);

    /**
     * @描述 分页查询待办
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.DoctaskListBean>
     * @创建人 zyh
     * @创建时间 2018/11/14 15:21
     */
    List<DoctaskListBean> backlogList(Map<String, Object> map);

    /**
     * @描述 查询待办数量
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 15:21
     */
    Integer backlogCount(Map<String, Object> map);

    /**
     * @描述 分页查询展期流水(Android)
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.DoctaskListBean>
     * @创建人 zyh
     * @创建时间 2018/11/14 15:30
     */
    List<DoctaskListBean> rolloverList(Map<String, Object> map);

    /**
     * @描述 查询展期流水(Android)数量
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 15:30
     */
    Integer rolloverCount(Map<String, Object> map);

    List<String> getcoborrower(Map<String, Object> map);

    List<String> getguarantor(Map<String, Object> map);

    List<String> getmortgagor(Map<String, Object> map);

    List<String> gethouseid(Map<String, Object> map);

    /**
     * @描述 获取员工号和手机号码
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.UserOfOrgBean
     * @创建人 zyh
     * @创建时间 2018/11/19 15:22
     */
    UserOfOrgBean getUserOfOrg(Map<String, Object> map);

}
