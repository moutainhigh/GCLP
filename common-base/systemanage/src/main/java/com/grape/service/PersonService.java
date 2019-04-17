package com.grape.service;

import com.grape.controller.request.CompanyRequest;
import com.grape.controller.request.DepnoRequest;
import com.grape.controller.request.PersonRequest;
import com.grape.model.db.Person;
import com.grape.model.db.Userrole;

import java.util.List;

public interface PersonService {
    //新增
    void inseretPerson(PersonRequest request) ;

    //删除
    void deletePerson(PersonRequest request) ;

    //修改
    void alterPerson(PersonRequest request) ;

    //查询
    List<Person> selectPersonByTerm(PersonRequest request) ;

	void updatePersonInfoByWorkeridAndComno(CompanyRequest req);

	List<Person> selectPersonListByDepno(DepnoRequest req);

	List<Person> selectPersonListByDepnoAndComno(String departmentno, String organizationno);

	List<Person> selectPersonByComno(String comno);

	Person selectPersonByWorkerid(String chgtl);

	List<Userrole> selectUserRoleByWorkerid(String workerid);
}
