package com.grape.model.mapper.base;

import com.grape.model.db.Workitem;
import com.grape.model.db.WorkitemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorkitemMapper {
    int countByExample(WorkitemExample example);

    int deleteByExample(WorkitemExample example);

    int deleteByPrimaryKey(@Param("workid") String workid, @Param("fork") String fork, @Param("branch") String branch);

    int insert(Workitem record);

    int insertSelective(Workitem record);

    List<Workitem> selectByExample(WorkitemExample example);

    Workitem selectByPrimaryKey(@Param("workid") String workid, @Param("fork") String fork, @Param("branch") String branch);

    int updateByExampleSelective(@Param("record") Workitem record, @Param("example") WorkitemExample example);

    int updateByExample(@Param("record") Workitem record, @Param("example") WorkitemExample example);

    int updateByPrimaryKeySelective(Workitem record);

    int updateByPrimaryKey(Workitem record);
}