package com.grape.model.mapper.base;

import com.grape.model.db.Liveinfo;
import com.grape.model.db.LiveinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LiveinfoMapper {
    int countByExample(LiveinfoExample example);

    int deleteByExample(LiveinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Liveinfo record);

    int insertSelective(Liveinfo record);

    List<Liveinfo> selectByExample(LiveinfoExample example);

    Liveinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Liveinfo record, @Param("example") LiveinfoExample example);

    int updateByExample(@Param("record") Liveinfo record, @Param("example") LiveinfoExample example);

    int updateByPrimaryKeySelective(Liveinfo record);

    int updateByPrimaryKey(Liveinfo record);
}