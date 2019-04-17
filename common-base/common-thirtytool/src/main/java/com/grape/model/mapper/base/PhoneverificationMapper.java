package com.grape.model.mapper.base;

import com.grape.model.db.Phoneverification;
import com.grape.model.db.PhoneverificationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PhoneverificationMapper {
    int countByExample(PhoneverificationExample example);

    int deleteByExample(PhoneverificationExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Phoneverification record);

    int insertSelective(Phoneverification record);

    List<Phoneverification> selectByExample(PhoneverificationExample example);

    Phoneverification selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Phoneverification record, @Param("example") PhoneverificationExample example);

    int updateByExample(@Param("record") Phoneverification record, @Param("example") PhoneverificationExample example);

    int updateByPrimaryKeySelective(Phoneverification record);

    int updateByPrimaryKey(Phoneverification record);
}