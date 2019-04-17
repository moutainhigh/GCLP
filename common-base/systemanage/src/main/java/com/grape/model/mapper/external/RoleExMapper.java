package com.grape.model.mapper.external;

import com.grape.controller.response.bean.PersonBean;
import com.grape.controller.response.bean.RolePersonBean;
import com.grape.controller.response.bean.RolePersonBean1;
import com.grape.model.db.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleExMapper {
    List<Role> selectAllPerson(PersonBean bean) ;

    List<RolePersonBean1> selectByRoleid(Map<String , Object> map) ;
}
