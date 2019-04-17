package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.BasicInformationBean;
import com.grape.controller.reponse.bean.ManagementlistBean;
import com.grape.controller.reponse.bean.OverduelistBean;
import com.grape.controller.reponse.bean.PromptpaymentBean;
import com.grape.controller.reponse.bean.RepayManagementBean;
import com.grape.controller.reponse.bean.RepaymenthistoryBean;
import com.grape.controller.reponse.bean.StatisticalRepay;
import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayplan;

/**
 * @描述 还款管理dao层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/16 14:06
 */
@Mapper
public interface RepayManagementExMapper {

    /**
     * @描述 根据资金方查询贷后信息
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/12/17 13:36
     */
    Integer getnum(Map<String, Object> map);

    /**
     * @描述 查询逾期信息
     * @参数 [map]
     * @返回值 java.util.Map<java.lang.String,java.lang.Object>
     * @创建人 zyh
     * @创建时间 2018/12/17 13:27
     */
    Map<String, Object> getOverdueInfo(Map<String, Object> map);

    /**
     * @描述 分页查询管理列表
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.ManagementlistBean>
     * @创建人 zyh
     * @创建时间 2018/11/16 14:06
     */
    List<ManagementlistBean> managementlistBean(Map<String, Object> map);

    /**
     * @描述 查询管理列表数量
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/16 14:09
     */
    Integer managementCount(Map<String, Object> map);

    StatisticalRepay statisticalRepay(Map<String, Object> map);

    Map<String, Object> getPostloaninfo(Map<String, Object> map);

    List<RepayManagementBean> repayManagementBeanlist(Map<String, Object> map);

    Integer repayManagementBeanCount(Map<String, Object> map);

    Map<String, Object> getDatetime(Map<String, Object> map);

    Map<String, Object> getmethod(Map<String, Object> map);

    String getnewWorkid(String workid);

    Map<String, Object> getrepaycapital(String workid);

    Map<String, Object> getsumofamount(String newWorkid);

    List<RepaymenthistoryBean> repaymenthistoryBeanlist(Map<String, Object> map);

    BasicInformationBean getBasicInformationBean(Map<String, Object> map);

    List<OverduelistBean> overduelistBean(Map<String, Object> map);

    List<PromptpaymentBean> promptpaymentBean(Map<String, Object> map);


    List<Postloaninfo> getPostloaninfolist(Map<String, Object> map);

    List<Map<String, Object>> getRepaymentInfo(Map<String, Object> map);

    Repayplan getRepayplan(Map<String, Object> map);

}
