package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import com.grape.model.db.Repayplan;
import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Account;
import com.grape.model.db.Accountquota;
import com.grape.model.db.Overdue;

@Mapper
public interface RepayInterfaceExMapper {

    Map<String, Object> getoverduemoney(Map<String, Object> map);

    void deleteRepayplan(Map<String, Object> map);

    Overdue getoverdueinfo(Map<String, Object> map);


    Map<String, Object> getOverdue(Map<String, Object> map);

    Map<String, Object> getRepayinfo(Map<String, Object> map);

    Map<String, Object> getRepayplan(Map<String, Object> map);


    Map<String, Object> getDoctaskInfo(Map<String, Object> map);

    List<Account> getAccountInfo(String linenumber);

    List<Accountquota> getAccountquotaInfo(String linenumber);

    /**
     * TODO  根据流水id和还款期数修改状态
     *
     * @param map
     * @return void
     * @author zyh
     * @date 20:09 2018/12/27
     **/
    void updateStatusByWorkIdAndRepayterm(Map<String, Object> map);

    /**
     * TODO  根据流水id和还款期数查询还款计划
     *
     * @param map
     * @return java.util.Map<java.lang.String                               ,                               java.lang.Object>
     * @author zyh
     * @date 11:15 2018/12/28
     **/
    Map<String, Object> selectByWorkIdAndRepayterm(Map<String, Object> map);

    /**
     * TODO  根据流水id和还款期数查询已还款的本金和利息
     *
     * @param map
     * @return java.util.Map<java.lang.String                               ,                               java.lang.Object>
     * @author zyh
     * @date 15:06 2018/12/28
     **/
    Map<String, Object> selectSumByWorkIdAndRepayterm(Map<String, Object> map);

    /**
     * TODO     根据流水 id和还款期数查询未还款的本金、利息、罚息和滞纳金
     *
     * @param map
     * @return java.util.Map<java.lang.String                               ,                               java.lang.Object>
     * @author zyh
     * @date 20:44 2018/12/31
     **/
    Map<String, Object> selectOverdueByWorkIdAndOverdueterm(Map<String, Object> map);

    /**
     * TODO   根据流水id查询最低还款的最前期数
     *
     * @param map
     * @return java.util.Map<java.lang.String       ,       java.lang.Object>
     * @author zyh
     * @date 15:36 2019/1/3
     **/
    Map<String, Object> selectMinAndMaxByWorkId(Map<String, Object> map);

    /**
     * TODO    根据流水id和期数查询还款计划
     *
     * @return java.util.Map<java.lang.String   ,   java.lang.Object>
     * @author zyh
     * @date 11:21 2019/1/4
     **/
    Map<String, Object> selectRepayplanByWorkIdAndRepayterm();


}
