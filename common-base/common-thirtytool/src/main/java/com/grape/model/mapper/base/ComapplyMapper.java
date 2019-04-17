package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Comapply;
import com.grape.model.db.ComapplyExample;
@Mapper
public interface ComapplyMapper {
    int countByExample(ComapplyExample example);

    int deleteByExample(ComapplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Comapply record);

    int insertSelective(Comapply record);

    List<Comapply> selectByExample(ComapplyExample example);

    Comapply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Comapply record, @Param("example") ComapplyExample example);

    int updateByExample(@Param("record") Comapply record, @Param("example") ComapplyExample example);

    int updateByPrimaryKeySelective(Comapply record);

    int updateByPrimaryKey(Comapply record);
}