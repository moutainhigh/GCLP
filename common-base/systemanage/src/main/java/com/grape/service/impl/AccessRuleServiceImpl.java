package com.grape.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.request.AccessRuleFormRequest;
import com.grape.controller.request.AccessRuleRequest;
import com.grape.controller.request.AccessRuleStateRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Accessrule;
import com.grape.model.mapper.base.AccessruleMapper;
import com.grape.model.mapper.external.ProductnodeExMapper;
import com.grape.service.AccessRuleService;
import com.grape.util.Util;

@Service
public class AccessRuleServiceImpl implements AccessRuleService{
	private static final Logger log = LoggerFactory.getLogger(AccessRuleService.class);
	@Autowired
	private AccessruleMapper accessRuleMapper;
	
	@Autowired
	private ProductnodeExMapper productnodeExMapper;
	@Override
	public List<Accessrule> selectAccessRule(AccessRuleRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getProductno()!=null && !"".equals(req.getProductno())){
			map.put("productno", req.getProductno());
		}
		if(req.getRuletype()!=null && !"".equals(req.getRuletype())){
			map.put("ruletype", req.getRuletype());
		}
		if(req.getRulename()!=null && !"".equals(req.getRulename())){
			map.put("rulename", req.getRulename());
		}
		map.put("pagenum", req.getPagenum());
		map.put("pagesize", req.getPagesize());
		List<Accessrule> accessrules = productnodeExMapper.selectAccessRule(map);
		if(accessrules!=null && accessrules.size()>0){
			return accessrules;
		}
		return null;
	}

	@Override
	public void insertAccessRule(AccessRuleFormRequest req) {
		Accessrule accessrule = new Accessrule();
		try {
			Util.transferFields(req, accessrule);
			accessrule.setId(Util.getID());
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		accessrule.setState("0");
		accessrule.setChgdt(new Date());
		accessrule.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		accessRuleMapper.insertSelective(accessrule);
	}

	@Override
	public void deleteAccessRule(IdRequest req) {
		accessRuleMapper.deleteByPrimaryKey(req.getId());
		
	}

	@Override
	public Accessrule selectAccessRuleById(IdRequest req) {
		Accessrule accessrule = accessRuleMapper.selectByPrimaryKey(req.getId());
		return accessrule;
	}

	@Override
	public void updateAccessRule(AccessRuleFormRequest req) {
		Accessrule accessrule = new Accessrule();
		try {
			Util.transferFields(req, accessrule);
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		accessrule.setChgdt(new Date());
		accessrule.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		accessRuleMapper.updateByPrimaryKey(accessrule);
		
	}

	@Override
	public void activeAccessRule(AccessRuleStateRequest req) {
		String state = req.getState();
		String id = req.getId();
		Accessrule accessrule = new Accessrule();
		accessrule.setId(id);
		accessrule.setState(state);
		accessRuleMapper.updateByPrimaryKeySelective(accessrule);
	}

	@Override
	public Integer selectAccessRuleCount(AccessRuleRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getProductno()!=null && !"".equals(req.getProductno())){
			map.put("productno", req.getProductno());
		}
		if(req.getRuletype()!=null && !"".equals(req.getRuletype())){
			map.put("ruletype", req.getRuletype());
		}
		if(req.getRulename()!=null && !"".equals(req.getRulename())){
			map.put("rulename", req.getRulename());
		}
		Integer count = productnodeExMapper.selectAccessRuleCount(map);
		return count;
	}
}
