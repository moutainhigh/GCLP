package com.grape.model.mapper.external;

import com.grape.model.db.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonExMapper {
    List<Person> selectByTerm(Person person) ;
}
