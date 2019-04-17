package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.RepayfollowDao;
import com.grape.repository.entity.Repayfollow;
import com.grape.service.RepayfollowService;

@Service
public class RepayfollowServiceImpl implements RepayfollowService {

	@Autowired
	private RepayfollowDao RepayfollowDao;

	@Override
	public List<Repayfollow> findByworkid(String workid,int pagenum, int pagesize){
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Repayfollow Repayfollow=new Repayfollow();
		Repayfollow.setWorkid(workid);
		Example<Repayfollow> example = Example.of(Repayfollow);
		Page<Repayfollow> page = RepayfollowDao.findAll(example, pageable);
		return page.getContent();
	}
}
