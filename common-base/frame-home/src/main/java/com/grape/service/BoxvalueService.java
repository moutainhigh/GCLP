package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.OrganizationInfoResponse;
import com.grape.controller.reponse.ProductInfoResponse;
import com.grape.model.db.Area;
import com.grape.model.db.Codetable;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;

public interface BoxvalueService {
	
	List<Product> getProduct();
	
	ProductInfoResponse productInfoResponse();
	
	List<Productnode> getProductnode(String productno);
	
	List<Codetable> getLog();
	
	List<Area> getArea();
	
	OrganizationInfoResponse organizationInfoResponse();
	
}
