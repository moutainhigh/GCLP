package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.bean.WorkitemBean;
import com.grape.model.db.Product;
import com.grape.model.db.ProductExample;
import com.grape.model.db.Productnode;
import com.grape.model.db.ProductnodeExample;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.model.mapper.base.ProductnodeMapper;
import com.grape.model.mapper.external.ProductnodeExMapper;
import com.grape.service.ProductnodeService;

@Service
public class ProductnodeServiceImpl implements ProductnodeService{

	@Autowired
	private ProductnodeExMapper productnodeExMapper ;
	@Autowired
	private ProductnodeMapper productnodeMapper ;
	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Productnode> selectProcessDate() {
		
		return productnodeExMapper.selectProDate();
	}

	@Override
	public List<Productnode> selectByNodeid(String nodeid) {
		ProductnodeExample exam = new ProductnodeExample() ;
		exam.createCriteria().andNodeidEqualTo(nodeid) ;
		return productnodeMapper.selectByExample(exam);
	}

	@Override
	public List<Product> selectRepayMethod(String productndode) {
		ProductExample example = new ProductExample();
		example.createCriteria().andProductnoEqualTo(productndode);
		return productMapper.selectByExample(example);
	}

	@Override
	public List<WorkitemBean> selectNodenameByWorkid(String workid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		return productnodeExMapper.selectNameByWorkid(map);
	}

}
