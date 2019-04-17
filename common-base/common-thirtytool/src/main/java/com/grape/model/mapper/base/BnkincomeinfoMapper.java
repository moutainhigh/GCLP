package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Bnkincomeinfo;
import com.grape.model.db.BnkincomeinfoExample;
@Mapper
public interface BnkincomeinfoMapper {
    int countByExample(BnkincomeinfoExample example);

    int deleteByExample(BnkincomeinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Bnkincomeinfo record);

    int insertSelective(Bnkincomeinfo record);

    List<Bnkincomeinfo> selectByExample(BnkincomeinfoExample example);

    Bnkincomeinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Bnkincomeinfo record, @Param("example") BnkincomeinfoExample example);

    int updateByExample(@Param("record") Bnkincomeinfo record, @Param("example") BnkincomeinfoExample example);

    int updateByPrimaryKeySelective(Bnkincomeinfo record);

    int updateByPrimaryKey(Bnkincomeinfo record);
}