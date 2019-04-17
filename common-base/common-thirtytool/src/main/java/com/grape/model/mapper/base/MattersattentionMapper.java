package com.grape.model.mapper.base;

import com.grape.model.db.Mattersattention;
import com.grape.model.db.MattersattentionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MattersattentionMapper {
    int countByExample(MattersattentionExample example);

    int deleteByExample(MattersattentionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Mattersattention record);

    int insertSelective(Mattersattention record);

    List<Mattersattention> selectByExampleWithBLOBs(MattersattentionExample example);

    List<Mattersattention> selectByExample(MattersattentionExample example);

    Mattersattention selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Mattersattention record, @Param("example") MattersattentionExample example);

    int updateByExampleWithBLOBs(@Param("record") Mattersattention record, @Param("example") MattersattentionExample example);

    int updateByExample(@Param("record") Mattersattention record, @Param("example") MattersattentionExample example);

    int updateByPrimaryKeySelective(Mattersattention record);

    int updateByPrimaryKeyWithBLOBs(Mattersattention record);

    int updateByPrimaryKey(Mattersattention record);
}