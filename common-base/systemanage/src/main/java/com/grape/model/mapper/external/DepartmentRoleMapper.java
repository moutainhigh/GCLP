package com.grape.model.mapper.external;

import com.grape.controller.reponse.RoleDepartmentResponse;
import com.grape.controller.response.bean.RoleDepartmentBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentRoleMapper {
    List<RoleDepartmentBean> selectByCompno(String organizationno) ;
}
