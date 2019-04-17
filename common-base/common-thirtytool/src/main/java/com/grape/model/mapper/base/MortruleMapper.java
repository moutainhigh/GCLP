package com.grape.model.mapper.base;

import com.grape.model.db.Mortrule;
import com.grape.model.db.MortruleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MortruleMapper {
    int countByExample(MortruleExample example);

    int deleteByExample(MortruleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Mortrule record);

    int insertSelective(Mortrule record);

    List<Mortrule> selectByExample(MortruleExample example);

    Mortrule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Mortrule record, @Param("example") MortruleExample example);

    int updateByExample(@Param("record") Mortrule record, @Param("example") MortruleExample example);

    int updateByPrimaryKeySelective(Mortrule record);

    int updateByPrimaryKey(Mortrule record);
}