package com.grape.model.mapper.base;

import com.grape.model.db.Doctasksign;
import com.grape.model.db.DoctasksignExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DoctasksignMapper {
    int countByExample(DoctasksignExample example);

    int deleteByExample(DoctasksignExample example);

    int deleteByPrimaryKey(String id);

    int insert(Doctasksign record);

    int insertSelective(Doctasksign record);

    List<Doctasksign> selectByExample(DoctasksignExample example);

    Doctasksign selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Doctasksign record, @Param("example") DoctasksignExample example);

    int updateByExample(@Param("record") Doctasksign record, @Param("example") DoctasksignExample example);

    int updateByPrimaryKeySelective(Doctasksign record);

    int updateByPrimaryKey(Doctasksign record);
}