package com.grape.model.mapper.base;

import com.grape.model.db.Otherapplyinfo;
import com.grape.model.db.OtherapplyinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OtherapplyinfoMapper {
    int countByExample(OtherapplyinfoExample example);

    int deleteByExample(OtherapplyinfoExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Otherapplyinfo record);

    int insertSelective(Otherapplyinfo record);

    List<Otherapplyinfo> selectByExample(OtherapplyinfoExample example);

    Otherapplyinfo selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Otherapplyinfo record, @Param("example") OtherapplyinfoExample example);

    int updateByExample(@Param("record") Otherapplyinfo record, @Param("example") OtherapplyinfoExample example);

    int updateByPrimaryKeySelective(Otherapplyinfo record);

    int updateByPrimaryKey(Otherapplyinfo record);
}