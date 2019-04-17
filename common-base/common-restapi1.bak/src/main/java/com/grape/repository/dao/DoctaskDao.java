package com.grape.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grape.repository.entity.Doctask;
	
public interface DoctaskDao extends JpaRepository<Doctask, String>  {

	Doctask findByworkid(String workid);
    
}
