package com.grape.util;

import java.util.List;

/**
 * 分页对象
 *
 * @author lijl
 * @version 1.0 - 2015年4月20日
 */
public class PageBean {

    /**
     * 默认分页大小
     */
    public static final int PAGE_SIZE_TEN = 10;

    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 记录数
     */
    private Integer recordCount;

    /**
     * 总页数
     */
    private Integer pageCount;

    /**
     * 数据
     */
    private List resultList;

    /**
     * 获得当前页
     *
     * @return
     * @author 张志聪
     * @create 2012-7-31
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置当前页
     *
     * @param currentPage
     * @author 张志聪
     * @create 2012-7-31
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 获得页大小
     *
     * @return
     * @author 张志聪
     * @create 2012-7-31
     */
    public Integer getPageSize() {
        return pageSize != null ? pageSize : PAGE_SIZE_TEN;
    }

    /**
     * 设置页大小
     *
     * @param pageSize
     * @author 张志聪
     * @create 2012-7-31
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得记录数
     *
     * @return
     * @author 张志聪
     * @create 2012-7-31
     */
    public Integer getRecordCount() {
        return recordCount != null ? recordCount : 0;
    }

    /**
     * 设置记录数
     *
     * @param recordCount
     * @author 张志聪
     * @create 2012-7-31
     */
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    /**
     * 获得页数
     *
     * @return
     * @author 张志聪
     * @create 2012-7-31
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * 设置页数
     *
     * @param pageCount
     * @author 张志聪
     * @create 2012-7-31
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 获得结果集
     *
     * @return
     * @author 张志聪
     * @create 2012-7-31
     */
    public List getResultList() {
        return resultList;
    }

    /**
     * 设置结果集
     *
     * @param resultList
     * @author 张志聪
     * @create 2012-7-31
     */
    public void setResultList(List resultList) {
        this.resultList = resultList;
    }

    /**
     * 获得下一页的最后一条记录位置
     *
     * @return
     * @author 张志聪
     * @create 2012-7-31
     */
    public int getSearchPage() {
        return (currentPage + 1) * pageSize.intValue();
    }

    public PageBean(Integer currentPage, Integer pageSize) {
        super();
        if (currentPage > 0) {
            this.currentPage = (currentPage - 1) * pageSize;
        } else {
            this.currentPage = 0;
        }
        this.pageSize = pageSize;
    }
}