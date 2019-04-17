package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Creditrecode;
import com.grape.model.db.CreditrecodeExample;
@Mapper
public interface CreditrecodeMapper {
    int countByExample(CreditrecodeExample example);

    int deleteByExample(CreditrecodeExample example);

    int deleteByPrimaryKey(@Param("workid") String workid, @Param("cerdid") String cerdid);

    int insert(Creditrecode record);

    int insertSelective(Creditrecode record);

    List<Creditrecode> selectByExample(CreditrecodeExample example);

    Creditrecode selectByPrimaryKey(@Param("workid") String workid, @Param("cerdid") String cerdid);

    int updateByExampleSelective(@Param("record") Creditrecode record, @Param("example") CreditrecodeExample example);

    int updateByExample(@Param("record") Creditrecode record, @Param("example") CreditrecodeExample example);

    int updateByPrimaryKeySelective(Creditrecode record);

    int updateByPrimaryKey(Creditrecode record);
}