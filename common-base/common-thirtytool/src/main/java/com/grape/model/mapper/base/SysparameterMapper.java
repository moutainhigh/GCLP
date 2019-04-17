package com.grape.model.mapper.base;

import com.grape.model.db.Sysparameter;
import com.grape.model.db.SysparameterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysparameterMapper {
    int countByExample(SysparameterExample example);

    int deleteByExample(SysparameterExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysparameter record);

    int insertSelective(Sysparameter record);

    List<Sysparameter> selectByExample(SysparameterExample example);

    Sysparameter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysparameter record, @Param("example") SysparameterExample example);

    int updateByExample(@Param("record") Sysparameter record, @Param("example") SysparameterExample example);

    int updateByPrimaryKeySelective(Sysparameter record);

    int updateByPrimaryKey(Sysparameter record);
}