package com.grape.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.reponse.bean.HFWresultBean;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Exinterface;
import com.grape.model.db.Exqueryhist;
import com.grape.model.db.Litigationinfo;
import com.grape.model.db.Shixin;
import com.grape.model.db.Susong;
import com.grape.model.db.SusongExample;
import com.grape.model.mapper.base.ExchannelMapper;
import com.grape.model.mapper.base.ExqueryhistMapper;
import com.grape.model.mapper.base.LitigationinfoMapper;
import com.grape.model.mapper.base.ShixinMapper;
import com.grape.model.mapper.base.SusongMapper;
import com.grape.service.ExinterfaceService;
import com.grape.service.HuifawangService;
import com.grape.tool.Util;

import lombok.extern.log4j.Log4j;
@Service
@Log4j
public class HuifawangServiceImpl implements HuifawangService {
	

	
	@Autowired
	ExchannelMapper exchannelMapper;
	@Autowired
	RestTemplate template;
	@Autowired
	SusongMapper susongMapper;
	@Autowired
	ShixinMapper shixinMapper;
	@Autowired
	LitigationinfoMapper litigationinfoMapper;
	@Autowired
	ExinterfaceService exinterfaceService;
	@Autowired
	ExqueryhistMapper exqueryhistMapper;
	@Override
	public HFWresultBean findResultBean(String workid,String username, String cerdid) {
		try {
			Exinterface exinterface = exinterfaceService.findExinterface1(MessageDetail.HUIFA_ID);
			if(exinterface==null){
				throw new NullPointerException("汇法网接口信息为空！");
			}
			Exchannel exchannel = exchannelMapper.selectByPrimaryKey(MessageDetail.HUIFA_ID);
			String url = exinterface.getUrl()
					+"?conid="+Integer.parseInt(exchannel.getConid())
					+"&stype="+1
					+"&n="+username
					+"&id="+cerdid;
			log.info("汇法网访问url："+url);
			HttpHeaders headersGet = new HttpHeaders();
			headersGet.setContentType(MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8"));
			HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<MultiValueMap<String, Object>>(null,
					headersGet);
			
			
			
			ResponseEntity<String> result = template.getForEntity(url, String.class, entity);
			log.info("汇法网返回信息："+result.getBody());
			
			if(result.getStatusCode().is2xxSuccessful()){
				//保存查询历史
				saveExqueryhist(workid, exinterface.getInterfaceno(), "Y",result.getBody());
				
				HFWresultBean resultBean = JSON.parseObject(result.getBody(), new TypeReference<HFWresultBean>(){});
				if(resultBean.getSuccess().equals("s")){
					return resultBean;
				}else{
					throw new IllegalStateException(result.getBody().toString());
				}
			}else{
				//保存查询历史
				saveExqueryhist(workid, exinterface.getInterfaceno(), "N",result.getBody());
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new IllegalStateException(e);
		}
		return null;
	}
	
	@Override
	public boolean litigationinfoInsertOrUpdate(Litigationinfo litigationinfo) {
		int flag;
		String workid = litigationinfo.getWorkid();
		String cerdid = litigationinfo.getCerdid();
		String querytype = litigationinfo.getQuerytype();
		Litigationinfo litigationinfo2 = litigationinfoMapper.selectByPrimaryKey(cerdid, querytype, workid);
		if(litigationinfo2!=null){
			flag = litigationinfoMapper.updateByPrimaryKey(litigationinfo);
		}else{
			flag = litigationinfoMapper.insert(litigationinfo);
		}
		if(flag==1){
			return true;
		}
		return false;
	}

	@Override
	public List<Susong> findSusongByWorkid(String workid) {
		SusongExample example = new SusongExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Susong> susongs = susongMapper.selectByExample(example);
		if(susongs.size()>0){
			return susongs;
		}
		return null;
	}

	private void saveExqueryhist(String workid,String interfaceno,String successflag,String content){
		Exqueryhist exqueryhist = new Exqueryhist();
		exqueryhist.setId(Util.getID());
		exqueryhist.setWorkid(workid);
		exqueryhist.setChannelno(MessageDetail.HUIFA_ID);
		exqueryhist.setSuccessflag(successflag);
		exqueryhist.setInterfaceno(interfaceno);
		exqueryhist.setContent(content);
		exqueryhist.setChgdt(new Date());
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		
		exqueryhist.setChgtl(username);
		exqueryhistMapper.insert(exqueryhist);
	}

	@Override
	public Susong findSusongByPrimarykey(String keyid, String workid) {
		
		return susongMapper.selectByPrimaryKey(keyid, workid);
	}

	@Override
	public Shixin findShixinByPrimarykey(String keyid, String workid) {
		// TODO Auto-generated method stub
		return shixinMapper.selectByPrimaryKey(keyid, workid);
	}

	@Override
	public void insertOrUpdateSusong(Susong susong) {
		Susong oldSusong = susongMapper.selectByPrimaryKey(susong.getKeyid(), susong.getWorkid());
		
		if(oldSusong!=null){
			susongMapper.updateByPrimaryKey(susong);
		}else{
			susongMapper.insert(susong);
		}
	
	}

	@Override
	public void insertOrUpdateShixin(Shixin shixin) {
		Shixin oldShixin = shixinMapper.selectByPrimaryKey(shixin.getKeyid(), shixin.getWorkid());
		if(oldShixin!=null){
			shixinMapper.updateByPrimaryKey(shixin);
		}else{
			shixinMapper.insert(shixin);
		}
	}
}
