package com.grape.model.mapper.base;

import com.grape.model.db.Callhist;
import com.grape.model.db.CallhistExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CallhistMapper {
    int countByExample(CallhistExample example);

    int deleteByExample(CallhistExample example);

    int deleteByPrimaryKey(String callid);

    int insert(Callhist record);

    int insertSelective(Callhist record);

    List<Callhist> selectByExample(CallhistExample example);

    Callhist selectByPrimaryKey(String callid);

    int updateByExampleSelective(@Param("record") Callhist record, @Param("example") CallhistExample example);

    int updateByExample(@Param("record") Callhist record, @Param("example") CallhistExample example);

    int updateByPrimaryKeySelective(Callhist record);

    int updateByPrimaryKey(Callhist record);
}