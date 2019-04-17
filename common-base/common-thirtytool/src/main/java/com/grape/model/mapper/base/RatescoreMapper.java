package com.grape.model.mapper.base;

import com.grape.model.db.Ratescore;
import com.grape.model.db.RatescoreExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RatescoreMapper {
    int countByExample(RatescoreExample example);

    int deleteByExample(RatescoreExample example);

    int deleteByPrimaryKey(String id);

    int insert(Ratescore record);

    int insertSelective(Ratescore record);

    List<Ratescore> selectByExample(RatescoreExample example);

    Ratescore selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Ratescore record, @Param("example") RatescoreExample example);

    int updateByExample(@Param("record") Ratescore record, @Param("example") RatescoreExample example);

    int updateByPrimaryKeySelective(Ratescore record);

    int updateByPrimaryKey(Ratescore record);
}