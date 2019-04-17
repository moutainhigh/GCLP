package com.grape.service;

import com.grape.controller.request.RoleRequest;
import com.grape.controller.response.bean.PersonBean;
import com.grape.controller.response.bean.RolePersonBean;
import com.grape.controller.response.bean.RolePersonBean1;
import com.grape.model.db.Noderole;
import com.grape.model.db.Person;
import com.grape.model.db.Role;

import java.util.List;

public interface RoleService {
    List<Role> selectSameOrg(String organizationno) ;

    List<Person> selectAllPerson(PersonBean bean) ;

    List<Role> selectAllRole(String nodeid) ;

    void updateNodeRole(List<Noderole> noderoles,String nodeid) ;

    RolePersonBean selectByRoleid(String roleid) ;

    void insertRole(Role role) ;

    void updateRole(Role role) ;
}
