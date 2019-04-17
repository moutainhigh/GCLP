package com.grape.controller.bean;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/** 
* @author cwc
* @version 创建时间：2018年12月12日 下午2:29:20  
*/
@Getter
@Setter
public class WorkitemBean {
	private String workid;

    private String fork;

    private String branch;

    private String stage;

    private String node;

    private String state;

    private String userid;

    private Date version;

    private String authuserid;

    private Date starttime;

    private Date realtime;

    private String returnflg;

    private String retscnode;

    private String retscper;
    
    private String nodename;

}
