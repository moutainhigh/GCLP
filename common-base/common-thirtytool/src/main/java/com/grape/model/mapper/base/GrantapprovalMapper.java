package com.grape.model.mapper.base;

import com.grape.model.db.Grantapproval;
import com.grape.model.db.GrantapprovalExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GrantapprovalMapper {
    int countByExample(GrantapprovalExample example);

    int deleteByExample(GrantapprovalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Grantapproval record);

    int insertSelective(Grantapproval record);

    List<Grantapproval> selectByExampleWithBLOBs(GrantapprovalExample example);

    List<Grantapproval> selectByExample(GrantapprovalExample example);

    Grantapproval selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Grantapproval record, @Param("example") GrantapprovalExample example);

    int updateByExampleWithBLOBs(@Param("record") Grantapproval record, @Param("example") GrantapprovalExample example);

    int updateByExample(@Param("record") Grantapproval record, @Param("example") GrantapprovalExample example);

    int updateByPrimaryKeySelective(Grantapproval record);

    int updateByPrimaryKeyWithBLOBs(Grantapproval record);

    int updateByPrimaryKey(Grantapproval record);
}