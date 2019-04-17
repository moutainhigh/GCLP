package com.grape.model.mapper.base;

import com.grape.model.db.Assessmodel;
import com.grape.model.db.AssessmodelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AssessmodelMapper {
    int countByExample(AssessmodelExample example);

    int deleteByExample(AssessmodelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assessmodel record);

    int insertSelective(Assessmodel record);

    List<Assessmodel> selectByExample(AssessmodelExample example);

    Assessmodel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assessmodel record, @Param("example") AssessmodelExample example);

    int updateByExample(@Param("record") Assessmodel record, @Param("example") AssessmodelExample example);

    int updateByPrimaryKeySelective(Assessmodel record);

    int updateByPrimaryKey(Assessmodel record);
}