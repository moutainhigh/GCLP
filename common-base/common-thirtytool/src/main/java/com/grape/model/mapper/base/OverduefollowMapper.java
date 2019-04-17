package com.grape.model.mapper.base;

import com.grape.model.db.Overduefollow;
import com.grape.model.db.OverduefollowExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OverduefollowMapper {
    int countByExample(OverduefollowExample example);

    int deleteByExample(OverduefollowExample example);

    int deleteByPrimaryKey(String id);

    int insert(Overduefollow record);

    int insertSelective(Overduefollow record);

    List<Overduefollow> selectByExampleWithBLOBs(OverduefollowExample example);

    List<Overduefollow> selectByExample(OverduefollowExample example);

    Overduefollow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Overduefollow record, @Param("example") OverduefollowExample example);

    int updateByExampleWithBLOBs(@Param("record") Overduefollow record, @Param("example") OverduefollowExample example);

    int updateByExample(@Param("record") Overduefollow record, @Param("example") OverduefollowExample example);

    int updateByPrimaryKeySelective(Overduefollow record);

    int updateByPrimaryKeyWithBLOBs(Overduefollow record);

    int updateByPrimaryKey(Overduefollow record);
}