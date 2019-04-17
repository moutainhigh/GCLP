package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.RepayinfoDao;
import com.grape.repository.entity.Repayinfo;
import com.grape.service.RepayinfoService;

@Service
public class RepayinfoServiceImpl implements RepayinfoService {

	@Autowired
	private RepayinfoDao RepayinfoDao;

	@Override
	public List<Repayinfo> findByworkid(String workid,int pagenum, int pagesize){
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Repayinfo Repayinfo=new Repayinfo();
		Repayinfo.setWorkid(workid);
		Example<Repayinfo> example = Example.of(Repayinfo);
		Page<Repayinfo> page = RepayinfoDao.findAll(example, pageable);
		return page.getContent();
	}
}
