package com.grape.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.DeviceidRequest;
import com.grape.controller.request.EquipmentRequest;
import com.grape.model.db.Equipment;
import com.grape.model.mapper.base.EquipmentMapper;
import com.grape.service.EquipmentService;
import com.grape.util.Util;

@Service
public class EquipmentServiceImpl implements EquipmentService{
	private static final Logger log = LoggerFactory.getLogger(CustinfoServiceImpl.class);
	
	@Autowired
	private EquipmentMapper equipmentMapper ;

	@Override
	public void insertEquipment(EquipmentRequest req) {
		Equipment equipment = new Equipment() ;
		try {
			Util.transferFields(req, equipment);
		} catch (Exception e) {
			log.info("实体转换出错"+e);
		}	
		equipment.setId(Util.getID());
		equipmentMapper.insert(equipment) ;		
	}

	@Override
	public Equipment queryBydeviceid(DeviceidRequest req) {
		return equipmentMapper.selectByPrimaryKey(req.getDeviceid());
	}
	
	
}
