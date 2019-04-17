package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Assetinfo;
import com.grape.model.db.AssetinfoExample;
@Mapper
public interface AssetinfoMapper {
    int countByExample(AssetinfoExample example);

    int deleteByExample(AssetinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Assetinfo record);

    int insertSelective(Assetinfo record);

    List<Assetinfo> selectByExample(AssetinfoExample example);

    Assetinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Assetinfo record, @Param("example") AssetinfoExample example);

    int updateByExample(@Param("record") Assetinfo record, @Param("example") AssetinfoExample example);

    int updateByPrimaryKeySelective(Assetinfo record);

    int updateByPrimaryKey(Assetinfo record);
}