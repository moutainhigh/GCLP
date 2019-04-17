package com.grape.model.mapper.base;

import com.grape.model.db.Procnodefile;
import com.grape.model.db.ProcnodefileExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProcnodefileMapper {
    int countByExample(ProcnodefileExample example);

    int deleteByExample(ProcnodefileExample example);

    int deleteByPrimaryKey(String id);

    int insert(Procnodefile record);

    int insertSelective(Procnodefile record);

    List<Procnodefile> selectByExample(ProcnodefileExample example);

    Procnodefile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Procnodefile record, @Param("example") ProcnodefileExample example);

    int updateByExample(@Param("record") Procnodefile record, @Param("example") ProcnodefileExample example);

    int updateByPrimaryKeySelective(Procnodefile record);

    int updateByPrimaryKey(Procnodefile record);
}