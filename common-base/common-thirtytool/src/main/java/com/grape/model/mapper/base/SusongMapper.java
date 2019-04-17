package com.grape.model.mapper.base;

import com.grape.model.db.Susong;
import com.grape.model.db.SusongExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SusongMapper {
    int countByExample(SusongExample example);

    int deleteByExample(SusongExample example);

    int deleteByPrimaryKey(@Param("keyid") String keyid, @Param("workid") String workid);

    int insert(Susong record);

    int insertSelective(Susong record);

    List<Susong> selectByExample(SusongExample example);

    Susong selectByPrimaryKey(@Param("keyid") String keyid, @Param("workid") String workid);

    int updateByExampleSelective(@Param("record") Susong record, @Param("example") SusongExample example);

    int updateByExample(@Param("record") Susong record, @Param("example") SusongExample example);

    int updateByPrimaryKeySelective(Susong record);

    int updateByPrimaryKey(Susong record);
}