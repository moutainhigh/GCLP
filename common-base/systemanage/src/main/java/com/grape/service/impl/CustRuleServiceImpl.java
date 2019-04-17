package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.grape.controller.request.CustruleOptionRequest;
import com.grape.controller.response.bean.CustruleByOptionBean;
import com.grape.model.db.Custrule;
import com.grape.model.db.CustruleExample;
import com.grape.model.mapper.base.CustruleMapper;
import com.grape.model.mapper.external.CustruleExMapper;
import com.grape.service.CustruleService;
import com.grape.util.Util;

@Service
public class CustRuleServiceImpl implements CustruleService {
    @Autowired
    private CustruleMapper custruleMapper ;
    @Autowired
    private CustruleExMapper custruleExMapper ;

    @Override
    public List<Custrule> selectAllCustrule() {
        CustruleExample custruleExample = new CustruleExample() ;
        custruleExample.createCriteria() ;
        List<Custrule> custrules = custruleMapper.selectByExample(custruleExample);
        if(!CollectionUtils.isEmpty(custrules)) {
            return custrules ;
        }
        return null;
    }

    @Override
    public List<Custrule> selectByOption(CustruleOptionRequest req) {
    	CustruleByOptionBean bean = new CustruleByOptionBean();
    	bean.setRulename(req.getRulename());
    	bean.setStatus(req.getStatus());
    	bean.setPagenum(req.getPagenum());
    	bean.setPagesize(req.getPagesize());
        List<Custrule> custrules = custruleExMapper.queryCustruleByOption(bean);
        return custrules;
    }

    @Override
    public Custrule selectById(String id) {
        Custrule custrule = custruleMapper.selectByPrimaryKey(id) ;
        return custrule;
    }

    @Override
    public void updateCustruleById(Custrule custrule) {
    	custrule.setChgtm(new Date());
    	custrule.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        custruleMapper.updateByPrimaryKeySelective(custrule) ;
    }

    @Override
    public void insertCustrule(Custrule custrule) {
    	custrule.setId(Util.getID());
    	custrule.setChgtm(new Date());
    	custrule.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        custruleMapper.insertSelective(custrule) ;
    }

    @Override
    public void deleteCustrule(String id) {
        custruleMapper.deleteByPrimaryKey(id) ;
    }

	@Override
	public Integer selectByOptionCount(CustruleOptionRequest request) {
		CustruleByOptionBean bean = new CustruleByOptionBean();
    	bean.setRulename(request.getRulename());
    	bean.setStatus(request.getStatus());
        Integer count = custruleExMapper.queryCustruleByOptionCount(bean);
        return count;
	}
}
