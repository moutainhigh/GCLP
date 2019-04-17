package com.grape.model.mapper.base;

import com.grape.model.db.Queryexhist;
import com.grape.model.db.QueryexhistExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QueryexhistMapper {
    int countByExample(QueryexhistExample example);

    int deleteByExample(QueryexhistExample example);

    int deleteByPrimaryKey(String id);

    int insert(Queryexhist record);

    int insertSelective(Queryexhist record);

    List<Queryexhist> selectByExample(QueryexhistExample example);

    Queryexhist selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Queryexhist record, @Param("example") QueryexhistExample example);

    int updateByExample(@Param("record") Queryexhist record, @Param("example") QueryexhistExample example);

    int updateByPrimaryKeySelective(Queryexhist record);

    int updateByPrimaryKey(Queryexhist record);
}