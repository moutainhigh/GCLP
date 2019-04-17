package com.grape.model.mapper.base;

import com.grape.model.db.Riskapprovalform;
import com.grape.model.db.RiskapprovalformExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RiskapprovalformMapper {
    int countByExample(RiskapprovalformExample example);

    int deleteByExample(RiskapprovalformExample example);

    int deleteByPrimaryKey(String id);

    int insert(Riskapprovalform record);

    int insertSelective(Riskapprovalform record);

    List<Riskapprovalform> selectByExample(RiskapprovalformExample example);

    Riskapprovalform selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Riskapprovalform record, @Param("example") RiskapprovalformExample example);

    int updateByExample(@Param("record") Riskapprovalform record, @Param("example") RiskapprovalformExample example);

    int updateByPrimaryKeySelective(Riskapprovalform record);

    int updateByPrimaryKey(Riskapprovalform record);
}