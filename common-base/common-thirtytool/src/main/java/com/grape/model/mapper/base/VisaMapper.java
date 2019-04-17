package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Visa;
import com.grape.model.db.VisaExample;
@Mapper
public interface VisaMapper {
    int countByExample(VisaExample example);

    int deleteByExample(VisaExample example);

    int deleteByPrimaryKey(String id);

    int insert(Visa record);

    int insertSelective(Visa record);

    List<Visa> selectByExample(VisaExample example);

    Visa selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Visa record, @Param("example") VisaExample example);

    int updateByExample(@Param("record") Visa record, @Param("example") VisaExample example);

    int updateByPrimaryKeySelective(Visa record);

    int updateByPrimaryKey(Visa record);
}