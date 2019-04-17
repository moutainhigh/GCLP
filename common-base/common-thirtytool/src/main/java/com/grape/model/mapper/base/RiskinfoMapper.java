package com.grape.model.mapper.base;

import com.grape.model.db.Riskinfo;
import com.grape.model.db.RiskinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RiskinfoMapper {
    int countByExample(RiskinfoExample example);

    int deleteByExample(RiskinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Riskinfo record);

    int insertSelective(Riskinfo record);

    List<Riskinfo> selectByExample(RiskinfoExample example);

    Riskinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Riskinfo record, @Param("example") RiskinfoExample example);

    int updateByExample(@Param("record") Riskinfo record, @Param("example") RiskinfoExample example);

    int updateByPrimaryKeySelective(Riskinfo record);

    int updateByPrimaryKey(Riskinfo record);
}