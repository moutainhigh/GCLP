package com.grape.model.mapper.base;

import com.grape.model.db.Shufflingfigure;
import com.grape.model.db.ShufflingfigureExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ShufflingfigureMapper {
    int countByExample(ShufflingfigureExample example);

    int deleteByExample(ShufflingfigureExample example);

    int deleteByPrimaryKey(String id);

    int insert(Shufflingfigure record);

    int insertSelective(Shufflingfigure record);

    List<Shufflingfigure> selectByExample(ShufflingfigureExample example);

    Shufflingfigure selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Shufflingfigure record, @Param("example") ShufflingfigureExample example);

    int updateByExample(@Param("record") Shufflingfigure record, @Param("example") ShufflingfigureExample example);

    int updateByPrimaryKeySelective(Shufflingfigure record);

    int updateByPrimaryKey(Shufflingfigure record);
}