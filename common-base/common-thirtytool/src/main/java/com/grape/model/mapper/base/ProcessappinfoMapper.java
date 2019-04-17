package com.grape.model.mapper.base;

import com.grape.model.db.Processappinfo;
import com.grape.model.db.ProcessappinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProcessappinfoMapper {
    int countByExample(ProcessappinfoExample example);

    int deleteByExample(ProcessappinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Processappinfo record);

    int insertSelective(Processappinfo record);

    List<Processappinfo> selectByExampleWithBLOBs(ProcessappinfoExample example);

    List<Processappinfo> selectByExample(ProcessappinfoExample example);

    Processappinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Processappinfo record, @Param("example") ProcessappinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Processappinfo record, @Param("example") ProcessappinfoExample example);

    int updateByExample(@Param("record") Processappinfo record, @Param("example") ProcessappinfoExample example);

    int updateByPrimaryKeySelective(Processappinfo record);

    int updateByPrimaryKeyWithBLOBs(Processappinfo record);

    int updateByPrimaryKey(Processappinfo record);
}