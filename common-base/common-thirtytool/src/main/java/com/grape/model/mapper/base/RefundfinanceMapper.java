package com.grape.model.mapper.base;

import com.grape.model.db.Refundfinance;
import com.grape.model.db.RefundfinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundfinanceMapper {
    int countByExample(RefundfinanceExample example);

    int deleteByExample(RefundfinanceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Refundfinance record);

    int insertSelective(Refundfinance record);

    List<Refundfinance> selectByExample(RefundfinanceExample example);

    Refundfinance selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Refundfinance record, @Param("example") RefundfinanceExample example);

    int updateByExample(@Param("record") Refundfinance record, @Param("example") RefundfinanceExample example);

    int updateByPrimaryKeySelective(Refundfinance record);

    int updateByPrimaryKey(Refundfinance record);
}