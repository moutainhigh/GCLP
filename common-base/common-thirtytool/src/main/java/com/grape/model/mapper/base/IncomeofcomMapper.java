package com.grape.model.mapper.base;

import com.grape.model.db.Incomeofcom;
import com.grape.model.db.IncomeofcomExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface IncomeofcomMapper {
    int countByExample(IncomeofcomExample example);

    int deleteByExample(IncomeofcomExample example);

    int deleteByPrimaryKey(@Param("workid") String workid, @Param("comno") String comno);

    int insert(Incomeofcom record);

    int insertSelective(Incomeofcom record);

    List<Incomeofcom> selectByExample(IncomeofcomExample example);

    Incomeofcom selectByPrimaryKey(@Param("workid") String workid, @Param("comno") String comno);

    int updateByExampleSelective(@Param("record") Incomeofcom record, @Param("example") IncomeofcomExample example);

    int updateByExample(@Param("record") Incomeofcom record, @Param("example") IncomeofcomExample example);

    int updateByPrimaryKeySelective(Incomeofcom record);

    int updateByPrimaryKey(Incomeofcom record);
}