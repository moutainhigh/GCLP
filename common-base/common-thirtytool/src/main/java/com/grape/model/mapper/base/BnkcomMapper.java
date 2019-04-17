package com.grape.model.mapper.base;

import com.grape.model.db.Bnkcom;
import com.grape.model.db.BnkcomExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BnkcomMapper {
    int countByExample(BnkcomExample example);

    int deleteByExample(BnkcomExample example);

    int deleteByPrimaryKey(@Param("comno") String comno, @Param("bnkno") String bnkno);

    int insert(Bnkcom record);

    int insertSelective(Bnkcom record);

    List<Bnkcom> selectByExample(BnkcomExample example);

    Bnkcom selectByPrimaryKey(@Param("comno") String comno, @Param("bnkno") String bnkno);

    int updateByExampleSelective(@Param("record") Bnkcom record, @Param("example") BnkcomExample example);

    int updateByExample(@Param("record") Bnkcom record, @Param("example") BnkcomExample example);

    int updateByPrimaryKeySelective(Bnkcom record);

    int updateByPrimaryKey(Bnkcom record);
}