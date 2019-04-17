package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Incomeinfo;
import com.grape.model.db.IncomeinfoExample;

@Mapper
public interface IncomeinfoMapper {
    int countByExample(IncomeinfoExample example);

    int deleteByExample(IncomeinfoExample example);

    int deleteByPrimaryKey(@Param("workid") String workid, @Param("cerdid") String cerdid);

    int insert(Incomeinfo record);

    int insertSelective(Incomeinfo record);

    List<Incomeinfo> selectByExample(IncomeinfoExample example);

    Incomeinfo selectByPrimaryKey(@Param("workid") String workid, @Param("cerdid") String cerdid);

    int updateByExampleSelective(@Param("record") Incomeinfo record, @Param("example") IncomeinfoExample example);

    int updateByExample(@Param("record") Incomeinfo record, @Param("example") IncomeinfoExample example);

    int updateByPrimaryKeySelective(Incomeinfo record);

    int updateByPrimaryKey(Incomeinfo record);
}