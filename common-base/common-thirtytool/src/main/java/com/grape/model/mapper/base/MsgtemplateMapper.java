package com.grape.model.mapper.base;

import com.grape.model.db.Msgtemplate;
import com.grape.model.db.MsgtemplateExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MsgtemplateMapper {
    int countByExample(MsgtemplateExample example);

    int deleteByExample(MsgtemplateExample example);

    int deleteByPrimaryKey(String templateno);

    int insert(Msgtemplate record);

    int insertSelective(Msgtemplate record);

    List<Msgtemplate> selectByExample(MsgtemplateExample example);

    Msgtemplate selectByPrimaryKey(String templateno);

    int updateByExampleSelective(@Param("record") Msgtemplate record, @Param("example") MsgtemplateExample example);

    int updateByExample(@Param("record") Msgtemplate record, @Param("example") MsgtemplateExample example);

    int updateByPrimaryKeySelective(Msgtemplate record);

    int updateByPrimaryKey(Msgtemplate record);
}