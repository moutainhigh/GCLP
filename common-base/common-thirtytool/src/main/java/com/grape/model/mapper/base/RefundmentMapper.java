package com.grape.model.mapper.base;

import com.grape.model.db.Refundment;
import com.grape.model.db.RefundmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RefundmentMapper {
    int countByExample(RefundmentExample example);

    int deleteByExample(RefundmentExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Refundment record);

    int insertSelective(Refundment record);

    List<Refundment> selectByExample(RefundmentExample example);

    Refundment selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Refundment record, @Param("example") RefundmentExample example);

    int updateByExample(@Param("record") Refundment record, @Param("example") RefundmentExample example);

    int updateByPrimaryKeySelective(Refundment record);

    int updateByPrimaryKey(Refundment record);
}