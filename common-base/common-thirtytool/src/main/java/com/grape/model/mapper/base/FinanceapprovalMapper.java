package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Financeapproval;
import com.grape.model.db.FinanceapprovalExample;
@Mapper
public interface FinanceapprovalMapper {
    int countByExample(FinanceapprovalExample example);

    int deleteByExample(FinanceapprovalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Financeapproval record);

    int insertSelective(Financeapproval record);

    List<Financeapproval> selectByExample(FinanceapprovalExample example);

    Financeapproval selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Financeapproval record, @Param("example") FinanceapprovalExample example);

    int updateByExample(@Param("record") Financeapproval record, @Param("example") FinanceapprovalExample example);

    int updateByPrimaryKeySelective(Financeapproval record);

    int updateByPrimaryKey(Financeapproval record);
}