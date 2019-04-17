package com.grape.model.mapper.base;

import com.grape.model.db.Repayplan;
import com.grape.model.db.RepayplanExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RepayplanMapper {
    int countByExample(RepayplanExample example);

    int deleteByExample(RepayplanExample example);

    int deleteByPrimaryKey(String id);

    int insert(Repayplan record);

    int insertSelective(Repayplan record);

    List<Repayplan> selectByExample(RepayplanExample example);

    Repayplan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Repayplan record, @Param("example") RepayplanExample example);

    int updateByExample(@Param("record") Repayplan record, @Param("example") RepayplanExample example);

    int updateByPrimaryKeySelective(Repayplan record);

    int updateByPrimaryKey(Repayplan record);
}