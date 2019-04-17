package com.grape.service;

import java.util.List;

import com.grape.model.db.Nodebutton;
import com.grape.model.db.Nodepage;
import com.grape.model.db.Noderole;
import com.grape.model.db.Procbranch;
import com.grape.model.db.Proccondition;
import com.grape.model.db.Proctrans;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;

public interface ProductService {
	
	Product getProductById(String productno);

	List<Product> getAllProduct();

	List<Nodepage> getNodepagesForProduct(String productno,String nodeid);

	List<Noderole> getNoderolesForProduct(String productno,String nodeid);

	List<Productnode> getProductnodeForProduct(String productno);

	List<Nodebutton> getNodeBtns(String productno,String nodeid);

	List<Procbranch> getBranches(String nodeid);

	List<Proctrans> getProctrans(String nodeid);

	List<Proccondition> getProcconditions(String nodeid);
	
	Productnode getProductnodeByPrimarykey(String type,String nodeid);
	
	Productnode getAppealToNode(String productno,String nodename);
	
}
