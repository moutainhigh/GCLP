package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Deliapplicateinfo;
import com.grape.model.db.DeliapplicateinfoExample;
@Mapper
public interface DeliapplicateinfoMapper {
    int countByExample(DeliapplicateinfoExample example);

    int deleteByExample(DeliapplicateinfoExample example);

    int deleteByPrimaryKey(@Param("cerdid") String cerdid, @Param("workid") String workid);

    int insert(Deliapplicateinfo record);

    int insertSelective(Deliapplicateinfo record);

    List<Deliapplicateinfo> selectByExample(DeliapplicateinfoExample example);

    Deliapplicateinfo selectByPrimaryKey(@Param("cerdid") String cerdid, @Param("workid") String workid);

    int updateByExampleSelective(@Param("record") Deliapplicateinfo record, @Param("example") DeliapplicateinfoExample example);

    int updateByExample(@Param("record") Deliapplicateinfo record, @Param("example") DeliapplicateinfoExample example);

    int updateByPrimaryKeySelective(Deliapplicateinfo record);

    int updateByPrimaryKey(Deliapplicateinfo record);
}