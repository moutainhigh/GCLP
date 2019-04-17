package com.grape.model.mapper.base;

import com.grape.model.db.Msgmaininfo;
import com.grape.model.db.MsgmaininfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MsgmaininfoMapper {
    int countByExample(MsgmaininfoExample example);

    int deleteByExample(MsgmaininfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Msgmaininfo record);

    int insertSelective(Msgmaininfo record);

    List<Msgmaininfo> selectByExampleWithBLOBs(MsgmaininfoExample example);

    List<Msgmaininfo> selectByExample(MsgmaininfoExample example);

    Msgmaininfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Msgmaininfo record, @Param("example") MsgmaininfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Msgmaininfo record, @Param("example") MsgmaininfoExample example);

    int updateByExample(@Param("record") Msgmaininfo record, @Param("example") MsgmaininfoExample example);

    int updateByPrimaryKeySelective(Msgmaininfo record);

    int updateByPrimaryKeyWithBLOBs(Msgmaininfo record);

    int updateByPrimaryKey(Msgmaininfo record);
}