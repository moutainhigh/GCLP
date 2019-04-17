package com.grape.model.mapper.base;

import com.grape.model.db.Codetask;
import com.grape.model.db.CodetaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CodetaskMapper {
    int countByExample(CodetaskExample example);

    int deleteByExample(CodetaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(Codetask record);

    int insertSelective(Codetask record);

    List<Codetask> selectByExample(CodetaskExample example);

    Codetask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Codetask record, @Param("example") CodetaskExample example);

    int updateByExample(@Param("record") Codetask record, @Param("example") CodetaskExample example);

    int updateByPrimaryKeySelective(Codetask record);

    int updateByPrimaryKey(Codetask record);
}