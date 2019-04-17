package com.grape.model.mapper.base;

import com.grape.model.db.Exinterface;
import com.grape.model.db.ExinterfaceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExinterfaceMapper {
    int countByExample(ExinterfaceExample example);

    int deleteByExample(ExinterfaceExample example);

    int deleteByPrimaryKey(@Param("channelno") String channelno, @Param("interfaceno") String interfaceno);

    int insert(Exinterface record);

    int insertSelective(Exinterface record);

    List<Exinterface> selectByExample(ExinterfaceExample example);

    Exinterface selectByPrimaryKey(@Param("channelno") String channelno, @Param("interfaceno") String interfaceno);

    int updateByExampleSelective(@Param("record") Exinterface record, @Param("example") ExinterfaceExample example);

    int updateByExample(@Param("record") Exinterface record, @Param("example") ExinterfaceExample example);

    int updateByPrimaryKeySelective(Exinterface record);

    int updateByPrimaryKey(Exinterface record);
}