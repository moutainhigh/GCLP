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

import com.grape.controller.bean.MortgageBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.MortgageResponse;
import com.grape.controller.reponse.MortgageResponse1;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.MortgageRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Area;
import com.grape.model.db.City;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Mortgage;
import com.grape.service.AreaService;
import com.grape.service.CityService;
import com.grape.service.CustinfoService;
import com.grape.service.MortgageService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("mortgage")
public class MortgageController {
	private static final Logger log = LoggerFactory.getLogger(MortgageController.class);
	@Autowired
	private MortgageService mortgageService;
	@Autowired
	private CityService cityService;
	@Autowired
	private AreaService areaService;
	@Autowired
	private CustinfoService custinfoService;
	@RequestMapping("queryMortgageById")
	@ApiOperation(value="根据抵押物id查询抵押物信息",httpMethod="POST",notes="查询抵押物的接口1",response=MortgageResponse.class)
	public Response queryMortgageById(@RequestBody IdRequest req){
		MortgageBean mortgageBean = new MortgageBean();
		Mortgage mort = mortgageService.queryMortgageById(req);
		StringBuilder sb = new StringBuilder();
		if(mort!=null){
			String owner = mort.getPropertyowner();
			if(owner!=null){
				String ownercerdid = null;
				String[] ownerlist = owner.split(",");
				boolean first = true;
				for(int i=0;i<ownerlist.length;i++){
					ownercerdid=ownerlist[i];
					List<Custinfo> cust = custinfoService.selectByCerdid(ownercerdid,mort.getWorkid());
					if(!cust.isEmpty()){
						String custname = cust.get(0).getCustname();
						if(first){
							first=false;
						}else{
							sb.append("，");
						}
						sb.append(custname);
					}
				}
			}
			
			City houseprovince =cityService.selectCityById(mort.getHouseaddressprovince());
			City housecity = cityService.selectCityById(mort.getHouseaddresscity());
			City housearea = cityService.selectCityById(mort.getHouseaddressarea());
			Area area=new Area();
			if(mort.getAreaid()!=null){
				area = areaService.queryAreaById(mort.getAreaid());
			}
			try {
				Util.transferFields(mort, mortgageBean);
			} catch (Exception e) {
				log.info("抵押物信息实体类转换出错");
			}
			//将三级联动的code的中文也一并返回
			if(area!=null){
				mortgageBean.setAreaidofch(area.getAreaname());
			}
			if(houseprovince != null) {
				mortgageBean.setHouseaddressprovinceofch(houseprovince.getCityname());
			}		
			if(housecity != null) {
				mortgageBean.setHouseaddresscityofch(housecity.getCityname());
			}		
			if(housearea != null) {
				mortgageBean.setHouseaddressareaofch(housearea.getCityname());
			}	
			
			
			mortgageBean.setPropertyownerofch(sb.toString());
			return new MortgageResponse(mortgageBean);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("queryAllMortgage")
	@ApiOperation(value="查询所有抵押物信息",httpMethod="POST",notes="查询抵押物的接口1",response=MortgageResponse.class)
	public Response queryAllMortgage(){
		boolean isjurdicalflg = true;
		List<Mortgage> list = mortgageService.queryAllMortgage();
		if(!list.isEmpty() && list!=null){
			List<MortgageBean> listbean = new ArrayList<MortgageBean>();
			//循环所以抵押物信息
			for(int i=0;i<list.size();i++){
				String owner = list.get(i).getPropertyowner();
				String ownercerdid = null;
				String[] ownerlist = owner.split(",");
				//循环产权人身份证号码获取产权人对应信息便于判断
				for(int j=0;j<ownerlist.length;j++){
					ownercerdid=ownerlist[j];
					List<Custinfo> cust = custinfoService.selectByCerdid(ownercerdid,list.get(i).getWorkid());
					if(cust!=null && !cust.isEmpty()){
						String applymain = cust.get(0).getApplymain();
						String custtype = cust.get(0).getCusttype();
						//申请人主体是法人
						if("2".equals(applymain)){
							if(custtype.contains("4")){//申请人为抵押人
								isjurdicalflg=true;
							}
						}
					}
				}
				MortgageBean mort = new MortgageBean();
				try {
					Util.transferFields(list.get(i), mort);
					mort.setIsjurdicalflg(isjurdicalflg);
				} catch (Exception e) {
					log.info("抵押物实体类转换出错");
				}
				listbean.add(mort);
			}
			return new MortgageResponse1(listbean);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("queryMortgageByWorkid")
	@ApiOperation(value="根据抵押物申请编号查询抵押物信息",httpMethod="POST",notes="查询抵押物的接口2",response=MortgageResponse.class)
	public Response queryMortgageByWorkid(@RequestBody WorkidRequest req){
		List<Mortgage> list = mortgageService.queryMortgageByWorkid(req);
		if(!list.isEmpty() && list!=null){
			List<MortgageBean> listbean = new ArrayList<MortgageBean>();
			for(int i=0;i<list.size();i++){
				MortgageBean mort = new MortgageBean();
				try {
					Util.transferFields(list.get(i), mort);
				} catch (Exception e) {
					log.info("抵押物实体类转换出错");
				}
				listbean.add(mort);
			}
			return new MortgageResponse1(listbean);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("queryMortgageByWorkidAndCerdid")
	@ApiOperation(value="根据抵押物申请编号查询抵押物信息",httpMethod="POST",notes="查询抵押物的接口2",response=MortgageResponse.class)
	public Response queryMortgageByWorkidAndCerdid(@RequestBody WorkidAndCerdidRequest req){
		List<Mortgage> list = mortgageService.queryMortgageByWorkidAndCerdid(req);
		if(!list.isEmpty() && list!=null){
			List<MortgageBean> listbean = new ArrayList<MortgageBean>();
			for(int i=0;i<list.size();i++){
				MortgageBean mort = new MortgageBean();
				try {
					Util.transferFields(list.get(i), mort);
				} catch (Exception e) {
					log.info("抵押物实体类转换出错");
				}
				listbean.add(mort);
			}
			return new MortgageResponse1(listbean);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("updateMortgage")
	@ApiOperation(value="更新抵押物信息的接口",notes="抵押物信息接口二",httpMethod="POST",response=MortgageResponse.class)
	public Response updateMortgage(@Validated @RequestBody MortgageRequest req){
		
		mortgageService.updateMortgage(req);
		
		return new RestfulResponse();
	}
	
	@RequestMapping("insertMortgage")
	@ApiOperation(value="新增抵押物信息的接口",notes="抵押物信息接口二",httpMethod="POST",response=MortgageResponse.class)
	public Response insertMortgage(@Validated @RequestBody MortgageRequest req){
		if(!"".equals(req.getId())){
			mortgageService.updateMortgage(req);
		}else{
			mortgageService.insertMortgage(req);
		}	
		return new RestfulResponse();
	}
	
	@RequestMapping("delateMortgage")
	@ApiOperation(value="删除押物信息的接口",notes="抵押物信息接口三",httpMethod="POST",response=MortgageResponse.class)
	public Response deleteMortgage(@RequestBody IdRequest req){
		
		mortgageService.deleteMortgage(req);
		
		return new RestfulResponse();
	}
}
