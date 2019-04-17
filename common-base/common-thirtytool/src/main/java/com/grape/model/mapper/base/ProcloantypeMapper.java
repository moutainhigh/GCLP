package com.grape.model.mapper.base;

import com.grape.model.db.Procloantype;
import com.grape.model.db.ProcloantypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProcloantypeMapper {
    int countByExample(ProcloantypeExample example);

    int deleteByExample(ProcloantypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Procloantype record);

    int insertSelective(Procloantype record);

    List<Procloantype> selectByExample(ProcloantypeExample example);

    Procloantype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Procloantype record, @Param("example") ProcloantypeExample example);

    int updateByExample(@Param("record") Procloantype record, @Param("example") ProcloantypeExample example);

    int updateByPrimaryKeySelective(Procloantype record);

    int updateByPrimaryKey(Procloantype record);
}