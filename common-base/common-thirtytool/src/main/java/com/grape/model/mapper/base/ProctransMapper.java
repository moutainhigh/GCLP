package com.grape.model.mapper.base;

import com.grape.model.db.Proctrans;
import com.grape.model.db.ProctransExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProctransMapper {
    int countByExample(ProctransExample example);

    int deleteByExample(ProctransExample example);

    int deleteByPrimaryKey(String transid);

    int insert(Proctrans record);

    int insertSelective(Proctrans record);

    List<Proctrans> selectByExample(ProctransExample example);

    Proctrans selectByPrimaryKey(String transid);

    int updateByExampleSelective(@Param("record") Proctrans record, @Param("example") ProctransExample example);

    int updateByExample(@Param("record") Proctrans record, @Param("example") ProctransExample example);

    int updateByPrimaryKeySelective(Proctrans record);

    int updateByPrimaryKey(Proctrans record);
}