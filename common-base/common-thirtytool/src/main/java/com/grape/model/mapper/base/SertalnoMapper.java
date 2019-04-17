package com.grape.model.mapper.base;

import com.grape.model.db.Sertalno;
import com.grape.model.db.SertalnoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SertalnoMapper {
    int countByExample(SertalnoExample example);

    int deleteByExample(SertalnoExample example);

    int deleteByPrimaryKey(String code);

    int insert(Sertalno record);

    int insertSelective(Sertalno record);

    List<Sertalno> selectByExample(SertalnoExample example);

    Sertalno selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Sertalno record, @Param("example") SertalnoExample example);

    int updateByExample(@Param("record") Sertalno record, @Param("example") SertalnoExample example);

    int updateByPrimaryKeySelective(Sertalno record);

    int updateByPrimaryKey(Sertalno record);
}