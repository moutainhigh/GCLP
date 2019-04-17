package com.grape.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.HomeFeign;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.reponse.PersonResponse;
import com.grape.controller.reponse.Repaynotation;
import com.grape.controller.reponse.RepaynotationResponse;
import com.grape.controller.reponse.RepaytoinfoResponse;
import com.grape.controller.reponse.RepaytoinfoResponse2;
import com.grape.controller.reponse.RepaytoinfoResponse3;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.AllLoaninfo;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.request.RepaytoInfoRequest;
import com.grape.controller.request.RepaytoInfoRequest1;
import com.grape.controller.request.RepaytoInfoRequest2;
import com.grape.controller.request.WorkidAndOrgRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.Bnkaccount;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.db.Workhistory;
import com.grape.service.ApplyforexService;
import com.grape.service.ApplyinfoOfComService;
import com.grape.service.BnkaccountService;
import com.grape.service.CustinfoService;
import com.grape.service.ExceptloaninfoService;
import com.grape.service.LoaninfoService;
import com.grape.service.ProductnodeService;
import com.grape.service.RepaytoinfoService;
import com.grape.service.WorkflowService;
import com.grape.service.WorkhistoryService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/repaytoinfo")//how foolish ya're

public class RepaytoinfoController {
	private static final Logger log = LoggerFactory.getLogger(RepaytoinfoController.class);
	@Autowired
	private WorkhistoryService workhistoryService;
	@Autowired
	private ApplyinfoOfComService appliinfoofcomService;
	@Autowired
	private LoaninfoService loaninfoService;
	@Autowired
	private CustinfoService custinfoService;
	@Autowired
	private RepaytoinfoService repaytoinfoService;
	@Autowired
	private WorkflowService workflowService;
	@Autowired
	private ApplyforexService applyforexService;
	@Autowired
	private WorkflowForeign workflowfeign;
	@Autowired
	private ProductnodeService productndodeService;
	@Autowired
	private ExceptloaninfoService exceptloaninfoService;
	@Autowired
	private BnkaccountService bnkaccountService;
	@Autowired
	private HomeFeign homefeign;
	
	@ApiOperation(value="根据申请编号查询批复信息",httpMethod="POST",notes="批复信息的第一个接口",response=RepaytoinfoResponse.class)
	@RequestMapping("/selectRepaytoinfoByWorkid")
	public Response selectRepaytoinfoByWorkid(@RequestBody WorkidRequest req){
		List<Repaytoinfo> repay = repaytoinfoService.selectRepaytoinfoByWorkid(req);
		if(!repay.isEmpty()){
			return new RepaytoinfoResponse(repay);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="批复信息(出纳出款),渠道确认审批批复",httpMethod="POST",notes="批复信息的第一个接口",response=RepaytoinfoResponse.class)
	@RequestMapping("/selectFinalRepaytoinfoByWorkid")
	public Response selectFinalRepaytoinfoByWorkid(@RequestBody WorkidRequest req){
		Bnkaccount bnkaccount = new Bnkaccount();
		bnkaccount=bnkaccountService.queryBnkaccountByWorkid(req.getWorkid());
		List<Repaytoinfo> list = new ArrayList<Repaytoinfo>();
		Repaytoinfo repay = repaytoinfoService.selectFinalrepaytoinfo(req.getWorkid());
		if(repay!=null){
			List<Repaytoinfo> repaytoinfo = repaytoinfoService.selectisfinalRepayToInfo(req.getWorkid());
			if(repaytoinfo!=null && !repaytoinfo.isEmpty()){
				for(int n=0;n<repaytoinfo.size();n++){
					Repaytoinfo repay2 = repaytoinfo.get(n);
					repay2.setIsfinilyflg("");
					repaytoinfoService.updateRepaytoinfo(repay2);
				}
			}
			repay.setIsfinilyflg("1");
			repaytoinfoService.updateRepaytoinfo(repay);
			list.add(repay);
			return new RepaytoinfoResponse3(list,bnkaccount);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="渠道确认保函批复",httpMethod="POST",notes="批复信息的第一个接口",response=RepaytoinfoResponse.class)
	@RequestMapping("/selectBaohanRepaytoinfoByWorkid")
	public Response selectBaohanRepaytoinfoByWorkid(@RequestBody WorkidRequest req){
		List<Repaytoinfo> list = new ArrayList<Repaytoinfo>();
		Repaytoinfo repay = repaytoinfoService.selectBaohanrepaytoinfo(req.getWorkid());
		if(repay!=null){
			list.add(repay);
			return new RepaytoinfoResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="根据申请编号和机构号查询批复信息",httpMethod="POST",notes="批复信息的第一个接口",response=RepaytoinfoResponse.class)
	@RequestMapping("/selectRepaytoinfoByWorkidAndOrg")
	public Response selectRepaytoinfoByWorkidAndOrg(@RequestBody WorkidAndOrgRequest req){
		Repaytoinfo repay = repaytoinfoService.selectRepaytoinfoByWorkidAndOrg(req);
		if(repay!=null){
			return new RepaytoinfoResponse2(repay);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="插入保函批复信息",httpMethod="POST",notes="批复信息的第二个接口",response=RepaytoinfoResponse.class)
	@RequestMapping("/insertRepaytoinfo")
	public Response insertRepaytoinfo(@RequestBody RepaytoInfoRequest req){
		//获取产品表的产品利率类型和还款方式
		List<Productnode> productndode =productndodeService.selectByNodeid(req.getNodeid());
		String productno=null;
		if(!productndode.isEmpty()){
			productno=productndode.get(0).getProductno();
		}
		List<Product> product = productndodeService.selectRepayMethod(productno);
		String repaymethod = null;
		String ratetype=null;
		if(!product.isEmpty()){
			if(productno.contains("ZQ")){
				repaymethod=applyforexService.selectByNewWorkid(req.getWorkid());
			}else{
				repaymethod=product.get(0).getRepaymethod();
			}
			ratetype=product.get(0).getRatetype();
		}
		PersonResponse personinfo = homefeign.personinfo();
		String orgbelongsto = personinfo.getPersoninfo().getOrgbelongsto();
		//平台方
		if(req.getBatchorg().equals("04")){
			/*Repaytoinfo repaytoinfo = repaytoinfoService.selectFourRepaytoinfo(req);
			if(repaytoinfo!=null){
				BigDecimal totalamount = repaytoinfo.getTotaluseamount();
				String totalterm = repaytoinfo.getTotaluseterm();
				if(totalamount!=null){
					req.setTotaluseamount(totalamount);
				}
				if(totalterm!=null){
					req.setTotaluseterm(totalterm);
				}
				req.setIsagreeexceptamount(repaytoinfo.getIsagreeexceptamount());
				req.setInterestrate(repaytoinfo.getInterestrate());
				req.setLoanlimittime(repaytoinfo.getLoanlimittime());
				req.setSumofamount(repaytoinfo.getSumofamount());
			}*/
			req.setBatchorg(orgbelongsto);
			//担保方
		}else if(req.getBatchorg().equals("05")){
			//同意期待贷款申请金额
			if(req.getIsagreeexceptamount().equals("1")){
				Exceptloaninfo except = exceptloaninfoService.querybyWorkid(req.getWorkid());
				BigDecimal suggestapplyamount=except.getExpectapplyamount();
				BigDecimal totaluseamount = except.getExtotaluseamount();
				String totalterm = except.getExtotaluseterm();
				String suggestuseterm =except.getExpectapplyyear();
				BigDecimal rate = except.getExpectapplyrate();
				req.setSumofamount(suggestapplyamount);
				req.setInterestrate(rate);
				req.setLoanlimittime(suggestuseterm);
				if(totaluseamount!=null){
					req.setTotaluseamount(totaluseamount);
				}
				if(totalterm!=null){
					req.setTotaluseterm(totalterm);
				}
			}
		}
		req.setIsfinilyflg("2");
		req.setRepaymethod(repaymethod);
		req.setInterestratetype(ratetype);
		repaytoinfoService.insertRepaytoinfo(req);
		String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		//进行流程跳转
		FlowHandleRequest handlereq=workflowService.selectWorkflow(req.getWorkid(),req.getNodeid());
		FlowHandleResponse res = new FlowHandleResponse();
		handlereq.setHisttype("14");
		handlereq.setActor(userid);
		handlereq.setNotation(req.getNotation());
		handlereq.setNextActor("");
		handlereq.setOperation(req.getOperation());
		if(!req.getOperation().equals("保存")){
			res=workflowfeign.handle(handlereq);
			log.info("流程处理的结果为"+res.getMessage());
		}
		return new RestfulResponse();
	}
	
	/*@ApiOperation(value="选择审批批复信息",httpMethod="POST",notes="批复信息的第n个接口",response=FlowHandleResponse.class)
	@RequestMapping("/kickRepaytoinfo")
	public Response kickRepaytoinfo(@RequestBody RepaytoInfoRequest1 req){
		//获得产品编号及产品的利率类型、还款方式
		List<Productnode> productndode =productndodeService.selectByNodeid(req.getNodeid());
		//获取选择的批复结果信息
		Repaytoinfo repaytoinfo = repaytoinfoService.selectById(req.getId()) ;
		String productno=null;
		if(!productndode.isEmpty()){
			productno=productndode.get(0).getProductno();
		}
		List<Product> product = productndodeService.selectRepayMethod(productno);
		String repaymethod = null;
		String ratetype=null;
		if(!product.isEmpty()){
			if(productno.contains("ZQ")){
				repaymethod=applyforexService.selectByNewWorkid(repaytoinfo.getWorkid());
			}else{
				repaymethod=product.get(0).getRepaymethod();
			}
			ratetype=product.get(0).getRatetype();
		}
		//查看原有批复信息表中是否存在最终批复结果
		Repaytoinfo repay = repaytoinfoService.selectFinalrepaytoinfo(repaytoinfo.getWorkid());
		if(repay!=null){
			//将原有的最终批复信息标识设为空，表示原有的批复信息不是最终的批复信息了。
			Repaytoinfo repayto = new Repaytoinfo();
			repayto.setId(repay.getId());
			repayto.setWorkid(repay.getWorkid());
			repayto.setIsfinilyflg("");
			repaytoinfoService.updateRepaytoinfo(repayto);
			//新增一个新的批复信息
			Repaytoinfo repaytoinfo1 = new Repaytoinfo();
			try {
				Util.transferFields(repaytoinfo, repaytoinfo1);
			} catch (Exception e) {
				log.info("批复信息实体转换出错");
			}
			//保存最终批复结果
			PersonResponse personinfo = homefeign.personinfo();
			String orgbelongsto = personinfo.getPersoninfo().getOrgbelongsto();
			repaytoinfo1.setId(Util.getID());
			repaytoinfo1.setRepaymethod(repaymethod);
			repaytoinfo1.setInterestratetype(ratetype);
			repaytoinfo1.setBatchorg(orgbelongsto);
			repaytoinfo1.setIsfinilyflg("1");
			repaytoinfoService.insertRepaytoinfo(repaytoinfo1);
		}else{//如果不存在最终批复结果，则新增一个批复结果
			Repaytoinfo repaytoinfo1 = new Repaytoinfo();
			try {
				Util.transferFields(repaytoinfo, repaytoinfo1);
			} catch (Exception e) {
				log.info("批复信息实体转换出错");
			}
			//保存最终批复结果
			PersonResponse personinfo = homefeign.personinfo();
			String orgbelongsto = personinfo.getPersoninfo().getOrgbelongsto();
			repaytoinfo1.setId(Util.getID());
			repaytoinfo1.setRepaymethod(repaymethod);
			repaytoinfo1.setInterestratetype(ratetype);
			repaytoinfo1.setBatchorg(orgbelongsto);
			repaytoinfo1.setIsfinilyflg("1");
			repaytoinfoService.insertRepaytoinfo(repaytoinfo1);
		}
		//进行流程跳转
		String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		FlowHandleRequest handlereq=workflowService.selectWorkflow(repaytoinfo.getWorkid(),req.getNodeid());
		FlowHandleResponse res = new FlowHandleResponse();
		handlereq.setHisttype("10");
		handlereq.setActor(userid);
		handlereq.setNotation("");
		handlereq.setNextActor("");
		handlereq.setOperation(req.getOperation());
		if(!req.getOperation().equals("保存")){
			res=workflowfeign.handle(handlereq);
			log.info("流程处理的结果为"+res.getMessage());
		}
		return res;
	}*/
	
	@ApiOperation(value="复议",httpMethod="POST",notes="批复信息的第n个接口",response=FlowHandleResponse.class)
	@RequestMapping("/RetackRepaytoinfo")
	public Response RetaRepaytoinfo(@RequestBody RepaytoInfoRequest2 req){
		List<String> ids = req.getIds() ;
		FlowHandleResponse res = new FlowHandleResponse();
		for (String id : ids) {
			Repaytoinfo repaytoinfo = repaytoinfoService.selectById(id) ;
			String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
			FlowHandleRequest handlereq=workflowService.selectWorkflow(repaytoinfo.getWorkid(),req.getNodeid());
			handlereq.setHisttype("");
			handlereq.setActor(userid);
			handlereq.setNotation("");
			handlereq.setNextActor("");
			handlereq.setOperation(req.getOperation());
			if(!req.getOperation().equals("保存")){
				res=workflowfeign.handle(handlereq);
			}
		}
		
		return res;
	}
	
	@ApiOperation(value="查询批复函信息",httpMethod="POST",response=RepaynotationResponse.class,notes="批复函接口")
	@RequestMapping("selectRepaynotation")
	public Response selectRepaynotation(@RequestBody WorkidRequest req){
		StringBuffer custname=new StringBuffer();
		List<String> custlist=new ArrayList<String>();
		List<String> notation = new ArrayList<String>();
		Repaynotation repayinfo = new Repaynotation();
		List<Workhistory> workhislist = workhistoryService.selectRiskWorkhistory(req);
		//贷款基本信息
		AllLoaninfo loan = loaninfoService.queryAllLoaninfoByWorkid(req);
		if(loan!=null && loan.getCvs()!=null && !loan.getCvs().equals("")){
			BigDecimal cvs = loan.getCvs().multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
			loan.setCvs(cvs);
		}
		//自然人申请人信息和法人申请信息
		List<Custinfo> list = custinfoService.querybyworkid(req);
		List<Applyinfoofcom> applylist = appliinfoofcomService.selectApplyinfoByWorkid(req);
		for(int j=0;j<workhislist.size();j++){
			if(workhislist.get(j).getNotation()!=null && !"".equals(workhislist.get(j).getNotation())){
				notation.add(workhislist.get(j).getNotation());
			}
		}
		if(!list.isEmpty()){
			for(Custinfo cust:list){
				if(cust.getCusttype().contains("1") || cust.getCusttype().contains("2")){
					custlist.add(cust.getCustname());
				}
			}
		}
		if(!applylist.isEmpty()){
			for(Applyinfoofcom apply:applylist){
				if(apply.getApplyertype().contains("1") || apply.getApplyertype().contains("2")){
					custlist.add(apply.getOrgname());
				}
			}
		}
		for(int i=0;i<custlist.size();i++){
			if((custlist.size()-1)==i){
				custname.append(custlist.get(i));
			}else{
				custname.append(custlist.get(i)).append("、");
			}
		}
		repayinfo.setCustname(custname.toString());
		if(loan != null) {
			if(loan.getTotaluseamount()!=null){
				repayinfo.setTotalamount(loan.getTotaluseamount());
			}
			if(loan.getTotaluseamount()!=null){
				repayinfo.setTotalterm(loan.getTotaluseterm());
			}
			if(loan.getSumofamount() != null) {
				repayinfo.setLoanamount(loan.getSumofamount());
			}
			if(loan.getInterestrate() != null) {
				repayinfo.setLoanrate(loan.getInterestrate());
			}
			if(loan.getLoanlimittime() != null) {
				repayinfo.setLoanterm(loan.getLoanlimittime());
			}
			if(loan.getProductname() != null) {
				repayinfo.setProductname(loan.getProductname());
			}
			repayinfo.setNotation(notation);
		}

		return new RepaynotationResponse(repayinfo);
	}
	
	@ApiOperation(value="根据批复机构查询担保方和平台方的结果",httpMethod="POST",notes="批复信息的第一个接口",response=RepaytoinfoResponse.class)
	@RequestMapping("/selectRepaytoinfoByThreeid")
	public Response selectRepaytoinfoByThreeid(@RequestBody WorkidRequest req){
		List<Repaytoinfo> repay = repaytoinfoService.selectRepaytoinfoOrderbytime(req) ;
		if(repay!=null){
			return new RepaytoinfoResponse(repay);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="根据批复机构查询通道和平台的结果",httpMethod="POST",notes="批复信息的第一个接口",response=RepaytoinfoResponse.class)
	@RequestMapping("/selectRepaytoinfoByThreeid2")
	public Response selectRepaytoinfoByThreeid2(@RequestBody WorkidRequest req){
		List<Repaytoinfo> repay = repaytoinfoService.selectRepaytoinfoOrderbytime2(req) ;
		if(repay!=null){
			return new RepaytoinfoResponse(repay);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
}
