package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper; 
import org.apache.ibatis.annotations.Param;
import com.grape.model.db.Doctask;
import com.grape.model.db.DoctaskExample;

@Mapper

public interface DoctaskMapper {
    int countByExample(DoctaskExample example);

    int deleteByExample(DoctaskExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Doctask record);

    int insertSelective(Doctask record);

    List<Doctask> selectByExample(DoctaskExample example);

    Doctask selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Doctask record, @Param("example") DoctaskExample example);

    int updateByExample(@Param("record") Doctask record, @Param("example") DoctaskExample example);

    int updateByPrimaryKeySelective(Doctask record);

    int updateByPrimaryKey(Doctask record);
}