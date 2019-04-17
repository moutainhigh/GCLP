package com.grape.service;

import java.util.List;

import com.grape.controller.request.DelimortRequest;
import com.grape.model.db.Delimortgage;

public interface DelimortgageService {

	Delimortgage queryDelimortgageById(String id);

	void deleteDelimort(String id);

	List<Delimortgage> queryDelimortgageByWorkid(String workid);

	List<Delimortgage> queryAllDelimortgage(int pagenum, int pagesize);

	void updateDelimort(DelimortRequest req);
	
	void insertDelimort(DelimortRequest req);

	void insertDelimort(Delimortgage mort) ;

    void deleteByExample(String workid);

	void deleteDeliCustinfoByExample(String workid);
}
