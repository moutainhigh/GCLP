package com.grape.model.mapper.base;

import com.grape.model.db.Paymentapplyinfo;
import com.grape.model.db.PaymentapplyinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PaymentapplyinfoMapper {
    int countByExample(PaymentapplyinfoExample example);

    int deleteByExample(PaymentapplyinfoExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Paymentapplyinfo record);

    int insertSelective(Paymentapplyinfo record);

    List<Paymentapplyinfo> selectByExample(PaymentapplyinfoExample example);

    Paymentapplyinfo selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Paymentapplyinfo record, @Param("example") PaymentapplyinfoExample example);

    int updateByExample(@Param("record") Paymentapplyinfo record, @Param("example") PaymentapplyinfoExample example);

    int updateByPrimaryKeySelective(Paymentapplyinfo record);

    int updateByPrimaryKey(Paymentapplyinfo record);
}