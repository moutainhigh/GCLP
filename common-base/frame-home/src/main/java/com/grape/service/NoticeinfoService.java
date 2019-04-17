package com.grape.service;


import java.util.Date;
import java.util.List;

import com.grape.model.db.Noticeinfo;
import com.grape.model.mapper.PageBean;

public interface NoticeinfoService {
	
	/**
	 * 新增公告信息
	 * @param noticeinfo
	 * @return
	 */
	
	boolean NoticeinfoAdd(Noticeinfo noticeinfo);
	
	/**
	 * 查询公告信息，默认按最新时间排序
	 * @param pageBean 分页
	 * @return
	 */
	
	List<Noticeinfo> findNoticeinfosByDate(PageBean pageBean);
	
	/**
	 * 以时间段查询公告信息，默认按最新时间排序
	 * @param startdate 开始时间
	 * @param enddate 结束时间
	 * @param pageBean 分页
	 * @return
	 */
	List<Noticeinfo> findNoticeinfoByDateOf(Date startdate,Date enddate,PageBean pageBean);
}
