package com.grape.service;

import com.grape.controller.request.DeviceidRequest;
import com.grape.controller.request.EquipmentRequest;
import com.grape.model.db.Equipment;

public interface EquipmentService {
	void insertEquipment(EquipmentRequest req) ;
	
	public Equipment queryBydeviceid(DeviceidRequest req) ;

}
