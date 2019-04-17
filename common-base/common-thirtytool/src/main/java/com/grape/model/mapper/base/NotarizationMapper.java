package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Notarization;
import com.grape.model.db.NotarizationExample;
@Mapper
public interface NotarizationMapper {
    int countByExample(NotarizationExample example);

    int deleteByExample(NotarizationExample example);

    int deleteByPrimaryKey(String id);

    int insert(Notarization record);

    int insertSelective(Notarization record);

    List<Notarization> selectByExample(NotarizationExample example);

    Notarization selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Notarization record, @Param("example") NotarizationExample example);

    int updateByExample(@Param("record") Notarization record, @Param("example") NotarizationExample example);

    int updateByPrimaryKeySelective(Notarization record);

    int updateByPrimaryKey(Notarization record);
}