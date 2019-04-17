package com.grape.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.ImageBean1;
import com.grape.controller.bean.MortgagestateBean;
import com.grape.controller.bean.RefundBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.bean.WorkhistoryBean;
import com.grape.controller.bean.WorkitemBean;
import com.grape.controller.feigncontroller.HomeFeign;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.ChanapprovalformResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.reponse.IsAppealResponse;
import com.grape.controller.reponse.IscancelBean;
import com.grape.controller.reponse.IscancelResponse;
import com.grape.controller.reponse.PersonResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.ResponseBean;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.WorkhistoryResponse;
import com.grape.controller.request.ChanapprovalformRequest;
import com.grape.controller.request.ExaminationRequest;
import com.grape.controller.request.FinanceapprovalRequest;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.RiskapprovalRequest;
import com.grape.controller.request.WorkhistoryRequest;
import com.grape.controller.request.WorkidAndNodeidRequest;
import com.grape.controller.request.WorkidAndStageRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.controller.response.bean.ChanapprovalformBean;
import com.grape.controller.response.bean.GroomapprovalBean;
import com.grape.controller.response.bean.IsappealBean;
import com.grape.controller.response.bean.RiskapprovalformBean;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Doctask;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.Financeapproval;
import com.grape.model.db.Groommortgage;
import com.grape.model.db.Mattersattention;
import com.grape.model.db.Mortgage;
import com.grape.model.db.Mortgagestate;
import com.grape.model.db.Paymentapplyinfo;
import com.grape.model.db.Person;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.model.db.Refundfinance;
import com.grape.model.db.Refundment;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.db.Reservations;
import com.grape.model.db.Riskapproval;
import com.grape.model.db.Verifyopinion;
import com.grape.model.db.Visa;
import com.grape.model.db.Workhistory;
import com.grape.model.db.Workitem;
import com.grape.service.ApplyforexService;
import com.grape.service.ChanapprovalformService;
import com.grape.service.DoctaskService;
import com.grape.service.ExceptloaninfoService;
import com.grape.service.FinanceapprovalService;
import com.grape.service.GroomapprovalService;
import com.grape.service.ImageService;
import com.grape.service.LoaninfoService;
import com.grape.service.MattersAttentionservice;
import com.grape.service.MortgageService;
import com.grape.service.PaymentapplyinfoService;
import com.grape.service.PersonService;
import com.grape.service.ProductnodeService;
import com.grape.service.RefundmentService;
import com.grape.service.RepaytoinfoService;
import com.grape.service.ReservationsService;
import com.grape.service.RiskapprovalService;
import com.grape.service.VisaService;
import com.grape.service.WorkflowService;
import com.grape.service.WorkhistoryService;
import com.grape.service.WorkitemService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/workhistory")
public class WorkhistoryController {
    private static final Logger log = LoggerFactory.getLogger(WorkhistoryController.class);

    @Autowired
    private LoaninfoService loaninfoService;
    @Autowired
    private MattersAttentionservice mattersattentionService;
    @Autowired
    private HomeFeign homefeign;
    @Autowired
    private WorkhistoryService workhistoryService;
    @Autowired
    private RiskapprovalService riskapprovalService;
    @Autowired
    private GroomapprovalService groomapprovalService;
    @Autowired
    private FinanceapprovalService financeapprovalService;
    @Autowired
    private ChanapprovalformService chanapprovalformService;
    @Autowired
    private WorkflowForeign workflowfeign;
    @Autowired
    private WorkflowService workflowService;
    @Autowired
    private RefundmentService refundementService;
    @Autowired
    private PaymentapplyinfoService paymentapplyinfoService;
    @Autowired
    private VisaService visaService;
    @Autowired
    private ReservationsService reservationsService;
    @Autowired
    private RepaytoinfoService repaytoinfoService;
    @Autowired
    private PersonService personService;
    @Autowired
    private ImageService imageService;
    @Autowired
    private MortgageService mortgageService;
    @Autowired
    private ExceptloaninfoService exceptloaninfoService;
    @Autowired
    private DoctaskService doctaskService;
    @Autowired
    private WorkitemService workitemService;
    @Autowired
    private ProductnodeService productnodeService;
    @Autowired
    private ApplyforexService applyforexService;
    private WorkidAndNodeidRequest request;
    private List<ImageBean1> imagelist;
	/*@Autowired
	private DoctaskService doctaskService;
	@Autowired
	private AreaService areaService;
	@Autowired
	private ExpectloaninfoService expectloaninfoService;*/

    @ApiOperation(value = "根据申请编号查询审批历史记录", httpMethod = "POST", notes = "审批历史记录查询的第一个接口", response = WorkhistoryResponse.class)
    @RequestMapping("/queryByWorkid")
    public Response queryByWorkid(@RequestBody WorkidRequest req) {
        PersonResponse personinfo = homefeign.personinfo();
        String orgbelongsto = personinfo.getPersoninfo().getOrgbelongsto();
        List<Workhistory> list = workhistoryService.queryByWorkid(req, orgbelongsto);
        List<String> havelist = new ArrayList<String>();
        for (int m = 0; m < list.size(); m++) {
            if (!havelist.contains(list.get(m).getStage())) {
                havelist.add(list.get(m).getStage());
            }
        }
        List<String> stagelist = new ArrayList<String>();
        List<String> leftstage = new ArrayList<String>();
        List<WorkhistoryBean> workhisBeanlist = new ArrayList<WorkhistoryBean>();
        //渠道方
        if (orgbelongsto.equals("01")) {
            stagelist.add("1");
            stagelist.add("A5");
            stagelist.add("C1");
            stagelist.add("C2");
        } else if (orgbelongsto.equals("02")) {//资金方
            //资金方能看到的机构审批内容
            stagelist.add("A2");
            stagelist.add("C1");
            stagelist.add("2");
            stagelist.add("3");
            stagelist.add("A3");
            stagelist.add("4");
            stagelist.add("A5");
            stagelist.add("B5");
            stagelist.add("5");
            stagelist.add("6");
            stagelist.add("7");
        } else if (orgbelongsto.equals("03")) {//通道方
            stagelist.add("C1");
            stagelist.add("3");
            stagelist.add("A3");
            stagelist.add("4");
        } else if (orgbelongsto.equals("04")) {//平台方
            stagelist.add("C1");
            stagelist.add("1");
            stagelist.add("C2");
            stagelist.add("2");
            stagelist.add("A2");
            stagelist.add("3");
            stagelist.add("A3");
            stagelist.add("4");
            stagelist.add("A5");
            stagelist.add("B5");
            stagelist.add("5");
            stagelist.add("6");
            stagelist.add("7");
        }
        //将工作号转成该工作号对应的员工的名字
        for (int i = 0; i < list.size(); i++) {

            Person person = personService.selectByWorkerid(list.get(i).getUserid());
            if (person != null) {
                String workername = person.getWorkername();
                if (!workername.equals("")) {
                    list.get(i).setUserid(workername);
                }
            }
            //将节点id转成节点名称
            Productnode node = workhistoryService.selectProductNode(list.get(i).getNode());
            list.get(i).setNode(node.getNodename());
            for (int j = 0; j < stagelist.size(); j++) {
                if (list.get(i).getStage() != null) {
                    if (list.get(i).getStage().equals(stagelist.get(j))) {
                        WorkhistoryBean bean = new WorkhistoryBean();
                        try {
                            Util.transferFields(list.get(i), bean);
                        } catch (Exception e) {
                            log.info("历史记录转换失败");
                        }
                        //拒绝退回的历史记录（1：退回；2：通过；3：当前）
                        if (bean.getOperation().equals("退回") || bean.getOperation().equals("拒绝") || bean.getOperation().equals("业务取消") || bean.getOperation().equals("质检不通过")) {
                            bean.setHistorytype("1");
                        } else {//历史通过的历史记录
                            bean.setHistorytype("2");
                        }

                        //添加该机构能够看到的审批历史
                        workhisBeanlist.add(bean);
                    } else {
                        if (!stagelist.contains(list.get(i).getStage())) {//没有权限看到的历史记录的stage
                            if (!leftstage.contains(list.get(i).getStage())) {
                                //将不能看到的审批历史的stage归类
                                leftstage.add(list.get(i).getStage());
                            }
                        }
                    }
                }
            }
        }
        //不是该机构能看到的审批历史记录则显示***已审批
        for (int k = 0; k < leftstage.size(); k++) {
            WorkhistoryBean workhis = new WorkhistoryBean();
            workhis.setId(Util.getID());
            workhis.setHistorytype("2");
            workhis.setWorkid(req.getWorkid());
            if (leftstage.get(k).equals("1") && havelist.contains("1")) {
                Date operdate = workhistoryService.selectWorkhisByStage(req.getWorkid(), "1").getOperdate();
                workhis.setStage("1");
                workhis.setOperdate(operdate);
                workhis.setNode("渠道已审批");
            } else if (leftstage.get(k).equals("C2") && havelist.contains("C2")) {
                Date operdate = workhistoryService.selectWorkhisByStage(req.getWorkid(), "C2").getOperdate();
                workhis.setOperdate(operdate);
                workhis.setStage("C2");
                workhis.setNode("渠道已进件");
            } else if (leftstage.get(k).equals("2") && havelist.contains("2")) {
                Date operdate = workhistoryService.selectWorkhisByStage(req.getWorkid(), "2").getOperdate();
                workhis.setOperdate(operdate);
                workhis.setStage("2");
                workhis.setNode("平台风控已审批");
            } else if (leftstage.get(k).equals("3") && havelist.contains("3")) {
                Date operdate = workhistoryService.selectWorkhisByStage(req.getWorkid(), "3").getOperdate();
                workhis.setOperdate(operdate);
                workhis.setStage("3");
                workhis.setNode("资金方风控已审批");
            } else if (leftstage.get(k).equals("4") && havelist.contains("4")) {
                Date operdate = workhistoryService.selectWorkhisByStage(req.getWorkid(), "4").getOperdate();
                workhis.setOperdate(operdate);
                workhis.setStage("4");
                workhis.setNode("通道风控已审批");
            } else if (leftstage.get(k).equals("5") && havelist.contains("5")) {
                Date operdate = workhistoryService.selectWorkhisByStage(req.getWorkid(), "5").getOperdate();
                workhis.setOperdate(operdate);
                workhis.setStage("5");
                workhis.setNode("已批复");
            } else if (leftstage.get(k).equals("6") && havelist.contains("6")) {
                Date operdate = workhistoryService.selectWorkhisByStage(req.getWorkid(), "6").getOperdate();
                workhis.setOperdate(operdate);
                workhis.setStage("6");
                workhis.setNode("放款已审批");
            } else if (leftstage.get(k).equals("7") && havelist.contains("7")) {
                Date operdate = workhistoryService.selectWorkhisByStage(req.getWorkid(), "7").getOperdate();
                workhis.setOperdate(operdate);
                workhis.setStage("7");
                workhis.setNode("退款已审批");
            }
            if (workhis.getNode() != null) {
                workhisBeanlist.add(workhis);
            }
        }
        //当前所在节点
        List<WorkitemBean> workitemList = productnodeService.selectNodenameByWorkid(req.getWorkid());
        List<String> nodeList = new ArrayList<String>();
        if (workitemList != null && !workitemList.isEmpty()) {
            for (int i = 0; i < workitemList.size(); i++) {
                WorkhistoryBean workhis = new WorkhistoryBean();
                String userid = workitemList.get(i).getUserid();
                if (userid != null && !userid.equals("")) {
                    Person person = personService.selectByWorkerid(userid);
                    if (person != null) {
                        String org = person.getOrganizationid();
                        String orgno = personService.selectOrgnoByOrganization(org);
                        String username = person.getWorkername();
                        //如果是同一机构就显示当前节点的审批人
                        if (orgno.equals(orgbelongsto)) {
                            workhis.setUserid(username);
                        }
                    }
                }
                nodeList.add(workitemList.get(i).getNodename());
                workhis.setHistorytype("3");
                workhis.setId(Util.getID());
                workhis.setNode(workitemList.get(i).getNodename());
                workhis.setOperdate(new Date());
                workhisBeanlist.add(workhis);
            }
        }
        if (!workhisBeanlist.isEmpty()) {
            Collections.sort(workhisBeanlist, new Comparator<WorkhistoryBean>() {
                @Override
                public int compare(WorkhistoryBean o1, WorkhistoryBean o2) {
                    return (o2.getOperdate().compareTo(o1.getOperdate()));
                }
            });
            return new WorkhistoryResponse(workhisBeanlist);
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }

    @ApiOperation(value = "根据申请编号查询该机构的下级审批历史记录", httpMethod = "POST", notes = "审批历史记录查询的第一个接口", response = WorkhistoryResponse.class)
    @RequestMapping("/querySelfByWorkid")
    public Response querySelfByWorkid(@RequestBody WorkidAndStageRequest req) {
        List<Workhistory> workhislist = new ArrayList<Workhistory>();
        List<WorkhistoryBean> workhisBeanlist = new ArrayList<WorkhistoryBean>();
        workhislist = workhistoryService.selectSelfWorkhistory(req);
        if (!workhislist.isEmpty()) {
            for (int i = 0; i < workhislist.size(); i++) {
                WorkhistoryBean workhistoryBean = new WorkhistoryBean();
                try {
                    Util.transferFields(workhislist.get(i), workhistoryBean);
                } catch (Exception e) {
                    log.info("历史记录实体类转换出错");
                }
                Productnode node = workhistoryService.selectProductNode(workhislist.get(i).getNode());
                workhistoryBean.setNode(node.getNodename());
                workhisBeanlist.add(workhistoryBean);
            }
            return new WorkhistoryResponse(workhisBeanlist);
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }

    @ApiOperation(value = "时间轴详细信息", httpMethod = "POST", response = ResponseBean.class, notes = "时间轴接口")
    @RequestMapping("/selectWorkhistoryDetail")
    public Response selectWorkhistoryDetail(@RequestBody IdRequest req) {
        Workhistory workhis = workhistoryService.selectWorkhisById(req);
        if ("1".equals(workhis.getType())) {
            //详细页只有审批意见
            return new ResponseBean(workhis, "1");
        } else if ("2".equals(workhis.getType())) {
            //退款申请信息
            RefundBean bean = new RefundBean();
            WorkidAndNodeidRequest request = new WorkidAndNodeidRequest();
            Doctask doctask = doctaskService.queryByWorkid(workhis.getWorkid());
            String productno = "";
            if (doctask.getProductno() != null) {
                productno = doctask.getProductno();
            }
            request.setProductno(productno);
            request.setWorkid(workhis.getWorkid());
            request.setNodeid(workhis.getNode());
            //查询退款申请上传的附件
            List<ImageBean1> list = imageService.selectImageByWorkidAndNodeid(request);
            if (list != null && !list.isEmpty()) {
                List<List<ImageBean1>> imagelist = new ArrayList<List<ImageBean1>>();
                List<String> typrelist = new ArrayList<String>();
                for (int i = 0; i < list.size(); i++) {
                    if (!typrelist.contains(list.get(i).getFiletype()) && list.get(i).getFiletype() != null) {
                        typrelist.add(list.get(i).getFiletype());
                    }
                }
                for (int j = 0; j < typrelist.size(); j++) {
                    List<ImageBean1> listbean = new ArrayList<ImageBean1>();
                    for (int k = 0; k < list.size(); k++) {
                        if (list.get(k).getFiletype().equals(typrelist.get(j))) {
                            listbean.add(list.get(k));
                        }
                    }
                    imagelist.add(listbean);
                }
                bean.setImagelist(imagelist);
            }
            Refundment refund = refundementService.selectRfundmentByWorkid(workhis.getWorkid());
            if (refund != null) {
                String refundtype = refund.getRefundtype();
                //将退款方式转换成中文名称
                if (refundtype != null) {
                    String result = refundementService.selectNameByCode(refundtype, "HAVETAKE");
                    if (result != null) {
                        refund.setRefundtype(result);
                    }
                }
                //将已收款项转换成中文名称
                String receivables = refund.getReceivables();
                if (receivables != null) {
                    String result = refundementService.selectNameByCode(receivables, "HAVETAKE");
                    if (result != null) {
                        refund.setReceivables(result);
                    }
                }
                if (productno != null) {
                    if (productno.contains("SLD") || productno.contains("PRD")) {
                        productno = productno.substring(0, 3);
                    } else {
                        productno = productno.substring(0, 2);
                    }
                }
                bean.setProductno(productno);
                bean.setRefundment(refund);
                return new ResponseBean(bean, "2");
            }
        } else if ("3".equals(workhis.getType())) {
            //放款财务一级审批
            Financeapproval financeapproval = financeapprovalService.selectFinanceapproval(req.getId());
            if (financeapproval != null) {
                return new ResponseBean(financeapproval, "3");
            }
        } else if ("4".equals(workhis.getType())) {
            //放款风控一级审批
            List<Riskapproval> ristlist = riskapprovalService.selectRiskapproval(req.getId());
            Riskapproval riskapproval = new Riskapproval();
            if (ristlist != null && !ristlist.isEmpty()) {
                riskapproval = ristlist.get(0);
            }
            List<Mortgagestate> mortlist = riskapprovalService.selectMortgagestateByLogid(req.getId());
            List<String> mortgagelist = new ArrayList<String>();
            List<MortgagestateBean> bean = new ArrayList<MortgagestateBean>();
            for (int i = 0; i < mortlist.size(); i++) {
                String mortgageid = mortlist.get(i).getMortgageid();
                if (!mortgagelist.contains(mortgageid)) {
                    mortgagelist.add(mortgageid);
                }
            }
            for (int k = 0; k < mortgagelist.size(); k++) {
                MortgagestateBean mortgagebean = new MortgagestateBean();
                List<String> imagelist = new ArrayList<String>();
                for (int j = 0; j < mortlist.size(); j++) {
                    if (mortlist.get(j).getMortgageid().equals(mortgagelist.get(k))) {
                        try {
                            Util.transferFields(mortlist.get(j), mortgagebean);
                        } catch (Exception e) {
                            log.info("抵押物查档实体转换错误");
                        }
                        imagelist.add(mortlist.get(j).getCheckstateimage());
                    }
                }
                String mortgagename = mortgageService.selectByMortgageid(mortgagelist.get(k)).getMartgagename();
                mortgagebean.setMortgageid(mortgagename);
                mortgagebean.setCheckstateimagelist(imagelist);
                bean.add(mortgagebean);
            }

            RiskapprovalformBean riskbean = new RiskapprovalformBean();
            if (mortlist != null) {
                riskbean.setMortgagestates(bean);
            }
            if (riskapproval != null) {
                riskbean.setRiskapproval(riskapproval);
            }
            if (riskbean != null) {
                return new ResponseBean(riskbean, "4");
            }
        } else if ("5".equals(workhis.getType())) {
            //放款申请信息
            Paymentapplyinfo payment = paymentapplyinfoService.selectPaymentapplyinfo(workhis.getWorkid());
            List<Groommortgage> groommortgages = groomapprovalService.selectgroommortgageByLogid(req.getId());
            Doctask doctask = doctaskService.queryByWorkid(workhis.getWorkid());
            String productno = "";
            if (doctask.getProductno() != null) {
                productno = doctask.getProductno();
            }
            WorkidAndNodeidRequest request = new WorkidAndNodeidRequest();
            request.setWorkid(workhis.getWorkid());
            request.setNodeid(workhis.getNode());
            request.setProductno(productno);
            //查询放款申请上传的附件
            List<ImageBean1> imagelist = imageService.selectImageByWorkidAndNodeid(request);
            for (int i = 0; i < groommortgages.size(); i++) {
                String mortgageid = groommortgages.get(i).getMortgageid();
                Mortgage mort = mortgageService.selectByMortgageid(mortgageid);
                String mortgagename = null;
                if (mort != null) {
                    mortgagename = mort.getMartgagename();
                }
                if (mortgagename != null) {
                    groommortgages.get(i).setMortgageid(mortgagename);
                } else {
                    groommortgages.get(i).setMortgageid("");
                }

            }
            GroomapprovalBean bean = new GroomapprovalBean();
            if (payment != null) {
                bean.setPaymentapplyinfo(payment);
            }
            if (!groommortgages.isEmpty()) {
                bean.setGroommortgages(groommortgages);
            }
            if (!imagelist.isEmpty()) {
                bean.setImagelist(imagelist);
            }
            if (bean != null) {
                return new ResponseBean(bean, "5");
            }
        } else if ("8".equals(workhis.getType())) {
            //预约面签
            Visa visa = visaService.queryId(req.getId());
            if (visa != null) {
                return new ResponseBean(visa, "8");
            }
        } else if ("9".equals(workhis.getType())) {
            //预约下户
            Reservations reservation = reservationsService.queryByid(workhis.getId());
            if (reservation != null) {
                return new ResponseBean(reservation, "9");
            }
        } else if ("10".equals(workhis.getType())) {
            //审批批复
            Repaytoinfo repaytoinfo = repaytoinfoService.selectFinalrepaytoinfo(workhis.getWorkid());
            if (repaytoinfo != null) {
                return new ResponseBean(repaytoinfo, "10");
            }
        } else if ("11".equals(workhis.getType())) {
            //平台、资金方风控审批
            ChanapprovalformBean bean = new ChanapprovalformBean();
            Chanapprovalform chan = chanapprovalformService.selectchanapprovalByLogid(req.getId());
            Verifyopinion verifyoption = chanapprovalformService.selectVerifyByWorkid(workhis.getWorkid());
            if (chan != null) {
                try {
                    Util.transferFields(chan, bean);
                } catch (Exception e) {
                    log.info("风控表单转换出错");
                }
                if (verifyoption != null) {
                    bean.setPhoneopinion(verifyoption.getPhoneopinion());
                    bean.setMortgageopinion(verifyoption.getMortgageopinion());
                }
                return new ResponseBean(bean, "11");
            }
        } else if ("12".equals(workhis.getType())) {
            //准入规则
            Mattersattention mattersattention = mattersattentionService.selectMattersattention(workhis.getWorkid());
            if (mattersattention != null) {
                return new ResponseBean(mattersattention, "12");
            }
        } else if ("13".equals(workhis.getType())) {
            //核行、面签视频
            List<ImageBean1> images = new ArrayList<ImageBean1>();
            WorkidAndNodeidRequest imagereq = new WorkidAndNodeidRequest();
            imagereq.setNodeid(workhis.getNode());
            imagereq.setWorkid(workhis.getWorkid());
            images = imageService.selectImageByWorkidAndNodeid(imagereq);
            if (images != null) {
                return new ResponseBean(images, "13");
            }
        } else if ("14".equals(workhis.getType())) {
            //保函批复
            Repaytoinfo repaytoinfo = repaytoinfoService.selectBaohanrepaytoinfo(workhis.getWorkid());
            if (repaytoinfo != null) {
                return new ResponseBean(repaytoinfo, "14");
            }
        } else if ("15".equals(workhis.getType())) {
            //退款财务一级审批表单
            Refundfinance refundfinance = new Refundfinance();
            refundfinance = refundementService.selectrefundfinance(req.getId());
            if (refundfinance != null) {
                return new ResponseBean(refundfinance, "15");
            }
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }

    @ApiOperation(value = "插入历史记录", httpMethod = "POST", notes = "审批历史记录的第二个接口", response = WorkhistoryResponse.class)
    @RequestMapping("/insertWorkhistory")
    public Response insertWorkhistory(@RequestBody WorkhistoryRequest req) {
        workhistoryService.insertWorkhistory(req);
        return new RestfulResponse();
    }

    @ApiOperation(value = "插入风控一级审批内容", httpMethod = "POST", notes = "审批内容的第三个接口", response = FlowHandleResponse.class)
    @RequestMapping("/insertRiskapproval")
    public Response insertRiskapproval(@RequestBody RiskapprovalRequest req) {
        String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        FlowHandleRequest handlereq = workflowService.selectWorkflow(req.getWorkid(), req.getNodeid());
        FlowHandleResponse res = new FlowHandleResponse();
        if (handlereq != null) {
            try {
                Util.transferFields(req, handlereq);
            } catch (Exception e) {
                log.info("实体类转换出错");
            }
            handlereq.setHisttype("4");
            handlereq.setActor(userid);
            handlereq.setNotation(req.getNotation());
            handlereq.setNextActor(req.getNextactor());
            handlereq.setOperation(req.getOperation());
            if (!req.getOperation().equals("保存")) {
                res = workflowfeign.handle(handlereq);
                if (res.getCode() != 20000) {
                    return res;
                }
            }
        } else {
            return new ErrorEntity(StatusCode.NOWORKITEMFOUND_ERROR);
        }
        riskapprovalService.insertRiskApproval(req, res);
        return new RestfulResponse();
    }

    @ApiOperation(value = "插入放款财务一级审批内容", httpMethod = "POST", notes = "审批内容的第五个接口", response = FlowHandleResponse.class)
    @RequestMapping("/insertFinanceapproval")
    public Response insertFinanceapproval(@RequestBody FinanceapprovalRequest req) {
        String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        FlowHandleRequest handlereq = workflowService.selectWorkflow(req.getWorkid(), req.getNodeid());
        FlowHandleResponse res = new FlowHandleResponse();
        if (handlereq != null) {
            try {
                Util.transferFields(req, handlereq);
            } catch (Exception e) {
                log.info("实体类转换出错");
            }
            handlereq.setActor(req.getUserid());
            handlereq.setHisttype("3");
            handlereq.setActor(userid);
            handlereq.setNotation(req.getLoannotation());
            handlereq.setNextActor(req.getNextactor());
            handlereq.setOperation(req.getOperation());
            if (!req.getOperation().equals("保存")) {
                res = workflowfeign.handle(handlereq);
                if (res.getCode() != 20000) {
                    return res;
                }
            }
        } else {
            return new ErrorEntity(StatusCode.NOWORKITEMFOUND_ERROR);
        }
        financeapprovalService.insertFinanceapproval(req, res);
        return new RestfulResponse();
    }

    @ApiOperation(value = "插入平台、通道、资金方审批内容", httpMethod = "POST", notes = "审批内容的第五个接口", response = FlowHandleResponse.class)
    @RequestMapping("/insertChanapproval")
    public Response insertChanapproval(@Validated @RequestBody ChanapprovalformRequest req) {
        log.info("开始插入平台、资金方、通道风控审批内容");
        PersonResponse personinfo = homefeign.personinfo();
        //获取当前登录人的所属机构
        String orgbelongsto = personinfo.getPersoninfo().getOrgbelongsto();
        //改变贷款评级
        String suggestleavel = req.getSuggestleavel();
        if (!Util.isBlank(suggestleavel) && orgbelongsto.equals("02")) {
            Doctask doc = doctaskService.queryByWorkid(req.getWorkid());
            if (doc != null) {
                doc.setLevel(suggestleavel);
                doctaskService.updateDoctaskByWorkid(doc);
            }
        }
        //将贷款利率类型和还款方式获取插入风控审批表
        List<Productnode> productndode = productnodeService.selectByNodeid(req.getNodeid());
        String productno = null;
        if (!productndode.isEmpty()) {
            productno = productndode.get(0).getProductno();
        }
        List<Product> product = productnodeService.selectRepayMethod(productno);
        String repaymethod = null;
        String ratetype = null;
        if (!product.isEmpty()) {
            if (productno.contains("ZQ")) {
                //展期获取原流水的还款方式和利率类型
                WorkidRequest workidRequest = new WorkidRequest();
                workidRequest.setWorkid(req.getWorkid());
                Product prod = loaninfoService.selectrepaymethodAndratetype(workidRequest);
                if (prod != null) {
                    repaymethod = prod.getRepaymethod();
                    ratetype = prod.getRatetype();
                }
            } else {
                repaymethod = product.get(0).getRepaymethod();
                ratetype = product.get(0).getRatetype();
            }
        }
        String userid = personinfo.getPersoninfo().getWorkerid();
        req.setUserid(userid);
        String agreeexpectloanflg = req.getAgreeexpectloanflg();
        Repaytoinfo repay = new Repaytoinfo();
        //如果选择的是不同意期待贷款申请信息，则保存表单内容
        if ("0".equals(agreeexpectloanflg)) {
            repay.setWorkid(req.getWorkid());
            repay.setRepaymethod(repaymethod);
            repay.setInterestratetype(ratetype);
            repay.setId(Util.getID());
            BigDecimal suggestuseamount = req.getSuggestuseamount();
            if (suggestuseamount != null) {
                repay.setTotaluseamount(suggestuseamount);
            }
            String suggestuseterm = req.getSuggestuseterm();
            if (suggestuseterm != null) {
                repay.setTotaluseterm(suggestuseterm);
            }
            repay.setIsagreeexceptamount(req.getAgreeexpectloanflg());
            repay.setSumofamount(req.getSuggestapplyamount());
            repay.setInterestrate(req.getSuggestapplyrate());
            repay.setBatchorg(orgbelongsto);
            repay.setLoanlimittime(req.getSuggestapplyterm());
            repay.setChgdt(new Date());
            //同意期待贷款申请信息，则获取期待贷款申请信息插入
        } else if ("1".equals(agreeexpectloanflg)) {
            Exceptloaninfo except = exceptloaninfoService.querybyWorkid(req.getWorkid());
            BigDecimal suggestapplyamount = except.getExpectapplyamount();
            BigDecimal totaluseamount = except.getExtotaluseamount();
            String totalterm = except.getExtotaluseterm();
            String suggestuseterm = except.getExpectapplyyear();
            BigDecimal rate = except.getExpectapplyrate();
            req.setSuggestapplyamount(suggestapplyamount);
            req.setSuggestapplyrate(rate);
            req.setSuggestapplyterm(suggestuseterm);
            if (totaluseamount != null) {
                req.setSuggestuseamount(totaluseamount);
            }
            if (totalterm != null) {
                req.setSuggestuseterm(totalterm);
            }
            repay.setWorkid(req.getWorkid());
            repay.setRepaymethod(repaymethod);
            repay.setInterestratetype(ratetype);
            repay.setId(Util.getID());
            if (totaluseamount != null) {
                repay.setTotaluseamount(totaluseamount);
            }
            if (totalterm != null) {
                repay.setTotaluseterm(totalterm);
            }
            repay.setIsagreeexceptamount(req.getAgreeexpectloanflg());
            repay.setSumofamount(suggestapplyamount);
            repay.setInterestrate(rate);
            repay.setBatchorg(orgbelongsto);
            repay.setLoanlimittime(suggestuseterm);
            repay.setChgdt(new Date());
        }
        //将内容同步保存到批复信息表中方便选择批复信息
        if (repay.getWorkid() != null && !"".equals(repay.getWorkid())) {
            repaytoinfoService.insertRepaytoinfo(repay);
        }
        //跳转流程节点
        FlowHandleRequest handlereq = workflowService.selectWorkflow(req.getWorkid(), req.getNodeid());
        FlowHandleResponse res = new FlowHandleResponse();
        if (handlereq != null) {
            try {
                Util.transferFields(req, handlereq);
            } catch (Exception e) {
                log.info("实体类转换出错");
            }
            handlereq.setHisttype("11");
            handlereq.setActor(userid);
            if (req.getOtheridea() != null && !req.getOtheridea().equals("")) {
                handlereq.setNotation(req.getOtheridea());
            } else if (req.getNatation() != null) {
                handlereq.setNotation(req.getNatation());
            }/*else if(req.getSituationnote()!=null){
				handlereq.setNotation(req.getSituationnote());
			}*/
            handlereq.setNextActor(req.getNextactor());
            handlereq.setOperation(req.getOperation());
            if (!req.getOperation().equals("保存")) {
                res = workflowfeign.handle(handlereq);
                log.info("流程跳转结果为" + res.getCode() + ":" + res.getMessage());
                if (res.getCode() != 20000) {
                    return res;
                }
            }
        } else {
            return new ErrorEntity(StatusCode.NOWORKITEMFOUND_ERROR);
        }
        chanapprovalformService.insertChanapproval(req, res);
        log.info("插入风控表单内容成功");
        //如果选择面签不需要质检，则自动跳转在面签质检节点的流水
        if (req.getFacesignflg() != null && orgbelongsto.equals("02")) {
            if (req.getFacesignflg().equals("0")) {
                List<Workitem> workitemlist = workitemService.selectByWorkid(req.getWorkid());
                for (int i = 0; i < workitemlist.size(); i++) {
                    List<Productnode> productnodelist = productnodeService.selectByNodeid(workitemlist.get(i).getNode());
                    for (int j = 0; j < productnodelist.size(); j++) {
                        if (productnodelist.get(j).getNodename() != null) {
                            if (productnodelist.get(j).getNodename().contains("面签直播质检")) {
                                FlowHandleRequest handlereq1 = workflowService.selectWorkflow(req.getWorkid(), productnodelist.get(j).getNodeid());
                                FlowHandleResponse res1 = new FlowHandleResponse();
                                if (handlereq1 != null) {
                                    handlereq1.setHisttype("1");
                                    handlereq1.setActor("00000000");
                                    handlereq1.setNotation("");
                                    handlereq1.setOperation("质检通过");
                                    res1 = workflowfeign.handle(handlereq1);
                                    log.info("流程跳转结果为" + res.getCode() + ":" + res1.getMessage());
                                }
                            }
                        }
                    }
                }
            }
        }
        return new RestfulResponse();
    }


    @ApiOperation(value = "资金方一级临时保存功能", httpMethod = "POST", notes = "资金方一级临时保存功能", response = FlowHandleResponse.class)
    @RequestMapping("/saveChanapproval")
    public Response saveChanapproval(@RequestBody ChanapprovalformRequest req) {
        log.info("开始插入资金方一级审批内容");
        PersonResponse personinfo = homefeign.personinfo();
        //获取当前登录人的所属机构
        String orgbelongsto = personinfo.getPersoninfo().getOrgbelongsto();
        //改变贷款评级
        String suggestleavel = req.getSuggestleavel();
        String isagree = req.getAgreeexpectloanflg();
        if (isagree != null && isagree.equals("1")) {
            Exceptloaninfo except = exceptloaninfoService.querybyWorkid(req.getWorkid());
            BigDecimal suggestapplyamount = except.getExpectapplyamount();
            String suggestuseterm = except.getExpectapplyyear();
            BigDecimal rate = except.getExpectapplyrate();
            req.setSuggestapplyamount(suggestapplyamount);
            req.setSuggestapplyrate(rate);
            req.setSuggestapplyterm(suggestuseterm);
        }
        if (!Util.isBlank(suggestleavel) && orgbelongsto.equals("02")) {
            Doctask doc = doctaskService.queryByWorkid(req.getWorkid());
            if (doc != null) {
                doc.setLevel(suggestleavel);
                doctaskService.updateDoctaskByWorkid(doc);
            }
        }
        String userid = personinfo.getPersoninfo().getWorkerid();
        req.setUserid(userid);
        //保存审批表单内容
        chanapprovalformService.saveChanapproval(req);
        log.info("插入风控表单内容成功");

        return new RestfulResponse();
    }

    @ApiOperation(value = "资金方一级临时数据查询", httpMethod = "POST", response = ChanapprovalformResponse.class)
    @RequestMapping("/selectChanapprovalform")
    public Response selectChanapprovalform(@RequestBody WorkidRequest req) {
        Chanapprovalform chanapproval = chanapprovalformService.selectChanapprovalformByWorkid(req);
        if (chanapproval != null) {
            return new ChanapprovalformResponse(chanapproval);
        } else {
            return new ErrorEntity(StatusCode.NO_DATAERROR);
        }

    }

    @ApiOperation(value = "插入质检意见", httpMethod = "POST", notes = "", response = FlowHandleResponse.class)
    @RequestMapping("/insertExamination")
    public Response insertExamination(@RequestBody ExaminationRequest req) {
        String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        FlowHandleRequest handlereq = workflowService.selectWorkflow(req.getWorkid(), req.getNodeid());
        FlowHandleResponse res = new FlowHandleResponse();
        if (handlereq != null) {
            handlereq.setHisttype("1");
            handlereq.setActor(userid);
            handlereq.setNotation(req.getExamination());
            handlereq.setNextActor("");
            handlereq.setOperation(req.getOperation());
            if (!req.getOperation().equals("保存")) {
                res = workflowfeign.handle(handlereq);
                log.info("流程处理返回的数据为" + res.getCode() + ":" + res.getMessage());
                if (res.getCode() != 20000) {
                    return res;
                }
            }
        } else {
            return new ErrorEntity(StatusCode.NOWORKITEMFOUND_ERROR);
        }
        workhistoryService.insertExamination(req, res);
        log.info("插入质检意见成功");
        return new RestfulResponse();
    }

    @ApiOperation(value = "是否可以申诉", httpMethod = "POST", notes = "", response = IsAppealResponse.class)
    @RequestMapping("/isappeal")
    public Response isappeal(@RequestBody WorkidRequest req) {
        String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        List<Workitem> list = workitemService.selectByWorkid(req.getWorkid());
        IsappealBean appeal = new IsappealBean();
        boolean isAppeal = false;
        if (!list.isEmpty()) {
            for (Workitem work : list) {
                if (work.getStage() != null) {
                    if (work.getStage().equals("E7") && work.getAuthuserid().equals(userid)) {
                        isAppeal = true;
                        break;
                    }
                }
            }
        }
        appeal.setAppeal(isAppeal);
        return new IsAppealResponse(appeal);
    }


    @ApiOperation(value = "是否可以取消", httpMethod = "POST", notes = "", response = IscancelResponse.class)
    @RequestMapping("/iscancel")
    public Response iscancel(@RequestBody WorkidRequest req) {
        IscancelBean iscancleBean = new IscancelBean();
        List<Workhistory> workhis = chanapprovalformService.selectByWorkid(req);
        List<Workitem> workitem = workitemService.selectByWorkid(req.getWorkid());
        List<String> stringList = new ArrayList<>();
        /*String stagelist = "1 2 3 4" ;*/
        String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
        /*String[] stagelist = new String[]{"1" , "2" , "3" , "4"} ;*/
        List<String> nodelist = new ArrayList<>();
        List<String> stagelist = new ArrayList<>();
        List<String> workstage = new ArrayList<>();
        stagelist.add("1");
        stagelist.add("2");
        stagelist.add("3");
        stagelist.add("4");

        if (!workhis.isEmpty() && workhis.size() > 0) {
            for (Workhistory workhistory : workhis) {
                stringList.add(workhistory.getStage());
            }
        }

        if (!workitem.isEmpty() && workitem.size() > 0) {
            for (Workitem workitem1 : workitem) {
                workstage.add(workitem1.getStage());
            }

            for (Workitem workitem1 : workitem) {
                nodelist.add(workitem1.getNode());
            }
        }

        if (!stringList.contains("A5") && userid.equals(doctask.getUserid())) {
            for (String string : workstage) {
                if (!stagelist.contains(string)) {
                    boolean isCancel = false;
                    iscancleBean.setCancel(isCancel);
                    return new IscancelResponse(iscancleBean);
                } else {
                    boolean isCancel = true;
                    iscancleBean.setCancel(isCancel);
                    return new IscancelResponse(iscancleBean);
                }
            }

        }
        boolean isCancel = false;
        iscancleBean.setCancel(isCancel);
        return new IscancelResponse(iscancleBean);
    }


}
