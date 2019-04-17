package com.grape.model.mapper.base;

import com.grape.model.db.Monthlystat;
import com.grape.model.db.MonthlystatExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MonthlystatMapper {
    int countByExample(MonthlystatExample example);

    int deleteByExample(MonthlystatExample example);

    int deleteByPrimaryKey(@Param("monthnum") String monthnum, @Param("channelno") String channelno, @Param("fundno") String fundno, @Param("aisleno") String aisleno);

    int insert(Monthlystat record);

    int insertSelective(Monthlystat record);

    List<Monthlystat> selectByExample(MonthlystatExample example);

    Monthlystat selectByPrimaryKey(@Param("monthnum") String monthnum, @Param("channelno") String channelno, @Param("fundno") String fundno, @Param("aisleno") String aisleno);

    int updateByExampleSelective(@Param("record") Monthlystat record, @Param("example") MonthlystatExample example);

    int updateByExample(@Param("record") Monthlystat record, @Param("example") MonthlystatExample example);

    int updateByPrimaryKeySelective(Monthlystat record);

    int updateByPrimaryKey(Monthlystat record);
}