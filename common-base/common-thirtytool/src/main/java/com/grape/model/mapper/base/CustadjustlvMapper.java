package com.grape.model.mapper.base;

import com.grape.model.db.Custadjustlv;
import com.grape.model.db.CustadjustlvExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustadjustlvMapper {
    int countByExample(CustadjustlvExample example);

    int deleteByExample(CustadjustlvExample example);

    int insert(Custadjustlv record);

    int insertSelective(Custadjustlv record);

    List<Custadjustlv> selectByExample(CustadjustlvExample example);

    int updateByExampleSelective(@Param("record") Custadjustlv record, @Param("example") CustadjustlvExample example);

    int updateByExample(@Param("record") Custadjustlv record, @Param("example") CustadjustlvExample example);
}