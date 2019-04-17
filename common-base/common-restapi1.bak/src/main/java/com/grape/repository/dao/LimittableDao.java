package com.grape.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grape.repository.entity.Limittable;
	
public interface LimittableDao extends JpaRepository<Limittable, String>  {

}
