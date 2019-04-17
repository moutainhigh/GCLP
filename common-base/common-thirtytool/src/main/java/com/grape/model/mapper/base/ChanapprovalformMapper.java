package com.grape.model.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.ChanapprovalformExample;
@Mapper
public interface ChanapprovalformMapper {
    int countByExample(ChanapprovalformExample example);

    int deleteByExample(ChanapprovalformExample example);

    int deleteByPrimaryKey(String id);

    int insert(Chanapprovalform record);

    int insertSelective(Chanapprovalform record);

    List<Chanapprovalform> selectByExample(ChanapprovalformExample example);

    Chanapprovalform selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Chanapprovalform record, @Param("example") ChanapprovalformExample example);

    int updateByExample(@Param("record") Chanapprovalform record, @Param("example") ChanapprovalformExample example);

    int updateByPrimaryKeySelective(Chanapprovalform record);

    int updateByPrimaryKey(Chanapprovalform record);
}