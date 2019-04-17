package com.grape.model.mapper.base;

import com.grape.model.db.Paydutyapply;
import com.grape.model.db.PaydutyapplyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PaydutyapplyMapper {
    int countByExample(PaydutyapplyExample example);

    int deleteByExample(PaydutyapplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Paydutyapply record);

    int insertSelective(Paydutyapply record);

    List<Paydutyapply> selectByExample(PaydutyapplyExample example);

    Paydutyapply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Paydutyapply record, @Param("example") PaydutyapplyExample example);

    int updateByExample(@Param("record") Paydutyapply record, @Param("example") PaydutyapplyExample example);

    int updateByPrimaryKeySelective(Paydutyapply record);

    int updateByPrimaryKey(Paydutyapply record);
}