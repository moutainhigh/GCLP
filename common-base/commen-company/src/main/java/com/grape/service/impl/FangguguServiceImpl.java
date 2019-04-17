package com.grape.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.grape.controller.reponse.bean.FGGQueryPriceBean;
import com.grape.controller.reponse.bean.FGGxiaoquBean;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Exinterface;
import com.grape.model.db.Mortgagematch;
import com.grape.model.mapper.base.MortgagematchMapper;
import com.grape.context.ServerContext;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.reponse.bean.ListJsonResult;
import com.grape.service.ExinterfaceService;
import com.grape.service.FangguguService;
import com.grape.service.HouseassessService;
import com.yf.tools.Generate;


import lombok.extern.log4j.Log4j;
@Log4j
@Service
public class FangguguServiceImpl implements FangguguService{
	
	
	
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	HouseassessService houseassessService;
	
	@Autowired
	MortgagematchMapper mortgagematchMapper;
	@Autowired
	ExinterfaceService exinterfaceService;
	@Autowired
	ServerContext serverContext;

	
	@Override
	public List<Mortgagematch> getFGGMortgage(Exchannel exchannel,String workid,String citycode,String mortgageno,String mortgagename) {
		
		try {
			Exinterface exinterface = exinterfaceService.findExinterface1(MessageDetail.FANGGUGU_ID);
			if(exinterface==null){
				throw new NullPointerException("房估估模糊匹配接口信息为空");
			}
			List<Mortgagematch> mortgagematchs = new ArrayList<>();
			String xiaoquUrl = exinterface.getUrl()
					+"?cityCode="+citycode
					+"&comName="+mortgagename;
			String KeyId=exchannel.getAccesskeyid();//用户keyId
			String AccessKeySecret = exchannel.getAccesskeysecret();//用户AccessKey
			/**数组内包含三个参数分别是keyId,AccessKey和请求URL*/
			/**请求URL不需要包括userKeyId，accessSignature、timeStamp，Generate.generate方法会帮助生成*/
			String [] param = {KeyId,AccessKeySecret,xiaoquUrl};
			/**此处模糊查询的是北京市的塔院小区，具体查询请根据用户拥有城市权限进行调整*/
			String finalUrl = "";//最终访问URL，此URL可以在浏览器中访问
			try {
				finalUrl = Generate.generate(param);
				log.info("生成模糊匹配url："+finalUrl);
			} catch (Exception e) {
				log.error("生成访问地址出错");
				throw new IllegalStateException(e);
			}

			HttpHeaders headersGet = new HttpHeaders();
			headersGet.setContentType(MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8"));
			HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<MultiValueMap<String, Object>>(null,
					headersGet);
			
			ResponseEntity<String> xiaoquresp = template.getForEntity(finalUrl, String.class,entity);
			log.info("模糊匹配接口返回信息"+xiaoquresp.getBody());
			if(xiaoquresp.getStatusCode().is2xxSuccessful()){
				//保存查询记录
				serverContext.saveExqueryhist(null, workid, exinterface.getInterfaceno(), "Y", xiaoquresp.getBody(), MessageDetail.FANGGUGU_ID);
			//	JSONObject jsonObject = JSONObject.parseObject(xiaoquresp.getBody());
				ListJsonResult<ListJsonResult<FGGxiaoquBean>> result=JSON.parseObject(xiaoquresp.getBody(), new TypeReference<ListJsonResult<ListJsonResult<FGGxiaoquBean>>>(){});
				
				if(result.getData().get(0).getData().size()>0){
					//把匹配的小区名称都保存起来，供业务选择修改
					for (int i = 0; i < result.getData().get(0).getData().size(); i++) {
						Mortgagematch mortgagematch = new Mortgagematch();
						mortgagematch.setMortgageno(mortgageno);
						mortgagematch.setMatchno(String.valueOf(i));
						if(i==0){//默认选择相识度最高的匹配
							mortgagematch.setMatchflag("Y");
						}
						mortgagematch.setHouseaddress(result.getData().get(0).getData().get(i).getAddress());
						mortgagematch.setCommunityid(result.getData().get(0).getData().get(i).getCommunityId());
						mortgagematch.setSimilarword(result.getData().get(0).getData().get(i).getSimilarWord());
						String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
						mortgagematch.setCdgtl(username);
						mortgagematch.setChgdt(new Date());
						mortgagematchs.add(mortgagematch);
						mortgagematchMapper.insert(mortgagematch);
					}
					
					return mortgagematchs;
				}
				
			}else{
				//保存查询记录
				serverContext.saveExqueryhist(null, workid, exinterface.getInterfaceno(), "N", xiaoquresp.getBody(), MessageDetail.FANGGUGU_ID);
			}
		} catch (Exception e) {
			log.error(e);
			throw new IllegalStateException(e);
		}
		
		return null;
	}



	@Override
	public FGGQueryPriceBean getFGGQueryPricAgain(Exchannel exchannel, String workid,String citycode,String mortgageno,
			String houseType, Float buildingArea,String communityid) {
		try {
			Exinterface exinterface = exinterfaceService.findExinterface2(MessageDetail.FANGGUGU_ID);
			if(exinterface==null){
				throw new NullPointerException("房估估估价接口信息为空");
			}
			String KeyId=exchannel.getAccesskeyid();//用户keyId
			String AccessKeySecret = exchannel.getAccesskeysecret();//用户AccessKey
			String finalUrl = "";//最终访问URL，此URL可以在浏览器中访问
			HttpHeaders headersGet = new HttpHeaders();
			headersGet.setContentType(MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8"));
			HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<MultiValueMap<String, Object>>(null,
					headersGet);

			//	JSONObject jsonObject = JSONObject.parseObject(xiaoquresp.getBody());
				
				
					if(communityid!=null){
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						String getPriceUrl = exinterface.getUrl()
								+"?cityCode="+citycode
								+"&communityId="+communityid
								+"&houseType="+houseType
								+"&enquiryTime="+dateFormat.format(new Date())
								+"&buildingArea="+buildingArea;
						String [] param2 = {KeyId,AccessKeySecret,getPriceUrl};
						try {
							finalUrl = Generate.generate(param2);
							log.info("生成自动估值url:"+finalUrl);
						} catch (Exception e) {
							log.error("生成访问地址出错");
							throw new IllegalStateException(e);
						}
						
						ResponseEntity<String> priceResult = template.getForEntity(finalUrl, String.class);
						log.info("自动估值接口返回信息："+priceResult.getBody());
						if(priceResult.getStatusCode().is2xxSuccessful()){
							//保存查询记录
							serverContext.saveExqueryhist(null, workid, exinterface.getInterfaceno(), "Y", priceResult.getBody(), MessageDetail.FANGGUGU_ID);
							
							ListJsonResult<FGGQueryPriceBean> jsonResult= JSON.parseObject(priceResult.getBody(), new TypeReference<ListJsonResult<FGGQueryPriceBean>>(){});
							FGGQueryPriceBean queryPriceBean = jsonResult.getData().get(0);

							return queryPriceBean;
						}else{
							//保存查询记录
							serverContext.saveExqueryhist(null, workid, exinterface.getInterfaceno(), "N", priceResult.getBody(), MessageDetail.FANGGUGU_ID);
						}
					}
			
			
		} catch (Exception e) {
			log.error(e);
			throw new IllegalStateException(e);
		}
		
		return null;
	}
	
	
	

}
