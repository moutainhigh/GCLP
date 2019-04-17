package com.grape.model.mapper.base;

import com.grape.model.db.Menuinfo;
import com.grape.model.db.MenuinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MenuinfoMapper {
    int countByExample(MenuinfoExample example);

    int deleteByExample(MenuinfoExample example);

    int deleteByPrimaryKey(String menuid);

    int insert(Menuinfo record);

    int insertSelective(Menuinfo record);

    List<Menuinfo> selectByExample(MenuinfoExample example);

    Menuinfo selectByPrimaryKey(String menuid);

    int updateByExampleSelective(@Param("record") Menuinfo record, @Param("example") MenuinfoExample example);

    int updateByExample(@Param("record") Menuinfo record, @Param("example") MenuinfoExample example);

    int updateByPrimaryKeySelective(Menuinfo record);

    int updateByPrimaryKey(Menuinfo record);
}