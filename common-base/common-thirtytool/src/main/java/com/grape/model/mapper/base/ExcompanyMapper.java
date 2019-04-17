package com.grape.model.mapper.base;

import com.grape.model.db.Excompany;
import com.grape.model.db.ExcompanyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExcompanyMapper {
    int countByExample(ExcompanyExample example);

    int deleteByExample(ExcompanyExample example);

    int deleteByPrimaryKey(String comno);

    int insert(Excompany record);

    int insertSelective(Excompany record);

    List<Excompany> selectByExample(ExcompanyExample example);

    Excompany selectByPrimaryKey(String comno);

    int updateByExampleSelective(@Param("record") Excompany record, @Param("example") ExcompanyExample example);

    int updateByExample(@Param("record") Excompany record, @Param("example") ExcompanyExample example);

    int updateByPrimaryKeySelective(Excompany record);

    int updateByPrimaryKey(Excompany record);
}