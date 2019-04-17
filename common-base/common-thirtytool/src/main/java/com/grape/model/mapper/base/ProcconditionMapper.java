package com.grape.model.mapper.base;

import com.grape.model.db.Proccondition;
import com.grape.model.db.ProcconditionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProcconditionMapper {
    int countByExample(ProcconditionExample example);

    int deleteByExample(ProcconditionExample example);

    int deleteByPrimaryKey(String conditionid);

    int insert(Proccondition record);

    int insertSelective(Proccondition record);

    List<Proccondition> selectByExample(ProcconditionExample example);

    Proccondition selectByPrimaryKey(String conditionid);

    int updateByExampleSelective(@Param("record") Proccondition record, @Param("example") ProcconditionExample example);

    int updateByExample(@Param("record") Proccondition record, @Param("example") ProcconditionExample example);

    int updateByPrimaryKeySelective(Proccondition record);

    int updateByPrimaryKey(Proccondition record);
}