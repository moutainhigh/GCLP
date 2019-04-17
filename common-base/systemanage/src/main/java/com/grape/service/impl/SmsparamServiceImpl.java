package com.grape.service.impl;

import com.grape.controller.request.SmsparamOptionRequest;
import com.grape.controller.response.bean.SmsparamByOptionBean;
import com.grape.model.db.Smsparam;
import com.grape.model.db.SmsparamExample;
import com.grape.model.mapper.base.SmsparamMapper;
import com.grape.model.mapper.external.SmsparamExMapper;
import com.grape.service.SmsparamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SmsparamServiceImpl implements SmsparamService {
    @Autowired
    private SmsparamMapper smsparamMapper ;
    @Autowired
    private SmsparamExMapper smsparamExMapper ;

    @Override
    public List<Smsparam> selectAllSmsparam() {
        SmsparamExample smsparamExample = new SmsparamExample() ;
        smsparamExample.createCriteria() ;
        List<Smsparam> smsparams = smsparamMapper.selectByExample(smsparamExample);
        if(!CollectionUtils.isEmpty(smsparams)) {
            return smsparams ;
        }else {
            return null ;
        }
    }

    @Override
    public List<Smsparam> selectByOption(SmsparamOptionRequest request) {
        Map<String , Object> map = new HashMap<>() ;
        if(!StringUtils.isEmpty(request.getTemplatecode())) {
            map.put("templatecode" , request.getTemplatecode()) ;
        }
        if(!StringUtils.isEmpty(request.getSendflg())) {
            map.put("sendflg" , request.getSendflg()) ;
        }
        if(!StringUtils.isEmpty(request.getSendtype())) {
            map.put("sendtype" , request.getSendtype()) ;
        }
        if(!StringUtils.isEmpty(request.getProductno())) {
            map.put("productno" , request.getProductno()) ;
        }
        map.put("pagenum", (request.getPagenum()-1)*request.getPagesize());
        map.put("pagesize", request.getPagesize());
        List<Smsparam> smsparams = smsparamExMapper.querySmsparamByOption(map);
        if(!CollectionUtils.isEmpty(smsparams)) {
            return smsparams ;
        }else {
            return null ;
        }
    }

    @Override
    public Smsparam selectById(String id) {
        Smsparam smsparam = smsparamMapper.selectByPrimaryKey(id);
        if(!StringUtils.isEmpty(smsparam)) {
            return smsparam ;
        }else {
            return null;
        }
    }

    @Override
    public void updateSmsparamById(Smsparam smsparam) {
        smsparamMapper.updateByPrimaryKeySelective(smsparam) ;
    }

    @Override
    public void insertSmsparam(Smsparam smsparam) {
        smsparamMapper.insertSelective(smsparam) ;
    }

    @Override
    public void deleteSmsparam(String id) {
        smsparamMapper.deleteByPrimaryKey(id) ;
    }

    @Override
    public void editSmsparam(String id, String useflg) {
        Smsparam smsparam = smsparamMapper.selectByPrimaryKey(id);
        smsparam.setUseflg(useflg);
        smsparamMapper.updateByPrimaryKeySelective(smsparam) ;
    }

    @Override
	public Integer selectByOptionCount(SmsparamOptionRequest request) {
		Map<String , Object> map = new HashMap<>() ;
        if(!StringUtils.isEmpty(request.getTemplatecode())) {
            map.put("templatecode" , request.getTemplatecode()) ;
        }
        if(!StringUtils.isEmpty(request.getSendflg())) {
            map.put("sendflg" , request.getSendflg()) ;
        }
        if(!StringUtils.isEmpty(request.getSendtype())) {
            map.put("sendtype" , request.getSendtype()) ;
        }
        if(!StringUtils.isEmpty(request.getProductno())) {
            map.put("productno" , request.getProductno()) ;
        }
        Integer count = smsparamExMapper.querySmsparamByOptionCount(map);
		return count;
	}
}
