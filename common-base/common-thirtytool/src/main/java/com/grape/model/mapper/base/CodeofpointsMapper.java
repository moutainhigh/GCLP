package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Codeofpoints;
import com.grape.model.db.CodeofpointsExample;
@Mapper
public interface CodeofpointsMapper {
    int countByExample(CodeofpointsExample example);

    int deleteByExample(CodeofpointsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Codeofpoints record);

    int insertSelective(Codeofpoints record);

    List<Codeofpoints> selectByExample(CodeofpointsExample example);

    Codeofpoints selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Codeofpoints record, @Param("example") CodeofpointsExample example);

    int updateByExample(@Param("record") Codeofpoints record, @Param("example") CodeofpointsExample example);

    int updateByPrimaryKeySelective(Codeofpoints record);

    int updateByPrimaryKey(Codeofpoints record);
}