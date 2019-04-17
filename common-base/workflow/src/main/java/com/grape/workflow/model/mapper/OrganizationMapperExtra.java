package com.grape.workflow.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Organization;

@Mapper
public interface OrganizationMapperExtra {

  Organization  findSupOrgByBnkno(String bnkno);

}