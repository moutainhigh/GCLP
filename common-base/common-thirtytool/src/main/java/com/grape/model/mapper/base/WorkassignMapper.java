package com.grape.model.mapper.base;

import com.grape.model.db.Workassign;
import com.grape.model.db.WorkassignExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorkassignMapper {
    int countByExample(WorkassignExample example);

    int deleteByExample(WorkassignExample example);

    int deleteByPrimaryKey(String id);

    int insert(Workassign record);

    int insertSelective(Workassign record);

    List<Workassign> selectByExample(WorkassignExample example);

    Workassign selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Workassign record, @Param("example") WorkassignExample example);

    int updateByExample(@Param("record") Workassign record, @Param("example") WorkassignExample example);

    int updateByPrimaryKeySelective(Workassign record);

    int updateByPrimaryKey(Workassign record);
}