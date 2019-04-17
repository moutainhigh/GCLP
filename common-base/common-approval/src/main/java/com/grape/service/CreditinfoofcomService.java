package com.grape.service;

import java.util.List;

import com.grape.controller.request.CreditinfoofcomRequest;
import com.grape.model.db.Creditinfoofcom;

public interface CreditinfoofcomService {

	public Creditinfoofcom queryByWorkid(String workid);

	void saveCreditinfoofcom(CreditinfoofcomRequest req);

	void deleteCreditinfoofcom(String workid);

	void insertCreditinfoofcom(CreditinfoofcomRequest req);

}
