package com.grape.service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.VisaRequest;
import com.grape.model.db.Visa;

public interface VisaService {
	public Visa queryByWorkid(String workid) ;
	
	void insertVisa(VisaRequest req, FlowHandleResponse res) ;

	public Visa queryId(String id);
}
