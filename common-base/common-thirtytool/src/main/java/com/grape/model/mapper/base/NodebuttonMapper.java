package com.grape.model.mapper.base;

import com.grape.model.db.Nodebutton;
import com.grape.model.db.NodebuttonExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NodebuttonMapper {
    int countByExample(NodebuttonExample example);

    int deleteByExample(NodebuttonExample example);

    int deleteByPrimaryKey(String id);

    int insert(Nodebutton record);

    int insertSelective(Nodebutton record);

    List<Nodebutton> selectByExample(NodebuttonExample example);

    Nodebutton selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Nodebutton record, @Param("example") NodebuttonExample example);

    int updateByExample(@Param("record") Nodebutton record, @Param("example") NodebuttonExample example);

    int updateByPrimaryKeySelective(Nodebutton record);

    int updateByPrimaryKey(Nodebutton record);
}