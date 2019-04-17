package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Litigationinfo;
import com.grape.model.db.LitigationinfoExample;
@Mapper
public interface LitigationinfoMapper {
    int countByExample(LitigationinfoExample example);

    int deleteByExample(LitigationinfoExample example);

    int deleteByPrimaryKey(@Param("cerdid") String cerdid, @Param("querytype") String querytype, @Param("workid") String workid);

    int insert(Litigationinfo record);

    int insertSelective(Litigationinfo record);

    List<Litigationinfo> selectByExample(LitigationinfoExample example);

    Litigationinfo selectByPrimaryKey(@Param("cerdid") String cerdid, @Param("querytype") String querytype, @Param("workid") String workid);

    int updateByExampleSelective(@Param("record") Litigationinfo record, @Param("example") LitigationinfoExample example);

    int updateByExample(@Param("record") Litigationinfo record, @Param("example") LitigationinfoExample example);

    int updateByPrimaryKeySelective(Litigationinfo record);

    int updateByPrimaryKey(Litigationinfo record);
}