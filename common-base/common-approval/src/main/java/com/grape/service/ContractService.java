package com.grape.service;

import java.util.List;

import com.grape.controller.request.ContractRequest;
import com.grape.controller.request.ProductnoAndAeraAndChannelnoRequest;
import com.grape.model.db.Contract;

public interface ContractService {
	
	void insertContract(ContractRequest req) ;
	
	List<Contract> selectContract(ProductnoAndAeraAndChannelnoRequest req) ;

	List<Contract> selectContracts(ProductnoAndAeraAndChannelnoRequest request) ;
	
}
