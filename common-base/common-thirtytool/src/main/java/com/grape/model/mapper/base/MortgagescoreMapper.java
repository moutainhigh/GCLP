package com.grape.model.mapper.base;

import com.grape.model.db.Mortgagescore;
import com.grape.model.db.MortgagescoreExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MortgagescoreMapper {
    int countByExample(MortgagescoreExample example);

    int deleteByExample(MortgagescoreExample example);

    int deleteByPrimaryKey(String id);

    int insert(Mortgagescore record);

    int insertSelective(Mortgagescore record);

    List<Mortgagescore> selectByExample(MortgagescoreExample example);

    Mortgagescore selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Mortgagescore record, @Param("example") MortgagescoreExample example);

    int updateByExample(@Param("record") Mortgagescore record, @Param("example") MortgagescoreExample example);

    int updateByPrimaryKeySelective(Mortgagescore record);

    int updateByPrimaryKey(Mortgagescore record);
}