package com.grape.model.mapper.base;

import com.grape.model.db.Redemptiontype;
import com.grape.model.db.RedemptiontypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RedemptiontypeMapper {
    int countByExample(RedemptiontypeExample example);

    int deleteByExample(RedemptiontypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Redemptiontype record);

    int insertSelective(Redemptiontype record);

    List<Redemptiontype> selectByExample(RedemptiontypeExample example);

    Redemptiontype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Redemptiontype record, @Param("example") RedemptiontypeExample example);

    int updateByExample(@Param("record") Redemptiontype record, @Param("example") RedemptiontypeExample example);

    int updateByPrimaryKeySelective(Redemptiontype record);

    int updateByPrimaryKey(Redemptiontype record);
}