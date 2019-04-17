package com.grape.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.context.ServerContext;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.AssessinfoResponse;
import com.grape.controller.reponse.ChannelAssessinfoResponse;
import com.grape.controller.reponse.MortgageAssessinfoResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FuguAssessinfoResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.MortgagematchResponse;
import com.grape.controller.reponse.OverdueAssessinfoResponse;
import com.grape.controller.reponse.bean.MortgageAssessinfo;
import com.grape.controller.reponse.bean.OverdueAssessinfo;
import com.grape.controller.reponse.bean.ChannelAssessinfo;
import com.grape.controller.request.AssessinfosRequest;
import com.grape.controller.request.AssessinfosRequest2;
import com.grape.controller.request.AssessmentRequest;
import com.grape.controller.request.MortgagematchRequest;
import com.grape.controller.request.AssessAddRequest;
import com.grape.controller.request.AssessEditRequest;
import com.grape.controller.request.AssessFangggRequest;
import com.grape.controller.request.AssessFangggRequest2;
import com.grape.controller.request.AssessManualRequest;
import com.grape.controller.request.AssessShilianRequest;
import com.grape.controller.request.AssessUpdateRequest;
import com.grape.model.db.Assessmodel;
import com.grape.model.db.Buildingproperty;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Houseassess;
import com.grape.model.db.Mortgage;
import com.grape.model.db.Mortgagematch;
import com.grape.model.db.Verifyopinion;
import com.grape.service.DoctaskService;
import com.grape.service.ExchannelService;
import com.grape.service.FangguguService;
import com.grape.service.HouseassessService;
import com.grape.service.MortgagematchService;
import com.grape.service.ShilianService;
import com.grape.service.VerifyopinionService;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/pinggu")
@Validated
@Log4j
public class PingguController {

    @Autowired
    ShilianService shilianService;
    @Autowired
    FangguguService fangguguService;

    @Autowired
    HouseassessService houseassessService;

    @Autowired
    ExchannelService exchannelService;

    @Autowired
    MortgagematchService mortgagematchService;
    @Autowired
    ServerContext pingguContext;

    @Autowired
    DoctaskService doctaskService;
    
    @Autowired
    VerifyopinionService opinionService;


    @ApiOperation(value = "房估估抵押物信息列表", httpMethod = "POST", notes = "用于返回房估估匹配的抵押物信息列表", response = MortgagematchResponse.class)
    @RequestMapping("/mortgage_match")
    public Response mortgage_match(@Validated @RequestBody MortgagematchRequest req) {
        try {
            List<Mortgagematch> mortgagematchs;
            mortgagematchs = mortgagematchService.findMortgagematchListByMortgageno(req.getMortgageno());
            if (mortgagematchs.size() > 0) {
                return new MortgagematchResponse(mortgagematchs);
            } else {
                // 如果没有抵押物匹配信息则发起查询
                Exchannel exchannel = exchannelService.findExchannelByChannelno(MessageDetail.FANGGUGU_ID);

                // 查看评估标志是否开启
                if (exchannel != null && exchannel.getOpenflg().equals("Y")) {
                    mortgagematchs = fangguguService.getFGGMortgage(exchannel, req.getWorkid(), req.getCitycode(),
                            req.getMortgageno(), req.getMartgagename());
                    return new MortgagematchResponse(mortgagematchs);
                } else {
                    throw new Exception(MessageDetail.FANGGUGU_OPEN_FAIL);
                }

            }

        } catch (Exception e) {
            return new ErrorEntity(StatusCode.FAIL, "获取匹配信息出错，请进行手工评估");
        }

    }

    @ApiOperation(value = "估价查询（初估）", httpMethod = "POST", notes = "房估估选择抵押物后发起评估", response = ChannelAssessinfoResponse.class)
    @RequestMapping("/chugu")
    public Response chugu(@Validated @RequestBody AssessFangggRequest req) {
        // 初次评估

        BigDecimal shilianprice = new BigDecimal(0);
        BigDecimal fangguguprice = new BigDecimal(0);

        ChannelAssessinfo shilianpriceinfo = null;
        ChannelAssessinfo fanggugupriceinfo = null;

        Houseassess shilianAssess = null;

        List<ChannelAssessinfo> priceinfoBeans = new ArrayList<>();
        List<BigDecimal> pricelist = new ArrayList<>();
        boolean success = true; //是否估价成功
        try {

            // 世联发起查询
            shilianpriceinfo = pingguContext.shilian(req.getWorkid(), req.getCitycode(), req.getMortgageno(),
                    req.getHouseaddress(), req.getFloorarea());
            if (shilianpriceinfo != null) {
                shilianprice = shilianpriceinfo.getAssessprice();
                pricelist.add(shilianprice);
                priceinfoBeans.add(shilianpriceinfo);
            } else {
                success = false;
            }

            // 查询匹配抵押物信息
            Mortgagematch mortgagematch = mortgagematchService.findMortgagematch(req.getMortgageno(), req.getMatchno());
            // 更新抵押物匹配信息
            pingguContext.updateMortgagematch(mortgagematch);

            // 房估估发起查询
            if (mortgagematch != null) {
                fanggugupriceinfo = pingguContext.fanggugu(req.getWorkid(), req.getCitycode(), req.getMortgageno(),
                        req.getHousetype(), req.getFloorarea(), mortgagematch.getCommunityid());
                if (fanggugupriceinfo != null) {
                    fangguguprice = fanggugupriceinfo.getAssessprice();
                    pricelist.add(fangguguprice);
                    priceinfoBeans.add(fanggugupriceinfo);
                } else {
                    success = false;
                }

            }


            ChannelAssessinfo onlineAssessinfo = new ChannelAssessinfo();

            // 计算系统评估价格
            Assessmodel assessmodel = houseassessService.findAssessmodelDefault();
            BigDecimal onlinePrice = pingguContext.onlinePrice2(shilianprice, fangguguprice,
                    assessmodel.getLowervalueOnline(), assessmodel.getTonevalueOnline(), assessmodel.getFloatOnline());
            BigDecimal onlineTotal = onlinePrice.multiply(new BigDecimal(req.getFloorarea()));

            pingguContext.saveHouseassess(req.getWorkid(), MessageDetail.XITONG_KEY, onlinePrice, onlineTotal,
                    req.getMortgageno(), null, null);

            onlineAssessinfo.setAssessprice(onlinePrice);
            onlineAssessinfo.setAssesstotal(onlineTotal);
            onlineAssessinfo.setChannel(MessageDetail.ONLINE_KEY);
            priceinfoBeans.add(onlineAssessinfo);

            return new ChannelAssessinfoResponse(priceinfoBeans, null, null);

        } catch (Exception e) {
            log.info(MessageDetail.PRICE_SYSTEM_FAIL + ":" + e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, "请进行手工评估");
        }

    }

    @ApiOperation(value = "评估渠道更改(初估)", httpMethod = "POST", notes = "返回渠道更改后的评估信息", response = ChannelAssessinfoResponse.class)
    @RequestMapping("/chugu_edit")
    public Response chugu_edit(@Validated @RequestBody AssessEditRequest req) {

        try {


            // 查询是否已录入一般成交价和快速成交价
            List<Buildingproperty> buildingproperties = houseassessService
                    .findBuildingpropertyByMortgageno(req.getMortgageno());
            // 如果产品为房抵贷则需先查询是否已录入一般成交价和快速成交价
            if (pingguContext.getPRDFlag(req.getWorkid())) {

                if (buildingproperties.isEmpty()) {
                    return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL + ",请先录入一般成交价或快速成交价");
                }
            }


            //查询要更改的渠道评估信息
            Houseassess houseassess = houseassessService.findHouseassess(req.getOldchannel(), req.getWorkid(),
                    req.getMortgageno());
            if (houseassess != null) {

                Mortgage mortgage = mortgagematchService.findMortgageById(req.getMortgageno());
                BigDecimal newprice = new BigDecimal(req.getNewprice());
                houseassess.setAssessOnlinePrice(newprice);

                BigDecimal newtotal = newprice.multiply(new BigDecimal(mortgage.getFloorarea()));
                houseassess.setAssessOnlineTotal(newtotal);

                houseassess.setFilename(req.getFilename());

                String newchannel;

                if (!Util.isBlank(req.getNewchannel())) {
                    if (("其它").equals(req.getNewchannel())) {
                        newchannel = req.getOtherparam();

                    } else {
                        newchannel = req.getNewchannel();

                    }

                    // 首先检验下是否已有有更改的渠道
                    if (!req.getOldchannel().equals(newchannel)) {
                        Houseassess existHouseassess = houseassessService.findHouseassess(newchannel,
                                req.getWorkid(), req.getMortgageno());
                        if (existHouseassess != null) {
                            return new ErrorEntity(StatusCode.FAIL, "已有相同评估渠道，请重新更改！");
                        }
                    }

                    houseassess.setChannel(newchannel);
                    // 将旧数据删掉
                    houseassessService.houseassessDelete(req.getWorkid(), req.getMortgageno(), req.getOldchannel());
                    houseassessService.houseassessAdd(houseassess);

                }

                // 将上传的图片放进IMAGE表供附件时查询
                pingguContext.saveImage(req.getWorkid(), req.getFilename(), req.getNodeid());

                // 计算系统风控评估价格并更新

                Houseassess xitongAssess = houseassessService.findHouseassess(MessageDetail.XITONG_KEY,
                        req.getWorkid(), req.getMortgageno());
                if (xitongAssess != null) {
                    // 如果产品为房抵贷则需计算风控价格，赎楼贷不用

                    //获取评估模型值
                    Assessmodel assessmodel = houseassessService.findAssessmodelDefault();
                    //获取业务评估单价
                    BigDecimal onlineprice = pingguContext.getOnlinePrice(assessmodel, xitongAssess.getWorkid(), xitongAssess.getMortgageno());
                    xitongAssess.setAssessOnlinePrice(onlineprice);
                    xitongAssess.setAssessOnlineTotal(onlineprice.multiply(new BigDecimal(mortgage.getFloorarea())));
                    if (pingguContext.getPRDFlag(req.getWorkid())) {
                        // 计算一般成交价和快速成交价

                        BigDecimal quickprice = pingguContext.getQuickprice(buildingproperties);// 快速成交价
                        BigDecimal generalprice = pingguContext.getGeneralprice(buildingproperties); // 一般成交价

                        xitongAssess.setGeneralUnitPrice(generalprice);
                        xitongAssess.setQuickUnitPrice(quickprice);
                        //获取风控评估单价
                        BigDecimal controlprice = pingguContext.controlPrice(onlineprice, generalprice, quickprice, assessmodel.getLowervalueBng(),
                                assessmodel.getTonevalueBng(), assessmodel.getLowervalueBng2(), assessmodel.getTonevalueBng2(), assessmodel.getFloatBng(), assessmodel.getFloatCno());
                        xitongAssess.setAssessControlPrice(controlprice);
                        xitongAssess.setAssessControlTotal(
                                controlprice.multiply(new BigDecimal(mortgage.getFloorarea())));

                    }
                    xitongAssess.setChgdt(new Date());
                    xitongAssess.setChgtl(ServerContext.getworkerid());
                    houseassessService.houseassessUpdate(xitongAssess);
                }

                return new ErrorEntity(StatusCode.OK, MessageDetail.OPRATION_SUCCESS);

            } else {
                log.info(req.getOldchannel() + "评估信息为空！");
            }

        } catch (Exception e) {
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.ASSESSMENT_EDIT_FAIL);
        }

        return new ErrorEntity(StatusCode.FAIL, MessageDetail.ASSESSMENT_EDIT_FAIL);
    }

    @ApiOperation(value = "评估意见(初估)", httpMethod = "POST", notes = "评估渠道全部更改后填写评估意见，返回操作状态", response = RestfulResponse.class)
    @RequestMapping("/notation")
    public Response notation(@Validated @RequestBody AssessmentRequest req) {
        try {
            // 保存审批历史
            pingguContext.saveVerifyopinion(req.getWorkid(), "", req.getNotation());
            /*
			 * List<MortgageAssessinfo> assessinfos = new ArrayList<>();
			 * 
			 * List<ChannelAssessinfo> channelAssessinfos = new ArrayList<>();
			 * 
			 * 
			 * //获取流水下抵押物信息 List<Map<String, Object>> resultlist =
			 * mortgagematchService.findMortgageParamList(req.getWorkid());
			 * if(resultlist.size()>0){ for (Map<String, Object> map :
			 * resultlist) { MortgageAssessinfo mortgageAssessinfo = new
			 * MortgageAssessinfo(); String mortgageno = (String)
			 * map.get("mortgageno"); if(!Util.isBlank(mortgageno)){
			 * //获取该抵押物编号下的评估信息 List<Houseassess> houseassesses =
			 * houseassessService.findHouseassessList(req.getWorkid(),
			 * mortgageno); if(houseassesses.size()>0){ for (Houseassess
			 * houseassess : houseassesses) { ChannelAssessinfo
			 * channelAssessinfo = new ChannelAssessinfo();
			 * if(houseassess.getChannel().equals(MessageDetail.XITONG_KEY)){
			 * //线上评估价格
			 * channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice
			 * ());
			 * channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal
			 * ()); channelAssessinfo.setChannel(MessageDetail.ONLINE_KEY);
			 * //综合评估价格 ChannelAssessinfo onlineAssessinfo = new
			 * ChannelAssessinfo();
			 * onlineAssessinfo.setAssessprice(houseassess.getAssessControlPrice
			 * ());
			 * onlineAssessinfo.setAssesstotal(houseassess.getAssessControlTotal
			 * ()); onlineAssessinfo.setChannel(MessageDetail.CONTROL_KEY);
			 * channelAssessinfos.add(onlineAssessinfo); }else{
			 * channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice
			 * ());
			 * channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal
			 * ()); channelAssessinfo.setChannel(houseassess.getChannel());
			 * 
			 * 
			 * }
			 * 
			 * channelAssessinfos.add(channelAssessinfo); } }
			 * 
			 * } mortgageAssessinfo.setMortgageno(mortgageno);
			 * mortgageAssessinfo.setMortgagename((String)
			 * map.get("mortgagename"));
			 * mortgageAssessinfo.setChannelAssessinfos(channelAssessinfos);
			 * assessinfos.add(mortgageAssessinfo); } } return new
			 * MortgageAssessinfoResponse(assessinfos);
			 */
            return new ErrorEntity(StatusCode.OK, MessageDetail.OPRATION_SUCCESS);
        } catch (Exception e) {
            log.error(MessageDetail.OPRATION_FAIL + e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL);
        }
    }

    @ApiOperation(value = "获取抵押物评估信息列表（用于评估更改）", httpMethod = "POST", notes = "返回获取抵押物评估信息列表", response = MortgageAssessinfoResponse.class)
    @RequestMapping("/chugu_update_infos")
    public Response chugu_update_info(@Validated @RequestBody AssessinfosRequest req) {
        try {
            List<MortgageAssessinfo> assessinfos = new ArrayList<>();


            // 首先获取流水下抵押物信息

            List<Mortgage> resultlist = mortgagematchService.findListByWorkid(req.getWorkid());
            if (!resultlist.isEmpty()) {

                for (Mortgage mortgage : resultlist) {
                    MortgageAssessinfo mortgageAssessinfo = new MortgageAssessinfo();
                    String mortgageno = mortgage.getId();
                    if (!Util.isBlank(mortgageno)) {
                        // 获取该抵押物编号下的评估信息
                        List<Houseassess> houseassesses = houseassessService.findHouseassessList(req.getWorkid(),
                                mortgageno);
                        List<ChannelAssessinfo> channelAssessinfos = new ArrayList<>();

                        if (houseassesses.size() > 0) {

                            BigDecimal quickprice = new BigDecimal(0);
                            BigDecimal generalprice = new BigDecimal(0);
                            for (Houseassess houseassess : houseassesses) {

                                if (!MessageDetail.XITONG_KEY.equals(houseassess.getChannel())) {
                                    ChannelAssessinfo channelAssessinfo = new ChannelAssessinfo();
                                    channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice());
                                    channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal());
                                    channelAssessinfo.setChannel(houseassess.getChannel());
                                    channelAssessinfo.setHouseaddress(houseassess.getAssessaddress());
                                    channelAssessinfos.add(channelAssessinfo);
                                } else {
                                    quickprice = houseassess.getQuickUnitPrice();
                                    generalprice = houseassess.getGeneralUnitPrice();

                                }

                            }
                            //如果是房抵贷产品则显示中介价格
                            if (pingguContext.getPRDFlag(req.getWorkid())) {
                                mortgageAssessinfo.setQuickprice(quickprice);
                                mortgageAssessinfo.setGeneralprice(generalprice);
                            }
                            
                           
                            mortgageAssessinfo.setMortgageno(mortgageno);
                            mortgageAssessinfo.setMortgagename(mortgage.getMartgagename());
                            mortgageAssessinfo.setChannelAssessinfos(channelAssessinfos);
                            assessinfos.add(mortgageAssessinfo);
                        }/* else {
							// 如果没有数据，则返回默认数据供编辑
							pingguContext.saveHouseassess(req.getWorkid(), MessageDetail.SHILIAN_KEY, new BigDecimal(0),
									new BigDecimal(0), mortgageno, "9", null);
							pingguContext.saveHouseassess(req.getWorkid(), MessageDetail.FANGGUGU_KEY,
									new BigDecimal(0), new BigDecimal(0), mortgageno, "9", null);
							pingguContext.saveHouseassess(req.getWorkid(), MessageDetail.XITONG_KEY, new BigDecimal(0),
									new BigDecimal(0), mortgageno, "9", null);

							// 重新获取该抵押物编号下的评估信息
							houseassesses = houseassessService.findHouseassessList(req.getWorkid(), mortgageno);
							if (houseassesses.size() > 0) {
								for (Houseassess houseassess : houseassesses) {
									ChannelAssessinfo channelAssessinfo = new ChannelAssessinfo();
									if (!houseassess.getChannel().equals(MessageDetail.XITONG_KEY)) {

										channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice());
										channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal());
										channelAssessinfo.setChannel(houseassess.getChannel());
										channelAssessinfo.setHouseaddress(mortgage.getHouseaddressdetail());
										channelAssessinfos.add(channelAssessinfo);
									}

								}
								mortgageAssessinfo.setMortgageno(mortgageno);
								mortgageAssessinfo.setMortgagename(mortgage.getMartgagename());
								mortgageAssessinfo.setChannelAssessinfos(channelAssessinfos);
								assessinfos.add(mortgageAssessinfo);
							}

						}*/
                    }
                }
            }
            String mortgageoponion=null;
            Verifyopinion verifyopinion=  opinionService.findVerifyopinionById(req.getWorkid());
            if(verifyopinion!=null){
            	mortgageoponion= verifyopinion.getMortgageopinion();
            }
            
            return new MortgageAssessinfoResponse(assessinfos,mortgageoponion);
        } catch (Exception e) {
            log.error(MessageDetail.ASSESSMENT_INFO_FAIL + e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.ASSESSMENT_INFO_FAIL);
        }
    }

    @ApiOperation(value = "获取抵押物评估信息列表（用于初估显示）", httpMethod = "POST", notes = "返回获取抵押物评估信息列表", response = ChannelAssessinfoResponse.class)
    @RequestMapping("/chugu_approval_infos")
    public Response chugu_approval_infos(@Validated @RequestBody AssessinfosRequest2 req) {
        try {

            List<ChannelAssessinfo> channelAssessinfos = new ArrayList<>();

            // 获取该抵押物编号下的评估信息
            List<Houseassess> houseassesses = houseassessService.findHouseassessList(req.getWorkid(),
                    req.getMortgageno());
            Mortgage mortgage = mortgagematchService.findMortgageById(req.getMortgageno());
            if (houseassesses.size() > 0) {
                int a = 1;
                for (Houseassess houseassess : houseassesses) {
                    ChannelAssessinfo channelAssessinfo = new ChannelAssessinfo();
                    ChannelAssessinfo controlAssess = new ChannelAssessinfo();
                    if (houseassess.getChannel().equals(MessageDetail.XITONG_KEY)) {
                        channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice());
                        channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal());
                        channelAssessinfo.setChannel(MessageDetail.ONLINE_KEY);
                        channelAssessinfos.add(channelAssessinfo);

                        List<Buildingproperty> buildingproperties = houseassessService
                                .findBuildingpropertyByMortgageno(req.getMortgageno());

                        // 如果产品为房抵贷则需显示风控价格，赎楼贷不用
                        if (pingguContext.getPRDFlag(req.getWorkid())) {
                            if (buildingproperties.size() > 0) {
                                // 快速成交价
                                BigDecimal quickprice = pingguContext.getQuickprice(buildingproperties);
                                // 一般成交价
                                BigDecimal generalprice = pingguContext.getGeneralprice(buildingproperties);


                                BigDecimal controlPrice = pingguContext.Comprehensive(req.getWorkid(),
                                        req.getMortgageno(), generalprice, quickprice);
                                houseassess.setGeneralUnitPrice(generalprice);
                                houseassess.setQuickUnitPrice(quickprice);
                                houseassess.setAssessControlPrice(controlPrice);
                                houseassess.setAssessControlTotal(
                                        controlPrice.multiply(new BigDecimal(mortgage.getFloorarea())));
                                houseassess.setChgdt(new Date());
                                houseassess.setChgtl(ServerContext.getworkerid());
                                houseassessService.houseassessUpdate(houseassess);

                                controlAssess.setAssessprice(houseassess.getAssessControlPrice());
                                controlAssess.setAssesstotal(houseassess.getAssessControlTotal());
                                controlAssess.setChannel(MessageDetail.CONTROL_KEY);
                                channelAssessinfos.add(controlAssess);

                            }
                        }
                    } else {

                        channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice());
                        channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal());
                        //如果是渠道的人不能看到评估渠道名称,只能显示如机构1
                        if (pingguContext.isChanneller()) {
                            channelAssessinfo.setChannel("机构" + String.valueOf(a));
                            a++;
                        } else {
                            channelAssessinfo.setChannel(houseassess.getChannel());
                        }

                        channelAssessinfos.add(channelAssessinfo);

                    }

                }
            }

            return new ChannelAssessinfoResponse(channelAssessinfos, null, null);
        } catch (Exception e) {
            log.error(MessageDetail.ASSESSMENT_INFO_FAIL + e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.ASSESSMENT_INFO_FAIL);
        }
    }

    @ApiOperation(value = "获取抵押物评估信息列表(复估)", httpMethod = "POST", notes = "返回获取抵押物评估信息列表", response = MortgageAssessinfoResponse.class)
    @RequestMapping("/fugu_infos")
    public Response fugu_infos(@Validated @RequestBody AssessinfosRequest req) {
        try {
            List<MortgageAssessinfo> assessinfos = new ArrayList<>();

            // 首先获取流水下抵押物信息
            List<Map<String, Object>> resultlist = mortgagematchService.findMortgageParamList(req.getWorkid());
            if (resultlist.size() > 0) {

                for (Map<String, Object> map : resultlist) {
                    MortgageAssessinfo mortgageAssessinfo = new MortgageAssessinfo();
                    String mortgageno = (String) map.get("mortgageno");
                    String assesstime = null;
                    if (!Util.isBlank(mortgageno)) {

                        // 获取该抵押物编号下的评估信息
                        List<Houseassess> houseassesses = houseassessService.findHouseassessList(req.getWorkid(),
                                mortgageno);
                        if (houseassesses.size() > 0) {
                            List<ChannelAssessinfo> channelAssessinfos = new ArrayList<>();
                            ChannelAssessinfo controlAssessinfo = new ChannelAssessinfo();
                            for (Houseassess houseassess : houseassesses) {
                                ChannelAssessinfo channelAssessinfo = new ChannelAssessinfo();

                                if (houseassess.getChannel().equals(MessageDetail.XITONG_KEY)) {
                                    // 线上评估价格
                                    channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice());
                                    channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal());
                                    channelAssessinfo.setChannel(MessageDetail.ONLINE_KEY);
                                    // 综合评估价格
                                    controlAssessinfo.setAssessprice(houseassess.getAssessControlPrice());
                                    controlAssessinfo.setAssesstotal(houseassess.getAssessControlTotal());
                                    controlAssessinfo.setChannel(MessageDetail.CONTROL_KEY);

                                    assesstime = String.valueOf(houseassess.getChgdt().getTime());
                                } else {
                                    channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice());
                                    channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal());
                                    channelAssessinfo.setChannel(houseassess.getChannel());
                                    channelAssessinfo.setFilename(houseassess.getFilename());
                                }

                                channelAssessinfos.add(channelAssessinfo);

                            }
                            channelAssessinfos.add(controlAssessinfo);
                            // 抵押物匹配列表
                            List<Mortgagematch> mortgagematchs = mortgagematchService
                                    .findMortgagematchListByMortgageno(mortgageno);
                            mortgageAssessinfo.setMortgagematchs(mortgagematchs);
                            mortgageAssessinfo.setMortgageno(mortgageno);
                            mortgageAssessinfo.setMortgagename((String) map.get("mortgagename"));
                            mortgageAssessinfo.setChannelAssessinfos(channelAssessinfos);
                            // 计算涨幅
                            String gains = String.valueOf(pingguContext.getGains(req.getWorkid(), mortgageno));
                            mortgageAssessinfo.setGains(gains);
                            mortgageAssessinfo.setAssesstime(assesstime);

                            assessinfos.add(mortgageAssessinfo);
                        }

                    }
                }
            }
            return new MortgageAssessinfoResponse(assessinfos,null);
        } catch (Exception e) {
            log.error(MessageDetail.ASSESSMENT_INFO_FAIL + ":" + e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.ASSESSMENT_INFO_FAIL);
        }
    }

    @ApiOperation(value = "获取抵押物评估信息列表(贷后逾期)", httpMethod = "POST", notes = "返回抵押物评估信息列表，用于贷后逾期显示", response = OverdueAssessinfoResponse.class)
    @RequestMapping("/infos_overdue")
    public Response infos_overdue(@Validated @RequestBody AssessinfosRequest req) {
        try {

            List<OverdueAssessinfo> assessinfos = new ArrayList<>();

            // 首先获取流水下抵押物信息
            List<Map<String, Object>> resultlist = mortgagematchService.findMortgageParamList(req.getWorkid());
            if (resultlist.size() > 0) {

                for (Map<String, Object> map : resultlist) {
                    OverdueAssessinfo assessinfo = new OverdueAssessinfo();
                    String mortgageno = (String) map.get("mortgageno");
                    String assesstime = null;
                    if (!Util.isBlank(mortgageno)) {

                        // 获取该抵押物编号下的评估信息
                        List<Houseassess> houseassesses = houseassessService.findHouseassessList(req.getWorkid(),
                                mortgageno);
                        if (houseassesses.size() > 0) {
                            for (Houseassess houseassess : houseassesses) {

                                if (houseassess.getChannel().equals(MessageDetail.XITONG_KEY)) {
                                    if (houseassess.getAssessAgainTotal() != null) {
                                        assessinfo.setTotalprice(houseassess.getAssessAgainTotal());
                                    } else {
                                        assessinfo.setTotalprice(houseassess.getAssessControlTotal());
                                    }

                                    assesstime = String.valueOf(houseassess.getChgdt().getTime());
                                }

                            }
                            assessinfo.setMortgagename((String) map.get("mortgagename"));

                            // 计算涨幅
                            String gains = String.valueOf(pingguContext.getGains(req.getWorkid(), mortgageno));
                            assessinfo.setGains(gains);
                            assessinfo.setAssesstime(assesstime);
                            assessinfos.add(assessinfo);
                        }

                    }
                }
            }
            return new OverdueAssessinfoResponse(assessinfos);
        } catch (Exception e) {
            log.error(MessageDetail.ASSESSMENT_INFO_FAIL + ":" + e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.ASSESSMENT_INFO_FAIL);
        }
    }

    @ApiOperation(value = "评估渠道更改(复估)", httpMethod = "POST", notes = "返回操作状态", response = RestfulResponse.class)
    @RequestMapping("/fugu_edit")
    public Response fugu_edit(@Validated @RequestBody AssessEditRequest req) {
        try {
            Houseassess houseassess = houseassessService.findHouseassess(req.getOldchannel(), req.getWorkid(),
                    req.getMortgageno());
            if (houseassess != null) {
                // 将旧数据删掉
                houseassessService.houseassessDelete(houseassess.getWorkid(), houseassess.getMortgageno(),
                        houseassess.getChannel());

                if (!Util.isBlank(req.getNewchannel()) && req.getNewchannel().equals("其他")) {
                    houseassess.setChannel(req.getOtherparam());
                }
                BigDecimal newprice = new BigDecimal(req.getNewprice());
                houseassess.setAssessOnlinePrice(newprice);

                Mortgage mortgage = mortgagematchService.findMortgageById(req.getMortgageno());
                BigDecimal newtotal = newprice.multiply(new BigDecimal(mortgage.getFloorarea()));
                houseassess.setAssessOnlineTotal(newtotal);

                houseassess.setFilename(req.getFilename());
                houseassessService.houseassessAdd(houseassess);

                // 计算系统风控评估价格并更新

                Houseassess xitongAssess = houseassessService.findHouseassess(MessageDetail.XITONG_KEY, req.getWorkid(),
                        req.getMortgageno());
                if (xitongAssess != null) {

                    if (xitongAssess.getGeneralUnitPrice() == null || xitongAssess.getQuickUnitPrice() == null) {
                        return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL + ",请先录入一般成交价或快速成交价");
                    }
                    BigDecimal controlPrice = pingguContext.Comprehensive(req.getWorkid(), req.getMortgageno(),
                            xitongAssess.getGeneralUnitPrice(), xitongAssess.getQuickUnitPrice());
                    xitongAssess.setAssessControlPrice(controlPrice);
                    xitongAssess.setAssessControlTotal(controlPrice.multiply(new BigDecimal(mortgage.getFloorarea())));
                    xitongAssess.setChgdt(new Date());
                    xitongAssess.setChgtl(ServerContext.getworkerid());
                    houseassessService.houseassessUpdate(houseassess);
                }

                return new ErrorEntity(StatusCode.OK, MessageDetail.OPRATION_SUCCESS);

            }
        } catch (Exception e) {
            log.info(e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.ASSESSMENT_EDIT_FAIL + ":" + e.getMessage());
        }

        return new ErrorEntity(StatusCode.FAIL, MessageDetail.ASSESSMENT_EDIT_FAIL);
    }

    @ApiOperation(value = "估价查询（世联复估）", httpMethod = "POST", notes = "返回复估后的评估信息列表", response = FuguAssessinfoResponse.class)
    @RequestMapping("/fugu_shilian")
    public Response fugu_shilian(@Validated @RequestBody AssessShilianRequest req) {

        try {

            Mortgage mortgage = mortgagematchService.findMortgageById(req.getMortgageno());
            if (mortgage != null) {
                pingguContext.shilian(req.getWorkid(), mortgage.getHouseaddresscity(), req.getMortgageno(),
                        mortgage.getHouseaddressdetail(), mortgage.getFloorarea());

                MortgageAssessinfo assessinfo = pingguContext.ComprehensiveFugu(req.getWorkid(), req.getMortgageno(),
                        mortgage.getFloorarea(), mortgage.getHouseaddressdetail(), mortgage.getMartgagename());
                return new FuguAssessinfoResponse(assessinfo);
            } else {
                log.info("抵押物信息为空");
            }

        } catch (Exception e) {
            log.error(MessageDetail.SHILIAN_QUERY_FAIL + e.getMessage() + ":" + e.getMessage());
            return new ErrorEntity(StatusCode.FAIL,
                    MessageDetail.SHILIAN_QUERY_FAIL + e.getMessage() + ":" + e.getMessage());
        }

        return new ErrorEntity(StatusCode.FAIL, MessageDetail.SHILIAN_QUERY_FAIL);

    }

    @ApiOperation(value = "估价查询（房估估复估）", httpMethod = "POST", notes = "返回复估后的评估信息", response = FuguAssessinfoResponse.class)
    @RequestMapping("/fugu_fanggg")
    public Response fugu_fanggg(@Validated @RequestBody AssessFangggRequest2 req) {

        try {
            // 查出房估估的匹配抵押物
            Mortgagematch mortgagematch = mortgagematchService.findMortgagematch(req.getMortgageno(), req.getMatchno());
            if (mortgagematch != null) {
                // 更新抵押物匹配信息
                pingguContext.updateMortgagematch(mortgagematch);
                Map<String, Object> mortgagemap = mortgagematchService.findMortgageByParam(req.getMortgageno());
                if (mortgagemap != null) {
                    String citycode = (String) mortgagemap.get("houseaddresscity");
                    String housetype = (String) mortgagemap.get("housetype");
                    String floorarea = (String) mortgagemap.get("floorarea");
                    String mortgagename = (String) mortgagemap.get("martgagename");
                    pingguContext.fanggugu(req.getWorkid(), citycode, req.getMortgageno(), housetype, floorarea,
                            mortgagematch.getCommunityid());

                    // 重新计算系统评估价格
                    MortgageAssessinfo assessinfo = pingguContext.ComprehensiveFugu(req.getWorkid(),
                            req.getMortgageno(), floorarea, mortgagematch.getHouseaddress(), mortgagename);
                    return new FuguAssessinfoResponse(assessinfo);
                } else {
                    log.info("抵押物信息为空");
                }

            } else {
                log.info("抵押物匹配信息为空");
            }

        } catch (Exception e) {
            log.error(MessageDetail.FANGGUGU_QUERY_FAIL + e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.FANGGUGU_QUERY_FAIL);
        }
        return new ErrorEntity(StatusCode.FAIL, MessageDetail.FANGGUGU_QUERY_FAIL);

    }

    @ApiOperation(value = "更新评估信息", httpMethod = "POST", notes = "返回操作状态", response = RestfulResponse.class)
    @RequestMapping("/assess_update")
    public Response assess_update(@Validated @RequestBody AssessUpdateRequest req) {

        try {

            Houseassess houseassess = houseassessService.findHouseassess(MessageDetail.XITONG_KEY, req.getWorkid(),
                    req.getMortgageno());
            if (houseassess != null) {
                BigDecimal quickprice = new BigDecimal(req.getQuickprice());
                BigDecimal generalprice = new BigDecimal(req.getGeneralprice());
                houseassess.setQuickUnitPrice(quickprice);
                houseassess.setGeneralUnitPrice(generalprice);

                houseassess.setChgtl(ServerContext.getworkerid());
                houseassess.setChgdt(new Date());

                // 进行综合价格计算
                BigDecimal controlprice = pingguContext.Comprehensive(req.getWorkid(), req.getMortgageno(),
                        generalprice, quickprice);
                BigDecimal controltotal = controlprice.multiply(new BigDecimal(req.getFloorarea()));
                houseassess.setAssessControlPrice(controlprice);
                houseassess.setAssessControlTotal(controltotal);
                houseassessService.houseassessUpdate(houseassess);
                return new ErrorEntity(StatusCode.OK, MessageDetail.OPRATION_SUCCESS);
            } else {
                return new ErrorEntity(StatusCode.FAIL, "抵押物信息为空");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL);
        }

    }

    @ApiOperation(value = "新增渠道评估信息", httpMethod = "POST", notes = "返回操作状态", response = RestfulResponse.class)
    @RequestMapping("/assess_add")
    public Response assess_add(@Validated @RequestBody AssessAddRequest req) {

        try {

            //先查询是否有相同渠道的评估信息
            Houseassess sameAssess = houseassessService.findHouseassess(req.getChannel(), req.getWorkid(), req.getMortgageno());
            if (sameAssess != null) {
                return new ErrorEntity(StatusCode.FAIL, "已有相同评估渠道信息，请重新操作！");
            }

            //插入渠道评估信息
            BigDecimal price = new BigDecimal(req.getPrice());
            BigDecimal total = price.multiply(new BigDecimal(req.getFloor()));
            pingguContext.saveHouseassess(req.getWorkid(), req.getChannel(), price, total, req.getMortgageno(), "2", null);

            // 将上传的图片放进IMAGE表供附件时查询
            pingguContext.saveImage(req.getWorkid(), req.getFilename(), req.getNodeid());


            //更新线上评估价格
            Houseassess houseassess = houseassessService.findHouseassess(MessageDetail.XITONG_KEY, req.getWorkid(), req.getMortgageno());
            if (houseassess == null) {
                houseassess = new Houseassess();
            }
            Assessmodel assessmodel = houseassessService.findAssessmodelDefault();
            BigDecimal onlineprice = pingguContext.getOnlinePrice(assessmodel, req.getWorkid(), req.getMortgageno());
            BigDecimal totalprice = onlineprice.multiply(new BigDecimal(req.getFloor()));
            pingguContext.saveHouseassess(req.getWorkid(), MessageDetail.XITONG_KEY, onlineprice, totalprice, req.getMortgageno(), null, null);
            return new ErrorEntity(StatusCode.OK, MessageDetail.OPRATION_SUCCESS);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL);
        }

    }

    @ApiOperation(value = "手工评估抵押物页面信息", httpMethod = "POST", notes = "返回操作状态", response = AssessinfoResponse.class)
    @RequestMapping("/assess_manual")
    public Response assess_manual(@Validated @RequestBody AssessManualRequest req) {

        try {

            // 获取该抵押物编号下的评估信息
            List<Houseassess> houseassesses = houseassessService.findHouseassessList(req.getWorkid(),
                    req.getMortgageno());
            List<ChannelAssessinfo> channelAssessinfos = new ArrayList<>();

            if (houseassesses.size() > 0) {
                int a = 1;
                for (Houseassess houseassess : houseassesses) {

                    if (!MessageDetail.XITONG_KEY.equals(houseassess.getChannel())) {
                        ChannelAssessinfo channelAssessinfo = new ChannelAssessinfo();
                        channelAssessinfo.setAssessprice(houseassess.getAssessOnlinePrice());
                        channelAssessinfo.setAssesstotal(houseassess.getAssessOnlineTotal());
                        //如果是渠道的人不能看到评估渠道名称
                        if (pingguContext.isChanneller()) {
                            channelAssessinfo.setChannel("渠道" + String.valueOf(a));
                            a++;
                        } else {
                            channelAssessinfo.setChannel(houseassess.getChannel());
                        }

                        channelAssessinfo.setHouseaddress(houseassess.getAssessaddress());
                        channelAssessinfos.add(channelAssessinfo);

                    }

                }


            }
            return new AssessinfoResponse(channelAssessinfos);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ErrorEntity(StatusCode.FAIL, "获取抵押物评估信息失败");
        }

    }
	
	/*@ApiOperation(value = "禧泰测试", httpMethod = "POST", notes = "返回操作状态", response = RestfulResponse.class)
	@RequestMapping("/xitai")
	public Response xitai() {

		try {
			Exchannel exchannel = exchannelService.findExchannelByChannelno(MessageDetail.XITAI_ID);
		
			xitaiService.findQueryPrice(exchannel, null, null);
			
			return new ErrorEntity(StatusCode.OK,"测试成功");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,"获取抵押物评估信息失败");
		}

	}*/
}
