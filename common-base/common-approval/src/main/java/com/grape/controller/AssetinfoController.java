package com.grape.controller;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.AssetinfoBackBean;
import com.grape.controller.bean.AssetinfoBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.AssetinfoListResponse;
import com.grape.controller.reponse.AssetinfoListResponse2;
import com.grape.controller.reponse.AssetinfoResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.AssetinfoRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Assetinfo;
import com.grape.model.db.City;
import com.grape.model.db.Custinfo;
import com.grape.service.AssetinfoService;
import com.grape.service.CityService;
import com.grape.service.CustinfoService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/assetinfo")
public class AssetinfoController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CityService cityService;
	@Autowired
	private CustinfoService custinfoService;
	@Autowired
	private AssetinfoService assetinfoService;
	@ApiOperation(value="根据申请编号和身份证号查询资产信息",notes="资产信息接口一",httpMethod="POST",response=AssetinfoListResponse.class)
	@RequestMapping("queryAssetByWorkidAndCerdid")
	public Response queryAssetByWorkidAndCerdid(@Validated @RequestBody WorkidAndCerdidRequest req){
		List<AssetinfoBean> assetBean = new ArrayList<AssetinfoBean>();
		List<Assetinfo> assetinfos = assetinfoService.queryAssetByWorkid(req);
		if(!assetinfos.isEmpty()){
			log.info("查询资产信息成功！");
			for(Assetinfo assetinfo:assetinfos){
				AssetinfoBean assess = new AssetinfoBean();
				String addressprov = assetinfo.getAddressprov();
				String addresscity = assetinfo.getAddresscity();
				String addresssarea = assetinfo.getAddresssarea();
				if(!Util.isBlank(addressprov)){
					City prov = cityService.selectCityById(addressprov);
					assess.setAddressprovofch(prov.getCityname());
				}
				if(!Util.isBlank(addresscity)){
					City city = cityService.selectCityById(addresscity);
					assess.setAddresscityofch(city.getCityname());
				}
				if(!Util.isBlank(addresssarea)){
					City area = cityService.selectCityById(addresssarea);
					assess.setAddresssareaofch(area.getCityname());
				}
				try {
					Util.transferFields(assetinfo, assess);
				} catch (Exception e) {
					log.info("资产信息实体类转换出错");
				}
				assetBean.add(assess);
			}
			return new AssetinfoListResponse(assetBean);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="根据申请编号查询资产信息(风控审批报告)",notes="资产信息接口一",httpMethod="POST",response=AssetinfoListResponse2.class)
	@RequestMapping("queryAssetByWorkid")
	public Response queryAssetByWorkid(@Validated @RequestBody WorkidRequest req){
		String assessnotation="";
		String assessnotation2="";
		AssetinfoBackBean assetinfoBean = new AssetinfoBackBean();
		AssetinfoBackBean assetinfoBean2 = new AssetinfoBackBean();
		assessnotation = assetinfoService.selectAssessNotation(req.getWorkid());
		assessnotation2 = assetinfoService.selectAssessNotation2(req.getWorkid());
		//资产类型为其他
		List<AssetinfoBean> assetBean = new ArrayList<AssetinfoBean>();
		//资产类型为其他房产
		List<AssetinfoBean> assetBean2 = new ArrayList<AssetinfoBean>();
		//资产类型为其他
		List<AssetinfoBean> assetBean3 = new ArrayList<AssetinfoBean>();
		//资产类型为其他房产
		List<AssetinfoBean> assetBean4 = new ArrayList<AssetinfoBean>();
		List<Assetinfo> assetinfos = assetinfoService.queryAssetinfoByWorkid(req.getWorkid());
		if(!assetinfos.isEmpty()){
			log.info("查询资产信息成功！");
			for(Assetinfo assetinfo:assetinfos){
				boolean applyman = true;
				String cerdid = assetinfo.getCerdid();
				if(cerdid!=null){
					List<Custinfo> custinfolist = custinfoService.selectByCerdid(cerdid, req.getWorkid());
					if(custinfolist!=null && !custinfolist.isEmpty()){
						assetinfo.setCerdid(custinfolist.get(0).getCustname());
						if(custinfolist.get(0).getCusttype().contains("3")){
							applyman=false;
						}
					}
				}
				if(applyman){
					StringBuffer addressofch = new StringBuffer();
					AssetinfoBean assess = new AssetinfoBean();
					String addressprov = assetinfo.getAddressprov();
					String addresscity = assetinfo.getAddresscity();
					String addresssarea = assetinfo.getAddresssarea();
					if(!Util.isBlank(addressprov)){
						City prov = cityService.selectCityById(addressprov);
						assess.setAddressprovofch(prov.getCityname());
						addressofch.append(prov.getCityname());
					}
					if(!Util.isBlank(addresscity)){
						City city = cityService.selectCityById(addresscity);
						assess.setAddresscityofch(city.getCityname());
						addressofch.append(city.getCityname());
					}
					if(!Util.isBlank(addresssarea)){
						City area = cityService.selectCityById(addresssarea);
						assess.setAddresssareaofch(area.getCityname());
						addressofch.append(area.getCityname());
					}
					try {
						Util.transferFields(assetinfo, assess);
					} catch (Exception e) {
						log.info("资产信息实体类转换出错");
					}
					if(assetinfo.getAddress()!=null && !assetinfo.getAddress().equals("")){
						addressofch.append(assetinfo.getAddress());
					}
					assess.setAddressofch(addressofch.toString());
					if(assess.getAssettype().equals("0")){
						assetBean.add(assess);
					}else if(assess.getAssettype().equals("1")){
						assetBean2.add(assess);
					}
					assetinfoBean.setHouseasset(assetBean);
					assetinfoBean.setOthersasset(assetBean2);
				}else{
					StringBuffer addressofch = new StringBuffer();
					AssetinfoBean assess = new AssetinfoBean();
					String addressprov = assetinfo.getAddressprov();
					String addresscity = assetinfo.getAddresscity();
					String addresssarea = assetinfo.getAddresssarea();
					if(!Util.isBlank(addressprov)){
						City prov = cityService.selectCityById(addressprov);
						assess.setAddressprovofch(prov.getCityname());
						addressofch.append(prov.getCityname());
					}
					if(!Util.isBlank(addresscity)){
						City city = cityService.selectCityById(addresscity);
						assess.setAddresscityofch(city.getCityname());
						addressofch.append(city.getCityname());
					}
					if(!Util.isBlank(addresssarea)){
						City area = cityService.selectCityById(addresssarea);
						assess.setAddresssareaofch(area.getCityname());
						addressofch.append(area.getCityname());
					}
					try {
						Util.transferFields(assetinfo, assess);
					} catch (Exception e) {
						log.info("资产信息实体类转换出错");
					}
					if(assetinfo.getAddress()!=null && !assetinfo.getAddress().equals("")){
						addressofch.append(assetinfo.getAddress());
					}
					assess.setAddressofch(addressofch.toString());
					if(assess.getAssettype().equals("0")){
						assetBean3.add(assess);
					}else if(assess.getAssettype().equals("1")){
						assetBean4.add(assess);
					}
					assetinfoBean2.setHouseasset(assetBean3);
					assetinfoBean2.setOthersasset(assetBean4);
				}
			}
			if(assessnotation2!=null){
				assetinfoBean2.setAssessnotation(assessnotation2);
			}
			if(assessnotation!=null){
				assetinfoBean.setAssessnotation(assessnotation);
			}
			return new AssetinfoListResponse2(assetinfoBean,assetinfoBean2);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("insertAssetinfo")
	@ApiOperation(value="插入资产信息",notes="资产信息接口二",httpMethod="POST",response=AssetinfoResponse.class)
	public Response insertAssetinfo(@Validated @RequestBody AssetinfoRequest req){
		assetinfoService.insertAssetinfo(req);
		log.info("新增资产信息成功！");
		return new RestfulResponse();
	}
	
	@RequestMapping("updateAssetinfo")
	@ApiOperation(value="更新资产信息",notes="资产信息接口三",httpMethod="POST",response=AssetinfoResponse.class)
	public Response updateAssetinfo(@Validated @RequestBody AssetinfoRequest req){
		assetinfoService.updateAssetinfo(req);
		log.info("更新资产信息成功！");
		return new RestfulResponse();
	}
	
	@RequestMapping("deleteAssetinfo")
	@ApiOperation(value="根据主键workid删除资产信息",notes="资产信息接口四",httpMethod="POST",response=AssetinfoResponse.class)
	public Response deleteAssetinfo(@Validated @RequestBody IdRequest req){
		assetinfoService.deleteAssetinfo(req);
		log.info("删除资产信息成功！");
		return new RestfulResponse();
	}
}
