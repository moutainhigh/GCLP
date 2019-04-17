package com.grape.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.RepaymethodAndratetypeBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.AllLoaninfoResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.LoaninfoResponse;
import com.grape.controller.reponse.RedemptiontypeResponse;
import com.grape.controller.reponse.RepaymethodAndratetypeResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.request.AllLoaninfo;
import com.grape.controller.request.LoaninfoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Loaninfo;
import com.grape.model.db.Product;
import com.grape.model.db.Redemptiontype;
import com.grape.service.ApplyforexService;
import com.grape.service.LoaninfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/loaninfo")
public class LoaninfoController {
	private Logger log = LoggerFactory.getLogger(LoaninfoController.class);
	@Autowired
	private LoaninfoService loaninfoService;
	@Autowired
	private ApplyforexService applyforexService;

	@ApiOperation(value="根据申请编号查询贷款信息",notes="贷款信息接口一",httpMethod="POST",response=LoaninfoResponse.class)
	@RequestMapping("queryLoaninfoByWorkid")
	public Response queryLoaninfoByWorkid(@RequestBody LoaninfoRequest req){
		Loaninfo loan = loaninfoService.queryLoaninfoByWorkid(req);
		if(loan!=null){
			log.info("查询借贷信息成功");
			return new LoaninfoResponse(loan);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="查询利率类型和还款方式",notes="贷款信息接口二",httpMethod="POST",response=RepaymethodAndratetypeResponse.class)
	@RequestMapping("selectrepaymethodAndratetype")
	public Response selectrepaymethodAndratetype(@RequestBody WorkidRequest req){
		Product product = loaninfoService.selectrepaymethodAndratetype(req) ;
		RepaymethodAndratetypeBean bean = new RepaymethodAndratetypeBean() ;
		if(null != product && !"".equals(product)) {
			bean.setRepaymethod(product.getRepaymethod());
			bean.setRatetype(product.getRatetype());
		}		
		log.info("查询借贷信息成功");
		return new RepaymethodAndratetypeResponse(bean);
	}
	
	
	@ApiOperation(value="根据申请编号查询疏漏方案",notes="",httpMethod="POST",response=RedemptiontypeResponse.class)
	@RequestMapping("queryRedemptiontypeByWorkid")
	public Response queryRedemptiontypeByWorkid(@RequestBody WorkidRequest req) {
		List<Redemptiontype> redems = loaninfoService.selectRedemptiontypebyWorkid(req) ;
		if(!redems.isEmpty() && redems.size() > 0) {
			Redemptiontype redem = redems.get(0) ;
			if(redem!=null){
				log.info("查询基本借贷信息成功");
				return new RedemptiontypeResponse(redem);
			}		
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="根据申请编号查询贷款基本信息",notes="贷款信息接口二",httpMethod="POST",response=AllLoaninfoResponse.class)
	@RequestMapping("queryAllLoaninfoByWorkid")
	public Response queryAllLoaninfoByWorkid(@RequestBody WorkidRequest req){
		AllLoaninfo alloan = new AllLoaninfo() ;
		//评估总价sumofamount  审批成数Aprob
		alloan = loaninfoService.queryAllLoaninfoByWorkid(req);
		if(alloan!=null && alloan.getCvs()!=null && !alloan.getCvs().equals("")){
			BigDecimal cvs = alloan.getCvs().multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
			alloan.setCvs(cvs);
		}
		//审批成数Aprob 
		/*Houseassess hou = new Houseassess();
	    List<Houseassess> hlist = new ArrayList<>() ;
		if(loaninfoService.selectHouseassess(req) != null) {
			hlist = loaninfoService.selectHouseassess(req) ;
			BigDecimal total = hou.getAssesstotal() ;
			alloan.setAprob(alloan.getSumofamount().divide(total));
		}*/
		
		//BigDecimal Aprob = alloan.getSumofamount().divide(loaninfoService.selectHouseassess(req).getAssesstotal()) ;
		
		//剩余贷款期限 remainingdays
		//Long remainingdays = (alloan.getNextrepaydate().getTime() - new Date().getTime())/(24*60*60*1000) ;
		if(alloan.getProductno().startsWith("ZQ")){
			String repaymethod=applyforexService.selectByNewWorkid(req.getWorkid());
			alloan.setRepaymethod(repaymethod);
			alloan.setRepaymethod1(repaymethod);
		}
		Date nextdate =alloan.getNextrepaydate();
		if(nextdate!=null) {
			alloan.setRemainingdays((alloan.getNextrepaydate().getTime() - new Date().getTime())/(24*60*60*1000));
		}
		if("1".equals(alloan.getProducttype())) {
			alloan.setProducttypename("房抵贷");
		}else if("5".equals(alloan.getProducttype())){
			alloan.setProducttypename("展期");
		}else{
			alloan.setProducttypename("赎楼贷");
			List<Redemptiontype> redems = loaninfoService.selectRedemptiontypebyWorkid(req) ;
			if(!redems.isEmpty() && redems.size() > 0) {
				Redemptiontype redem = redems.get(0) ;
				alloan.setBeloanbank(redem.getBeloanbank());
				alloan.setOsumofamount(redem.getOsumofamount());
				alloan.setRedemaccountname(redem.getRedemaccountname());
				alloan.setOrepayaccountname(redem.getOrepayaccountname());
				alloan.setRedemaccount(redem.getRedemaccount());
				alloan.setOrepayaccount(redem.getOrepayaccount());
				alloan.setOrepayaccountbnk(redem.getOrepayaccountbnk());
				alloan.setRedemccountbnk(redem.getRedemccountbnk());
				alloan.setIsthirdpartyrepay(redem.getIsthirdpartyrepay()); 
				alloan.setIsthirdpartyredem(redem.getIsthirdpartyredem());
				alloan.setRedemdescription(redem.getRedemdescription());
				alloan.setNewloanbank(redem.getNewloanbank());
				alloan.setApplyamount(redem.getApplyamount());
			}
		}
		log.info("查询基本借贷信息成功");
		return new AllLoaninfoResponse(alloan);
	}
	
}
