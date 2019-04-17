package com.grape.model.mapper.base;

import com.grape.model.db.Prorepaytype;
import com.grape.model.db.ProrepaytypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProrepaytypeMapper {
    int countByExample(ProrepaytypeExample example);

    int deleteByExample(ProrepaytypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Prorepaytype record);

    int insertSelective(Prorepaytype record);

    List<Prorepaytype> selectByExample(ProrepaytypeExample example);

    Prorepaytype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Prorepaytype record, @Param("example") ProrepaytypeExample example);

    int updateByExample(@Param("record") Prorepaytype record, @Param("example") ProrepaytypeExample example);

    int updateByPrimaryKeySelective(Prorepaytype record);

    int updateByPrimaryKey(Prorepaytype record);
}