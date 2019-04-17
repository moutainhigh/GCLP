package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Mortgagerent;
import com.grape.model.db.MortgagerentExample;
@Mapper
public interface MortgagerentMapper {
    int countByExample(MortgagerentExample example);

    int deleteByExample(MortgagerentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Mortgagerent record);

    int insertSelective(Mortgagerent record);

    List<Mortgagerent> selectByExample(MortgagerentExample example);

    Mortgagerent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Mortgagerent record, @Param("example") MortgagerentExample example);

    int updateByExample(@Param("record") Mortgagerent record, @Param("example") MortgagerentExample example);

    int updateByPrimaryKeySelective(Mortgagerent record);

    int updateByPrimaryKey(Mortgagerent record);
}