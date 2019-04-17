package com.grape.controller;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.*;
import com.grape.controller.request.*;
import com.grape.controller.response.bean.ComapplyBean;
import com.grape.model.db.*;
import com.grape.model.db.Redemptiontype;
import com.grape.service.*;
import com.grape.util.Util;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/applyforex")
public class ApplyforexController {
    private static final Logger log = LoggerFactory.getLogger(ApplyforexController.class);
    @Autowired
    private ApplyforexService applyforexService;
    @Autowired
    private CustinfoService custinfoService;
    @Autowired
    private WorkflowForeign workflowfeign;
    @Autowired
    private WorkflowService workflowService;
    @Autowired
    private WorkitemService workitemService;
    @Autowired
    private ExpectloaninfoService expectloaninfoService;
    @Autowired
    private LoaninfoService loaninfoService;
    @Autowired
    private DoctaskService doctaskService;
    @Autowired
    private WorkhistoryService workhistoryService;
    @Autowired
    private CreditrecordService creditrecodeService;
    @Autowired
    private DebtinfoService debtinfoService;
    @Autowired
    private IncomeinfoService incomeinfoService;
    @Autowired
    private AssetinfoService assetinfoService;
    @Autowired
    private MortgageService mortgageService;
    @Autowired
    private ImageService imageService;
    @Autowired
    private DiliapplicateinfoService deliapplicateinfoService;
    @Autowired
    private DelimortgageService delimortgageService;
    @Autowired
    private BuildingpropertyService buildingpropertyService;
    @Autowired
    private LiveinfoService liveinfoService;
    @Autowired
    private BnkaccountService bnkaccountService;
    @Autowired
    private BnkincomeinfoService bnkincomeinfoService;
    @Autowired
    private OtherapplyinfoService otherapplyinfoService;
    @Autowired
    private MortgagefilingService mortgagefilingService;
    @Autowired
    private MattersAttentionservice mattersAttentionservice;
    @Autowired
    private RedemptiontypeService redemptiontypeService;

    @RequestMapping("/isApplyforex")
    @ApiOperation(value = "是否可以申请展期", httpMethod = "POST", notes = "接口")
    public Response isApplyforex(@RequestBody WorkidRequest req) {
        String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        List<Workhistory> workhistory = workhistoryService.selectWorkhistory(req);
        Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
        IsApplyforexBean apply = new IsApplyforexBean();
        Product Producttype = new Product();
        Producttype = applyforexService.selectProducttype(req);
        /*Applyforex applyforex = applyforexService.selectByPrimaryKey(req.getWorkid()) ;*/
        List<Applyforex> applist = applyforexService.selectByWorkid(req.getWorkid());

        /*if(workhistory.contains(("A5")) || workhistory.contains("B5")) {*/
        if (userid.equals(doctask.getUserid()) && applist.isEmpty()) {
            List<Repayplan> list = applyforexService.isApplyforex(req.getWorkid());
            if (!list.isEmpty() && list.size() > 2) {
                Repayplan repayplan = list.get(1);
                if (repayplan.getRepaydate().getTime() < new Date().getTime()) {
                    boolean IsApplyforex = true;
                    apply.setApplyforex(IsApplyforex);
                    apply.setProducttype(Producttype.getProducttype());
                }
                return new IsApplyforexResponse(apply);
            }
        }

        boolean IsApplyforex = false;
        apply.setApplyforex(IsApplyforex);
        apply.setProducttype(Producttype.getProducttype());
        return new IsApplyforexResponse(apply);
    }


    @RequestMapping("/insertApplyforex")
    @ApiOperation(value = "新增申请展期", httpMethod = "POST", notes = "接口", response = ApplyforexRequest.class)
    public Response insertApplyforex(@RequestBody ApplyforexRequest req) {
        Applyforex applyforex = applyforexService.selectByPrimaryKey(req.getWorkid());
        if (applyforex == null) {
            Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
            String productno = null;
            if (doctask != null && doctask.getProductno() != null) {
                productno = doctask.getProductno().startsWith("SLD") ? "ZQ001" : "ZQ002";
            }
            FlowCreateRequest fcreq = new FlowCreateRequest();
            fcreq.setProductno(productno);
            /*fcreq.setProductno("ZQ001") ;*/
            String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
            fcreq.setActor(workerid);
            FlowCreateResponse startProcess = workflowfeign.startProcess(fcreq);
            if (startProcess.getCode() != 20000) {
                log.info("生成的新的流程:" + startProcess);
                return startProcess;
            }

            List<Workitem> list = workitemService.selectByWorkid(startProcess.getWorkid());
            Workitem workitem = new Workitem();
            if (!list.isEmpty() && list.size() > 0) {
                workitem = list.get(0);
            }

            String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
            log.info("=======================================================================================workid" + startProcess.getWorkid() + "  " + workitem.getNode());
            FlowHandleRequest handlereq = workflowService.selectWorkflow(startProcess.getWorkid(), workitem.getNode());
            FlowHandleResponse res = new FlowHandleResponse();
            if (null != handlereq) {
                handlereq.setHisttype("");
                handlereq.setActor(userid);
                handlereq.setNotation("");
                handlereq.setNextActor("");
                handlereq.setOperation(req.getOperation());
                if (!req.getOperation().equals("保存")) {
                    res = workflowfeign.handle(handlereq);
                    if (res.getCode() != 20000) {
                        return res;
                    }
                }
            }

            req.setNewworkid(startProcess.getWorkid());
            WorkidRequest workid = new WorkidRequest();
            workid.setWorkid(req.getWorkid());
            Product product = loaninfoService.selectrepaymethodAndratetype(workid);
            ExpectloaninfoRequest exreq = new ExpectloaninfoRequest();
            exreq.setWorkid(startProcess.getWorkid());
            exreq.setExpectapplyamount(req.getExamount());
            exreq.setExpectapplyrate(req.getExinterestrate());
            exreq.setExpectapplyyear(req.getExage());
            exreq.setRepaymethod(product.getRepaymethod());
            exreq.setInterestratetype(product.getRatetype().toString());

            expectloaninfoService.insertExpectloaninfo(exreq);
            applyforexService.insertApplyforex(req);

            //共同借款人
            List<ComapplyBean> req2 = req.getComapplyBean();
            /*ComapplyRequest req2 = new ComapplyRequest() ;*/

            Custinfo cust = new Custinfo();
            if (null != req.getExamount()) {
                if (req2 != null && !req2.isEmpty() && req2.size() > 0) {
                    for (ComapplyBean comapplyBean : req2) {
                        if (null != comapplyBean.getComapply()) {
                            cust.setWorkid(req.getNewworkid());
                            cust.setCusttype("2");
                            cust.setCustname(comapplyBean.getComapply());
                            cust.setCerdid(comapplyBean.getIdenti());
                            cust.setCountry(comapplyBean.getNationality());
                            custinfoService.insertComcust(cust);
                        }
                    }
                }
            }

            //申请人信息
            req.setNewworkid(startProcess.getWorkid());
            WorkidRequest workidreq = new WorkidRequest();
            workidreq.setWorkid(req.getWorkid());
            List<Custinfo> custinfos = custinfoService.querybyworkid(workidreq);
            for (Custinfo custinfo : custinfos) {
                custinfo.setWorkid(startProcess.getWorkid());
                custinfoService.insertComcust(custinfo);
            }
			/*request.setCerdid(req.getIdentifino());
			Custinfo custinfo = custinfoService.queryByCerdidAndWorkid(request) ;*/
			/*CustinfoForm custinfoform = new CustinfoForm();
			try {
				Util.transferFields(custinfo, custinfoform);
			} catch (Exception e) {
				log.info("success for transferFields");
			}*/


            //判断离风控审批时间间隔
            List<String> stagelist = new ArrayList<>();
            List<Long> date = new ArrayList<>();
            stagelist.add("2");
            stagelist.add("3");
            stagelist.add("4");
            Doctask doct = doctaskService.queryByWorkid(startProcess.getWorkid());
            List<Workhistory> workhistory = workhistoryService.selectWorkhistory(workid);
            if (null != workhistory && workhistory.size() > 0) {
                for (Workhistory workhis : workhistory) {
                    if (null != doct && stagelist.contains(workhis.getStage())) {
                        date.add(doct.getChgdt().getTime() - workhis.getOperdate().getTime());
                    }
                }
            }

            if (Collections.max(date) < 7776000000L) {//新流水建立时间 - 上笔流水最后操作时间 < 3 个月

                //信用记录
                List<Creditrecode> creditrecode = creditrecodeService.queryByWorkid(req.getWorkid());
                CreditrecodeRequest creditReq = new CreditrecodeRequest();
                if (creditrecode != null && !creditrecode.isEmpty()) {
                    for (Creditrecode credit : creditrecode) {
                        credit.setWorkid(startProcess.getWorkid());
                        try {
                            Util.transferFields(credit, creditReq);
                        } catch (Exception e) {
                            log.info("success for transferFields");
                            new RuntimeException();
                        }
                        creditrecodeService.insertCreditInfo(creditReq);
                    }
                }

                //负债信息
                List<Debtinfo> debtinfo = debtinfoService.queryByWorkid(req.getWorkid());
                if (debtinfo != null && !debtinfo.isEmpty()) {
                    for (Debtinfo debt : debtinfo) {
                        debt.setWorkid(startProcess.getWorkid());
                        debt.setId(Util.getID());
                        debtinfoService.insertDebtin(debt);
                    }
                }

                //收入情况
                List<Incomeinfo> incomeinfo = incomeinfoService.queryInconeinfoByWorkid(req.getWorkid());
                IncomeinfoRequest incomeReq = new IncomeinfoRequest();
                if (incomeinfo != null && !incomeinfo.isEmpty()) {
                    for (Incomeinfo income : incomeinfo) {
                        income.setWorkid(startProcess.getWorkid());
                        try {
                            Util.transferFields(income, incomeReq);
                        } catch (Exception e) {
                            log.info("success for transferFields");
                            new RuntimeException();
                        }
                        incomeinfoService.insertIncomeInfo(incomeReq);
                    }
                }

                //银行账户
                Bnkaccount bnkaccount = bnkaccountService.queryBnkaccountByWorkid(req.getWorkid());
                if (null != bnkaccount) {
                    bnkaccount.setWorkid(startProcess.getWorkid());
                    bnkaccountService.insertBnkaccounts(bnkaccount);
                }

                //银行收入情况
                List<Bnkincomeinfo> bnkincomeinfos = bnkincomeinfoService.queryByWorkid(req.getWorkid());
                if (null != bnkincomeinfos && bnkincomeinfos.size() > 0) {
                    for (Bnkincomeinfo bnk :
                            bnkincomeinfos) {
                        bnk.setId(Util.getID());
                        bnk.setWorkid(startProcess.getWorkid());
                        bnkincomeinfoService.insertBnkincominfo(bnk);
                    }
                }

                //其他贷款用途
                WorkidRequest workids = new WorkidRequest();
                workids.setWorkid(req.getWorkid());
                Otherapplyinfo otherapplyinfo = otherapplyinfoService.queryOtherapplyinfoByWorkid(workids);
                if (null != otherapplyinfo) {
                    otherapplyinfo.setWorkid(startProcess.getWorkid());
                    otherapplyinfoService.insertOtherapply(otherapplyinfo);
                }

                //附件
                List<Image> imageList = new ArrayList<Image>();
                imageList = imageService.selectByWorkid(req.getWorkid());
                if (imageList != null && !imageList.isEmpty() && imageList.size() > 0) {
                    for (Image image : imageList) {
                        image.setImageid(Util.getID());
                        image.setWorkid(startProcess.getWorkid());
                        imageService.insertImage(image);
                    }
                }

                //抵押物信息
                WorkidRequest workidReq = new WorkidRequest();
                String mortgageid;
                String newMortgageid;
                MortgagefilingidRequest mortreq = new MortgagefilingidRequest();
                workidReq.setWorkid(req.getWorkid());
                List<Mortgage> mortgage = mortgageService.queryMortgageByWorkid(workidReq);
                MortgageRequest mortReq = new MortgageRequest();
                if (mortgage != null && !mortgage.isEmpty()) {
                    for (Mortgage mort : mortgage) {
                        mortgageid = mort.getId();
                        newMortgageid = Util.getID();
                        Delimortgage delimortgage = delimortgageService.queryDelimortgageById(mortgageid);
                        if (null != delimortgage) {
                            delimortgage.setWorkid(startProcess.getWorkid());
                            delimortgage.setId(newMortgageid);
                            delimortgageService.insertDelimort(delimortgage);
                        }
						
				/*		mortreq.setMortgagefilingid(mortgageid);
						Mortgagefiling mortgagefiling = mortgagefilingService.selectMortgagefiling(mortreq) ;
						if(null != mortgagefiling) {
							mortgagefiling.setWorkid(startProcess.getWorkid());
							mortgagefiling.setMortgagefilingid(newMortgageid);
							mortgagefilingService.insertMortgagefi(mortgagefiling);
						}*/

                        mort.setId(newMortgageid);
                        mort.setWorkid(startProcess.getWorkid());
                        mortgageService.insertMortgage(mort);

                        imageList = imageService.selectByWorkid(startProcess.getWorkid());
                        for (Image image : imageList
                        ) {
                            if (null != image.getSavetype() && image.getSavetype().equals(mortgageid)) {
                                image.setSavetype(newMortgageid);
                                imageService.updateImage(image);
                            }
                        }
                    }
                }

                //资产信息
                List<Assetinfo> assetinfo = assetinfoService.queryAssetinfoByWorkid(req.getWorkid());
                AssetinfoRequest assetReq = new AssetinfoRequest();
                if (assetinfo != null && !assetinfo.isEmpty()) {
                    for (Assetinfo assetinfo2 : assetinfo) {
                        assetinfo2.setId(Util.getID());
                        assetinfo2.setWorkid(startProcess.getWorkid());
                        assetinfo2.setCerdid(req.getIdentifino());
                        assetinfoService.insertAsset(assetinfo2);
                    }
                }

                //下户尽调
                List<Deliapplicateinfo> delilist = deliapplicateinfoService.queryByworkid(req.getWorkid());
                if (delilist != null && !delilist.isEmpty() && delilist.size() > 0) {
                    for (Deliapplicateinfo deliapplicateinfo : delilist) {
                        deliapplicateinfo.setWorkid(startProcess.getWorkid());
                        deliapplicateinfoService.insertApp(deliapplicateinfo);
                    }
                }

                //尽调意见
                Mattersattention mattersattention = mattersAttentionservice.selectMattersattention(req.getWorkid());
                if (null != mattersattention) {
                    mattersattention.setId(Util.getID());
                    mattersattention.setWorkid(startProcess.getWorkid());
                    mattersAttentionservice.insertMattersattention(mattersattention);
                }

                //房产评估
                WorkidRequest workidRequ = new WorkidRequest();
                workidRequ.setWorkid(startProcess.getWorkid());
                List<Mortgage> mortgage1 = mortgageService.queryMortgageByWorkid(workidReq);
                if (null != mortgage1 && !mortgage.isEmpty()) {
                    MortgageidRequest mortreq1 = new MortgageidRequest();
                    for (Mortgage mortgage2 : mortgage1) {
                        mortreq1.setMortgageid(mortgage2.getId());
                        List<Buildingproperty> buildlist = buildingpropertyService.queryByMortgageid(mortreq1);
                        if (null != buildlist && !buildlist.isEmpty()) {
                            for (Buildingproperty buildingproperty : buildlist) {
                                buildingproperty.setId(Util.getID());
                                buildingpropertyService.insertBuilding(buildingproperty);
                            }
                        }
                    }
                }
				
/*				//视频地址
				List<Liveinfo> listLive = liveinfoService.selectByWorkid(req.getWorkid()) ;
				for (Liveinfo liveinfo : listLive) {
					liveinfo.setId(Util.getID()) ;
					liveinfo.setWorkid(startProcess.getWorkid());
					liveinfoService.insertLiveinfo(liveinfo);
				}*/

                //赎楼方案
                Redemptiontype redemptiontype = redemptiontypeService.findRedemptiontypeByWorkid(req.getWorkid());
                if (null != redemptiontype) {
                    redemptiontype.setId(Util.getID());
                    redemptiontype.setWorkid(startProcess.getWorkid());
                    redemptiontypeService.insertRedemption(redemptiontype);
                }

            }
            return new RestfulResponse();
        }
        return new RestfulResponse();
    }

    @RequestMapping("/selectExage")
    @ApiOperation(value = "查询展期年限", httpMethod = "POST", notes = "接口", response = ApplyforexRequest.class)
    public List selectExage(@RequestBody WorkidRequest req) {
        Product Producttype = new Product();
        Producttype = applyforexService.selectProducttype(req);
        Repaytoinfo finalrepaytoinfo = new Repaytoinfo();
        finalrepaytoinfo = applyforexService.selectFinalrepaytoinfo(req);

        List<Integer> list = new ArrayList<>();

        if (finalrepaytoinfo != null) {
            String loanlimittime = finalrepaytoinfo.getLoanlimittime();
            if (Producttype.getProducttype().equals("1")) {
                //房抵贷
                if (Integer.parseInt(loanlimittime) >= 6) {
                    for (int i = 1; i <= 6; i++) {
                        list.add(i);
                    }

                } else {
                    for (int i = 1; i <= Integer.parseInt(loanlimittime); i++) {
                        list.add(1);
                    }
                }
            } else {
                //赎楼贷
                if (Integer.parseInt(loanlimittime) >= 15) {
                    for (int i = 1; i <= 15; i++) {
                        list.add(i);
                    }
                } else {
                    for (int i = 1; i <= Integer.parseInt(loanlimittime); i++) {
                        list.add(i);
                    }
                }
            }
        }

        return list;
    }

    @RequestMapping("/selectTitle")
    @ApiOperation(value = "查询姓名证件号利率", httpMethod = "POST", notes = "接口", response = ApplyforexForm.class)
    public Response selectTitle(@RequestBody WorkidRequest req) {
        ApplyforexForm applyforex = new ApplyforexForm();
        List<Custinfo> list = custinfoService.querybyworkid(req);
        Repaytoinfo finalrepaytoinfo = new Repaytoinfo();
        finalrepaytoinfo = applyforexService.selectFinalrepaytoinfo(req);

        for (Custinfo custinfo : list) {
            //String[] split = custinfo.getCusttype().split(",") ;
            //for (String string : split) {
            if (custinfo.getCusttype().indexOf("1") != -1) {
                applyforex.setCustname(custinfo.getCustname());
                applyforex.setCerdid(custinfo.getCerdid());
            }
            //}
        }


        if (finalrepaytoinfo != null) {
            applyforex.setInterestrate(finalrepaytoinfo.getInterestrate());
        }

        return new ApplyforexFormResponse(applyforex);
    }

    @RequestMapping("/selectApplyfor")
    @ApiOperation(value = "查询还款管理", httpMethod = "POST", notes = "接口", response = StatisticalRepayResponse.class)
    public Response selectApplyforex(@RequestBody WorkidRequest req) {
        Applyforex apply = new Applyforex();
        apply = applyforexService.selectByPrimaryKey(req.getWorkid());
        if (apply != null) {
            String workid = apply.getWorkid();
            StatisticalRepay Repay = applyforexService.statisticalRepay(workid);
            if (Repay != null) {
                log.info("查询还款信息成功");
                return new StatisticalRepayResponse(Repay);
            }
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }

    @RequestMapping("/selectApplyfor2")
    @ApiOperation(value = "查询展期管理", httpMethod = "POST", notes = "接口", response = StatisticalRepayResponse.class)
    public Response selectApplyforex2(@RequestBody WorkidRequest req) {
        StatisticalRepay Repay = applyforexService.statisticalRepay(req.getWorkid());
        Repayplan repayplan = applyforexService.selectRepaycapital(req.getWorkid());
        Applyforex applyforex = applyforexService.selectByPrimaryKey(req.getWorkid());
        if (repayplan != null) {
            if (Repay != null) {
                Repay.setSpread(repayplan.getRepaycapital().subtract(applyforex.getExamount()));
                log.info("查询展期信息成功");
                return new StatisticalRepayResponse(Repay);
            }
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }

}
