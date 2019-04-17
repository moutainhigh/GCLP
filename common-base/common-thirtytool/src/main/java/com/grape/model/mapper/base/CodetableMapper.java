package com.grape.model.mapper.base;

import com.grape.model.db.Codetable;
import com.grape.model.db.CodetableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CodetableMapper {
    int countByExample(CodetableExample example);

    int deleteByExample(CodetableExample example);

    int deleteByPrimaryKey(@Param("codtyp") String codtyp, @Param("codflg") String codflg);

    int insert(Codetable record);

    int insertSelective(Codetable record);

    List<Codetable> selectByExample(CodetableExample example);

    Codetable selectByPrimaryKey(@Param("codtyp") String codtyp, @Param("codflg") String codflg);

    int updateByExampleSelective(@Param("record") Codetable record, @Param("example") CodetableExample example);

    int updateByExample(@Param("record") Codetable record, @Param("example") CodetableExample example);

    int updateByPrimaryKeySelective(Codetable record);

    int updateByPrimaryKey(Codetable record);
}