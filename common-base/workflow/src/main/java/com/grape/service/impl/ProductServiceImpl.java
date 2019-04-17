package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Nodebutton;
import com.grape.model.db.NodebuttonExample;
import com.grape.model.db.Nodepage;
import com.grape.model.db.NodepageExample;
import com.grape.model.db.Noderole;
import com.grape.model.db.NoderoleExample;
import com.grape.model.db.Procbranch;
import com.grape.model.db.ProcbranchExample;
import com.grape.model.db.Proccondition;
import com.grape.model.db.ProcconditionExample;
import com.grape.model.db.Proctrans;
import com.grape.model.db.ProctransExample;
import com.grape.model.db.Product;
import com.grape.model.db.ProductExample;
import com.grape.model.db.Productnode;
import com.grape.model.db.ProductnodeExample;
import com.grape.model.mapper.base.NodebuttonMapper;
import com.grape.model.mapper.base.NodepageMapper;
import com.grape.model.mapper.base.NoderoleMapper;
import com.grape.model.mapper.base.ProcbranchMapper;
import com.grape.model.mapper.base.ProcconditionMapper;
import com.grape.model.mapper.base.ProctransMapper;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.model.mapper.base.ProductnodeMapper;
import com.grape.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private ProductnodeMapper productnodeMapper;
	
	@Autowired
	private NodepageMapper nodepageMapper;
	
	@Autowired
	private NoderoleMapper noderoleMapper;
	
	@Autowired
	private NodebuttonMapper nodebuttonMapper;
	
	@Autowired
	private ProcbranchMapper procbranchMapper;
	
	@Autowired
	private ProcconditionMapper procconditionMapper;
	
	@Autowired
	private ProctransMapper proctransMapper;
	
	@Override
	public List<Product> getAllProduct() {
		
		ProductExample example = new ProductExample();
		return productMapper.selectByExample(example);
	}

	@Override
	public List<Nodepage> getNodepagesForProduct(String productno, String nodeid) {
		NodepageExample example = new NodepageExample();
		
		example.createCriteria().andProductnoEqualTo(productno).andNodeidEqualTo(nodeid);
		
		return nodepageMapper.selectByExample(example);
	}

	@Override
	public List<Noderole> getNoderolesForProduct(String productno, String nodeid) {
		NoderoleExample example = new NoderoleExample();
		
		example.createCriteria().andProductnoEqualTo(productno).andNodeidEqualTo(nodeid);
		
		return noderoleMapper.selectByExample(example);
	}

	@Override
	public List<Productnode> getProductnodeForProduct(String productno) {
		ProductnodeExample example = new ProductnodeExample();
		
		example.createCriteria().andProductnoEqualTo(productno);
		
		return productnodeMapper.selectByExample(example);
	}

	@Override
	public List<Nodebutton> getNodeBtns(String productno, String nodeid) {
		NodebuttonExample example = new NodebuttonExample();
	
		example.createCriteria().andProductnoEqualTo(productno).andNodeidEqualTo(nodeid);
		
		return nodebuttonMapper.selectByExample(example);
	}

	@Override
	public List<Procbranch> getBranches(String nodeid) {
		ProcbranchExample example = new ProcbranchExample();
	
		example.createCriteria().andNodeidEqualTo(nodeid);
		
		return procbranchMapper.selectByExample(example);
	}

	@Override
	public List<Proctrans> getProctrans(String buttonid) {
		ProctransExample example = new ProctransExample();
		
		example.createCriteria().andButtonidEqualTo(buttonid);
		
		return proctransMapper.selectByExample(example);
	}

	@Override
	public List<Proccondition> getProcconditions(String nodeid) {
		ProcconditionExample example = new ProcconditionExample();
		
		example.createCriteria().andNodeidEqualTo(nodeid);
		
		return procconditionMapper.selectByExample(example);
	}

	@Override
	public Product getProductById(String productno) {
		return productMapper.selectByPrimaryKey(productno);
	}

	@Override
	public Productnode getProductnodeByPrimarykey(String type, String nodeid) {
		return productnodeMapper.selectByPrimaryKey(type, nodeid);
	}

	@Override
	public Productnode getAppealToNode(String productno, String nodename) {
		ProductnodeExample example = new ProductnodeExample();
		example.createCriteria().andProductnoEqualTo(productno).andNodenameEqualTo(nodename);
		List<Productnode> list = productnodeMapper.selectByExample(example);
		if(list==null || list.isEmpty()){
			return null;
		}
		return list.get(0);
	}

}
