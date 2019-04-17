package com.grape.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.grape.controller.reponse.BasicInformationResponse;
import com.grape.controller.reponse.ManagementlistResponse;
import com.grape.controller.reponse.OverduelistResponse;
import com.grape.controller.reponse.PromptpaymentsResponse;
import com.grape.controller.reponse.RepayManagementResponse;
import com.grape.controller.reponse.RepaymenthistoryResponse;
import com.grape.controller.reponse.bean.OverdueStatBean;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.model.db.Overdue;
import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayplan;
import com.grape.util.PageBean;

/**
 * @描述 还款管理Service层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/16 11:01
 */
public interface RepayManagementService {

    /**
     * @描述 逾期统计信息
     * @参数 [userOfOrgBean]
     * @返回值 java.util.List<com.grape.controller.reponse.bean.OverdueStatBean>
     * @创建人 zyh
     * @创建时间 2018/11/16 11:01
     */
    List<OverdueStatBean> overdueStatReponse(UserOfOrgBean userOfOrgBean);

    /**
     * @描述 管理列表
     * @参数 [startDate, endDate, productNo, workId, custName, cerdId, houseNo, pageBean, userOfOrgBean]
     * @返回值 com.grape.controller.reponse.ManagementlistResponse
     * @创建人 zyh
     * @创建时间 2018/11/16 13:42
     */
    ManagementlistResponse managementlistResponse(Date startDate, Date endDate, String productNo,
                                                  String workId, String custName, String cerdId, String houseNo, PageBean pageBean, UserOfOrgBean userOfOrgBean);

    /**
     * @描述 原还款详情
     * @参数 [workId, checkType, pageBean]
     * @返回值 com.grape.controller.reponse.RepayManagementResponse
     * @创建人 zyh
     * @创建时间 2018/11/16 14:44
     */
    RepayManagementResponse repayManagementResponse(String workId, String checkType, PageBean pageBean);

    /**
     * @描述 分页查询展期还款详情
     * @参数 [workId, checkType, pageBean]
     * @返回值 com.grape.controller.reponse.RepayManagementResponse
     * @创建人 zyh
     * @创建时间 2018/11/16 19:00
     */
    RepayManagementResponse repayRollOverResponse(String workId, String checkType, PageBean pageBean);

    /**
     * @描述 查询原基本信息
     * @参数 [workId]
     * @返回值 com.grape.controller.reponse.BasicInformationResponse
     * @创建人 zyh
     * @创建时间 2018/11/16 19:07
     */
    BasicInformationResponse basicInformationResponse(String workId);

    /**
     * @描述 查询展期基本信息
     * @参数 [workId]
     * @返回值 com.grape.controller.reponse.BasicInformationResponse
     * @创建人 zyh
     * @创建时间 2018/11/16 19:11
     */
    BasicInformationResponse basicInfoRollOverResponse(String workId);

    /**
     * @描述 查询还款记录列表
     * @参数 [workId, refundIssue]
     * @返回值 com.grape.controller.reponse.RepaymenthistoryResponse
     * @创建人 zyh
     * @创建时间 2018/11/22 14:23
     */
    RepaymenthistoryResponse repaymenthistoryResponse(String workId, Integer refundIssue);

    /**
     * @描述 查询逾期列表(Android)
     * @参数 [userOfOrgBean]
     * @返回值 com.grape.controller.reponse.OverduelistResponse
     * @创建人 zyh
     * @创建时间 2018/11/16 19:27
     */
    OverduelistResponse overduelistResponse(UserOfOrgBean userOfOrgBean);

    /**
     * @描述 查询还款提醒(Android)
     * @参数 [userOfOrgBean]
     * @返回值 com.grape.controller.reponse.PromptpaymentsResponse
     * @创建人 zyh
     * @创建时间 2018/11/16 19:28
     */
    PromptpaymentsResponse promptpaymentsResponse(UserOfOrgBean userOfOrgBean);


    //task任务


    List<Postloaninfo> getPostloaninfolist(Date startDate, Date endDate);

    List<Map<String, Object>> getRepaymentInfo(String workid, int refundissue);

    void saveOverdue(Overdue overdue);

    Repayplan getRepayplan(String workid, Integer nextrefundissue);

    void updatepostloaninfo(Postloaninfo postloaninfo);

    List<Overdue> getoverduelist();

    Postloaninfo getpostloaninfo(String workid);

    void updateOverdue(Overdue overdue);
}
