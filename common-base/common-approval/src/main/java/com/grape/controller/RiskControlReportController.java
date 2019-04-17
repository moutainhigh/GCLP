package com.grape.controller;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.CompanyFeign;
import com.grape.controller.reponse.ApprovalRecordResponse;
import com.grape.controller.reponse.CreditLineResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.MortgageInfoResponse;
import com.grape.controller.reponse.PhoneVerificationResponse;
import com.grape.controller.reponse.PlanNaccountResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.WaihuCalllogResponse;
import com.grape.controller.reponse.WorkhistoryResponse;
import com.grape.controller.reponse.WorkhistoryResponse2;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.MortgagefilingRequest;
import com.grape.controller.request.PhoneverificationRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.controller.response.bean.AccountInfo;
import com.grape.controller.response.bean.ChannelassessInfo;
import com.grape.controller.response.bean.CreditLineBean;
import com.grape.controller.response.bean.MortgageInfo;
import com.grape.controller.response.bean.MortgageInfoBean;
import com.grape.controller.response.bean.RiskinfoBean;
import com.grape.controller.response.bean.WaihuCalllog;
import com.grape.model.db.Bnkaccount;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Codetable;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Delimortgage;
import com.grape.model.db.Doctask;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.Houseassess;
import com.grape.model.db.Mortgage;
import com.grape.model.db.Mortgagefiling;
import com.grape.model.db.Phoneverification;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.model.db.Redemptiontype;
import com.grape.model.db.Riskinfo;
import com.grape.model.db.Workhistory;
import com.grape.service.BnkaccountService;
import com.grape.service.ChanapprovalformService;
import com.grape.service.CityService;
import com.grape.service.CodeTableService;
import com.grape.service.CustinfoService;
import com.grape.service.DelimortgageService;
import com.grape.service.DoctaskService;
import com.grape.service.ExceptloaninfoService;
import com.grape.service.HouseAssessService;
import com.grape.service.MortgageService;
import com.grape.service.MortgagefilingService;
import com.grape.service.PersonService;
import com.grape.service.PhoneverificationService;
import com.grape.service.ProductnodeService;
import com.grape.service.RedemptiontypeService;
import com.grape.service.WorkhistoryService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/risk_control")
@Log4j
public class RiskControlReportController {

	@Autowired
	RedemptiontypeService redemptiontypeService;
	@Autowired
	BnkaccountService bnkAccountService;
	
	@Autowired
	ChanapprovalformService approvalService;
	
	@Autowired
	WorkhistoryService workhistoryService;
	@Autowired
	PersonService personService;
	
	@Autowired
	ProductnodeService productnodeService;
	
	@Autowired
	CompanyFeign companyFeign;
	
	@Autowired
	MortgageService mortgageService;
	
	@Autowired
	MortgagefilingService mortgagefilingService;
	
	@Autowired
	HouseAssessService houseAssessService;
	
	@Autowired
	PhoneverificationService phoneverificationService;
	
	@Autowired
	DelimortgageService delimortgageService;
	
	@Autowired
	CustinfoService custinfoService;
	
	@Autowired
	ExceptloaninfoService exceptloaninfoService;
	
	@Autowired
	CodeTableService codetableService;
	
	@Autowired
	CityService cityService;
	
	@Autowired
	DoctaskService doctaskService;
	
	
	
	@ApiOperation(value="赎楼方案和银行账户",notes="返回赎楼方案和银行账户信息",httpMethod="POST",response = PlanNaccountResponse.class)
	@RequestMapping("/planNaccount")
	public Response planNaccount(@RequestBody WorkidRequest req) {
		try {
			Redemptiontype redemptiontype = redemptiontypeService.findRedemptiontypeByWorkid(req.getWorkid());
		
			Bnkaccount bnkaccount = bnkAccountService.queryBnkaccountByWorkid(req.getWorkid());
			AccountInfo accountInfo = new AccountInfo();
			
			try {
				Util.transferFields(bnkaccount, accountInfo);
			} catch (Exception e) {
				log.info("转换银行账户信息实体失败");
			}
			if(redemptiontype==null){
				redemptiontype = new Redemptiontype();
			}
			return new PlanNaccountResponse(redemptiontype, accountInfo);
		} catch (Exception e) {
			log.info(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL, "查询赎楼方案或银行账户信息失败！")	;
		}
			
	}
	
	@ApiOperation(value="风控审批记录时间轴",notes="返回风控审批历史记录",response=WorkhistoryResponse.class,httpMethod="POST")
	@RequestMapping("/approval_record_time")
	public Response approval_record_time(@RequestBody WorkidRequest req) {
		try {
			
			//先组装一个只带节点名称的路线图
			List<Workhistory> cachelist = new ArrayList<>();
			
			Workhistory workhistory1 = new Workhistory();
			workhistory1.setNode("资金方二级审批");
			cachelist.add(workhistory1);
			Workhistory workhistory2 = new Workhistory();
			workhistory2.setNode("资金方三级审批");
			cachelist.add(workhistory2);
			//暂时先以期望金额判断，后期要加区域等级
				Exceptloaninfo exceptloaninfo = exceptloaninfoService.querybyWorkid(req.getWorkid());
				if(exceptloaninfo!=null){
					BigDecimal expectapplyamount = exceptloaninfo.getExpectapplyamount();
					if(expectapplyamount.compareTo(new BigDecimal(5000000))>=0){
						Workhistory workhistory3 = new Workhistory();
						workhistory3.setNode("资金方贷审会审批");
						cachelist.add(workhistory3);
					}
					if(expectapplyamount.compareTo(new BigDecimal(10000000))>=0){
						Workhistory workhistory4 = new Workhistory();
						workhistory4.setNode("资金方股东会审批");
						cachelist.add(workhistory4); 
					}

				}
				
			
			
			
			//查询风控审批记录(11代表风控审批类型)
			List<Workhistory> workhistories = workhistoryService.findWorkhistList(req.getWorkid(), "11","3");
			//资金方一级审批记录
			List<Workhistory> cachedeletelist = new ArrayList<>();
			
				for (int i=0;i<workhistories.size();i++) {
					Workhistory workhistory = workhistories.get(i);
					
					
					
					//将节点id转换成节点名称
					Productnode node = workhistoryService.selectProductNode(workhistory.getNode());
					//如果节点名称为资金方一级审批，移除不显示
					if("资金方一级审批".equals(node.getNodename())){
						cachedeletelist.add(workhistory);
						continue;
					}
					workhistory.setNode(node.getNodename());
					
					//如果已经走过节点则移除路线图对应的节点
					if(!cachelist.isEmpty()){
						for (int j=0;j<cachelist.size();j++) {
							if(cachelist.get(j).getNode().equals(node.getNodename())){
								cachelist.remove(cachelist.get(j));
							}
						}
						
					}

					//将工作号转成员工名字
					String workername=personService.selectByWorkerid(workhistory.getUserid()).getWorkername();
					if(!workername.equals("")){
						workhistory.setUserid(workername);
					}
					
					
					
				}
				
				//移除不显示
				
				if(!cachedeletelist.isEmpty()){
					for (Workhistory workhistory : cachedeletelist) {
						workhistories.remove(workhistory);
					}
					
				}
				
				/*//当前所在节点
				String nodename = productnodeService.selectNodenameByWorkid(req.getWorkid());
				if(nodename!=null){
					Workhistory workhis = new Workhistory();
					workhis.setId(Util.getID());
					workhis.setNode(nodename);
					workhis.setOperdate(new Date());
					workhistories.add(workhis);
				}*/
				workhistories.addAll(cachelist);
				return new WorkhistoryResponse2(workhistories);
			
		
			
		} catch (Exception e) {
			log.info(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL, "查询风控审批记录失败！");
		}
		
		
		
	}
	
	@ApiOperation(value="风控审批记录详细信息",notes="返回风控审批记录详细信息",response=ApprovalRecordResponse.class,httpMethod="POST")
	@RequestMapping("/approval_record_info")
	public Response approval_record_info(@RequestBody IdRequest req) {
		try {
			//查询id对应的审批详细信息
			Chanapprovalform chanapprovalform = new Chanapprovalform();
			chanapprovalform = approvalService.selectchanapprovalByLogid(req.getId());
			if(chanapprovalform!=null){
				ApprovalRecordResponse approvalRecordResponse = new ApprovalRecordResponse();
				approvalRecordResponse.setChanapprovalform(chanapprovalform);
				/*Productnode node = workhistoryService.selectProductNode(chanapprovalform.getNodeid());
				
					if("资金方一级审批".equals(node.getNodename())){
						//如果风控审批记录中节点为资金方一级审批，加入电话核查信息
						try {
							WorkidRequest workidRequest = new WorkidRequest();
							workidRequest.setWorkid(chanapprovalform.getWorkid());
							WaihuCalllogResponse calllogResponse = companyFeign.callloginfo(workidRequest);
							PhoneVirification phoneVirification = new PhoneVirification();
							phoneVirification.setCalllogs(calllogResponse.getCalllogs());
							phoneVirification.setNotation(calllogResponse.getNotation());
							approvalRecordResponse.setPhoneVirification(phoneVirification);
						} catch (Exception e) {
							log.info(e.getMessage());
						}

					}*/
				return approvalRecordResponse;
			}else{
				return new ErrorEntity(StatusCode.NULL_CONTENT, "无风控审批记录");
			}
		} catch (Exception e) {
			log.info(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL, "查询风控审批记录失败！");
		}
		
	}
	
	@ApiOperation(value="抵押物信息",notes="返回抵押物信息",httpMethod="POST",response = MortgageInfoResponse.class)
	@RequestMapping("/mortgage_info")
	public Response mortgage_info(@RequestBody WorkidRequest req) {
		try {
			List<MortgageInfo> mortgageInfoList = new ArrayList<>();
			MortgageInfoResponse mortgageInfoResponse = new MortgageInfoResponse();
			
			//查询抵押物信息审查
			
			String mortgagenote = approvalService.findMortgagenote(req.getWorkid());
			mortgageInfoResponse.setReviewInformation(mortgagenote);
			//查询流水下所有抵押物信息
			List<Mortgage> mortgages = mortgageService.queryMortgageByWorkid(req);
			if(!mortgages.isEmpty()){
				
				for (Mortgage mortgage : mortgages) {
					
					MortgageInfoBean mortgageInfoBean = new MortgageInfoBean();
					MortgageInfo mortgageInfo = new MortgageInfo();
					//将身份证号转换为姓名
					WorkidAndCerdidRequest request = new WorkidAndCerdidRequest();
					
					//由于身份证可以有多个，需截取字符串
					String propertyowner = mortgage.getPropertyowner();
					if(!Util.isBlank(propertyowner)){
						String[] propertyowners = propertyowner.split(",");
						StringBuilder newOwner = new StringBuilder();
						for (String string : propertyowners) {
							request.setCerdid(string);
							request.setWorkid(mortgage.getWorkid());
							Custinfo custinfo = custinfoService.queryByCerdidAndWorkid(request);
							if(custinfo!=null){
								newOwner.append(custinfo.getCustname()+",");
							}
						}
						if(newOwner.toString().contains(",")){
							mortgage.setPropertyowner(newOwner.toString().substring(0, newOwner.length()-1));
						}else{
							mortgage.setPropertyowner("");
						}
						
					}
					
					
					
					//转换所属省份，城市，区域
					String shengfen = cityService.getCityname(mortgage.getHouseaddressprovince());
					mortgage.setHouseaddressprovince(shengfen);
					String chengshi = cityService.getCityname(mortgage.getHouseaddresscity());
					mortgage.setHouseaddresscity(chengshi);
					String quyu = cityService.getCityname(mortgage.getHouseaddressarea());
					mortgage.setHouseaddressarea(quyu);
					
					try {
						Util.transferFields(mortgage, mortgageInfoBean);
					} catch (Exception e) {
						log.info("转换抵押物信息实体类失败");
					}
					
					
					
					//查询抵押物查档信息
					MortgagefilingRequest mortgagefilingRequest = new MortgagefilingRequest();
					mortgagefilingRequest.setMortgagefilingid(mortgage.getId());
					Mortgagefiling mortgagefiling = new Mortgagefiling();
					mortgagefiling = mortgagefilingService.selectMortgageById(mortgagefilingRequest);
					if(mortgagefiling!=null){
						//转换顺位人类型
						if(!Util.isBlank(mortgagefiling.getMortgages1())){
							Codetable codetable = codetableService.findByPrimarkey("NEXTMORTGAGE", mortgagefiling.getMortgages1());
							mortgagefiling.setMortgages1(codetable.getCoddes());
						}
						if(!Util.isBlank(mortgagefiling.getMortgages2())){
							Codetable codetable2 = codetableService.findByPrimarkey("NEXTMORTGAGE", mortgagefiling.getMortgages2());
							mortgagefiling.setMortgages2(codetable2.getCoddes());
						}
						try {
							Util.transferFields(mortgagefiling, mortgageInfoBean);
						} catch (Exception e) {
							log.info("转换抵押物查档信息实体类失败");
						}
					}
					
					
					
					//是否为电梯房
					Delimortgage delimortgage = delimortgageService.queryDelimortgageById(mortgage.getId());
					if(delimortgage!=null){
						mortgageInfoBean.setIselevatorroom(delimortgage.getIselevatorroom());
						mortgageInfoBean.setFloors(delimortgage.getFloors());
						mortgageInfoBean.setNumberoflayers(delimortgage.getNumberoflayers());
					}
					
					mortgageInfo.setMortgageinfo(mortgageInfoBean);
					//查询抵押物评估信息
					List<Houseassess> houseassesses = houseAssessService.findHouseAssessList(mortgage.getWorkid(), mortgage.getId());
					if(!houseassesses.isEmpty()){
						
						List<ChannelassessInfo> channelassessInfos = new ArrayList<>();
						
						for (Houseassess houseassess : houseassesses) {
							//如果是系统评估信息
							if("系统".equals(houseassess.getChannel())){
								
								
								//取线上评估单价和总价
								mortgageInfo.setOnlineprice(houseassess.getAssessOnlinePrice());
								
								mortgageInfo.setOnlinetotal(houseassess.getAssessOnlineTotal());
								
								//如果产品类型为房抵贷，则显示综合价格和成交价
								Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
								Product product = doctaskService.findProductByNo(doctask.getProductno());
								String producttype = product.getProducttype();
								if (("5".equals(producttype) && "ZQ002".equals(doctask.getProductno())) || "1".equals(producttype)) {

									//取综合评估单价和总价
									mortgageInfo.setControlprice(houseassess.getAssessControlPrice());
									mortgageInfo.setControltotal(houseassess.getAssessControlTotal());
									//快速成交单价和总价
									ChannelassessInfo channelassessInfo = new ChannelassessInfo();
									channelassessInfo.setAssesschannel("当前快速成交价（店询）");
									if(houseassess.getQuickUnitPrice()!=null){
										channelassessInfo.setAssessprice(houseassess.getQuickUnitPrice());
										channelassessInfo.setAssesstotal(houseassess.getQuickUnitPrice().multiply(new BigDecimal(mortgage.getFloorarea())));
										
									}
									channelassessInfos.add(channelassessInfo);
									
									
									//一般成交单价和总价
									ChannelassessInfo channelassessInfo2 = new ChannelassessInfo();
									channelassessInfo2.setAssesschannel("一般成交价（店询）");
									if(houseassess.getGeneralUnitPrice()!=null){
										channelassessInfo2.setAssessprice(houseassess.getGeneralUnitPrice());
										channelassessInfo2.setAssesstotal(houseassess.getGeneralUnitPrice().multiply(new BigDecimal(mortgage.getFloorarea())));
									}
									
									channelassessInfos.add(channelassessInfo2);
								}
								
								
							}else{
								//其他评估渠道直接放入
								ChannelassessInfo channelassessInfo3 = new ChannelassessInfo();
								channelassessInfo3.setAssesschannel(houseassess.getChannel());
								channelassessInfo3.setAssessprice(houseassess.getAssessOnlinePrice());
								channelassessInfo3.setAssesstotal(houseassess.getAssessOnlineTotal());
								channelassessInfos.add(channelassessInfo3);
							}
							
						}
						mortgageInfo.setChannelassessInfos(channelassessInfos);
					}
					
				
					mortgageInfoList.add(mortgageInfo);
				}
			}else{
				return new ErrorEntity(StatusCode.NULL_CONTENT, "抵押物信息为空！");
			}
			
			mortgageInfoResponse.setMortgageInfoList(mortgageInfoList);
			return mortgageInfoResponse;
		} catch (Exception e) {
			log.info(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL, "查询抵押物信息失败！")	;
		}
			
	}
	
	@ApiOperation(value="建议授信额度",notes="返回建议授信额度信息",httpMethod="POST",response = CreditLineResponse.class)
	@RequestMapping("/credit_line")
	public Response credit_line(@RequestBody WorkidRequest req) { 
		try {
			Chanapprovalform chanapprovalform = approvalService.findChanapprovalformByNode(req.getWorkid());
			CreditLineBean creditLineBean = new CreditLineBean();
			if(chanapprovalform!=null){
				try {
					Util.transferFields(chanapprovalform, creditLineBean);
				} catch (Exception e) {
					log.info("转换建议授信额度实体失败");
				}
			}
			//前端要求为空字符串
			if(creditLineBean.getColumnselect()==null){
				creditLineBean.setColumnselect("");
			}
			return new CreditLineResponse(creditLineBean);
		} catch (Exception e) {
			log.info(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL, "查询建议授信额度失败！")	;
		}
			
	}
	
	@ApiOperation(value="电话核查信息",notes="返回电话核查信息",httpMethod="POST",response = PhoneVerificationResponse.class)
	@RequestMapping("/phone_varification")
	public Response Phone_varification(@RequestBody WorkidRequest req) {
		try {
			
			//查询电话核查信息
			
			List<WaihuCalllog> calllogs = new ArrayList<>();
			Phoneverification phoneverification = phoneverificationService.findPhoneverificationByWorkid(req.getWorkid());
			
			if(phoneverification==null){
				phoneverification = new Phoneverification();
			}
			//获取风险信息
			List<Riskinfo> riskinfos = phoneverificationService.findRiskinfoByWorkid(req.getWorkid());
			//获取电话通话记录
			try {
				WorkidRequest workidRequest = new WorkidRequest();
				workidRequest.setWorkid(req.getWorkid());
				WaihuCalllogResponse calllogResponse = companyFeign.callloginfo(workidRequest);
				calllogs = calllogResponse.getCalllogs();
	
			} catch (Exception e) {
				log.info(e.getMessage());
			}
			
			return new PhoneVerificationResponse(phoneverification,riskinfos, calllogs);
		} catch (Exception e) {
			log.info(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL, "查询电话核查信息失败！")	;
		}
		
			
	}
	
	@ApiOperation(value="电话核查信息保存",notes="返回操作状态",httpMethod="POST",response = RestfulResponse.class)
	@RequestMapping("/phone_varification_save")
	public Response phone_varification_save(@RequestBody PhoneverificationRequest req) {
		try {
			
			//实体类转换
			Phoneverification phoneverification = new Phoneverification();
			
			try {
				Util.transferFields(req, phoneverification);
				phoneverification.setChgdt(new Date());
				String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
				phoneverification.setChgtl(workerid);
				
				List<RiskinfoBean> riskinfos = req.getRiskinfos();
				
				//查询时候以前有数据，有则删除
				List<Riskinfo> existRiskinfos = phoneverificationService.findRiskinfoByWorkid(req.getWorkid());
				if(!existRiskinfos.isEmpty()){
					phoneverificationService.deleteRiskinfo(req.getWorkid());
				}
				for (RiskinfoBean riskinfoBean : riskinfos) {
					Riskinfo riskinfo = new Riskinfo();
					riskinfo.setWorkid(req.getWorkid());
					riskinfo.setId(Util.getID());
					riskinfo.setRiskadvice(riskinfoBean.getRiskadvice());
					riskinfo.setRiskdiclosure(riskinfoBean.getRiskdiclosure());
					phoneverificationService.insertRiskinfo(riskinfo);
				}
			} catch (Exception e) {
				log.info("电话核查信息实体类转换出错");
			}
			
			//先查询是否已有该条数据
			Phoneverification olePhoneverification = phoneverificationService.findPhoneverificationByWorkid(req.getWorkid());
			//如果已有该数据，则更新，没有则插入
			
			if(olePhoneverification!=null){
				phoneverificationService.update(phoneverification);
			}else{
				phoneverificationService.insert(phoneverification);
			}
			
			return new ErrorEntity(StatusCode.OK, "操作成功!");
		} catch (Exception e) {
			log.info(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL, "操作失败！")	;
		}
		
			
	}
	
	
}
