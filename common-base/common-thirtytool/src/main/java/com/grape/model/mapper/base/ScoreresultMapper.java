package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Scoreresult;
import com.grape.model.db.ScoreresultExample;

@Mapper
public interface ScoreresultMapper {
    int countByExample(ScoreresultExample example);

    int deleteByExample(ScoreresultExample example);

    int deleteByPrimaryKey(String id);

    int insert(Scoreresult record);

    int insertSelective(Scoreresult record);

    List<Scoreresult> selectByExample(ScoreresultExample example);

    Scoreresult selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Scoreresult record, @Param("example") ScoreresultExample example);

    int updateByExample(@Param("record") Scoreresult record, @Param("example") ScoreresultExample example);

    int updateByPrimaryKeySelective(Scoreresult record);

    int updateByPrimaryKey(Scoreresult record);
}