package com.grape.model.mapper.base;

import com.grape.model.db.Accessrule;
import com.grape.model.db.AccessruleExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccessruleMapper {
    int countByExample(AccessruleExample example);

    int deleteByExample(AccessruleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Accessrule record);

    int insertSelective(Accessrule record);

    List<Accessrule> selectByExample(AccessruleExample example);

    Accessrule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Accessrule record, @Param("example") AccessruleExample example);

    int updateByExample(@Param("record") Accessrule record, @Param("example") AccessruleExample example);

    int updateByPrimaryKeySelective(Accessrule record);

    int updateByPrimaryKey(Accessrule record);
}