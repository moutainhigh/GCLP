package com.grape.service;

import java.util.List;

import com.grape.repository.entity.Limittable;

public interface LimittableService {

	List<Limittable> findByaccountno(String accountno,int pagenum, int pagesize);
	
	void saveLimittable(Limittable limittable);
	
}
