package com.grape.model.mapper.base;


import com.grape.model.db.Account;
import com.grape.model.db.AccountExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @描述 账号表dao层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 19:03
 */
@Mapper
public interface AccountMapper {
    /**
     * @描述
     * @参数 [example]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:06
     */
    int countByExample(AccountExample example);

    /**
     * @描述
     * @参数 [example]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    int deleteByExample(AccountExample example);

    /**
     * @描述
     * @参数 [accountno]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    int deleteByPrimaryKey(String accountno);

    /**
     * @描述
     * @参数 [record]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    int insert(Account record);

    /**
     * @描述
     * @参数 [record]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    int insertSelective(Account record);

    /**
     * @描述
     * @参数 [example]
     * @返回值 java.util.List<com.grape.model.db.Account>
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * @描述 根据主键查询数据
     * @参数 [accountno]
     * @返回值 com.grape.model.db.Account
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    Account selectByPrimaryKey(String accountno);

    /**
     * @描述
     * @参数 [record, example]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * @描述
     * @参数 [record, example]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * @描述
     * @参数 [record]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:07
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * @描述
     * @参数 [record]
     * @返回值 int
     * @创建人 zyh
     * @创建时间 2018/11/14 19:08
     */
    int updateByPrimaryKey(Account record);
}