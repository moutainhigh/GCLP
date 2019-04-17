package com.grape.model.mapper.base;

import com.grape.model.db.Autoform;
import com.grape.model.db.AutoformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoformMapper {
    int countByExample(AutoformExample example);

    int deleteByExample(AutoformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Autoform record);

    int insertSelective(Autoform record);

    List<Autoform> selectByExampleWithBLOBs(AutoformExample example);

    List<Autoform> selectByExample(AutoformExample example);

    Autoform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Autoform record, @Param("example") AutoformExample example);

    int updateByExampleWithBLOBs(@Param("record") Autoform record, @Param("example") AutoformExample example);

    int updateByExample(@Param("record") Autoform record, @Param("example") AutoformExample example);

    int updateByPrimaryKeySelective(Autoform record);

    int updateByPrimaryKeyWithBLOBs(Autoform record);

    int updateByPrimaryKey(Autoform record);
}