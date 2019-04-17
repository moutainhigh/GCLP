package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Doctask;
import com.grape.model.db.Product;
import com.grape.model.mapper.base.DoctaskMapper;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.service.DoctaskService;

@Service
public class DoctaskServiceImpl implements DoctaskService{

	@Autowired
	DoctaskMapper doctaskMapper;
	
	@Autowired
	ProductMapper productMapper;
	@Override
	public Doctask findByWorkid(String workid) {
		
		return doctaskMapper.selectByPrimaryKey(workid);
	}
	@Override
	public Product findProductByNo(String productNo) {
		
		return productMapper.selectByPrimaryKey(productNo);
	}
	
	
}
