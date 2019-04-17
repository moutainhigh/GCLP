package com.grape.model.mapper.base;

import com.grape.model.db.Mortgage;
import com.grape.model.db.MortgageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MortgageMapper {
    int countByExample(MortgageExample example);

    int deleteByExample(MortgageExample example);

    int deleteByPrimaryKey(String id);

    int insert(Mortgage record);

    int insertSelective(Mortgage record);

    List<Mortgage> selectByExample(MortgageExample example);

    Mortgage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Mortgage record, @Param("example") MortgageExample example);

    int updateByExample(@Param("record") Mortgage record, @Param("example") MortgageExample example);

    int updateByPrimaryKeySelective(Mortgage record);

    int updateByPrimaryKey(Mortgage record);
}