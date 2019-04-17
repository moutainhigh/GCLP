package com.grape.model.mapper.base;

import com.grape.model.db.Proctask;
import com.grape.model.db.ProctaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProctaskMapper {
    int countByExample(ProctaskExample example);

    int deleteByExample(ProctaskExample example);

    int deleteByPrimaryKey(@Param("taskid") String taskid, @Param("productno") String productno, @Param("nodeid") String nodeid);

    int insert(Proctask record);

    int insertSelective(Proctask record);

    List<Proctask> selectByExample(ProctaskExample example);

    Proctask selectByPrimaryKey(@Param("taskid") String taskid, @Param("productno") String productno, @Param("nodeid") String nodeid);

    int updateByExampleSelective(@Param("record") Proctask record, @Param("example") ProctaskExample example);

    int updateByExample(@Param("record") Proctask record, @Param("example") ProctaskExample example);

    int updateByPrimaryKeySelective(Proctask record);

    int updateByPrimaryKey(Proctask record);
}