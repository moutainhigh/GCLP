package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Mortgagefiling;
import com.grape.model.db.MortgagefilingExample;
@Mapper
public interface MortgagefilingMapper {
    int countByExample(MortgagefilingExample example);

    int deleteByExample(MortgagefilingExample example);

    int deleteByPrimaryKey(String mortgagefilingid);

    int insert(Mortgagefiling record);

    int insertSelective(Mortgagefiling record);

    List<Mortgagefiling> selectByExample(MortgagefilingExample example);

    Mortgagefiling selectByPrimaryKey(String mortgagefilingid);

    int updateByExampleSelective(@Param("record") Mortgagefiling record, @Param("example") MortgagefilingExample example);

    int updateByExample(@Param("record") Mortgagefiling record, @Param("example") MortgagefilingExample example);

    int updateByPrimaryKeySelective(Mortgagefiling record);

    int updateByPrimaryKey(Mortgagefiling record);
}