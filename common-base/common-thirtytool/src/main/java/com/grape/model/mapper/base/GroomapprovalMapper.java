package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Groomapproval;
import com.grape.model.db.GroomapprovalExample;
@Mapper
public interface GroomapprovalMapper {
    int countByExample(GroomapprovalExample example);

    int deleteByExample(GroomapprovalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Groomapproval record);

    int insertSelective(Groomapproval record);

    List<Groomapproval> selectByExample(GroomapprovalExample example);

    Groomapproval selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Groomapproval record, @Param("example") GroomapprovalExample example);

    int updateByExample(@Param("record") Groomapproval record, @Param("example") GroomapprovalExample example);

    int updateByPrimaryKeySelective(Groomapproval record);

    int updateByPrimaryKey(Groomapproval record);
}