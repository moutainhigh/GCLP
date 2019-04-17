package com.grape.model.mapper.base;

import com.grape.model.db.Repayfollow;
import com.grape.model.db.RepayfollowExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RepayfollowMapper {
    int countByExample(RepayfollowExample example);

    int deleteByExample(RepayfollowExample example);

    int deleteByPrimaryKey(String id);

    int insert(Repayfollow record);

    int insertSelective(Repayfollow record);

    List<Repayfollow> selectByExampleWithBLOBs(RepayfollowExample example);

    List<Repayfollow> selectByExample(RepayfollowExample example);

    Repayfollow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Repayfollow record, @Param("example") RepayfollowExample example);

    int updateByExampleWithBLOBs(@Param("record") Repayfollow record, @Param("example") RepayfollowExample example);

    int updateByExample(@Param("record") Repayfollow record, @Param("example") RepayfollowExample example);

    int updateByPrimaryKeySelective(Repayfollow record);

    int updateByPrimaryKeyWithBLOBs(Repayfollow record);

    int updateByPrimaryKey(Repayfollow record);
}