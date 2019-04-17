package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Buildingproperty;
import com.grape.model.db.BuildingpropertyExample;
@Mapper
public interface BuildingpropertyMapper {
    int countByExample(BuildingpropertyExample example);

    int deleteByExample(BuildingpropertyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Buildingproperty record);

    int insertSelective(Buildingproperty record);

    List<Buildingproperty> selectByExample(BuildingpropertyExample example);

    Buildingproperty selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Buildingproperty record, @Param("example") BuildingpropertyExample example);

    int updateByExample(@Param("record") Buildingproperty record, @Param("example") BuildingpropertyExample example);

    int updateByPrimaryKeySelective(Buildingproperty record);

    int updateByPrimaryKey(Buildingproperty record);
}