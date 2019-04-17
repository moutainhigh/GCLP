package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.bean.ProductView;
import com.grape.model.mapper.PageBean;

public interface ProductService {
	
	ProductView findByProducttype(String workerid,String city,String producttype,PageBean pageBean);
	
	List<ProductView> findProductAll(PageBean pageBean);
	
	String findContentByProductno(String productno);
	
	boolean ProductUse(String productno,String citycode,String workerid);
}
