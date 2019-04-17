package com.grape.model.mapper.base;

import com.grape.model.db.Reservations;
import com.grape.model.db.ReservationsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ReservationsMapper {
    int countByExample(ReservationsExample example);

    int deleteByExample(ReservationsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Reservations record);

    int insertSelective(Reservations record);

    List<Reservations> selectByExample(ReservationsExample example);

    Reservations selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Reservations record, @Param("example") ReservationsExample example);

    int updateByExample(@Param("record") Reservations record, @Param("example") ReservationsExample example);

    int updateByPrimaryKeySelective(Reservations record);

    int updateByPrimaryKey(Reservations record);
}