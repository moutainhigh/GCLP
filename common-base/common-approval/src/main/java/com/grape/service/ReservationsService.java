package com.grape.service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.ReservationsRequest;
import com.grape.model.db.Reservations;

public interface ReservationsService {
	void insertfacesign(ReservationsRequest req, FlowHandleResponse res);
	
	public Reservations queryByWorkid(String workid) ;

	Reservations queryByid(String id);
}
