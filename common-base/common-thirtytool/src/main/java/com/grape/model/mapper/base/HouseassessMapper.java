package com.grape.model.mapper.base;

import com.grape.model.db.Houseassess;
import com.grape.model.db.HouseassessExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HouseassessMapper {
    int countByExample(HouseassessExample example);

    int deleteByExample(HouseassessExample example);

    int deleteByPrimaryKey(@Param("workid") String workid, @Param("mortgageno") String mortgageno, @Param("channel") String channel);

    int insert(Houseassess record);

    int insertSelective(Houseassess record);

    List<Houseassess> selectByExample(HouseassessExample example);

    Houseassess selectByPrimaryKey(@Param("workid") String workid, @Param("mortgageno") String mortgageno, @Param("channel") String channel);

    int updateByExampleSelective(@Param("record") Houseassess record, @Param("example") HouseassessExample example);

    int updateByExample(@Param("record") Houseassess record, @Param("example") HouseassessExample example);

    int updateByPrimaryKeySelective(Houseassess record);

    int updateByPrimaryKey(Houseassess record);
}