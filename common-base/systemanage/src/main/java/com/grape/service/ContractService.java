package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.ConstractBean;
import com.grape.controller.request.ContractFormRequest;
import com.grape.controller.request.ContractRequest;
import com.grape.controller.request.ContractStateRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Area;
import com.grape.model.db.Contract;

public interface ContractService {

	List<ConstractBean> selectContractInfo(ContractRequest req);

	void insertContract(ContractFormRequest req);

	Contract selectContractDetai(IdRequest req);

	void updateContract(ContractFormRequest req);

	void deleteContract(IdRequest req);

	void activeContract(ContractStateRequest req);

	Integer selectContractInfoCount(ContractRequest req);

	List<Area> selectAreaInfo();

}
