package com.grape.service;

import java.util.List;

import com.grape.repository.entity.Repayfollow;

public interface RepayfollowService {

	List<Repayfollow> findByworkid(String workid,int pagenum, int pagesize);
	
}
