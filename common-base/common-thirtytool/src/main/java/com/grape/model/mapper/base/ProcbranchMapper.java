package com.grape.model.mapper.base;

import com.grape.model.db.Procbranch;
import com.grape.model.db.ProcbranchExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProcbranchMapper {
    int countByExample(ProcbranchExample example);

    int deleteByExample(ProcbranchExample example);

    int deleteByPrimaryKey(String branchid);

    int insert(Procbranch record);

    int insertSelective(Procbranch record);

    List<Procbranch> selectByExample(ProcbranchExample example);

    Procbranch selectByPrimaryKey(String branchid);

    int updateByExampleSelective(@Param("record") Procbranch record, @Param("example") ProcbranchExample example);

    int updateByExample(@Param("record") Procbranch record, @Param("example") ProcbranchExample example);

    int updateByPrimaryKeySelective(Procbranch record);

    int updateByPrimaryKey(Procbranch record);
}