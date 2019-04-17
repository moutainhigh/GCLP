package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Repaytoinfo;
import com.grape.model.db.RepaytoinfoExample;
@Mapper
public interface RepaytoinfoMapper {
    int countByExample(RepaytoinfoExample example);

    int deleteByExample(RepaytoinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Repaytoinfo record);

    int insertSelective(Repaytoinfo record);

    List<Repaytoinfo> selectByExample(RepaytoinfoExample example);

    Repaytoinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Repaytoinfo record, @Param("example") RepaytoinfoExample example);

    int updateByExample(@Param("record") Repaytoinfo record, @Param("example") RepaytoinfoExample example);

    int updateByPrimaryKeySelective(Repaytoinfo record);

    int updateByPrimaryKey(Repaytoinfo record);
}