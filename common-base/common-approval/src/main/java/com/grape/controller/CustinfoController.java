package com.grape.controller;

import com.grape.controller.bean.CustinfoBean;
import com.grape.controller.bean.ImageBean1;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.*;
import com.grape.controller.request.*;
import com.grape.controller.response.bean.HaveLoanBean;
import com.grape.model.db.*;
import com.grape.model.db.Redemptiontype;
import com.grape.service.*;
import com.grape.util.Util;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/custinfo")
@Validated
public class CustinfoController {
	private static final Logger log = LoggerFactory.getLogger(CustinfoController.class);
	@Autowired
	private CustinfoService custinfoService;
	@Autowired
	private LitigationinfoService litigationinfoService;
	@Autowired
	private CityService cityService;
	@Autowired
	private DebtinfoService debtinfoService;
	@Autowired
	private ApplyinfoOfComService appliinfoofcomService;
	@Autowired
	private DoctaskService doctaskService;
	@Autowired
	private PostoverdueService postoverdueService;
	@Autowired
	private MortgageService mortgageService ;
	@Autowired
	private ExceptloaninfoService exceptloanService; 
	@Autowired
	private OtherapplyinfoService otherapplyinfoService;
	@Autowired
	private RedemptiontypeService redemptiontypeService;
	@Autowired
	private BnkaccountService bnkaccountService;
	@Autowired
	private IncomeinfoService incomeinfoService;
	@Autowired
	private AssetinfoService assetinfoService;
	@Autowired
	private CreditrecordService creditrecordService;
	@Autowired
	private MortgagefilingService mortgagefilingService;
	@Autowired
	private ImageService imageService;
	
	@RequestMapping("/queryByWorkid")
	@ApiOperation(value="根据申请编号查询该笔贷款相关申请人信息",httpMethod="POST",notes="申请人信息接口1",response=CustinfoListResponse.class)
	public Response queryByWorkid(@RequestBody WorkidRequest req){
		List<Custinfo> custlist = new ArrayList<Custinfo>();
		List<Applyinfoofcom> applyinfoofcoms = new ArrayList<Applyinfoofcom>();
		List<Custinfo> list = custinfoService.querybyworkid(req);
        Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
        for(int i=0;i<list.size();i++){
			if(list.get(i).getCusttype().equals("1") || list.get(i).getCusttype().equals("1,4") || list.get(i).getCusttype().equals("4,1")){
				custlist.add(list.get(i));
			}
		}
		/*if(!doctask.getProductno().startsWith("ZQ")) {*/
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCusttype().equals("2") || list.get(i).getCusttype().equals("2,4") || list.get(i).getCusttype().equals("4,2")) {
                    custlist.add(list.get(i));
                }
            }
       /* }*/
		for(int i=0;i<list.size();i++){
			if(list.get(i).getCusttype().equals("3") || list.get(i).getCusttype().equals("3,4") || list.get(i).getCusttype().equals("4,3")){
				custlist.add(list.get(i));
			}
		}
		for(int i=0;i<list.size();i++){
			if(list.get(i).getCusttype().equals("4")){
				custlist.add(list.get(i));
			}
		}
		for(int i=0;i<list.size();i++){
			if(list.get(i).getCusttype().equals("5")){
				custlist.add(list.get(i));
			}
		}
		for(int i=0;i<list.size();i++){
			if(list.get(i).getCusttype()!=null && list.get(i).getCusttype().equals("")){
				custlist.add(list.get(i));
			}
		}
		List<Applyinfoofcom> applylist = appliinfoofcomService.selectApplyinfoByWorkid(req);
		for(int i=0;i<applylist.size();i++){
			if(applylist.get(i).getApplyertype().equals("1") || applylist.get(i).getApplyertype().equals("1,4") || applylist.get(i).getApplyertype().equals("4,1")){
				applyinfoofcoms.add(applylist.get(i));
			}
		}
        /*if(!doctask.getProductno().startsWith("ZQ")) {*/
            for (int i = 0; i < applylist.size(); i++) {
                if (applylist.get(i).getApplyertype().equals("2") || applylist.get(i).getApplyertype().equals("2,4") || applylist.get(i).getApplyertype().equals("4,2")) {
                    applyinfoofcoms.add(applylist.get(i));
                }
            }
       /* }*/
		for(int i=0;i<applylist.size();i++){
			if(applylist.get(i).getApplyertype().equals("3") || applylist.get(i).getApplyertype().equals("3,4") || applylist.get(i).getApplyertype().equals("4,3")){
				applyinfoofcoms.add(applylist.get(i));
			}
		}
		for(int i=0;i<applylist.size();i++){
			if(applylist.get(i).getApplyertype().equals("4")){
				applyinfoofcoms.add(applylist.get(i));
			}
		}
		for(int i=0;i<applylist.size();i++){
			if(applylist.get(i).getApplyertype().equals("5")){
				applyinfoofcoms.add(applylist.get(i));
			}
		}
		for(int i=0;i<applylist.size();i++){
			if(applylist.get(i).getApplyertype()!=null && applylist.get(i).getApplyertype().equals("")){
				applyinfoofcoms.add(applylist.get(i));
			}
		}
		if(!list.isEmpty() || !applylist.isEmpty()){
			return new CustinfoListResponse(custlist,applyinfoofcoms);
		}
		return new ErrorEntity(StatusCode.OK);
	}
	
	@RequestMapping("/CustinfoAndMortByWorkid")
	@ApiOperation(value="根据申请编号查询该笔贷款相关申请人信息和抵押物信息",httpMethod="POST",notes="申请人信息接口1",response=CustinfoAndMortgageResponse.class)
	public Response CustinfoAndMortByWorkid(@RequestBody WorkidRequest req){
		List<Custinfo> custinfolist = new ArrayList<Custinfo>();
		List<Applyinfoofcom> applyinfoofcomlist = new ArrayList<Applyinfoofcom>();
		List<Custinfo> list = custinfoService.querybyworkid(req);
		List<Applyinfoofcom> applylist = appliinfoofcomService.selectApplyinfoByWorkid(req);
		List<Mortgage> mortgagelist = mortgageService.queryMortgageByWorkid(req) ;
		if(list!=null && !list.isEmpty()){
			for(int i=0;i<list.size();i++){
				if(list.get(i).getCusttype().contains("1")){
					custinfolist.add(list.get(i));
				}
			}
			for(int i=0;i<list.size();i++){
				if(!list.get(i).getCusttype().contains("1")){
					custinfolist.add(list.get(i));
				}
			}
		}
		if(applylist!=null && !applylist.isEmpty()){
			for(int i=0;i<applylist.size();i++){
				if(applylist.get(i).getApplyertype().contains("1")){
					applyinfoofcomlist.add(applylist.get(i));
				}
			}
			for(int i=0;i<applylist.size();i++){
				if(!applylist.get(i).getApplyertype().contains("1")){
					applyinfoofcomlist.add(applylist.get(i));
				}
			}
		}
		if(!list.isEmpty() || !applylist.isEmpty() || !mortgagelist.isEmpty()){
			return new CustinfoAndMortgageResponse(custinfolist,applyinfoofcomlist,mortgagelist);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/querycountByWorkid")
	@ApiOperation(value="根据申请编号查询该笔贷款相关申请人信息数量",httpMethod="POST",notes="申请人信息接口2",response=CustinfoListResponse.class)
	public ResultBean querycountByWorkid(@RequestBody WorkidRequest req){
		List<Custinfo> list = custinfoService.querybyworkid(req);
		List<Applyinfoofcom> applylist = appliinfoofcomService.selectApplyinfoByWorkid(req);
		ResultBean result = new ResultBean();
		result.setData(list.size()+applylist.size());
		result.setMsg("查询申请人数量成功");
		return result;
	}
	@RequestMapping("/queryByCerdid")
	@ApiOperation(value="根据身份证号查询申请人相关信息",httpMethod="POST",notes="申请人信息接口2",response=CustinfoListResponse.class)
	public Response queryByCerdid(@RequestBody CerdidRequest req){
		List<Custinfo> list = custinfoService.queryByCerdid(req);
		if(!list.isEmpty()){
			return new CustinfoResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/queryByCerdidAndWorkid")
	@ApiOperation(value="根据客户编号和身份证号查询某个申请人相关信息",httpMethod="POST",notes="申请人信息接口3",response=CustinfoResponse1.class)
	public Response queryByCustnoAndWorkid(@RequestBody WorkidAndCerdidRequest req){
		CustinfoBean cust = new CustinfoBean();
		//获取配偶信息
		List<Custinfo> marrowinfo = custinfoService.selectMarrowinfo(req);
		if(!marrowinfo.isEmpty()){
			//将配偶信息的身份证号一并传回
			String marrowcerdid = marrowinfo.get(0).getCerdid();
			/*cust.setMarrowcerdid(marrowcerdid);*/
		}
		
		
		//主借款人、共同借款人、担保人、抵押人信息
		Custinfo list = custinfoService.queryByCerdidAndWorkid(req);
		List<Litigationinfo> litigationinfos = litigationinfoService.selectLitiByCerdidAndWorkid(req);
		//借款人在我司历史是否有贷款
		HaveLoanBean haveloanbean = new HaveLoanBean();
		List<Haveloaninfo> havalist= new ArrayList<Haveloaninfo>();
		List<Custinfo> hiscust = custinfoService.selectByCerdid(req);
		if(!hiscust.isEmpty()){
			for(int i=0;i<hiscust.size();i++){
				Haveloaninfo haveloan = new Haveloaninfo();
				String workid = hiscust.get(i).getWorkid();
				//贷款申请时间和贷款产品
				AllLoaninfo alloan = custinfoService.selectDoctaskinfo(workid);
				if(alloan!=null){
					haveloan.setLoandate(alloan.getApplydate());
					haveloan.setProductname(alloan.getProductname());
				}
				//审批是否成功
				Postloaninfo postloaninfo = postoverdueService.selectByWorkid(workid);
				if(postloaninfo!=null){
					haveloan.setLoanstate("审批成功");
				}else{
					haveloan.setLoanstate("审批失败");
				}
				havalist.add(haveloan);
			}
			haveloanbean.setHavaloanflg("1");
			haveloanbean.setList(havalist);
		}else{
			haveloanbean.setHavaloanflg("0");
		}
		if(list!=null){
			String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
			Doctask doctask=doctaskService.queryByWorkid(req.getWorkid());
			String userid = doctask.getUserid();
			//将客户信息的手机号码加密，只有业务员和售后人员可以查看
			if(!userid.equals(workerid)){
				Postloaninfo postloaninfo = postoverdueService.selectByWorkid(req.getWorkid());
				if(postloaninfo==null || (postloaninfo!=null && !"Y".equals(postloaninfo.getOverdueflg()))){
					if(!"".equals(list.getTelnumber())){
						String mobile = list.getTelnumber();
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
							list.setTelnumber(mobile);
						}
					}
				}
			}
			//将三级联动的code转成中文一并返回
			City houseprovince =cityService.selectCityById(list.getFamilyaddressprovince());
			City housecity = cityService.selectCityById(list.getFamilyaddresscity());
			City housearea = cityService.selectCityById(list.getFamilyaddressarea());
			City censusregisterprovvince = cityService.selectCityById(list.getCensusregisterprovvince());
			City censusregistercity = cityService.selectCityById(list.getCensusregistercity());
			City nativeplaceprovince = cityService.selectCityById(list.getNativeplaceprovince());
			City nativeplacecity = cityService.selectCityById(list.getNativeplacecity());
			City nativeplacearea = cityService.selectCityById(list.getNativeplacearea());
			try {
				//将实体bean的参数内容转换
				Util.transferFields(list, cust);
			} catch (Exception e) {
				log.info("实体类转换出错");
			}

			if(nativeplacearea != null) {
				cust.setNativeplaceareaofch(nativeplacearea.getCityname());
			}
			if(nativeplacecity != null) {
				cust.setNativeplacecityofch(nativeplacecity.getCityname());
			}
			if(nativeplaceprovince != null) {
				cust.setNativeplaceprovinceofch(nativeplaceprovince.getCityname());
			}
			if(censusregistercity != null) {
				cust.setCensusregistercityofch(censusregistercity.getCityname());
			}
			if(censusregisterprovvince != null) {
				cust.setCensusregisterprovvinceofch(censusregisterprovvince.getCityname());
			}
			if(houseprovince != null) {
				cust.setFamilyaddressprovinceofch(houseprovince.getCityname());
			}
			if(housecity != null) {
				cust.setFamilyaddresscityofch(housecity.getCityname());
			}
			if(housearea != null) {
				cust.setFamilyaddressareaofch(housearea.getCityname());
			}
			
			if(cust.getRelationcerdid() != null) {
				Custinfo custinfo = custinfoService.queryByCerdidAndWorkid(req.getWorkid(),cust.getRelationcerdid()) ;
				if(custinfo!=null){
					String custname = custinfo.getCustname();
					if(custname!= null) {
						cust.setMarrowname(custname);
					}
				}
			}
			
			return new CustinfoResponse1(cust,litigationinfos,haveloanbean);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/updateCustinfo")
	@ApiOperation(value="更新申请人信息",httpMethod="POST",notes="申请人信息接口4",response=CustinfoResponse1.class)
	public Response updateCustinfo(@Validated @RequestBody CustinfoForm req){
		custinfoService.updateCustinfo(req);
		litigationinfoService.updateLitigationinfo(req);
		return  new RestfulResponse();
	}
	
	@RequestMapping("/insertCustinfo")
	@ApiOperation(value="插入申请人信息",httpMethod="POST",notes="申请人信息接口4",response=CustinfoResponse1.class)
	public Response insertCustinfo(@Validated @RequestBody CustinfoForm req){
		/*String ismarrow = req.getIsmarrow();
		String relationcerdid = req.getRelationcerdid();
		String workid = req.getWorkid();
		//如果新增的为配偶信息，当配偶身份证号码修改了的时候，需要先将原纪录删除
		if(ismarrow.equals("1")){
			List<Custinfo> custinfolist = custinfoService.selectBymarriedAndCerdid(ismarrow,relationcerdid,workid);
			if(!custinfolist.isEmpty()){
				for(Custinfo custinfo:custinfolist){
					if(!req.getCerdid().equals(custinfo.getCerdid())){
						custinfoService.deleteCustinfo(custinfo);
					}
				}
			}
		}*/
		WorkidAndCerdidRequest request = new WorkidAndCerdidRequest();
		request.setCerdid(req.getCerdid());
		request.setWorkid(req.getWorkid());
		Custinfo cust = custinfoService.queryByCerdidAndWorkid(req.getWorkid(),req.getCerdid());
		String  telNumber = "" ;
		if(null != cust && null != cust.getTelnumber()) {
			telNumber = cust.getTelnumber();
		}
		List<Litigationinfo> litiinfo = new ArrayList<Litigationinfo>();
		litiinfo = litigationinfoService.selectLitiByCerdidAndWorkid(request);
		if(cust!=null){
			req.setTelnumber(telNumber);
			custinfoService.updateCustinfo(req);
			if(!litiinfo.isEmpty()){
				litigationinfoService.updateLitigationinfo(req);
			}else{
				litigationinfoService.insertLitigationinfo(req);
			}
		}else{
			custinfoService.insertCustinfo(req);
			litigationinfoService.insertLitigationinfo(req);
		}
		return new RestfulResponse();
	}

	@RequestMapping("/insertLitigationinfo")
	@ApiOperation(value="新增诉讼记录",httpMethod="POST",notes="诉讼记录接口",response=CustinfoForm.class)
	public Response insertLitigationinfo(@Validated @RequestBody CustinfoForm req){
		WorkidAndCerdidRequest request = new WorkidAndCerdidRequest();
		request.setCerdid(req.getCerdid());
		request.setWorkid(req.getWorkid());
		List<Litigationinfo> litiinfo = new ArrayList<Litigationinfo>();
		litiinfo = litigationinfoService.selectLitiByCerdidAndWorkid(request);

		if(!litiinfo.isEmpty()){
			litigationinfoService.updateLitigationinfo(req);
		}else{
			litigationinfoService.insertLitigationinfo(req);
		}
		return new RestfulResponse();
	}
	
	@RequestMapping("/completeCustinfo")
	@ApiOperation(value="完善申请人信息",httpMethod="POST",notes="申请人信息接口6",response=CustinfoResponse1.class)
	public Response completeCustinfo(@Validated @RequestBody CustinfoRequest2 req){
		custinfoService.completeCustinfo(req);
		return  new RestfulResponse();
	}
	
	@RequestMapping("deleteCustinfo")
	@ApiOperation(value="删除客户信息",httpMethod="POST",notes="申请人信息接口5",response=CustinfoResponse1.class)
	public Response deleteCustinfo(@RequestBody WorkidAndCerdidRequest req){
		custinfoService.deleteCustinfo(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectcustmarrowinfo")
	@ApiOperation(value="配偶信息",httpMethod="POST",notes="申请人信息接口5",response=CustmarrowResponse.class)
	public Response selectcustmarrowinfo(@RequestBody WorkidAndCerdidRequest req){
		List<Debtinfo> debtlist = debtinfoService.queryDebtByWorkidAndCerdid(req);
		Custmarrow cust = custinfoService.selectCustmarrow(req);
		return new CustmarrowResponse(debtlist,cust);
		
	}
	
	@RequestMapping("/checkcomplateInfo")
	@ApiOperation(value="判断完善信息是否都完成了",httpMethod="POST",notes="判断完善资料接口",response=ComplateResponse.class)
	public Response checkcomplateInfo(@RequestBody WorkidAndProductnoRequest req){
		WorkidRequest workidreq = new WorkidRequest();
		WorkidAndNodeidRequest workidAndNodeidRequest = new WorkidAndNodeidRequest();
		workidAndNodeidRequest.setWorkid(req.getWorkid());
		workidAndNodeidRequest.setNodeid(req.getNodeid());
		workidAndNodeidRequest.setProductno(req.getProductno());
		workidreq.setWorkid(req.getWorkid());
	    boolean baseinfoflg=true; 
	    boolean mortgageinfoflg=true; 
	    boolean custinfoflg=true; 
	    boolean imageinfoflg=true; 
	    String productno = req.getProductno();
	    //期望贷款申请信息是否完善
		Exceptloaninfo exceptloan = exceptloanService.querybyWorkid(req.getWorkid());
		if(exceptloan==null){
			baseinfoflg=false;
		}
		//其他申请信息是否完善
		Otherapplyinfo otherapply = otherapplyinfoService.queryOtherapplyinfoByWorkid(workidreq);
		if(otherapply==null){
			baseinfoflg=false;
		}
		//银行账号是否完善
		Bnkaccount bnkaccount = bnkaccountService.queryBnkaccountByWorkid(req.getWorkid());
		if(bnkaccount==null){
			baseinfoflg=false;
		}
		//赎楼方案是否完善
		if(productno.startsWith("SLD") || productno.equals("ZQ001")){
			Redemptiontype redemptioninfo = redemptiontypeService.findRedemptiontypeByWorkid(req.getWorkid());
			if(redemptioninfo==null){
				baseinfoflg=false;
			}
		}
		//收入情况是否完善
		List<Incomeinfo> incomeinfo = incomeinfoService.queryInconeinfoByWorkid(req.getWorkid());
		Doctask doc = doctaskService.queryByWorkid(req.getWorkid());
		if(doc.getProductno().contains("PRD") || doc.getProductno().equals("ZQ002")){
			if(incomeinfo==null || incomeinfo.isEmpty()){
				custinfoflg=false;
			}
		}
		//资产信息是否完善
		List<Assetinfo> assetinfolist = assetinfoService.queryAssetinfoByWorkid(req.getWorkid());
		if(assetinfolist==null || assetinfolist.isEmpty()){
			custinfoflg=false;
		}
		//负债信息是否完善
		List<Debtinfo> debtinfolist = debtinfoService.queryByWorkid(req.getWorkid());
		if(debtinfolist==null || debtinfolist.isEmpty()){
			custinfoflg=false;
		}
		//信用记录是否完善
		List<Creditrecode> creditinfo = creditrecordService.queryByWorkid(req.getWorkid());  
		if(creditinfo==null || creditinfo.isEmpty()){
			custinfoflg=false;
		}
		//查档信息是否完善
		List<Mortgagefiling> mortgagefilingList = mortgagefilingService.selectMortgagefilingByWorkid(req.getWorkid());
		if(mortgagefilingList==null || mortgagefilingList.isEmpty()){
			mortgageinfoflg=false;
		}
		//附件是否完善
		List<ImageBean1> imagelist = imageService.selectImageByWorkidAndNodeid(workidAndNodeidRequest);
		if(imagelist==null || imagelist.isEmpty()){
			imageinfoflg=false;
		}
		return new ComplateResponse(baseinfoflg,mortgageinfoflg,custinfoflg,imageinfoflg);
	}
}
