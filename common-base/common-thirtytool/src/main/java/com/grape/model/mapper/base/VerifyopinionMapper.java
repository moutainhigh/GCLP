package com.grape.model.mapper.base;

import com.grape.model.db.Verifyopinion;
import com.grape.model.db.VerifyopinionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VerifyopinionMapper {
    int countByExample(VerifyopinionExample example);

    int deleteByExample(VerifyopinionExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Verifyopinion record);

    int insertSelective(Verifyopinion record);

    List<Verifyopinion> selectByExample(VerifyopinionExample example);

    Verifyopinion selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Verifyopinion record, @Param("example") VerifyopinionExample example);

    int updateByExample(@Param("record") Verifyopinion record, @Param("example") VerifyopinionExample example);

    int updateByPrimaryKeySelective(Verifyopinion record);

    int updateByPrimaryKey(Verifyopinion record);
}