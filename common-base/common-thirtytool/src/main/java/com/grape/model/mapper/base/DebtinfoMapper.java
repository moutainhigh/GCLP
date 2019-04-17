package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Debtinfo;
import com.grape.model.db.DebtinfoExample;
@Mapper
public interface DebtinfoMapper {
    int countByExample(DebtinfoExample example);

    int deleteByExample(DebtinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Debtinfo record);

    int insertSelective(Debtinfo record);

    List<Debtinfo> selectByExample(DebtinfoExample example);

    Debtinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Debtinfo record, @Param("example") DebtinfoExample example);

    int updateByExample(@Param("record") Debtinfo record, @Param("example") DebtinfoExample example);

    int updateByPrimaryKeySelective(Debtinfo record);

    int updateByPrimaryKey(Debtinfo record);
}