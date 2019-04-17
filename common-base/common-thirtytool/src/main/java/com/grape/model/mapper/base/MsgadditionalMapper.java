package com.grape.model.mapper.base;

import com.grape.model.db.Msgadditional;
import com.grape.model.db.MsgadditionalExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MsgadditionalMapper {
    int countByExample(MsgadditionalExample example);

    int deleteByExample(MsgadditionalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Msgadditional record);

    int insertSelective(Msgadditional record);

    List<Msgadditional> selectByExample(MsgadditionalExample example);

    Msgadditional selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Msgadditional record, @Param("example") MsgadditionalExample example);

    int updateByExample(@Param("record") Msgadditional record, @Param("example") MsgadditionalExample example);

    int updateByPrimaryKeySelective(Msgadditional record);

    int updateByPrimaryKey(Msgadditional record);
}