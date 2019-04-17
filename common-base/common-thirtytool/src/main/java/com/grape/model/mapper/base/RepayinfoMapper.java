package com.grape.model.mapper.base;

import com.grape.model.db.Repayinfo;
import com.grape.model.db.RepayinfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RepayinfoMapper {
    int countByExample(RepayinfoExample example);

    int deleteByExample(RepayinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Repayinfo record);

    int insertSelective(Repayinfo record);

    List<Repayinfo> selectByExample(RepayinfoExample example);

    Repayinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Repayinfo record, @Param("example") RepayinfoExample example);

    int updateByExample(@Param("record") Repayinfo record, @Param("example") RepayinfoExample example);

    int updateByPrimaryKeySelective(Repayinfo record);

    int updateByPrimaryKey(Repayinfo record);
}