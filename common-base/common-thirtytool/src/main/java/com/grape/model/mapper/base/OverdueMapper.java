package com.grape.model.mapper.base;

import com.grape.model.db.Overdue;
import com.grape.model.db.OverdueExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OverdueMapper {
    int countByExample(OverdueExample example);

    int deleteByExample(OverdueExample example);

    int deleteByPrimaryKey(String id);

    int insert(Overdue record);

    int insertSelective(Overdue record);

    List<Overdue> selectByExample(OverdueExample example);

    Overdue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Overdue record, @Param("example") OverdueExample example);

    int updateByExample(@Param("record") Overdue record, @Param("example") OverdueExample example);

    int updateByPrimaryKeySelective(Overdue record);

    int updateByPrimaryKey(Overdue record);
}