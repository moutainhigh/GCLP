package com.grape.model.mapper.base;

import com.grape.model.db.Areaquota;
import com.grape.model.db.AreaquotaExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AreaquotaMapper {
    int countByExample(AreaquotaExample example);

    int deleteByExample(AreaquotaExample example);

    int deleteByPrimaryKey(@Param("accountno") String accountno, @Param("areaid") String areaid);

    int insert(Areaquota record);

    int insertSelective(Areaquota record);

    List<Areaquota> selectByExample(AreaquotaExample example);

    Areaquota selectByPrimaryKey(@Param("accountno") String accountno, @Param("areaid") String areaid);

    int updateByExampleSelective(@Param("record") Areaquota record, @Param("example") AreaquotaExample example);

    int updateByExample(@Param("record") Areaquota record, @Param("example") AreaquotaExample example);

    int updateByPrimaryKeySelective(Areaquota record);

    int updateByPrimaryKey(Areaquota record);
}