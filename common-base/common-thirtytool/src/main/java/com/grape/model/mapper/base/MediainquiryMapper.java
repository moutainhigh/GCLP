package com.grape.model.mapper.base;

import com.grape.model.db.Mediainquiry;
import com.grape.model.db.MediainquiryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MediainquiryMapper {
    int countByExample(MediainquiryExample example);

    int deleteByExample(MediainquiryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Mediainquiry record);

    int insertSelective(Mediainquiry record);

    List<Mediainquiry> selectByExample(MediainquiryExample example);

    Mediainquiry selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Mediainquiry record, @Param("example") MediainquiryExample example);

    int updateByExample(@Param("record") Mediainquiry record, @Param("example") MediainquiryExample example);

    int updateByPrimaryKeySelective(Mediainquiry record);

    int updateByPrimaryKey(Mediainquiry record);
}