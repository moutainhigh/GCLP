package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Nodepage;
import com.grape.model.db.NodepageExample;
@Mapper
public interface NodepageMapper {
    int countByExample(NodepageExample example);

    int deleteByExample(NodepageExample example);

    int deleteByPrimaryKey(String id);

    int insert(Nodepage record);

    int insertSelective(Nodepage record);

    List<Nodepage> selectByExample(NodepageExample example);

    Nodepage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Nodepage record, @Param("example") NodepageExample example);

    int updateByExample(@Param("record") Nodepage record, @Param("example") NodepageExample example);

    int updateByPrimaryKeySelective(Nodepage record);

    int updateByPrimaryKey(Nodepage record);
}