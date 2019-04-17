package com.grape.model.mapper.base;

import com.grape.model.db.Formdata;
import com.grape.model.db.FormdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormdataMapper {
    int countByExample(FormdataExample example);

    int deleteByExample(FormdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Formdata record);

    int insertSelective(Formdata record);

    List<Formdata> selectByExampleWithBLOBs(FormdataExample example);

    List<Formdata> selectByExample(FormdataExample example);

    Formdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Formdata record, @Param("example") FormdataExample example);

    int updateByExampleWithBLOBs(@Param("record") Formdata record, @Param("example") FormdataExample example);

    int updateByExample(@Param("record") Formdata record, @Param("example") FormdataExample example);

    int updateByPrimaryKeySelective(Formdata record);

    int updateByPrimaryKeyWithBLOBs(Formdata record);

    int updateByPrimaryKey(Formdata record);
}