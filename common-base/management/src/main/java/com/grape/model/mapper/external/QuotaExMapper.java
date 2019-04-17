package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.ChangeRecordListBean;
import com.grape.controller.reponse.bean.SeeAreaQuotaListBean;
import com.grape.controller.reponse.bean.SeeQuotaListBean;
import com.grape.controller.reponse.bean.StatisticalAreaQuota;
import com.grape.controller.reponse.bean.StatisticalQuota;
import com.grape.model.db.Account;
import com.grape.model.db.Accountquota;

/**
 * @描述 额度Dao层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 17:13
 */
@Mapper
public interface QuotaExMapper {

    /**
     * @描述 查询统计额度
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.StatisticalQuota
     * @创建人 zyh
     * @创建时间 2018/11/14 17:13
     */
    StatisticalQuota getstatisticalQuota(Map<String, Object> map);

    /**
     * @描述 分页查询额度
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.SeeQuotaListBean>
     * @创建人 zyh
     * @创建时间 2018/11/14 17:16
     */
    List<SeeQuotaListBean> seeQuotaListBean(Map<String, Object> map);

    /**
     * @描述 查询额度数量
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 17:17
     */
    Integer seeQuotaCount(Map<String, Object> map);

    /**
     * @描述 分页查询地区额度
     * @参数 [map]
     * @返回值 com.grape.controller.reponse.bean.StatisticalAreaQuota
     * @创建人 zyh
     * @创建时间 2018/11/14 17:21
     */
    StatisticalAreaQuota getStatisticalAreaQuota(Map<String, Object> map);

    /**
     * @描述 查看地区额度数量
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.SeeAreaQuotaListBean>
     * @创建人 zyh
     * @创建时间 2018/11/14 17:21
     */
    List<SeeAreaQuotaListBean> getseeAreaQuotalist(Map<String, Object> map);

    /**
     * @描述 查询变更记录数量
     * @参数 [map]
     * @返回值 java.lang.Integer
     * @创建人 zyh
     * @创建时间 2018/11/14 17:41
     */
    Integer getseeAreaQuotaCount(Map<String, Object> map);

    /**
     * @描述 分页查询变更记录
     * @参数 [map]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.ChangeRecordListBean>
     * @创建人 zyh
     * @创建时间 2018/11/14 17:42
     */
    List<ChangeRecordListBean> getChangeRecordList(Map<String, Object> map);

    Integer getChangeRecordCount(Map<String, Object> map);

    /**
     *@描述   根据条件查询账号
     *@参数  [map]
     *@返回值  com.grape.model.db.Accountquota
     *@创建人  zyh
     *@创建时间  2018/11/14 19:21
     */
    Accountquota getAccountquota(Map<String, Object> map);

    Map<String, Object> getDoctaskInfo(Map<String, Object> map);

    List<Account> getAccountInfo(String linenumber);

    /**
     * @描述 获取账号信息
     * @参数 [linenumber]
     * @返回值 java.util.List<com.grape.model.db.Accountquota>
     * @创建人 zyh
     * @创建时间 2018/11/14 18:59
     */
    List<Accountquota> getAccountquotaInfo(String linenumber);
}
