package com.grape.model.mapper.base;

import com.grape.model.db.Chanproduct;
import com.grape.model.db.ChanproductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ChanproductMapper {
    int countByExample(ChanproductExample example);

    int deleteByExample(ChanproductExample example);

    int deleteByPrimaryKey(String id);

    int insert(Chanproduct record);

    int insertSelective(Chanproduct record);

    List<Chanproduct> selectByExample(ChanproductExample example);

    Chanproduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Chanproduct record, @Param("example") ChanproductExample example);

    int updateByExample(@Param("record") Chanproduct record, @Param("example") ChanproductExample example);

    int updateByPrimaryKeySelective(Chanproduct record);

    int updateByPrimaryKey(Chanproduct record);
}