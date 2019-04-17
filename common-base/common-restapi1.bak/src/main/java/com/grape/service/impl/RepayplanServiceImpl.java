package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.RepayplanDao;
import com.grape.repository.entity.Repayplan;
import com.grape.service.RepayplanService;

@Service
public class RepayplanServiceImpl implements RepayplanService {

	@Autowired
	private RepayplanDao repayplanDao;

	@Override
	public List<Repayplan> findByworkid(String workid,int pagenum, int pagesize){
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Repayplan repayplan=new Repayplan();
		repayplan.setWorkid(workid);
		Example<Repayplan> example = Example.of(repayplan);
		Page<Repayplan> page = repayplanDao.findAll(example, pageable);
		return page.getContent();
	}
}
