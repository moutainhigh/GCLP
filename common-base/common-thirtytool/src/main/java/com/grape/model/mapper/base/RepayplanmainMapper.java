package com.grape.model.mapper.base;

import com.grape.model.db.Repayplanmain;
import com.grape.model.db.RepayplanmainExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RepayplanmainMapper {
    int countByExample(RepayplanmainExample example);

    int deleteByExample(RepayplanmainExample example);

    int deleteByPrimaryKey(String id);

    int insert(Repayplanmain record);

    int insertSelective(Repayplanmain record);

    List<Repayplanmain> selectByExample(RepayplanmainExample example);

    Repayplanmain selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Repayplanmain record, @Param("example") RepayplanmainExample example);

    int updateByExample(@Param("record") Repayplanmain record, @Param("example") RepayplanmainExample example);

    int updateByPrimaryKeySelective(Repayplanmain record);

    int updateByPrimaryKey(Repayplanmain record);
}