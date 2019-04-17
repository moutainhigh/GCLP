package com.grape.model.mapper.base;

import com.grape.model.db.Applyforex;
import com.grape.model.db.ApplyforexExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ApplyforexMapper {
    int countByExample(ApplyforexExample example);

    int deleteByExample(ApplyforexExample example);

    int deleteByPrimaryKey(String id);

    int insert(Applyforex record);

    int insertSelective(Applyforex record);

    List<Applyforex> selectByExample(ApplyforexExample example);

    Applyforex selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Applyforex record, @Param("example") ApplyforexExample example);

    int updateByExample(@Param("record") Applyforex record, @Param("example") ApplyforexExample example);

    int updateByPrimaryKeySelective(Applyforex record);

    int updateByPrimaryKey(Applyforex record);
}