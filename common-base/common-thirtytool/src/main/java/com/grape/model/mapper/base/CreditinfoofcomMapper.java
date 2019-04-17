package com.grape.model.mapper.base;

import com.grape.model.db.Creditinfoofcom;
import com.grape.model.db.CreditinfoofcomExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CreditinfoofcomMapper {
    int countByExample(CreditinfoofcomExample example);

    int deleteByExample(CreditinfoofcomExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Creditinfoofcom record);

    int insertSelective(Creditinfoofcom record);

    List<Creditinfoofcom> selectByExample(CreditinfoofcomExample example);

    Creditinfoofcom selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Creditinfoofcom record, @Param("example") CreditinfoofcomExample example);

    int updateByExample(@Param("record") Creditinfoofcom record, @Param("example") CreditinfoofcomExample example);

    int updateByPrimaryKeySelective(Creditinfoofcom record);

    int updateByPrimaryKey(Creditinfoofcom record);
}