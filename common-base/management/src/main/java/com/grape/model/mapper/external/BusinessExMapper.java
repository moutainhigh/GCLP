package com.grape.model.mapper.external;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.DeclarationBean;
import com.grape.controller.reponse.bean.LendingBean;
import com.grape.controller.reponse.bean.RefundBean;
import com.grape.controller.reponse.bean.RefusedBean;
import com.grape.controller.reponse.bean.ReplyBean;
import com.grape.controller.reponse.bean.WaitingBean;

/**
 * @描述 流水表dao层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 11:31
 */
@Mapper
public interface BusinessExMapper {

    /**
     * @描述 查询报单
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.DeclarationBean
     * @创建人 zyh
     * @创建时间 2018/11/14 11:31
     */
    DeclarationBean getDeclarationBean(Map<String, Object> map);

    /**
     * @描述 查询批复
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.ReplyBean
     * @创建人 zyh
     * @创建时间 2018/11/14 11:37
     */
    ReplyBean getReplyBean(Map<String, Object> map);

    /**
     * @描述 查询拒单
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.RefusedBean
     * @创建人 zyh
     * @创建时间 2018/11/14 11:52
     */
    RefusedBean getRefusedBean(Map<String, Object> map);

    /**
     * @描述 查询退单
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.RefundBean
     * @创建人 zyh
     * @创建时间 2018/11/14 11:52
     */
    RefundBean getRefundBean(Map<String, Object> map);

    /**
     * @描述 查询放款
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.LendingBean
     * @创建人 zyh
     * @创建时间 2018/11/14 11:52
     */
    LendingBean getLendingBean(Map<String, Object> map);

    /**
     * @描述 查询抵押金额
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 11:52
     */
    Integer mortgageamount(Map<String, Object> map);

    /**
     * @描述 查询非抵押贷款金额
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 11:52
     */
    Integer notmortgageamount(Map<String, Object> map);

    /**
     * @描述 查询待放款
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.WaitingBean
     * @创建人 zyh
     * @创建时间 2018/11/14 11:52
     */
    WaitingBean getWaitingBean(Map<String, Object> map);

    /**
     * @描述 查询取证
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 11:52
     */
    Integer getforensics(Map<String, Object> map);

    /**
     * @描述 查询非取证
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 11:52
     */
    Integer getnotforensics(Map<String, Object> map);

}
