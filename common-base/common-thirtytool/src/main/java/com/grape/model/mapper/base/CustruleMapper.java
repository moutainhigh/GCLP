package com.grape.model.mapper.base;

import com.grape.model.db.Custrule;
import com.grape.model.db.CustruleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustruleMapper {
    int countByExample(CustruleExample example);

    int deleteByExample(CustruleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Custrule record);

    int insertSelective(Custrule record);

    List<Custrule> selectByExample(CustruleExample example);

    Custrule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Custrule record, @Param("example") CustruleExample example);

    int updateByExample(@Param("record") Custrule record, @Param("example") CustruleExample example);

    int updateByPrimaryKeySelective(Custrule record);

    int updateByPrimaryKey(Custrule record);
}