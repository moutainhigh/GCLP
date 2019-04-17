package com.grape.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.ReservationsRequest;
import com.grape.model.db.Reservations;
import com.grape.model.db.ReservationsExample;
import com.grape.model.mapper.base.ReservationsMapper;
import com.grape.service.ReservationsService;
import com.grape.util.Util;
@Service
public class ReservationsServiceImpl implements ReservationsService{
	private static final Logger log = LoggerFactory.getLogger(ReservationsServiceImpl.class);
	
	@Autowired
	private ReservationsMapper reservationsMapper ;

	@Override
	public Reservations queryByWorkid(String workid) {
		ReservationsExample example = new ReservationsExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Reservations> reser = reservationsMapper.selectByExample(example);
		if(!reser.isEmpty()){
			return reser.get(0);
		}
		return null;
	}
	
	@Override
	public void insertfacesign(ReservationsRequest req, FlowHandleResponse res) {
		Reservations reser = new Reservations() ;
		try {
			Util.transferFields(req, reser);
		} catch(Exception e) {
			log.info("实体类转换出错" , e);
		}
		if(res!=null){
			reser.setId(res.getLogid());
			reser.setWorkid(req.getWorkid());
			reservationsMapper.insertSelective(reser) ;
		}
	}

	@Override
	public Reservations queryByid(String id) {
		ReservationsExample example = new ReservationsExample();
		example.createCriteria().andIdEqualTo(id);
		List<Reservations> list = reservationsMapper.selectByExample(example);
		if(list!=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}


}
