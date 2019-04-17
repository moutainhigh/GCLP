package com.grape.model.mapper.base;

import com.grape.model.db.Exqueryhist;
import com.grape.model.db.ExqueryhistExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExqueryhistMapper {
    int countByExample(ExqueryhistExample example);

    int deleteByExample(ExqueryhistExample example);

    int deleteByPrimaryKey(String id);

    int insert(Exqueryhist record);

    int insertSelective(Exqueryhist record);

    List<Exqueryhist> selectByExampleWithBLOBs(ExqueryhistExample example);

    List<Exqueryhist> selectByExample(ExqueryhistExample example);

    Exqueryhist selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Exqueryhist record, @Param("example") ExqueryhistExample example);

    int updateByExampleWithBLOBs(@Param("record") Exqueryhist record, @Param("example") ExqueryhistExample example);

    int updateByExample(@Param("record") Exqueryhist record, @Param("example") ExqueryhistExample example);

    int updateByPrimaryKeySelective(Exqueryhist record);

    int updateByPrimaryKeyWithBLOBs(Exqueryhist record);

    int updateByPrimaryKey(Exqueryhist record);
}