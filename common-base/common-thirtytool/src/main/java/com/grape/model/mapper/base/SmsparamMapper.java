package com.grape.model.mapper.base;

import com.grape.model.db.Smsparam;
import com.grape.model.db.SmsparamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsparamMapper {
    int countByExample(SmsparamExample example);

    int deleteByExample(SmsparamExample example);

    int deleteByPrimaryKey(String id);

    int insert(Smsparam record);

    int insertSelective(Smsparam record);

    List<Smsparam> selectByExample(SmsparamExample example);

    Smsparam selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Smsparam record, @Param("example") SmsparamExample example);

    int updateByExample(@Param("record") Smsparam record, @Param("example") SmsparamExample example);

    int updateByPrimaryKeySelective(Smsparam record);

    int updateByPrimaryKey(Smsparam record);
}