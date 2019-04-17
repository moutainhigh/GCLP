package com.grape.model.mapper.base;

import com.grape.model.db.Riskapproval;
import com.grape.model.db.RiskapprovalExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RiskapprovalMapper {
    int countByExample(RiskapprovalExample example);

    int deleteByExample(RiskapprovalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Riskapproval record);

    int insertSelective(Riskapproval record);

    List<Riskapproval> selectByExample(RiskapprovalExample example);

    Riskapproval selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Riskapproval record, @Param("example") RiskapprovalExample example);

    int updateByExample(@Param("record") Riskapproval record, @Param("example") RiskapprovalExample example);

    int updateByPrimaryKeySelective(Riskapproval record);

    int updateByPrimaryKey(Riskapproval record);
}