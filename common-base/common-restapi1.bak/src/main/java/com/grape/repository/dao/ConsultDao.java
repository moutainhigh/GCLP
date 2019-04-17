package com.grape.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grape.repository.entity.Consult;
	
public interface ConsultDao extends JpaRepository<Consult, String>  {

}
