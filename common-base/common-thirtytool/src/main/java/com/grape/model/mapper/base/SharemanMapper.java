package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Shareman;
import com.grape.model.db.SharemanExample;
@Mapper
public interface SharemanMapper {
    int countByExample(SharemanExample example);

    int deleteByExample(SharemanExample example);

    int deleteByPrimaryKey(String id);

    int insert(Shareman record);

    int insertSelective(Shareman record);

    List<Shareman> selectByExample(SharemanExample example);

    Shareman selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Shareman record, @Param("example") SharemanExample example);

    int updateByExample(@Param("record") Shareman record, @Param("example") SharemanExample example);

    int updateByPrimaryKeySelective(Shareman record);

    int updateByPrimaryKey(Shareman record);
}