package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.ConsultDao;
import com.grape.repository.entity.Consult;
import com.grape.service.ConsultService;

@Service
public class ConsultServiceImpl implements ConsultService {

	@Autowired
	private ConsultDao ConsultDao;

	@Override
	public List<Consult> findByworkid(String workid,int pagenum, int pagesize){
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Consult Consult=new Consult();
		Consult.setWorkid(workid);
		Example<Consult> example = Example.of(Consult);
		Page<Consult> page = ConsultDao.findAll(example, pageable);
		return page.getContent();
	}
}
