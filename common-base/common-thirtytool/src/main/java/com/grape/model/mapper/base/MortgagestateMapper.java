package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Mortgagestate;
import com.grape.model.db.MortgagestateExample;
@Mapper
public interface MortgagestateMapper {
    int countByExample(MortgagestateExample example);

    int deleteByExample(MortgagestateExample example);

    int deleteByPrimaryKey(String id);

    int insert(Mortgagestate record);

    int insertSelective(Mortgagestate record);

    List<Mortgagestate> selectByExample(MortgagestateExample example);

    Mortgagestate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Mortgagestate record, @Param("example") MortgagestateExample example);

    int updateByExample(@Param("record") Mortgagestate record, @Param("example") MortgagestateExample example);

    int updateByPrimaryKeySelective(Mortgagestate record);

    int updateByPrimaryKey(Mortgagestate record);
}