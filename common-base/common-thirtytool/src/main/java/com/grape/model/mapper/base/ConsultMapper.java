package com.grape.model.mapper.base;

import com.grape.model.db.Consult;
import com.grape.model.db.ConsultExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConsultMapper {
    int countByExample(ConsultExample example);

    int deleteByExample(ConsultExample example);

    int deleteByPrimaryKey(String id);

    int insert(Consult record);

    int insertSelective(Consult record);

    List<Consult> selectByExample(ConsultExample example);

    Consult selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByExample(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKey(Consult record);
}