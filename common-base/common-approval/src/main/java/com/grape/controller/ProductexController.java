package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.ApplyinfofcomBean;
import com.grape.controller.bean.ProductexBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ChanapprovalformResponse3;
import com.grape.controller.reponse.CreditrecordResponse3;
import com.grape.controller.reponse.CustinfoResponse2;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.ProductexResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidAndComnoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.controller.response.bean.ApplyinfoOfComResponseBean;
import com.grape.controller.response.bean.ChanapprovalBean;
import com.grape.controller.response.bean.CreditreCard;
import com.grape.controller.response.bean.CreditreCardex;
import com.grape.controller.response.bean.CreditreCode;
import com.grape.controller.response.bean.CreditreCodeex;
import com.grape.controller.response.bean.CreditreNum;
import com.grape.controller.response.bean.Creditrecordbeans;
import com.grape.controller.response.bean.CustinfoResponseBean;
import com.grape.controller.response.bean.MortAndCustBean;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.City;
import com.grape.model.db.Creditrecode;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Doctask;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.Industry;
import com.grape.model.db.Litigationinfo;
import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Shareman;
import com.grape.service.ApplyinfoOfComService;
import com.grape.service.ChanapprovalformService;
import com.grape.service.CityService;
import com.grape.service.CreditrecordService;
import com.grape.service.CustinfoService;
import com.grape.service.DoctaskService;
import com.grape.service.ExceptloaninfoService;
import com.grape.service.IndustyService;
import com.grape.service.LitigationinfoService;
import com.grape.service.PostoverdueService;
import com.grape.service.ProductexService;
import com.grape.service.SharemanService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/productex")
public class ProductexController {
	
	@Autowired
	private ProductexService productexService ;
	@Autowired
	private CustinfoService custinfoService ;
	@Autowired 
	private LitigationinfoService litigationinfoService ;
	@Autowired
	private ChanapprovalformService chanapprovalformService ;
	@Autowired
	private CityService cityService ;
	@Autowired
	private CreditrecordService creditrecordService ;
	@Autowired
	private ApplyinfoOfComService applyinfoOfComService ;
	@Autowired
	private SharemanService sharemanService ;
	@Autowired
	private IndustyService industyService ;
	@Autowired
	private ExceptloaninfoService exceptloaninfoService ;
	@Autowired
	private DoctaskService doctaskService ;
	@Autowired
	private PostoverdueService postoverdueService ;
	
	@ApiOperation(value="基本信息",notes="",response=ProductexResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid")
	public Response basequeryByWorkid(@RequestBody WorkidRequest req){
		ProductexBean pro = productexService.selectProductex(req.getWorkid()) ;
		if(pro!=null){
			return new ProductexResponse(pro);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="借款人信息",notes="",response=CustinfoResponse2.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid1")
	public Response custqueryByWorkid(@RequestBody WorkidRequest req){
		List<Custinfo> custlist = new ArrayList<Custinfo>() ;
		List<ApplyinfoOfComResponseBean> applyinfoofcom = new ArrayList<ApplyinfoOfComResponseBean>() ;
		List<ApplyinfoOfComResponseBean> applyinfoofcom2 = new ArrayList<ApplyinfoOfComResponseBean>() ;
		List<Shareman> sharelist = new ArrayList<Shareman>() ;
		List<Shareman> sharelist2 = new ArrayList<Shareman>() ;
		String workid;
		List<Applyinfoofcom> applylist = applyinfoOfComService.queryByWorkid(req.getWorkid()) ;
		if(applylist != null && !applylist.isEmpty()){
			for (int i=0;i<applylist.size();i++) {
				ApplyinfofcomBean applyBean = new ApplyinfofcomBean();
				Applyinfoofcom applyinfo = applylist.get(i) ;
				WorkidAndComnoRequest req1 = new WorkidAndComnoRequest() ;
				String socialcreditcode = applyinfo.getSocialcreditcode() ;
				req1.setWorkid(req.getWorkid());
				req1.setComno(socialcreditcode);
				sharelist = sharemanService.selectSharemanList(req1);
				sharelist2 = sharemanService.selectSharemanList2(req1);
				if(applyinfo!=null){
					City comaddresscity =cityService.selectCityById(applyinfo.getComaddresscity());
					City comaddressprovince =cityService.selectCityById(applyinfo.getComaddressprovince());
					City comaddressarea = cityService.selectCityById(applyinfo.getComaddressarea());
					City realcomaddresscity =cityService.selectCityById(applyinfo.getRealcomaddresscity());
					City realcomaddressprovince = cityService.selectCityById(applyinfo.getRealcomaddressprovince());
					City realarea = cityService.selectCityById(applyinfo.getRealcomaddressarea());
					Industry industyfirst = industyService.selectNameById(applyinfo.getIndustryfirst());
					Industry industysecond = industyService.selectNameById(applyinfo.getIndustrysecond());
					try {
						Util.transferFields(applyinfo, applyBean);
					} catch (Exception e) {
						
					}
					
					if(comaddresscity != null) {
						applyBean.setComaddresscityofch(comaddresscity.getCityname());
					}
					if(comaddressprovince != null) {
						applyBean.setComaddressprovinceofch(comaddressprovince.getCityname());
					}
					if(comaddressarea != null) {
						applyBean.setComaddressareaofch(comaddressarea.getCityname());
					}
					if(realcomaddresscity != null) {
						applyBean.setRealcomaddresscityofch(realcomaddresscity.getCityname());
					}
					if(realcomaddressprovince != null) {
						applyBean.setRealcomaddressprovinceofch(realcomaddressprovince.getCityname());
					}
					if(realarea != null) {
						applyBean.setRealcomaddressareaofch(realarea.getCityname());
					}
					if(industyfirst != null) {
						applyBean.setIndustryfirstofch(industyfirst.getCodname());
					}
					if(industysecond != null) {
						applyBean.setIndustrysecondofch(industysecond.getCodname());
					}
					if(sharelist2.size()>0){
						sharelist.addAll(sharelist2);
					}	
					ApplyinfoOfComResponseBean app = new ApplyinfoOfComResponseBean() ;
				if(applyinfo.getApplyertype().contains("3") && !applyinfo.getApplyertype().equals("4")) {			
					app.setObj(applyBean);
					app.setList(sharelist);
					applyinfoofcom.add(app) ;
				} else if(applyinfo.getApplyertype().contains("1") && !applyinfo.getApplyertype().equals("4")){				
					app.setObj(applyBean);
					app.setList(sharelist);
					applyinfoofcom2.add(app) ;
				}
			}
		}
			
			for (int i=0;i<applylist.size();i++) {
				ApplyinfofcomBean applyBean = new ApplyinfofcomBean();
				Applyinfoofcom applyinfo = applylist.get(i) ;
				WorkidAndComnoRequest req1 = new WorkidAndComnoRequest() ;
				String socialcreditcode = applyinfo.getSocialcreditcode() ;
				req1.setWorkid(req.getWorkid());
				req1.setComno(socialcreditcode);
				sharelist = sharemanService.selectSharemanList(req1);
				sharelist2 = sharemanService.selectSharemanList2(req1);
				if(applyinfo!=null){
					City comaddresscity =cityService.selectCityById(applyinfo.getComaddresscity());
					City comaddressprovince =cityService.selectCityById(applyinfo.getComaddressprovince());
					City comaddressarea = cityService.selectCityById(applyinfo.getComaddressarea());
					City realcomaddresscity =cityService.selectCityById(applyinfo.getRealcomaddresscity());
					City realcomaddressprovince = cityService.selectCityById(applyinfo.getRealcomaddressprovince());
					City realarea = cityService.selectCityById(applyinfo.getRealcomaddressarea());
					Industry industyfirst = industyService.selectNameById(applyinfo.getIndustryfirst());
					Industry industysecond = industyService.selectNameById(applyinfo.getIndustrysecond());
					try {
						Util.transferFields(applyinfo, applyBean);
					} catch (Exception e) {
						
					}
					
					if(comaddresscity != null) {
						applyBean.setComaddresscityofch(comaddresscity.getCityname());
					}
					if(comaddressprovince != null) {
						applyBean.setComaddressprovinceofch(comaddressprovince.getCityname());
					}
					if(comaddressarea != null) {
						applyBean.setComaddressareaofch(comaddressarea.getCityname());
					}
					if(realcomaddresscity != null) {
						applyBean.setRealcomaddresscityofch(realcomaddresscity.getCityname());
					}
					if(realcomaddressprovince != null) {
						applyBean.setRealcomaddressprovinceofch(realcomaddressprovince.getCityname());
					}
					if(realarea != null) {
						applyBean.setRealcomaddressareaofch(realarea.getCityname());
					}
					if(industyfirst != null) {
						applyBean.setIndustryfirstofch(industyfirst.getCodname());
					}
					if(industysecond != null) {
						applyBean.setIndustrysecondofch(industysecond.getCodname());
					}
					if(sharelist2.size()>0){
						sharelist.addAll(sharelist2);
					}	
					ApplyinfoOfComResponseBean app = new ApplyinfoOfComResponseBean() ;
					if(applyinfo.getApplyertype().contains("2") && !applyinfo.getApplyertype().equals("4")){				
						app.setObj(applyBean);
						app.setList(sharelist);
						applyinfoofcom2.add(app) ;
					}
				}
			}
		}
					
//----------------------------------------------------------------------------------------------------//
		custlist =custinfoService.selectCustinfoByWorkid(req.getWorkid()) ;
		String loannote = "" ;
		String baseinfonote = "" ;
		String baseinfonote1 = "" ;
		String lownote1 = "" ;
		if(custlist != null && !custlist.isEmpty()) {
			List<CustinfoResponseBean> custBean = new ArrayList<CustinfoResponseBean>() ;
			List<CustinfoResponseBean> custBean2 = new ArrayList<CustinfoResponseBean>() ;
			for (int i=0;i<custlist.size();i++) {
				Custinfo custinfo = custlist.get(i);
				CustinfoResponseBean custin = new CustinfoResponseBean() ; 				
				//将三级联动的code转成中文一并返回
				City houseprovince =cityService.selectCityById(custinfo.getFamilyaddressprovince());
				City housecity = cityService.selectCityById(custinfo.getFamilyaddresscity());
				City housearea = cityService.selectCityById(custinfo.getFamilyaddressarea());
				City censusregisterprovvince = cityService.selectCityById(custinfo.getCensusregisterprovvince());
				City censusregistercity = cityService.selectCityById(custinfo.getCensusregistercity());
				City nativeplaceprovince = cityService.selectCityById(custinfo.getNativeplaceprovince());
				City nativeplacecity = cityService.selectCityById(custinfo.getNativeplacecity());
				City nativeplacearea = cityService.selectCityById(custinfo.getNativeplacearea());
				if(nativeplacearea != null) {
					custinfo.setNativeplacearea(nativeplacearea.getCityname());
				}
				if(nativeplacecity != null) {
					custinfo.setNativeplacecity(nativeplacecity.getCityname());
				}
				if(nativeplaceprovince != null) {
					custinfo.setNativeplaceprovince(nativeplaceprovince.getCityname());
				}
				if(censusregistercity != null) {
					custinfo.setCensusregistercity(censusregistercity.getCityname());
				}
				if(censusregisterprovvince != null) {
					custinfo.setCensusregisterprovvince(censusregisterprovvince.getCityname());
				}
				if(houseprovince != null) {
					custinfo.setFamilyaddressprovince(houseprovince.getCityname());
				}
				if(housecity != null) {
					custinfo.setFamilyaddresscity(housecity.getCityname());
				}
				if(housearea != null) {
					custinfo.setFamilyaddressarea(housearea.getCityname());
				}
				String cerdid = custinfo.getCerdid() ;
				WorkidAndCerdidRequest req1 = new WorkidAndCerdidRequest() ;
				req1.setCerdid(cerdid);
				req1.setWorkid(req.getWorkid());
				List<Litigationinfo> litilist = litigationinfoService.selectLitiByCerdidAndWorkid(req1) ;
				custin.setCust(custinfo);
				if(litilist != null && !litilist.isEmpty()) {
					custin.setLitigationinfo(litilist);
				}
				
				List<Chanapprovalform> chan = chanapprovalformService.findChanApprovalFormByWorkid(req.getWorkid()) ;


				if(custinfo.getCusttype().contains("3") && !custinfo.getCusttype().equals("4")) {			
					custBean.add(custin) ;
				} else if(custinfo.getCusttype().contains("1") && !custinfo.getCusttype().equals("4")){				
					custBean2.add(custin) ;
				}				
			}
			
			for (int i=0;i<custlist.size();i++) {
				Custinfo custinfo = custlist.get(i);
				CustinfoResponseBean custin = new CustinfoResponseBean() ; 
				
				if(custinfo!=null){
					String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
					Doctask doctask=doctaskService.queryByWorkid(req.getWorkid());
					String userid = doctask.getUserid();
					//将客户信息的手机号码加密，只有业务员和售后人员可以查看
					if(!userid.equals(workerid)){
						Postloaninfo postloaninfo = postoverdueService.selectByWorkid(req.getWorkid());
						if(postloaninfo==null || (postloaninfo!=null && !"Y".equals(postloaninfo.getOverdueflg()))){
							if(!"".equals(custinfo.getTelnumber())){
								String mobile = custinfo.getTelnumber();
								if(null != mobile) {
									if(mobile.length()==11){
										mobile=mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
									}else if(mobile.length()==8){
										mobile=mobile.replaceAll("(\\d{2})\\d{4}(\\d{2})","$1****$2");
									}else if(mobile.length()==9){
										mobile=mobile.replaceAll("(\\d{3})\\d{4}(\\d{2})","$1****$2");
									}else if(mobile.length()==10){
										mobile=mobile.replaceAll("(\\d{3})\\d{4}(\\d{3})","$1****$2");
									}
									custinfo.setTelnumber(mobile);
								}
							}
						}
					}
				}
				//将三级联动的code转成中文一并返回
				City houseprovince =cityService.selectCityById(custinfo.getFamilyaddressprovince());
				City housecity = cityService.selectCityById(custinfo.getFamilyaddresscity());
				City housearea = cityService.selectCityById(custinfo.getFamilyaddressarea());
				City censusregisterprovvince = cityService.selectCityById(custinfo.getCensusregisterprovvince());
				City censusregistercity = cityService.selectCityById(custinfo.getCensusregistercity());
				City nativeplaceprovince = cityService.selectCityById(custinfo.getNativeplaceprovince());
				City nativeplacecity = cityService.selectCityById(custinfo.getNativeplacecity());
				City nativeplacearea = cityService.selectCityById(custinfo.getNativeplacearea());
				if(nativeplacearea != null) {
					custinfo.setNativeplacearea(nativeplacearea.getCityname());
				}
				if(nativeplacecity != null) {
					custinfo.setNativeplacecity(nativeplacecity.getCityname());
				}
				if(nativeplaceprovince != null) {
					custinfo.setNativeplaceprovince(nativeplaceprovince.getCityname());
				}
				if(censusregistercity != null) {
					custinfo.setCensusregistercity(censusregistercity.getCityname());
				}
				if(censusregisterprovvince != null) {
					custinfo.setCensusregisterprovvince(censusregisterprovvince.getCityname());
				}
				if(houseprovince != null) {
					custinfo.setFamilyaddressprovince(houseprovince.getCityname());
				}
				if(housecity != null) {
					custinfo.setFamilyaddresscity(housecity.getCityname());
				}
				if(housearea != null) {
					custinfo.setFamilyaddressarea(housearea.getCityname());
				}
				String cerdid = custinfo.getCerdid() ;
				WorkidAndCerdidRequest req1 = new WorkidAndCerdidRequest() ;
				req1.setCerdid(cerdid);
				req1.setWorkid(req.getWorkid());
				List<Litigationinfo> litilist = litigationinfoService.selectLitiByCerdidAndWorkid(req1) ;
				custin.setCust(custinfo);
				if(litilist != null && !litilist.isEmpty()) {
					custin.setLitigationinfo(litilist);
				}
				if(custinfo.getCusttype().contains("2") && !custinfo.getCusttype().equals("4")) {			
					custBean2.add(custin) ;
				}			
			}
			Chanapprovalform selectChanappro = productexService.selectChanappro(req.getWorkid()) ;
			if(null != selectChanappro) {
				loannote = selectChanappro.getLawnote() ;					
				baseinfonote = selectChanappro.getBaseinfonote() ;
				baseinfonote1 = selectChanappro.getBaseinfonote1() ;
				lownote1 = selectChanappro.getLownote1() ;
			}
			return new CustinfoResponse2(custBean , custBean2 ,applyinfoofcom , applyinfoofcom2 , loannote , baseinfonote , baseinfonote1 , lownote1) ;
			
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;

	}
	
	@ApiOperation(value="征信记录",notes="",response=CreditrecordResponse3.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid2")
	public Response CreditqueryByWorkid(@RequestBody WorkidRequest req){		
		Creditrecordbeans creditrecordbeans1 = new Creditrecordbeans() ;	    
		Creditrecordbeans creditrecordbeans2 = new Creditrecordbeans() ;
		List<CreditreCard> creditreCard1 = new ArrayList<CreditreCard>();   
		List<CreditreCardex> creditreCardex1 = new ArrayList<CreditreCardex>();   
		List<CreditreCode> creditreCode1 = new ArrayList<CreditreCode>();
		List<CreditreCodeex> creditreCodeex1 = new ArrayList<CreditreCodeex>();
		List<CreditreNum> creditreNum1= new ArrayList<CreditreNum>();
		List<CreditreCard> creditreCard2 = new ArrayList<CreditreCard>();
		List<CreditreCardex> creditreCardex2 = new ArrayList<CreditreCardex>();
		List<CreditreCode> creditreCode2 = new ArrayList<CreditreCode>();
		List<CreditreCodeex> creditreCodeex2 = new ArrayList<CreditreCodeex>();
		List<CreditreNum> creditreNum2 = new ArrayList<CreditreNum>();
		
		WorkidAndCerdidRequest request = new WorkidAndCerdidRequest() ;

		int maxoverdueday = 0;
		int sumoverduecount = 0 ; 
		String isblackofcreditcard = "" ;
		String isblackofloancredit = "" ;
		String isrecentoverdue = "" ;
		String isguarantee = "" ;
		String isguarantee2 = "" ;
		String isrecentoverdue2 = "" ;
		String isrecentoverdue4 = "" ;
		String isrecentoverdue3 = "" ;
		
		List<Creditrecode> creditre = creditrecordService.queryByWorkid(req.getWorkid()) ;		
		for (Creditrecode creditrecode : creditre) {
			CreditreCard card = new CreditreCard() ;
			CreditreCardex cardex = new CreditreCardex() ;
			CreditreCode code = new CreditreCode() ;
			CreditreCodeex codeex = new CreditreCodeex() ;
			CreditreNum num = new CreditreNum() ;
			String workid = req.getWorkid() ;
			String cerdid = creditrecode.getCerdid() ;

		request.setCerdid(cerdid);
		request.setWorkid(workid);
		Creditrecode Credit = creditrecordService.queryCreditByWorkid(request) ;
		isblackofcreditcard = Credit.getIsblackofcreditcard() ;
		isblackofloancredit = Credit.getIsblackofloancredit() ;
			//3 担保人
			card = productexService.selectCreditreCard1(request) ;
			if(null != card && !"".equals(card)) {
				creditreCard1.add(card) ;
			}
			cardex = productexService.selectCreditreCardex1(request) ;
			if(null != cardex && !"".equals(cardex)) {
				creditreCardex1.add(cardex) ;
			}
			code = productexService.selectCreditreCode1(request) ;
			if(null != code && !"".equals(code)) {
				creditreCode1.add(code) ;
			}
			codeex = productexService.selectCreditreCodeex1(request) ;
			if(null != codeex && !"".equals(codeex)) {
				creditreCodeex1.add(codeex) ;
			}
			num = productexService.selectCreditreNum1(request) ;
			if(null != num && !"".equals(num)) {
				creditreNum1.add(num) ;
			}
			
		 
			if(null != card && !"".equals(card)) {
				isguarantee2 = card.getIsguarantee() ;
			}
			
			
			if(null != code && !"".equals(code)) {
				isrecentoverdue2 = code.getIsrecentoverdue() ;
			}
			
			if(null != card && !"".equals(card)) {
				isrecentoverdue = card.getIsrecentoverdue() ;
			}
			
			if(null != card && !"".equals(card)) {
				if(card.getMaxoverdueday() != null && !"".equals(card.getMaxoverdueday())) {
					Integer integer = Integer.valueOf(card.getMaxoverdueday()) ;
					
					if(integer > maxoverdueday) {
						maxoverdueday = integer ;
					}
				}
				
				if(card.getOverduecount() != null && !"".equals(card.getOverduecount())) {
					Integer integer = Integer.valueOf(card.getOverduecount()) ;
					
					sumoverduecount = integer + sumoverduecount ;
				}
			}
			

			//1 , 2 借款人
			card = productexService.selectCreditreCard2(request) ;
			if(null != card && !"".equals(card)) {
				creditreCard2.add(card) ;
			}
			cardex = productexService.selectCreditreCardex2(request) ;
			if(null != cardex && !"".equals(cardex)) {
				creditreCardex2.add(cardex) ;
			}
			code = productexService.selectCreditreCode2(request) ;
			if(null != code && !"".equals(code)) {
				creditreCode2.add(code) ;
			}
			codeex = productexService.selectCreditreCodeex2(request) ;
			if(null != codeex && !"".equals(codeex)) {
				creditreCodeex2.add(codeex) ;
			}
			num = productexService.selectCreditreNum2(request) ;
			if(null != num && !"".equals(num)) {
				creditreNum2.add(num) ;
			}
			
			
			if(null != code && !"".equals(code)) {
				isrecentoverdue3 = "" ;
				isrecentoverdue3 = code.getIsrecentoverdue() ;
			}
			
			if(null != card && !"".equals(card)) {
				isrecentoverdue4 = "" ;
				isrecentoverdue4 = card.getIsrecentoverdue() ;
				isguarantee = "" ;
				isguarantee = card.getIsguarantee() ;
			}
			
			if(null != card && !"".equals(card)) {
				if(card.getMaxoverdueday() != null && !"".equals(card.getMaxoverdueday())) {
					Integer integer = Integer.valueOf(card.getMaxoverdueday()) ;
					
					if(integer > maxoverdueday) {
						maxoverdueday = integer ;
					}
				}
				
				if(card.getOverduecount() != null && !"".equals(card.getOverduecount())) {
					Integer integer = Integer.valueOf(card.getOverduecount()) ;
					
					sumoverduecount = integer + sumoverduecount ;
				}
			}
						
		}
		//loannote 贷款信息审查
		String loannote = "" ;
		String creditinfonote = "" ;
		String creditinverstnote = "" ;
		String loannote1 = "" ;
		String creditinfonote1 = "" ;
		String creditinverstnote1 = "" ;
		
		Chanapprovalform selectChanappro = productexService.selectChanappro(req.getWorkid()) ;
		if(null != selectChanappro) {
			loannote = selectChanappro.getLoannote() ;					
			creditinfonote = selectChanappro.getCreditinfonote() ;
			creditinfonote1 = selectChanappro.getCreditinfonote1() ;
			creditinverstnote = selectChanappro.getBaseinfonote1() ;
			loannote1 = selectChanappro.getLoaninfonote1() ;
			creditinverstnote = selectChanappro.getCreditinvestnote() ;
			creditinverstnote1 = selectChanappro.getCreditinverstnote1() ;
		}
		
		
		List<Chanapprovalform> chan = chanapprovalformService.findChanApprovalFormByWorkid(req.getWorkid()) ;

		String sumoverduecount1 = sumoverduecount + "" ;
		String maxoverdueday1 = maxoverdueday + "" ;
		
		
		creditrecordbeans1.setSumoverduecount(sumoverduecount1);
		creditrecordbeans1.setMaxoverdueday(maxoverdueday1);
		creditrecordbeans1.setLoannote(loannote1);
		creditrecordbeans1.setCreditinfonote(creditinfonote1);
		creditrecordbeans1.setCreditinverstnote(creditinverstnote1);
		creditrecordbeans1.setIsblackofcreditcard(isblackofcreditcard);
		creditrecordbeans1.setIsblackofloancredit(isblackofloancredit); 
		creditrecordbeans1.setIsguarantee(isguarantee2);
		creditrecordbeans1.setIsrecentoverdue(isrecentoverdue);
		creditrecordbeans1.setIsrecentoverdue2(isrecentoverdue2);
		
		creditrecordbeans1.setCreditreCard(creditreCard1);
		creditrecordbeans1.setCreditreCardex(creditreCardex1);
		creditrecordbeans1.setCreditreCode(creditreCode1);
		creditrecordbeans1.setCreditreCodeex(creditreCodeex1);
		creditrecordbeans1.setCreditreNum(creditreNum1);
	
		
		creditrecordbeans2.setSumoverduecount(sumoverduecount1);
		creditrecordbeans2.setMaxoverdueday(maxoverdueday1);
		creditrecordbeans2.setLoannote(loannote);
		creditrecordbeans2.setCreditinfonote(creditinfonote);
		creditrecordbeans2.setCreditinverstnote(creditinverstnote);
		creditrecordbeans2.setIsblackofcreditcard(isblackofcreditcard);
		creditrecordbeans2.setIsblackofloancredit(isblackofloancredit); 
		creditrecordbeans2.setIsguarantee(isguarantee);
		creditrecordbeans2.setIsrecentoverdue(isrecentoverdue3);
		creditrecordbeans2.setIsrecentoverdue2(isrecentoverdue4);
		
		creditrecordbeans2.setCreditreCard(creditreCard2);
		creditrecordbeans2.setCreditreCardex(creditreCardex2);
		creditrecordbeans2.setCreditreCode(creditreCode2);
		creditrecordbeans2.setCreditreCodeex(creditreCodeex2);
		creditrecordbeans2.setCreditreNum(creditreNum2);	
		return new CreditrecordResponse3(creditrecordbeans1 , creditrecordbeans2);		
	}
	
	@ApiOperation(value="授信方案",notes="",response=ChanapprovalformResponse3.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid3")
	public Response CelectChanByWorkid(@RequestBody WorkidRequest req){

		Exceptloaninfo exceptloaninfo = new Exceptloaninfo() ;
		ChanapprovalBean chan = productexService.selectChanByWorkid(req.getWorkid()) ;
		if(null == chan) {
			chan = new ChanapprovalBean() ;
		}
		exceptloaninfo = exceptloaninfoService.querybyWorkid(req.getWorkid()) ;
		if(null != exceptloaninfo && chan != null) {
			String repaymethod = "" ;
			repaymethod = exceptloaninfo.getRepaymethod() ;
			chan.setSuggestrepayway(repaymethod);
		}
		List<Custinfo> custlist = new ArrayList<Custinfo>() ;
		custlist =productexService.queryByworkid(req.getWorkid()) ;
		MortAndCustBean mortAndCustBean = new MortAndCustBean() ;
		String cerdid = "" ;
		String promidea = "" ;
		String promidea1 = "以" ;
		String promidea2 = "物业抵押" ;
		WorkidAndCerdidRequest reqcw = new WorkidAndCerdidRequest() ;
		for (Custinfo custinfo : custlist) {
			cerdid = custinfo.getCerdid() ;
			reqcw.setCerdid(cerdid);
			reqcw.setWorkid(req.getWorkid());
			mortAndCustBean = productexService.selectmortbycre(reqcw) ;
			if(null != mortAndCustBean && null != mortAndCustBean.getMartgagename() && mortAndCustBean.getCustname() != null && !"".equals(mortAndCustBean.getCustname())){
				if("".equals(promidea)){
					promidea = promidea + mortAndCustBean.getCustname() + "名下的" + mortAndCustBean.getMartgagename() ;	
				}else{
					promidea = promidea + ";" +  mortAndCustBean.getCustname() + "名下的" + mortAndCustBean.getMartgagename() ;	
				}	
			}			
		}
		if(!"".equals(promidea)) {		
			promidea = promidea1 + promidea + promidea2 ;
		}

		if(null != chan && !"".equals(chan)) {
			chan.setPromidea(promidea);
		}	
		if(chan!=null){
			return new ChanapprovalformResponse3(chan);	
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
}
