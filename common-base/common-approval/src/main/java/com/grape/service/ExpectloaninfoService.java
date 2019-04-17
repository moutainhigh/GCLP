package com.grape.service;


import com.grape.controller.request.ExpectloaninfoRequest;
import com.grape.controller.request.ProductnoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.Product;

public interface ExpectloaninfoService {

	Exceptloaninfo queryAssetByWorkid(WorkidRequest req);

	void insertExpectloaninfo(ExpectloaninfoRequest req);

	void updateExpectloaninfo(ExpectloaninfoRequest req);

	void deleteExpectloaninfo(WorkidRequest req);

	Exceptloaninfo queryAssetByWorkid(String workid);

	Product selectRepayMethod(ProductnoRequest req);

}
