package com.grape.service;

import java.util.List;

import com.grape.controller.bean.WorkitemBean;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;

public interface ProductnodeService {
	
	List<Productnode> selectProcessDate() ;
	
	List<Productnode> selectByNodeid(String nodeid) ;

	List<Product> selectRepayMethod(String productndode);

	List<WorkitemBean> selectNodenameByWorkid(String workid);
}
