package com.grape.model.mapper.base;

import com.grape.model.db.Profiles;
import com.grape.model.db.ProfilesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProfilesMapper {
    int countByExample(ProfilesExample example);

    int deleteByExample(ProfilesExample example);

    int deleteByPrimaryKey(String fileno);

    int insert(Profiles record);

    int insertSelective(Profiles record);

    List<Profiles> selectByExample(ProfilesExample example);

    Profiles selectByPrimaryKey(String fileno);

    int updateByExampleSelective(@Param("record") Profiles record, @Param("example") ProfilesExample example);

    int updateByExample(@Param("record") Profiles record, @Param("example") ProfilesExample example);

    int updateByPrimaryKeySelective(Profiles record);

    int updateByPrimaryKey(Profiles record);
}