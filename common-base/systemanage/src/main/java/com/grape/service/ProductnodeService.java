package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.ProductnodeAndTaskInfo;
import com.grape.controller.request.NoidRequest;
import com.grape.controller.request.PathNodeRequest;
import com.grape.controller.request.ProductFormRequest;
import com.grape.controller.request.ProductNoRequest;
import com.grape.controller.request.ProductNodeInfoRequest;
import com.grape.controller.request.ProductNodeRequest;
import com.grape.controller.request.ProductRequest;
import com.grape.model.db.Codetask;
import com.grape.model.db.Page;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;

public interface ProductnodeService {

	List<Productnode> selectProductNodeByProductno(ProductNodeInfoRequest req);

	void insertProductnode(ProductNodeRequest req);

	void deleteProductNode(NoidRequest req);

	ProductnodeAndTaskInfo selectProductnodeByNodeidAndType(NoidRequest req);

	void updateProductnode(ProductNodeRequest req);

	void insertPathNodeInfo(PathNodeRequest req);

	List<Codetask> selectAllTaskInfo();

	void updateProductnodeByNodeInfo(ProductNodeRequest req);

	Productnode selectProductnodeByPrimartKey(NoidRequest request);

	List<Product> seleatProductInfo(ProductRequest req);

	void updateProduct(ProductFormRequest req);

	Product selectProductByProductno(String productno);

	void insertProduct(ProductFormRequest req);

	Product selectProductDetail(ProductRequest req);

	void deleteProduct(ProductFormRequest req);

	void publicProduct(ProductFormRequest req);

	List<Page> selectProductPage();

	Integer selectProductNodeCount(ProductNodeInfoRequest req);

	List<Productnode> selectProductnodeByType(ProductNoRequest req);

	void activeProductNode(ProductNodeInfoRequest req);

}
