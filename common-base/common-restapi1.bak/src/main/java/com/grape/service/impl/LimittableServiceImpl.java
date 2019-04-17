package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.LimittableDao;
import com.grape.repository.entity.Limittable;
import com.grape.repository.entity.LimittableKey;
import com.grape.service.LimittableService;

@Service
public class LimittableServiceImpl implements LimittableService {

	@Autowired
	private LimittableDao limittableDao;

	@Override
	public List<Limittable> findByaccountno(String accountno, int pagenum, int pagesize) {
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Limittable limittable=new Limittable();
		LimittableKey limittableKey=new LimittableKey();
		limittableKey.setAccountno(accountno);
		limittable.setLimittableKey(limittableKey);
		Example<Limittable> example = Example.of(limittable);
		Page<Limittable> page = limittableDao.findAll(example, pageable);
		return page.getContent();
	}

	@Override
	public void saveLimittable(Limittable limittable) {
		limittableDao.save(limittable);
	}
}
