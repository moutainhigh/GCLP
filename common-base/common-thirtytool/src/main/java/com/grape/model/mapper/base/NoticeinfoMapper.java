package com.grape.model.mapper.base;

import com.grape.model.db.Noticeinfo;
import com.grape.model.db.NoticeinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NoticeinfoMapper {
    int countByExample(NoticeinfoExample example);

    int deleteByExample(NoticeinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Noticeinfo record);

    int insertSelective(Noticeinfo record);

    List<Noticeinfo> selectByExampleWithBLOBs(NoticeinfoExample example);

    List<Noticeinfo> selectByExample(NoticeinfoExample example);

    Noticeinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Noticeinfo record, @Param("example") NoticeinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Noticeinfo record, @Param("example") NoticeinfoExample example);

    int updateByExample(@Param("record") Noticeinfo record, @Param("example") NoticeinfoExample example);

    int updateByPrimaryKeySelective(Noticeinfo record);

    int updateByPrimaryKeyWithBLOBs(Noticeinfo record);

    int updateByPrimaryKey(Noticeinfo record);
}