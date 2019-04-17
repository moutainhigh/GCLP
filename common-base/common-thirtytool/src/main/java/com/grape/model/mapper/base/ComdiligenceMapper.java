package com.grape.model.mapper.base;

import com.grape.model.db.Comdiligence;
import com.grape.model.db.ComdiligenceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ComdiligenceMapper {
    int countByExample(ComdiligenceExample example);

    int deleteByExample(ComdiligenceExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Comdiligence record);

    int insertSelective(Comdiligence record);

    List<Comdiligence> selectByExampleWithBLOBs(ComdiligenceExample example);

    List<Comdiligence> selectByExample(ComdiligenceExample example);

    Comdiligence selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Comdiligence record, @Param("example") ComdiligenceExample example);

    int updateByExampleWithBLOBs(@Param("record") Comdiligence record, @Param("example") ComdiligenceExample example);

    int updateByExample(@Param("record") Comdiligence record, @Param("example") ComdiligenceExample example);

    int updateByPrimaryKeySelective(Comdiligence record);

    int updateByPrimaryKeyWithBLOBs(Comdiligence record);

    int updateByPrimaryKey(Comdiligence record);
}