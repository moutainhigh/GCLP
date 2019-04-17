package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Delimortgage;
import com.grape.model.db.DelimortgageExample;
@Mapper
public interface DelimortgageMapper {
    int countByExample(DelimortgageExample example);

    int deleteByExample(DelimortgageExample example);

    int deleteByPrimaryKey(String id);

    int insert(Delimortgage record);

    int insertSelective(Delimortgage record);

    List<Delimortgage> selectByExampleWithBLOBs(DelimortgageExample example);

    List<Delimortgage> selectByExample(DelimortgageExample example);

    Delimortgage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Delimortgage record, @Param("example") DelimortgageExample example);

    int updateByExampleWithBLOBs(@Param("record") Delimortgage record, @Param("example") DelimortgageExample example);

    int updateByExample(@Param("record") Delimortgage record, @Param("example") DelimortgageExample example);

    int updateByPrimaryKeySelective(Delimortgage record);

    int updateByPrimaryKeyWithBLOBs(Delimortgage record);

    int updateByPrimaryKey(Delimortgage record);
}