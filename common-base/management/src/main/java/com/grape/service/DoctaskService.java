package com.grape.service;

import java.util.Date;

import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.util.PageBean;

public interface DoctaskService {

    PageBean doctaskListReponse(Date startDate, Date endDate, String nodeid, String productno, String workid, String custname,
                                String cerdid, String houseno, PageBean pageBean, UserOfOrgBean userOfOrgBean);

    PageBean backlogListReponse(Date startDate, Date endDate, String nodeid, String productno, String workid, String custname,
                                String cerdid, String houseno, String processflg, PageBean pageBean);

    PageBean rolloverListReponse(Date startDate, Date endDate, String nodeid, String productno, String workid, String custname,
                                 String cerdid, String houseno, PageBean pageBean, UserOfOrgBean userOfOrgBean);

    UserOfOrgBean getUserOfOrg();
}
