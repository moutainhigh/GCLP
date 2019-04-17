package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Productnode;
import com.grape.model.db.ProductnodeExample;
import com.grape.model.mapper.base.ProductnodeMapper;
import com.grape.service.ProductnodeService;

@Service
public class ProductnodeServiceImpl implements ProductnodeService {

	@Autowired
	ProductnodeMapper productnodeMapper;
	@Override
	public Productnode findByNodeid(String nodeid) {
		ProductnodeExample example = new ProductnodeExample();
		example.createCriteria().andNodeidEqualTo(nodeid);
		List<Productnode> productnodes = productnodeMapper.selectByExample(example);
		if(!productnodes.isEmpty()){
			return productnodes.get(0);
		}
		return null;
	}


}
