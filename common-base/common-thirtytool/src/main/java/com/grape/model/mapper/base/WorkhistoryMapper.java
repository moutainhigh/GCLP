package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Workhistory;
import com.grape.model.db.WorkhistoryExample;
@Mapper
public interface WorkhistoryMapper {
    int countByExample(WorkhistoryExample example);

    int deleteByExample(WorkhistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Workhistory record);

    int insertSelective(Workhistory record);

    List<Workhistory> selectByExampleWithBLOBs(WorkhistoryExample example);

    List<Workhistory> selectByExample(WorkhistoryExample example);

    Workhistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Workhistory record, @Param("example") WorkhistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Workhistory record, @Param("example") WorkhistoryExample example);

    int updateByExample(@Param("record") Workhistory record, @Param("example") WorkhistoryExample example);

    int updateByPrimaryKeySelective(Workhistory record);

    int updateByPrimaryKeyWithBLOBs(Workhistory record);

    int updateByPrimaryKey(Workhistory record);
}