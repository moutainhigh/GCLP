package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Loaninfo;
import com.grape.model.db.LoaninfoExample;
@Mapper
public interface LoaninfoMapper {
    int countByExample(LoaninfoExample example);

    int deleteByExample(LoaninfoExample example);

    int deleteByPrimaryKey(String mortgageid);

    int insert(Loaninfo record);

    int insertSelective(Loaninfo record);

    List<Loaninfo> selectByExample(LoaninfoExample example);

    Loaninfo selectByPrimaryKey(String mortgageid);

    int updateByExampleSelective(@Param("record") Loaninfo record, @Param("example") LoaninfoExample example);

    int updateByExample(@Param("record") Loaninfo record, @Param("example") LoaninfoExample example);

    int updateByPrimaryKeySelective(Loaninfo record);

    int updateByPrimaryKey(Loaninfo record);
}