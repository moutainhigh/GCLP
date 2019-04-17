package com.grape.model.mapper.base;

import com.grape.model.db.Workproc;
import com.grape.model.db.WorkprocExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface WorkprocMapper {
    int countByExample(WorkprocExample example);

    int deleteByExample(WorkprocExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Workproc record);

    int insertSelective(Workproc record);

    List<Workproc> selectByExample(WorkprocExample example);

    Workproc selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Workproc record, @Param("example") WorkprocExample example);

    int updateByExample(@Param("record") Workproc record, @Param("example") WorkprocExample example);

    int updateByPrimaryKeySelective(Workproc record);

    int updateByPrimaryKey(Workproc record);
}