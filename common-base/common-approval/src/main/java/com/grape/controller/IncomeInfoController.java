package com.grape.controller;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.IncomeAmountBean;
import com.grape.controller.bean.Monthtotal;
import com.grape.controller.bean.MortgagerentBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.bean.WorkflowInfo;
import com.grape.controller.reponse.BnkincomeBean;
import com.grape.controller.reponse.BnkincomeinfoBean;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.IncomeInfoResponse;
import com.grape.controller.reponse.IncomeInfoResponse2;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.IncomeinfoRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Bnkincomeinfo;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Incomeinfo;
import com.grape.model.db.Mortgage;
import com.grape.model.db.Mortgagerent;
import com.grape.service.BnkincomeinfoService;
import com.grape.service.CodeTableService;
import com.grape.service.CustinfoService;
import com.grape.service.IncomeinfoService;
import com.grape.service.MortgageService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/incomeinfo")
public class IncomeInfoController {
	private final static Logger log = LoggerFactory.getLogger(IncomeInfoController.class);
	@Autowired
	private IncomeinfoService incomeinfoService;
	@Autowired
	private BnkincomeinfoService bnkincomeinfoService;
	@Autowired
	private CustinfoService custinfoService;
	@Autowired
	private MortgageService mortgageService;
	
	@Autowired
	private CodeTableService codeTableService;
	
	@RequestMapping("queryByWorkid")
	@ApiOperation(value="根据申请编号和身份证号码查询收入情况",notes="收入情况接口一",httpMethod="POST",response=IncomeInfoResponse.class)
	public Response queryByWorkid(@RequestBody WorkidAndCerdidRequest req){
		Incomeinfo list = incomeinfoService.queryIncomeByWorkid(req);
		List<Mortgagerent> mortlist = incomeinfoService.selectMortRent(req);
		List<MortgagerentBean> mortbeanlist = new ArrayList<MortgagerentBean>();
		//循环抵押物租金收入信息
		for(int m=0;m<mortlist.size();m++){
			MortgagerentBean mort = new MortgagerentBean();
			String mortgageid = mortlist.get(m).getMortgageid();
			Mortgage mortgage = mortgageService.selectByMortgageid(mortgageid);
			String mortgagename = mortgage.getMartgagename();
			try {
				Util.transferFields(mortlist.get(m), mort);
			} catch (Exception e) {
				log.info("抵押物租金实体类转换错误");
			}
			mort.setMartgagename(mortgagename);
			mortbeanlist.add(mort);
		}
		List<Bnkincomeinfo> incomelist = bnkincomeinfoService.selectBnkincomeList(req);
		List<BnkincomeBean> bnkBean = new ArrayList<BnkincomeBean>();
		List<BnkincomeinfoBean> bnklist = new ArrayList<BnkincomeinfoBean>();
		List<String> accountlist = new ArrayList<String>();
		List<String> bnkname = new ArrayList<String>();
		List<String> bnkname2 = new ArrayList<String>();
		List<String> incomeway = new ArrayList<String>();
		List<String> imcomesource = new ArrayList<String>();
		//循环银行流水信息
		for(int j=0;j<incomelist.size();j++){
			if(!accountlist.contains(incomelist.get(j).getBnkaccount()) ||!bnkname.contains(incomelist.get(j).getBnkname())){
				accountlist.add(incomelist.get(j).getBnkaccount());
				bnkname2.add(incomelist.get(j).getBanname2());
				bnkname.add(incomelist.get(j).getBnkname());
				incomeway.add(incomelist.get(j).getIncomeway());
				imcomesource.add(incomelist.get(j).getAmountsource());
			}
		}
		//循环账号个数
		for(int k=0;k<accountlist.size();k++){
			String account = accountlist.get(k);
			String bnksname=bnkname.get(k);
			String bnksname2=bnkname2.get(k);
			for(int i=0;i<incomelist.size();i++){
				if((!(incomelist.get(i).getBnkaccount()).equals(account))){
					continue;
				}else if((!(incomelist.get(i).getBnkname()).equals(bnksname))){
					continue;
				}else if(bnksname2!=null){
					String name = incomelist.get(i).getBanname2();
					if(name!=null){
						if(!name.equals(bnksname2)){
							continue;
						}
					} 
				}
				BnkincomeinfoBean bnk = new BnkincomeinfoBean();
				bnk.setAmount(incomelist.get(i).getAmount());
				bnk.setIncomedate(incomelist.get(i).getIncomedate());
				bnklist.add(bnk);
			}
			//将银行流水信息组装
			BnkincomeBean bnkin = new BnkincomeBean();
			bnkin.setBanname2(bnkname2.get(k));
			bnkin.setBnkaccount(accountlist.get(k));
			bnkin.setBnkname(bnkname.get(k));
			bnkin.setBnkincomeinfo(bnklist);
			bnkin.setAmountsource(imcomesource.get(k));
			bnkin.setIncomeway(incomeway.get(k));
			bnkBean.add(bnkin);
			bnklist = new ArrayList<BnkincomeinfoBean>();
		}
		//便于回收内存
		accountlist=null;
		bnkname=null;
		bnkname2=null;
		incomeway=null;
		imcomesource=null;
		if(list!=null){
			return new IncomeInfoResponse(list,bnkBean,mortbeanlist);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("queryAllWorkid")
	@ApiOperation(value="根据申请编号查询所有收入情况(风控审批报告)",notes="收入情况接口一",httpMethod="POST",response=IncomeInfoResponse2.class)
	public Response queryAllWorkid(@RequestBody WorkidRequest req){
		BigDecimal totalmonthamount = new BigDecimal(0);
		List<WorkflowInfo> workflowlist = new ArrayList<WorkflowInfo>();
		BigDecimal totalworkflow = new BigDecimal(0);
		List<String> cerdidlist = new ArrayList<String>();
		//近半年其他收入总额
		BigDecimal halfyearreceipt = new BigDecimal(0);
		//近半年其他月均收入总额
		BigDecimal halfyaerincome = new BigDecimal(0);
		//月收入
		List<BigDecimal> rentincome = new ArrayList<BigDecimal>();
		//净利润
		BigDecimal netmargin = new BigDecimal(0);
		//月租金总收入
		//BigDecimal monthamount = new BigDecimal(0);
		//获取所有账号每个月合计金额
		//获取收入审查说明
		String incomenotation="";
		String revertnote = "";
		List<String> datelist = new ArrayList<String>();
		Chanapprovalform chanapprovalform  = incomeinfoService.selectIncomeNotation(req.getWorkid());
		if(chanapprovalform!=null){
			incomenotation=chanapprovalform.getIncomenote();
			revertnote=chanapprovalform.getRevertnote();
		}
		List<Monthtotal> monthtotal = incomeinfoService.selectMonthtotal(req.getWorkid());
		for(int h=0;h<monthtotal.size();h++){
			String date = monthtotal.get(h).getIncomedate();
			if(date!=null){
				date=date.replace("-", "年");
				date=date+"月";
				monthtotal.get(h).setIncomedate(date);
			}
		}
		//获取收入情况表信息
		List<Incomeinfo> list = incomeinfoService.queryInconeinfoByWorkid(req.getWorkid());
		//获取抵押物月租金收入
		List<Mortgagerent> mortlist = incomeinfoService.selectMortRentByWorkid(req);
		//银行码表
		Map<String, String> bnkCodeMap = codeTableService.getCodeMap("AMOUNTOFBANK");
		//收入情况码表
		Map<String, String> incometypeMap = codeTableService.getCodeMap("INCOMETYPE");
		/*for(int a=0;a<mortlist.size();a++){
			monthamount = monthamount.add(mortlist.get(a).getMonthamount());
		}*/
		List<MortgagerentBean> mortbeanlist = new ArrayList<MortgagerentBean>();
		//将抵押物名称转换成中文
		//处理银行流水信息
		List<Bnkincomeinfo> incomelist = bnkincomeinfoService.queryByWorkid(req.getWorkid());
		List<BnkincomeBean> bnkBean = new ArrayList<BnkincomeBean>();
		List<BnkincomeinfoBean> bnklist = new ArrayList<BnkincomeinfoBean>();
		List<String> accountlist = new ArrayList<String>();
		List<String> bnkname = new ArrayList<String>();
		List<String> bnkname2 = new ArrayList<String>();
		List<String> incomeway = new ArrayList<String>();
		List<String> imcomesource = new ArrayList<String>();
		//循环银行流水信息
		for(int j=0;j<incomelist.size();j++){
			String date = Util.date2String(incomelist.get(j).getIncomedate(), "yyyy年MM月");
			if(!datelist.contains(date) && date!=null){
				datelist.add(date);
			}
			if(!accountlist.contains(incomelist.get(j).getBnkaccount()) ||!bnkname.contains(incomelist.get(j).getBnkname())){
				accountlist.add(incomelist.get(j).getBnkaccount());
				bnkname2.add(incomelist.get(j).getBanname2());
				bnkname.add(incomelist.get(j).getBnkname());
				incomeway.add(incomelist.get(j).getIncomeway());
				imcomesource.add(incomelist.get(j).getAmountsource());
			}
		}
		//循环账号个数
		for(int k=0;k<accountlist.size();k++){
			BigDecimal totalamount = new BigDecimal(0);
			String account = accountlist.get(k);
			String bnksname=bnkname.get(k);
			String bnksname2=bnkname2.get(k);
			//将银行流水信息组装
			BnkincomeBean bnkin = new BnkincomeBean();
			//将身份证号码转成名字
			for(int m=0;m<incomelist.size();m++){
				String cerdid = incomelist.get(m).getCerdid();
				if(cerdid!=null){
					List<Custinfo> custinfolist = custinfoService.selectByCerdid(cerdid, req.getWorkid());
					if(custinfolist!=null && !custinfolist.isEmpty()){
						if(custinfolist.get(0).getCusttype().contains("1") || custinfolist.get(0).getCusttype().contains("2")){
							if(incomelist.get(m).getBnkaccount().equals(account)){
								bnkin.setCerdid(custinfolist.get(0).getCustname());
							}
						}else{
							if(cerdid!=null && !cerdidlist.contains(cerdid)){
								cerdidlist.add(cerdid);
							}
						}
					}
				}
			}
			for(int i=0;i<incomelist.size();i++){
				if((!(incomelist.get(i).getBnkaccount()).equals(account))){
					continue;
				}else if((!(incomelist.get(i).getBnkname()).equals(bnksname))){
					continue;
				}else if(bnksname2!=null){
					String name = incomelist.get(i).getBanname2();
					if(name!=null){
						if(!name.equals(bnksname2)){
							continue;
						}
					} 
				}
				//流水总金额
				if(!cerdidlist.contains(incomelist.get(i).getCerdid())){
					totalworkflow=totalworkflow.add(incomelist.get(i).getAmount());
				}
				//单个账号流水合计
				totalamount=totalamount.add(incomelist.get(i).getAmount());
				BnkincomeinfoBean bnk = new BnkincomeinfoBean();
				bnk.setAmount(incomelist.get(i).getAmount());
				bnk.setIncomedate(incomelist.get(i).getIncomedate());
				bnklist.add(bnk);
			}
			if(!cerdidlist.contains(bnkin.getCerdid()) && bnkin.getCerdid()!=null){
				bnkin.setTotalamount(totalamount);
				bnkin.setBanname2(bnkname2.get(k));
				bnkin.setBnkaccount(accountlist.get(k));
				bnkin.setBnkname(bnkname.get(k));
				bnkin.setBnkincomeinfo(bnklist);
				bnkin.setAmountsource(imcomesource.get(k));
				bnkin.setIncomeway(incomeway.get(k));
				bnkBean.add(bnkin);
				//组装收入情况描述
				String tempAccount = "";
				if(bnkin.getBnkaccount()!=null){
					if(bnkin.getBnkaccount().length()>=4){
						tempAccount = bnkin.getBnkaccount().substring(bnkin.getBnkaccount().length()-4);
					}else{
						tempAccount = bnkin.getBnkaccount();
					}
				}
				bnkin.setIncomedesc(bnkCodeMap.get(bnkin.getBnkname())+tempAccount+incometypeMap.get(bnkin.getIncomeway()));
				bnkin.setMonthtotal(monthtotal);
			}
			bnklist = new ArrayList<BnkincomeinfoBean>();
		}
		//pc端需要的银行流水按行计算的银行流水
		Map<String,BigDecimal> sumMap = new HashMap<String,BigDecimal>();
		
		for(int a=0;a<datelist.size();a++){
			WorkflowInfo workflowinfo = new WorkflowInfo();
			List<IncomeAmountBean> amountlist = new ArrayList<IncomeAmountBean>();
			for(int b=0;b<incomelist.size();b++){
				if(Util.date2String(incomelist.get(b).getIncomedate(), "yyyy年MM月").equals(datelist.get(a))){
					String accountname = incomelist.get(b).getBnkaccount();
					if(accountname.length()>3){
						accountname=accountname.substring(incomelist.get(b).getBnkaccount().length()-4);
					}
					IncomeAmountBean bean = new IncomeAmountBean();
					bean.setAmount(incomelist.get(b).getAmount());
					bean.setBnkincomeofch(bnkCodeMap.get(incomelist.get(b).getBnkname())+accountname+incometypeMap.get(incomelist.get(b).getIncomeway()));
					totalmonthamount=totalmonthamount.add(incomelist.get(b).getAmount());
					amountlist.add(bean);
					//累计
					BigDecimal temp = sumMap.get(bean.getBnkincomeofch());
					if(temp==null){
						temp = new BigDecimal(0);
					}
					temp = temp.add(incomelist.get(b).getAmount());
					sumMap.put(bean.getBnkincomeofch(), temp);
				}
			}
			workflowinfo.setAmountlist(amountlist);
			workflowinfo.setIncomedate(datelist.get(a));
			workflowinfo.setTotammonthamount(totalmonthamount);
			workflowlist.add(workflowinfo);
			totalmonthamount=new BigDecimal(0);
		}
		
		WorkflowInfo totalInfo = new WorkflowInfo();
		List<IncomeAmountBean> totalList = new ArrayList<IncomeAmountBean>();
		totalInfo.setAmountlist(totalList);
		if(workflowlist!=null && !workflowlist.isEmpty()){
			List<IncomeAmountBean> amountListFirst = workflowlist.get(0).getAmountlist();
			BigDecimal total = new BigDecimal(0);
			
			for (int i = 0; i < amountListFirst.size(); i++) {
				IncomeAmountBean bean = amountListFirst.get(i);
				IncomeAmountBean totalTemp = new IncomeAmountBean();
				totalTemp.setAmount(sumMap.get(bean.getBnkincomeofch()));
				totalTemp.setBnkincomeofch(bean.getBnkincomeofch());
				totalList.add(totalTemp);
				
				total = total.add(totalTemp.getAmount());
			}
			totalInfo.setTotammonthamount(total);
			totalInfo.setIncomedate("合计");
			workflowlist.add(totalInfo);
		}
		for(int m=0;m<mortlist.size();m++){
			MortgagerentBean mort = new MortgagerentBean();
			String mortgageid = mortlist.get(m).getMortgageid();
			Mortgage mortgage = mortgageService.selectByMortgageid(mortgageid);
			String mortgagename = mortgage.getMartgagename();
			try {
				Util.transferFields(mortlist.get(m), mort);
			} catch (Exception e) {
				log.info("抵押物租金实体类转换错误");
			}
			mort.setMartgagename(mortgagename);
			if(mortlist!=null && !mortlist.isEmpty()){
				if(mortlist.get(m).getCerdid()!=null && !cerdidlist.contains(mortlist.get(m).getCerdid())){
					mortbeanlist.add(mort);
				}
			}
			
		}
		for(int n=0;n<list.size();n++){
			if(list.get(n).getCerdid()!=null && !cerdidlist.contains(list.get(n).getCerdid())){
				if(list.get(n).getHalfyearreceipt()!=null){
					halfyearreceipt = halfyearreceipt.add(list.get(n).getHalfyearreceipt());
				}
				if(list.get(n).getHalfyaerincome()!=null){
					halfyaerincome = halfyaerincome.add(list.get(n).getHalfyaerincome());
				}
				if(list.get(n).getRentincome()!=null){
					rentincome.add(list.get(n).getRentincome());
				}
				if(list.get(n).getNetmargin()!=null && !list.get(n).getNetmargin().equals("")){
					netmargin = netmargin.add(new BigDecimal(list.get(n).getNetmargin()));
				}
			}
		}
		BigDecimal monamount = new BigDecimal(0);
		if(rentincome!=null && !rentincome.isEmpty()){
			monamount = Collections.max(rentincome);
		}
		//组装收入总计
		Incomeinfo incomeinfo = new Incomeinfo();
		incomeinfo.setWorkid(req.getWorkid());
		incomeinfo.setHalfyaerincome(halfyaerincome);
		incomeinfo.setHalfyearreceipt(halfyearreceipt);
		incomeinfo.setRentincome(monamount);
		incomeinfo.setNetmargin(netmargin.toString());
		//便于回收内存
		accountlist=null;
		bnkname=null;
		bnkname2=null;
		incomeway=null;
		imcomesource=null;
		if(list!=null && !list.isEmpty()){
			return new IncomeInfoResponse2(incomeinfo,totalworkflow,bnkBean,mortbeanlist,incomenotation,revertnote,workflowlist);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("insertIncomeinfo")
	@ApiOperation(value="插入收入情况",notes="收入情况接口二",httpMethod="POST",response=IncomeInfoResponse.class)
	public Response insertIncomeinfo(@RequestBody IncomeinfoRequest req){
		incomeinfoService.insertIncomeInfo(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("updateIncomeinfo")
	@ApiOperation(value="更新收入情况",notes="收入情况接口三",httpMethod="POST",response=IncomeInfoResponse.class)
	public Response updateIncomeinfo(@RequestBody IncomeinfoRequest req){
		incomeinfoService.updateincomeinfo(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("deleteIncomeinfo")
	@ApiOperation(value="根据主键workid和身份证号码删除收入情况",notes="收入情况接口四",httpMethod="POST",response=IncomeInfoResponse.class)
	public Response deleteIncomeinfo(@RequestBody WorkidAndCerdidRequest req){
		incomeinfoService.deleteincomeinfo(req);
		return new RestfulResponse();
	}
}
