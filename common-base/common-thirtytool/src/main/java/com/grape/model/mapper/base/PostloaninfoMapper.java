package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Postloaninfo;
import com.grape.model.db.PostloaninfoExample;
@Mapper
public interface PostloaninfoMapper {
    int countByExample(PostloaninfoExample example);

    int deleteByExample(PostloaninfoExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Postloaninfo record);

    int insertSelective(Postloaninfo record);

    List<Postloaninfo> selectByExample(PostloaninfoExample example);

    Postloaninfo selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Postloaninfo record, @Param("example") PostloaninfoExample example);

    int updateByExample(@Param("record") Postloaninfo record, @Param("example") PostloaninfoExample example);

    int updateByPrimaryKeySelective(Postloaninfo record);

    int updateByPrimaryKey(Postloaninfo record);
}