package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.ExceptloaninfoExample;
@Mapper
public interface ExceptloaninfoMapper {
    int countByExample(ExceptloaninfoExample example);

    int deleteByExample(ExceptloaninfoExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Exceptloaninfo record);

    int insertSelective(Exceptloaninfo record);

    List<Exceptloaninfo> selectByExample(ExceptloaninfoExample example);

    Exceptloaninfo selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Exceptloaninfo record, @Param("example") ExceptloaninfoExample example);

    int updateByExample(@Param("record") Exceptloaninfo record, @Param("example") ExceptloaninfoExample example);

    int updateByPrimaryKeySelective(Exceptloaninfo record);

    int updateByPrimaryKey(Exceptloaninfo record);
}