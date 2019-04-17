package com.grape.model.mapper.base;

import com.grape.model.db.Shixin;
import com.grape.model.db.ShixinExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ShixinMapper {
    int countByExample(ShixinExample example);

    int deleteByExample(ShixinExample example);

    int deleteByPrimaryKey(@Param("keyid") String keyid, @Param("workid") String workid);

    int insert(Shixin record);

    int insertSelective(Shixin record);

    List<Shixin> selectByExampleWithBLOBs(ShixinExample example);

    List<Shixin> selectByExample(ShixinExample example);

    Shixin selectByPrimaryKey(@Param("keyid") String keyid, @Param("workid") String workid);

    int updateByExampleSelective(@Param("record") Shixin record, @Param("example") ShixinExample example);

    int updateByExampleWithBLOBs(@Param("record") Shixin record, @Param("example") ShixinExample example);

    int updateByExample(@Param("record") Shixin record, @Param("example") ShixinExample example);

    int updateByPrimaryKeySelective(Shixin record);

    int updateByPrimaryKeyWithBLOBs(Shixin record);

    int updateByPrimaryKey(Shixin record);
}