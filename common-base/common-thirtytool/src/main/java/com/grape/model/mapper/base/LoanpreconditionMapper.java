package com.grape.model.mapper.base;

import com.grape.model.db.Loanprecondition;
import com.grape.model.db.LoanpreconditionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LoanpreconditionMapper {
    int countByExample(LoanpreconditionExample example);

    int deleteByExample(LoanpreconditionExample example);

    int deleteByPrimaryKey(String loanpredocno);

    int insert(Loanprecondition record);

    int insertSelective(Loanprecondition record);

    List<Loanprecondition> selectByExample(LoanpreconditionExample example);

    Loanprecondition selectByPrimaryKey(String loanpredocno);

    int updateByExampleSelective(@Param("record") Loanprecondition record, @Param("example") LoanpreconditionExample example);

    int updateByExample(@Param("record") Loanprecondition record, @Param("example") LoanpreconditionExample example);

    int updateByPrimaryKeySelective(Loanprecondition record);

    int updateByPrimaryKey(Loanprecondition record);
}