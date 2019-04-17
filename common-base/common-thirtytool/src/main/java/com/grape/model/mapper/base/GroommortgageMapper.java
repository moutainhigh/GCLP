package com.grape.model.mapper.base;

import com.grape.model.db.Groommortgage;
import com.grape.model.db.GroommortgageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GroommortgageMapper {
    int countByExample(GroommortgageExample example);

    int deleteByExample(GroommortgageExample example);

    int deleteByPrimaryKey(String id);

    int insert(Groommortgage record);

    int insertSelective(Groommortgage record);

    List<Groommortgage> selectByExample(GroommortgageExample example);

    Groommortgage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Groommortgage record, @Param("example") GroommortgageExample example);

    int updateByExample(@Param("record") Groommortgage record, @Param("example") GroommortgageExample example);

    int updateByPrimaryKeySelective(Groommortgage record);

    int updateByPrimaryKey(Groommortgage record);
}