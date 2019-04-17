package com.grape.service.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.grape.repository.dao.GoodsDao;
import com.grape.repository.entity.Goods;
import com.grape.service.GoodService;

@Service
public class GoodServiceImpl implements GoodService {

	@Autowired
	private GoodsDao goodsDao;	
	
	@Override
	public List<Goods> getGoodsByName(String name, int pagenum, int pagesize) {
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Page<Goods> page = goodsDao.findByName(name, pageable);
		return page.getContent();
	}

	@Override
	public List<Goods> getGoodsByName2(String name, int pagenum, int pagesize) {
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Page<Goods> page = goodsDao.findAll(new Specification<Goods>() {
			@Override
			public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.equal(root.get("name"), name);
			}
		}, pageable);
		return page.getContent();
	}

	@Override
	public List<Goods> getGoodsByName3(String name, int pagenum, int pagesize) {
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Page<Goods> page = goodsDao.findByName2(name, pageable);
		return page.getContent();
	}
	
	@Override
	public List<Map<String, Object>> getGoodsByName4(String name, int pagenum, int pagesize) {
		Pageable pageable = new PageRequest(pagenum,pagesize);
		Page<Map<String, Object>> page = goodsDao.findByName3(name, pageable);
		return page.getContent();
	}
}
