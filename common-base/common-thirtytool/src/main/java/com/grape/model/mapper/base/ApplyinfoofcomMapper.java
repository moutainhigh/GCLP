package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.ApplyinfoofcomExample;
@Mapper
public interface ApplyinfoofcomMapper {
    int countByExample(ApplyinfoofcomExample example);

    int deleteByExample(ApplyinfoofcomExample example);

    int deleteByPrimaryKey(@Param("workid") String workid, @Param("socialcreditcode") String socialcreditcode);

    int insert(Applyinfoofcom record);

    int insertSelective(Applyinfoofcom record);

    List<Applyinfoofcom> selectByExample(ApplyinfoofcomExample example);

    Applyinfoofcom selectByPrimaryKey(@Param("workid") String workid, @Param("socialcreditcode") String socialcreditcode);

    int updateByExampleSelective(@Param("record") Applyinfoofcom record, @Param("example") ApplyinfoofcomExample example);

    int updateByExample(@Param("record") Applyinfoofcom record, @Param("example") ApplyinfoofcomExample example);

    int updateByPrimaryKeySelective(Applyinfoofcom record);

    int updateByPrimaryKey(Applyinfoofcom record);
}