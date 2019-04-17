package com.grape.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.ConstractBean;
import com.grape.controller.request.ContractFormRequest;
import com.grape.controller.request.ContractRequest;
import com.grape.controller.request.ContractStateRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Area;
import com.grape.model.db.AreaExample;
import com.grape.model.db.Contract;
import com.grape.model.mapper.base.AreaMapper;
import com.grape.model.mapper.base.ContractMapper;
import com.grape.model.mapper.external.ContractExMapper;
import com.grape.service.ContractService;
import com.grape.util.Util;
@Service
public class ContractServiceImpl implements ContractService{
	@Autowired
	private ContractExMapper contractExMapper;
	
	@Autowired
	private ContractMapper contractMapper;
	
	@Autowired
	private AreaMapper areaMapper;
	
	@Override
	public List<ConstractBean> selectContractInfo(ContractRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getArea()!=null && !"".equals(req.getArea())){
			map.put("area", req.getArea());
		}
		if(req.getChanno()!=null && !"".equals(req.getChanno())){
			map.put("channo", req.getChanno());
		}
		if(req.getConstractname()!=null && !"".equals(req.getConstractname())){
			map.put("contractname", req.getConstractname());
		}
		if(req.getProductno()!=null && !"".equals(req.getProductno())){
			map.put("productno", req.getProductno());
		}
		if(req.getState()!=null && !"".equals(req.getState())){
			map.put("state", req.getState());
		}
		map.put("pagenum", req.getPagenum());
		map.put("pagesize", req.getPagesize());
		List<ConstractBean> list = contractExMapper.selectContractInfo(map);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}
	@Override
	public void insertContract(ContractFormRequest req) {
		Contract contract = new Contract();
		try {
			Util.transferFields(req, contract);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contract.setState("0");
		contract.setId(Util.getID());
		contract.setChgdt(new Date());
		contract.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		contractMapper.insertSelective(contract);
	}
	@Override
	public Contract selectContractDetai(IdRequest req) {
		Contract contract =contractMapper.selectByPrimaryKey(req.getId());
		return contract;
	}
	@Override
	public void updateContract(ContractFormRequest req) {
		Contract contract = new Contract();
		try {
			Util.transferFields(req, contract);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contract.setChgdt(new Date());
		contract.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		contractMapper.updateByPrimaryKey(contract);
		
	}
	@Override
	public void deleteContract(IdRequest req) {
		contractMapper.deleteByPrimaryKey(req.getId());
		
	}
	@Override
	public void activeContract(ContractStateRequest req) {
		Contract contract = new Contract();
		contract.setId(req.getId());
		contract.setState(req.getState());
		contractMapper.updateByPrimaryKeySelective(contract);
	}
	@Override
	public Integer selectContractInfoCount(ContractRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getArea()!=null && !"".equals(req.getArea())){
			map.put("area", req.getArea());
		}
		if(req.getChanno()!=null && !"".equals(req.getChanno())){
			map.put("channo", req.getChanno());
		}
		if(req.getConstractname()!=null && !"".equals(req.getConstractname())){
			map.put("contractname", req.getConstractname());
		}
		if(req.getProductno()!=null && !"".equals(req.getProductno())){
			map.put("productno", req.getProductno());
		}
		if(req.getState()!=null && !"".equals(req.getState())){
			map.put("state", req.getState());
		}
		Integer count = contractExMapper.selectContractInfoCount(map);
		return count;
	}
	@Override
	public List<Area> selectAreaInfo() {
		AreaExample example = new AreaExample();
		example.createCriteria().andSuperiorareaIsNull();
		return areaMapper.selectByExample(example);
	}

}
