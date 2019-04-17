package com.grape.model.mapper.base;

import com.grape.model.db.Noderole;
import com.grape.model.db.NoderoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NoderoleMapper {
    int countByExample(NoderoleExample example);

    int deleteByExample(NoderoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Noderole record);

    int insertSelective(Noderole record);

    List<Noderole> selectByExample(NoderoleExample example);

    Noderole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Noderole record, @Param("example") NoderoleExample example);

    int updateByExample(@Param("record") Noderole record, @Param("example") NoderoleExample example);

    int updateByPrimaryKeySelective(Noderole record);

    int updateByPrimaryKey(Noderole record);
}