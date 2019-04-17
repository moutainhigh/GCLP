package com.grape.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.DebtinfoBackBean;
import com.grape.controller.bean.DebtinfoBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.DebtinfoResponse;
import com.grape.controller.reponse.DebtinfoResponse2;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.DebtinfoListRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.City;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Debtinfo;
import com.grape.service.CityService;
import com.grape.service.CustinfoService;
import com.grape.service.DebtinfoService;
import com.grape.service.DoctaskService;
import com.grape.service.impl.DebtinfoServiceImpl;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/debtinfo")
@Validated
public class DebtinfoController {
	private static final Logger log = LoggerFactory.getLogger(DebtinfoServiceImpl.class);
	
	@Autowired
	private DebtinfoService debtinfoService;	
	@Autowired
	private CityService cityService;
	@Autowired
	private CustinfoService custinfoService;
	@ApiOperation(value="根据申请编号和身份证号码查询负债信息",notes="负债信息接口一",httpMethod="POST",response=DebtinfoResponse.class)
	@RequestMapping("queryDebtByWorkid")
	public Response queryDebtByWorkid(@RequestBody WorkidAndCerdidRequest req){
		List<Debtinfo> debt = debtinfoService.queryDebtByWorkidAndCerdid(req);
		List<DebtinfoBean> listBean = new ArrayList<DebtinfoBean>() ;
		if(debt!=null){
			String hishaveflg = "";
			String haveflg = "";
			if(!debt.isEmpty()){
				hishaveflg=debt.get(0).getHistoricalhavaloanflg();
				haveflg=debt.get(0).getHavaloanflg();
			}
			for(int i=0;i<debt.size();i++){
				
				DebtinfoBean bean = new DebtinfoBean();
				try {
					Util.transferFields(debt.get(i), bean);
				} catch (Exception e) {
					log.info("实体类转换出错"+e);
				}
				//将三级联动的code转成中文一并返回
				City houseprovince =cityService.selectCityById(debt.get(i).getAddressprov());
				City housecity = cityService.selectCityById(debt.get(i).getAddresscity());
				City housearea = cityService.selectCityById(debt.get(i).getAddressarea());
				if(houseprovince != null) {
					bean.setTransaddressprov(houseprovince.getCityname());
				}
				if(housecity != null) {
					bean.setTransaddresscity(housecity.getCityname());
				}
				if(housearea != null) {
					bean.setTransaddressarea(housearea.getCityname());
				}
				if(bean.getDebttype()!=null && (!"".equals(bean.getDebttype()))){
					listBean.add(bean) ;
				}
			}
			return new DebtinfoResponse(listBean,hishaveflg,haveflg);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="根据申请编号查询负债信息(风控报告)",notes="负债信息接口一",httpMethod="POST",response=DebtinfoResponse2.class)
	@RequestMapping("queryAllDebtByWorkid")
	public Response queryAllDebtByWorkid(@RequestBody WorkidRequest req){
		List<Debtinfo> debt = debtinfoService.queryByWorkid(req.getWorkid());
		//借款人负债信息
		DebtinfoBackBean debtinfoBackBean = new DebtinfoBackBean();
		//贷款明细
		List<DebtinfoBean> listBean = new ArrayList<DebtinfoBean>() ;
		//信用卡明细
		List<DebtinfoBean> listBean2 = new ArrayList<DebtinfoBean>() ;
		//总负债
		BigDecimal totaldebtamount = new BigDecimal(0);
		//贷款负债金额
		BigDecimal totalloanamount = new BigDecimal(0);
		//信用卡负债金额
		BigDecimal totalcerdidamount = new BigDecimal(0);
		//担保人负债信息
		DebtinfoBackBean debtinfoBackBean2 = new DebtinfoBackBean();
		//贷款明细
		List<DebtinfoBean> listBean3 = new ArrayList<DebtinfoBean>() ;
		//信用卡明细
		List<DebtinfoBean> listBean4 = new ArrayList<DebtinfoBean>() ;
		//总负债
		BigDecimal totaldebtamount2 = new BigDecimal(0);
		//贷款负债金额
		BigDecimal totalloanamount2 = new BigDecimal(0);
		//信用卡负债金额
		BigDecimal totalcerdidamount2 = new BigDecimal(0);
		BigDecimal thirty = new BigDecimal(0.3);
		String debtinfonotation = "";
		String debtinfonotation1="";
		String companyrepaynote="";
		Chanapprovalform chanapprovalform = new Chanapprovalform();
		chanapprovalform=debtinfoService.queryChanapprovalByWorkid(req.getWorkid());
		if(null != chanapprovalform && !"".equals(chanapprovalform)) {
			debtinfonotation=chanapprovalform.getDebtnote();
			debtinfonotation1=chanapprovalform.getDebtinfonote1();
			companyrepaynote=chanapprovalform.getCompanyrepaynote();
		}

		if(debt!=null){
			String hishaveflg = "";
			String haveflg = "";
			if(!debt.isEmpty()){
				hishaveflg=debt.get(0).getHistoricalhavaloanflg();
				haveflg=debt.get(0).getHavaloanflg();
			}
			for(int i=0;i<debt.size();i++){
				boolean isapplyman=true;
				String cerdid = debt.get(i).getCerdid();
				if(cerdid!=null){
					List<Custinfo> custinfolist = custinfoService.selectByCerdid(cerdid, req.getWorkid());
					if(custinfolist!=null && !custinfolist.isEmpty()){
						debt.get(i).setCerdid(custinfolist.get(0).getCustname());
						if(custinfolist.get(0).getCusttype().contains("3")){
							isapplyman=false;
						}
					}
				}
				if(isapplyman){
					StringBuffer address = new StringBuffer();
					DebtinfoBean bean = new DebtinfoBean();
					try {
						Util.transferFields(debt.get(i), bean);
					} catch (Exception e) {
						log.info("实体类转换出错"+e);
					}
					//将三级联动的code转成中文一并返回
					City houseprovince =cityService.selectCityById(debt.get(i).getAddressprov());
					City housecity = cityService.selectCityById(debt.get(i).getAddresscity());
					City housearea = cityService.selectCityById(debt.get(i).getAddressarea());
					if(houseprovince != null) {
						bean.setTransaddressprov(houseprovince.getCityname());
						address.append(houseprovince.getCityname());
					}
					if(housecity != null) {
						bean.setTransaddresscity(housecity.getCityname());
						address.append(housecity.getCityname());
					}
					if(housearea != null) {
						bean.setTransaddressarea(housearea.getCityname());
						address.append(housearea.getCityname());
					}
					address.append(debt.get(i).getAddress());
					bean.setAddressofch(String.valueOf(address));
					if(bean.getDebttype()!=null && (!"".equals(bean.getDebttype()))){
						if(bean.getDebttype().equals("1") || bean.getDebttype().equals("2")){
							totalloanamount=totalloanamount.add(bean.getBorrowremain());
							totaldebtamount=totaldebtamount.add(bean.getBorrowremain());
							listBean.add(bean) ;
						}else if(bean.getDebttype().equals("3")){
							totalcerdidamount=totalcerdidamount.add(bean.getUsedposition().multiply(thirty));
							totaldebtamount=totaldebtamount.add(bean.getUsedposition().multiply(thirty));
							listBean2.add(bean) ;
						}
					}
				}else{
					StringBuffer address = new StringBuffer();
					DebtinfoBean bean = new DebtinfoBean();
					try {
						Util.transferFields(debt.get(i), bean);
					} catch (Exception e) {
						log.info("实体类转换出错"+e);
					}
					//将三级联动的code转成中文一并返回
					City houseprovince =cityService.selectCityById(debt.get(i).getAddressprov());
					City housecity = cityService.selectCityById(debt.get(i).getAddresscity());
					City housearea = cityService.selectCityById(debt.get(i).getAddressarea());
					if(houseprovince != null) {
						bean.setTransaddressprov(houseprovince.getCityname());
						address.append(houseprovince.getCityname());
					}
					if(housecity != null) {
						bean.setTransaddresscity(housecity.getCityname());
						address.append(housecity.getCityname());
					}
					if(housearea != null) {
						bean.setTransaddressarea(housearea.getCityname());
						address.append(housearea.getCityname());
					}
					address.append(debt.get(i).getAddress());
					bean.setAddressofch(String.valueOf(address));
					if(bean.getDebttype()!=null && (!"".equals(bean.getDebttype()))){
						if(bean.getDebttype().equals("1") || bean.getDebttype().equals("2")){
							totalloanamount2=totalloanamount2.add(bean.getBorrowremain());
							totaldebtamount2=totaldebtamount2.add(bean.getBorrowremain());
							listBean3.add(bean) ;
						}else if(bean.getDebttype().equals("3")){
							totalcerdidamount2=totalcerdidamount2.add(bean.getUsedposition().multiply(thirty));
							totaldebtamount2=totaldebtamount2.add(bean.getUsedposition().multiply(thirty));
							listBean4.add(bean) ;
						}
					}
				}
			}
			//将借款人负债信息组装
			debtinfoBackBean.setCerdiddebtinfos(listBean2);
			debtinfoBackBean.setHavaloanflg(haveflg);
			debtinfoBackBean.setHistoricalhavaloanflg(hishaveflg);
			debtinfoBackBean.setLoandebtinfos(listBean);
			debtinfoBackBean.setTotalcerdidamount(totalcerdidamount);
			debtinfoBackBean.setTotaldebtamount(totaldebtamount);
			debtinfoBackBean.setTotalloanamount(totalloanamount);
			debtinfoBackBean.setDebtinfonotation(debtinfonotation);
			debtinfoBackBean.setCompanyrepaynote(companyrepaynote);
			//将担保人信息组装
			debtinfoBackBean2.setCerdiddebtinfos(listBean4);
			debtinfoBackBean2.setHavaloanflg(haveflg);
			debtinfoBackBean2.setHistoricalhavaloanflg(hishaveflg);
			debtinfoBackBean2.setLoandebtinfos(listBean3);
			debtinfoBackBean2.setTotalcerdidamount(totalcerdidamount2);
			debtinfoBackBean2.setTotaldebtamount(totaldebtamount2);
			debtinfoBackBean2.setTotalloanamount(totalloanamount2);
			debtinfoBackBean2.setDebtinfonotation1(debtinfonotation1);
			debtinfoBackBean2.setCompanyrepaynote(companyrepaynote);
			return new DebtinfoResponse2(debtinfoBackBean,debtinfoBackBean2);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("insertDebtinfo")
	@ApiOperation(value="插入负债信息",notes="负债信息接口二",httpMethod="POST",response=DebtinfoResponse.class)
	public Response insertDebtinfo(@Validated @RequestBody DebtinfoListRequest req){
		List<Debtinfo> debt = debtinfoService.queryDebtByWorkidAndCerdid(req);
		if(debt!=null && !debt.isEmpty()){
			debtinfoService.deleteDebtinfo(req);
			debtinfoService.insertDebtinfo(req);
		}else{
			debtinfoService.insertDebtinfo(req);
		}
		return new RestfulResponse();
		
	}
	
	@RequestMapping("updateDebtinfo")
	@ApiOperation(value="更新负债信息",notes="负债信息接口三",httpMethod="POST",response=DebtinfoResponse.class)
	public Response updateDebtinfo(@RequestBody DebtinfoListRequest req){
		debtinfoService.updateDebtinfo(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("deleteDebtinfo")
	@ApiOperation(value="根据主键workid删除负债信息",notes="负债信息接口四",httpMethod="POST",response=DebtinfoResponse.class)
	public Response deleteDebtinfo(@RequestBody IdRequest req){
		debtinfoService.deleteDebtinfo(req);
		return new RestfulResponse();
	}
	

}
