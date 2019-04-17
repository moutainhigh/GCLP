package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.StatisticalAccountResponse;
import com.grape.controller.reponse.bean.SeeTradingBean;
import com.grape.controller.reponse.bean.SeeAccountListBean;
import com.grape.model.db.Account;

/**
 * @描述 账号dao层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 15:03
 */
@Mapper
public interface AccountExMapper {

    /**
     * @描述 分组统计账号
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.StatisticalAccountResponse
     * @创建人 zyh
     * @创建时间 2018/11/13 15:03
     */
    StatisticalAccountResponse statisticalAccount(Map<String, Object> map);

    /**
     * @描述 分页查询账号
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.SeeAccountListBean>
     * @创建人 zyh
     * @创建时间 2018/11/13 16:19
     */
    List<SeeAccountListBean> seeAccountList(Map<String, Object> map);

    Integer seeAccountCount(Map<String, Object> map);

    Account getAccount(Map<String, Object> map);

    List<SeeTradingBean> seeTradingList(Map<String, Object> map);

    Integer seeTradingCount(Map<String, Object> map);

    List<SeeTradingBean> seeSingleList(Map<String, Object> map);

    Integer seeSingleCount(Map<String, Object> map);

}
