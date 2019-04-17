package com.grape.model.mapper.base;

import com.grape.model.db.Exchannel;
import com.grape.model.db.ExchannelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExchannelMapper {
    int countByExample(ExchannelExample example);

    int deleteByExample(ExchannelExample example);

    int deleteByPrimaryKey(String channelno);

    int insert(Exchannel record);

    int insertSelective(Exchannel record);

    List<Exchannel> selectByExample(ExchannelExample example);

    Exchannel selectByPrimaryKey(String channelno);

    int updateByExampleSelective(@Param("record") Exchannel record, @Param("example") ExchannelExample example);

    int updateByExample(@Param("record") Exchannel record, @Param("example") ExchannelExample example);

    int updateByPrimaryKeySelective(Exchannel record);

    int updateByPrimaryKey(Exchannel record);
}