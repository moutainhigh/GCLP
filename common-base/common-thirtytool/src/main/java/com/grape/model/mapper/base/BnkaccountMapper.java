package com.grape.model.mapper.base;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.grape.model.db.Bnkaccount;
import com.grape.model.db.BnkaccountExample;
@Mapper
public interface BnkaccountMapper {
    int countByExample(BnkaccountExample example);

    int deleteByExample(BnkaccountExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Bnkaccount record);

    int insertSelective(Bnkaccount record);

    List<Bnkaccount> selectByExample(BnkaccountExample example);

    Bnkaccount selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Bnkaccount record, @Param("example") BnkaccountExample example);

    int updateByExample(@Param("record") Bnkaccount record, @Param("example") BnkaccountExample example);

    int updateByPrimaryKeySelective(Bnkaccount record);

    int updateByPrimaryKey(Bnkaccount record);
}