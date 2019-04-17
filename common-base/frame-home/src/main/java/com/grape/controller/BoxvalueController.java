package com.grape.controller;


import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.OrganizationInfoResponse;
import com.grape.controller.reponse.ProductInfoResponse;
import com.grape.controller.request.ProductnodeRequest;
import com.grape.model.db.Area;
import com.grape.model.db.Codetable;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.service.BoxvalueService;

@RestController
@RequestMapping("/box")
@Validated
public class BoxvalueController {
	
	@Autowired
	private BoxvalueService boxvalueService;
	
	@ApiOperation(value = "查询产品下拉框",httpMethod="POST",notes="",response=Product.class)
	@RequestMapping("/getProduct")
	public List<Product> getProduct() {
		return boxvalueService.getProduct();
	}
	
	@ApiOperation(value = "查询产品下拉框(Android)",httpMethod="POST",notes="",response=ProductInfoResponse.class)
	@RequestMapping("/productInfoResponse")
	public ProductInfoResponse productInfoResponse() {
		return boxvalueService.productInfoResponse();
	}
	
	@ApiOperation(value = "流水状态下拉框",httpMethod="POST",notes="",response=Productnode.class)
	@RequestMapping("/getProductnode")
	public List<Productnode> getProductnode(@Validated @RequestBody ProductnodeRequest productnodeRequest) {
		return boxvalueService.getProductnode(productnodeRequest.getProductno());
	}
	
	@ApiOperation(value = "日志类型下拉框",httpMethod="POST",notes="",response=Codetable.class)
	@RequestMapping("/getLog")
	public List<Codetable> getLog() {
		return boxvalueService.getLog();
	}
	
	@ApiOperation(value = "城市下拉框",httpMethod="POST",notes="",response=Area.class)
	@RequestMapping("/getArea")
	public List<Area> getArea() {
		return boxvalueService.getArea();
	}
	
	@ApiOperation(value = "企业下拉框",httpMethod="POST",notes="",response=OrganizationInfoResponse.class)
	@RequestMapping("/organizationInfoResponse")
	public OrganizationInfoResponse organizationInfoResponse() {
		return boxvalueService.organizationInfoResponse();
	}
}
