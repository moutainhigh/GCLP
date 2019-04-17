package com.grape.model.mapper.base;

import com.grape.model.db.Applymaninfo;
import com.grape.model.db.ApplymaninfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ApplymaninfoMapper {
    int countByExample(ApplymaninfoExample example);

    int deleteByExample(ApplymaninfoExample example);

    int deleteByPrimaryKey(@Param("workid") String workid, @Param("cerdid") String cerdid);

    int insert(Applymaninfo record);

    int insertSelective(Applymaninfo record);

    List<Applymaninfo> selectByExampleWithBLOBs(ApplymaninfoExample example);

    List<Applymaninfo> selectByExample(ApplymaninfoExample example);

    Applymaninfo selectByPrimaryKey(@Param("workid") String workid, @Param("cerdid") String cerdid);

    int updateByExampleSelective(@Param("record") Applymaninfo record, @Param("example") ApplymaninfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Applymaninfo record, @Param("example") ApplymaninfoExample example);

    int updateByExample(@Param("record") Applymaninfo record, @Param("example") ApplymaninfoExample example);

    int updateByPrimaryKeySelective(Applymaninfo record);

    int updateByPrimaryKeyWithBLOBs(Applymaninfo record);

    int updateByPrimaryKey(Applymaninfo record);
}