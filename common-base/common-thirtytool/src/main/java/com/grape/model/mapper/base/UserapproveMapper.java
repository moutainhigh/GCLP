package com.grape.model.mapper.base;

import com.grape.model.db.Userapprove;
import com.grape.model.db.UserapproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserapproveMapper {
    int countByExample(UserapproveExample example);

    int deleteByExample(UserapproveExample example);

    int deleteByPrimaryKey(@Param("arerid") String arerid, @Param("channelno") String channelno, @Param("userid") String userid, @Param("productno") String productno);

    int insert(Userapprove record);

    int insertSelective(Userapprove record);

    List<Userapprove> selectByExample(UserapproveExample example);

    Userapprove selectByPrimaryKey(@Param("arerid") String arerid, @Param("channelno") String channelno, @Param("userid") String userid, @Param("productno") String productno);

    int updateByExampleSelective(@Param("record") Userapprove record, @Param("example") UserapproveExample example);

    int updateByExample(@Param("record") Userapprove record, @Param("example") UserapproveExample example);

    int updateByPrimaryKeySelective(Userapprove record);

    int updateByPrimaryKey(Userapprove record);
}