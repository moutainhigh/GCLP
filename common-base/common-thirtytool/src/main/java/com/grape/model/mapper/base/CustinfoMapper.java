package com.grape.model.mapper.base;

import com.grape.model.db.Custinfo;
import com.grape.model.db.CustinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustinfoMapper {
    int countByExample(CustinfoExample example);

    int deleteByExample(CustinfoExample example);

    int deleteByPrimaryKey(@Param("workid") String workid, @Param("cerdid") String cerdid);

    int insert(Custinfo record);

    int insertSelective(Custinfo record);

    List<Custinfo> selectByExampleWithBLOBs(CustinfoExample example);

    List<Custinfo> selectByExample(CustinfoExample example);

    Custinfo selectByPrimaryKey(@Param("workid") String workid, @Param("cerdid") String cerdid);

    int updateByExampleSelective(@Param("record") Custinfo record, @Param("example") CustinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Custinfo record, @Param("example") CustinfoExample example);

    int updateByExample(@Param("record") Custinfo record, @Param("example") CustinfoExample example);

    int updateByPrimaryKeySelective(Custinfo record);

    int updateByPrimaryKeyWithBLOBs(Custinfo record);

    int updateByPrimaryKey(Custinfo record);
}