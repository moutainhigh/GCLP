package com.grape.service;

import com.grape.controller.request.NotarizationRequest;
import com.grape.model.db.Notarization;

public interface NotarizationService {
	public Notarization queryByWorkid(NotarizationRequest req) ;
	
	void insertNotarize(NotarizationRequest req) ;
}
