package com.grape.service;

import java.util.List;

import com.grape.controller.request.IncomeofcomRequest;
import com.grape.model.db.Incomeofcom;

public interface IncomeofcomService {

	public Incomeofcom queryByWorkidAndComno(String workid,String comno);

	void saveIncomeofcom(IncomeofcomRequest req);

	public void deleteIncomeofcom(String workid,String comno);

	void insertIncomeofcom(IncomeofcomRequest req);

}
