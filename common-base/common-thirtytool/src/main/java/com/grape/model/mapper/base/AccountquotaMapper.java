package com.grape.model.mapper.base;

import com.grape.model.db.Accountquota;
import com.grape.model.db.AccountquotaExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountquotaMapper {
    int countByExample(AccountquotaExample example);

    int deleteByExample(AccountquotaExample example);

    int deleteByPrimaryKey(String linenumber);

    int insert(Accountquota record);

    int insertSelective(Accountquota record);

    List<Accountquota> selectByExample(AccountquotaExample example);

    Accountquota selectByPrimaryKey(String linenumber);

    int updateByExampleSelective(@Param("record") Accountquota record, @Param("example") AccountquotaExample example);

    int updateByExample(@Param("record") Accountquota record, @Param("example") AccountquotaExample example);

    int updateByPrimaryKeySelective(Accountquota record);

    int updateByPrimaryKey(Accountquota record);
}