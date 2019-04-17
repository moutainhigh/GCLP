package com.grape.model.mapper.base;

import com.grape.model.db.Custscore;
import com.grape.model.db.CustscoreExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustscoreMapper {
    int countByExample(CustscoreExample example);

    int deleteByExample(CustscoreExample example);

    int deleteByPrimaryKey(String id);

    int insert(Custscore record);

    int insertSelective(Custscore record);

    List<Custscore> selectByExample(CustscoreExample example);

    Custscore selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Custscore record, @Param("example") CustscoreExample example);

    int updateByExample(@Param("record") Custscore record, @Param("example") CustscoreExample example);

    int updateByPrimaryKeySelective(Custscore record);

    int updateByPrimaryKey(Custscore record);
}