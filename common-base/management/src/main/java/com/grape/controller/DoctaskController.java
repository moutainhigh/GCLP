package com.grape.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.DoctaskListResponse;
import com.grape.controller.reponse.bean.DoctaskListBean;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.controller.request.DoctaskListRequest;
import com.grape.util.PageBean;
import com.grape.util.Util;
import com.grape.service.DoctaskService;

import io.swagger.annotations.ApiOperation;

/**
 * @描述 流水模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/12/11 17:04
 */
@RestController
@RequestMapping("/doctask")
@Validated
@Log4j
public class DoctaskController {

    @Autowired
    private DoctaskService doctaskService;


    /**
     * @描述 分页查询流水
     * @参数 [doctaskListRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/12/11 17:09
     */
    @ApiOperation(value = "分页查询流水", httpMethod = "POST", notes = "分页查询流水测试接口", response = DoctaskListResponse.class)
    @RequestMapping("/doctaskListReponse")
    public Response doctaskListReponse(@Validated @RequestBody DoctaskListRequest doctaskListRequest) {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            PageBean pageBeanRequest = new PageBean(doctaskListRequest.getPagenum(), doctaskListRequest.getPagesize());
            if (doctaskListRequest.getEndDate() != null) {
                Calendar c = Calendar.getInstance();
                c.setTime(doctaskListRequest.getEndDate());
                c.add(Calendar.DAY_OF_MONTH, 1);
                doctaskListRequest.setEndDate(c.getTime());
            }
            //处理流水和姓名供模糊查询
            String wrokId = Util.fillSeqno(doctaskListRequest.getWorkid());
            //String custname = "%"+doctaskListRequest.getCustname()+"%";
            PageBean pageBeanResponse = doctaskService.doctaskListReponse(
                    doctaskListRequest.getStartDate(), doctaskListRequest.getEndDate(), doctaskListRequest.getNodeid(),
                    doctaskListRequest.getProductno(), wrokId, doctaskListRequest.getCustname(),
                    doctaskListRequest.getCerdid(), doctaskListRequest.getHouseno(),
                    pageBeanRequest, userOfOrgBean);
            return new DoctaskListResponse(pageBeanResponse.getResultList(), pageBeanResponse.getRecordCount());
        } catch (Exception e) {
            log.error(StatusCode.SELECT_DOCTASKLIST_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_DOCTASKLIST_ERROR);
        }
    }

    /**
     * @描述 分页待办查询
     * @参数 [backlogListRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/12/11 17:09
     */
    @ApiOperation(value = "分页待办查询", httpMethod = "POST", notes = "分页查询待办测试接口", response = DoctaskListResponse.class)
    @RequestMapping("/backlogListReponse")
    public Response backlogListReponse(@Validated @RequestBody DoctaskListRequest backlogListRequest) {
        try {
            PageBean pageBeanRequest = new PageBean(backlogListRequest.getPagenum(), backlogListRequest.getPagesize());
            if (backlogListRequest.getEndDate() != null) {
                Calendar c = Calendar.getInstance();
                c.setTime(backlogListRequest.getEndDate());
                c.add(Calendar.DAY_OF_MONTH, 1);
                backlogListRequest.setEndDate(c.getTime());
            }
            //处理workid供模糊查询
            String wrokId = Util.fillSeqno(backlogListRequest.getWorkid());
            PageBean pageBeanResponse = doctaskService.backlogListReponse(
                    backlogListRequest.getStartDate(), backlogListRequest.getEndDate(), backlogListRequest.getNodeid(),
                    backlogListRequest.getProductno(), wrokId, backlogListRequest.getCustname(),
                    backlogListRequest.getCerdid(), backlogListRequest.getHouseno(), backlogListRequest.getProcessflg(), pageBeanRequest);

            List<DoctaskListBean> doctaskListBeanlist = pageBeanResponse.getResultList();
            for (int i = 0; i < doctaskListBeanlist.size(); i++) {
                //如果是已办，则标记该流水为已办
                if ("1".equals(backlogListRequest.getProcessflg())) {
                    doctaskListBeanlist.get(i).setProcessflg("1");
                    //如果是待办，则标记该流水为待办
                } else if ("2".equals(backlogListRequest.getProcessflg())) {
                    doctaskListBeanlist.get(i).setProcessflg("2");
                }
            }
            //如果待办和已办都查询，需要循环判断每一条流水为什么类型
            if ("1,2".equals(backlogListRequest.getProcessflg()) || "2,1".equals(backlogListRequest.getProcessflg())) {
                backlogListRequest.setProcessflg("2");
                List<String> workidlist = new ArrayList<String>();
                //查询待办流水
                PageBean pageBeanResponse1 = doctaskService.backlogListReponse(
                        backlogListRequest.getStartDate(), backlogListRequest.getEndDate(), backlogListRequest.getNodeid(),
                        backlogListRequest.getProductno(), wrokId, backlogListRequest.getCustname(),
                        backlogListRequest.getCerdid(), backlogListRequest.getHouseno(), backlogListRequest.getProcessflg(), pageBeanRequest);
                List<DoctaskListBean> doctaskListBeanlist1 = pageBeanResponse1.getResultList();
                //查询待办的流水并将待办的workid和nodeid合并放入一个list中
                if (doctaskListBeanlist1 != null && !doctaskListBeanlist1.isEmpty()) {
                    for (int j = 0; j < doctaskListBeanlist1.size(); j++) {
                        StringBuffer sb = new StringBuffer();
                        String workid = doctaskListBeanlist1.get(j).getWorkid();
                        String nodeid = doctaskListBeanlist1.get(j).getNodeid();
                        sb.append(workid).append(nodeid);
                        if (sb != null && !String.valueOf(sb).equals("")) {
                            workidlist.add(sb.toString());
                        }
                    }
                }

                //循环所有待办和已办流水并标记
                if (doctaskListBeanlist != null && !doctaskListBeanlist.isEmpty()) {
                    for (int m = 0; m < doctaskListBeanlist.size(); m++) {
                        StringBuffer sb = new StringBuffer();
                        String sbstr = "";
                        String workid = doctaskListBeanlist.get(m).getWorkid();
                        String nodeid = doctaskListBeanlist.get(m).getNodeid();
                        sb.append(workid).append(nodeid);
                        if (sb != null && !"".equals(String.valueOf(sb))) {
                            sbstr = sb.toString();
                        }
                        if (workidlist.contains(sbstr)) {
                            doctaskListBeanlist.get(m).setProcessflg("2");
                        } else {
                            doctaskListBeanlist.get(m).setProcessflg("1");
                        }
                    }
                }
            }
            return new DoctaskListResponse(doctaskListBeanlist, pageBeanResponse.getRecordCount());
        } catch (Exception e) {
            log.error(StatusCode.SELECT_BACKLOGLIST_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_BACKLOGLIST_ERROR);
        }
    }

    /**
     * @描述 分页查询展期流水(Android)
     * @参数 [rolloverListRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/12/11 17:14
     */
    @ApiOperation(value = "分页查询展期流水(Android)", httpMethod = "POST", notes = "分页查询展期流水(Android)测试接口", response = DoctaskListResponse.class)
    @RequestMapping("/rolloverListReponse")
    public Response rolloverListReponse(@Validated @RequestBody DoctaskListRequest rolloverListRequest) {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            PageBean pageBeanRequest = new PageBean(rolloverListRequest.getPagenum(), rolloverListRequest.getPagesize());
            if (rolloverListRequest.getEndDate() != null) {
                Calendar c = Calendar.getInstance();
                c.setTime(rolloverListRequest.getEndDate());
                c.add(Calendar.DAY_OF_MONTH, 1);
                rolloverListRequest.setEndDate(c.getTime());
            }
            PageBean pageBeanResponse = doctaskService.rolloverListReponse(
                    rolloverListRequest.getStartDate(), rolloverListRequest.getEndDate(), rolloverListRequest.getNodeid(),
                    rolloverListRequest.getProductno(), rolloverListRequest.getWorkid(), rolloverListRequest.getCustname(),
                    rolloverListRequest.getCerdid(), rolloverListRequest.getHouseno(),
                    pageBeanRequest, userOfOrgBean);
            return new DoctaskListResponse(pageBeanResponse.getResultList(), pageBeanResponse.getRecordCount());
        } catch (Exception e) {
            log.error(StatusCode.SELECT_ROLLOVERLIST_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_ROLLOVERLIST_ERROR);
        }
    }
}
